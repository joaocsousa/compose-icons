import generator.MapIconsToSvgComposeFolderResult
import generator.SvgToComposeConfig
import generator.putRelocatedRelativeTo
import generator.registerGeneratorTask
import java.io.File

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.vanniktech.maven.publish")
}

setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.tablericons"
}

registerGeneratorTask(
    githubId = "tabler/tabler-icons",
    version = "v3.36.1",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        // In newer versions, icons might be in icons/outline or src/icons
        fun findIconsDir(root: File): File {
            val candidates = listOf("icons/outline", "icons", "src/icons/outline", "src/icons")
            for (path in candidates) {
                val dir = File(root, path)
                if (dir.exists() && dir.isDirectory) return dir
            }
            return File(root, "icons")
        }

        val iconsDir = findIconsDir(repoCloneDir)

        val relocatedNames = mutableMapOf<String, String>()

        // renaming to match to svg-to-compose
        // using walkTopDown to avoid NPE if dir doesn't exist and to find recursive SVGs
        iconsDir.walkTopDown().filter { it.extension == "svg" }
            .forEach {
                val newFile = File(it.parentFile, it.name.replace("-", "_"))

                // store the name change
                relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                // rename to conform with SVG to Compose
                it.renameTo(newFile)
            }

        MapIconsToSvgComposeFolderResult(
            iconsFolder = iconsDir,
            relocatedNames = relocatedNames
        )
    },
    svgToComposeConfig = SvgToComposeConfig(
        accessorName = "TablerIcons",
    ),
    licensePathAtRepo = { "LICENSE" },
    documentationHeader = "[Tabler Icons](https://tabler-icons.io/)"
)