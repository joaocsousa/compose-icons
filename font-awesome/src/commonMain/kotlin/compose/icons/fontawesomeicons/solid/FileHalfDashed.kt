package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FileHalfDashed: ImageVector
    get() {
        if (_fileHalfDashed != null) {
            return _fileHalfDashed!!
        }
        _fileHalfDashed = Builder(name = "FileHalfDashed", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 512.0f)
                curveToRelative(-29.8f, 0.0f, -54.8f, -20.4f, -61.9f, -48.0f)
                lineToRelative(61.9f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(168.0f, 512.0f)
                lineToRelative(-56.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(56.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(272.0f, 512.0f)
                lineToRelative(-56.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(56.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(381.9f, 464.0f)
                curveToRelative(-7.1f, 27.6f, -32.1f, 48.0f, -61.9f, 48.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(61.9f, 0.0f)
                close()
                moveTo(48.0f, 416.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(384.0f, 416.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(213.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.2f, 6.8f, 45.2f, 18.8f)
                lineTo(365.3f, 125.2f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.2f)
                lineTo(384.0f, 320.0f)
                lineTo(0.0f, 320.0f)
                lineTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(213.5f, 0.0f)
                close()
                moveTo(208.0f, 152.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(93.5f, 0.0f)
                lineToRelative(-117.5f, -117.5f)
                lineToRelative(0.0f, 93.5f)
                close()
            }
        }
        .build()
        return _fileHalfDashed!!
    }

private var _fileHalfDashed: ImageVector? = null
