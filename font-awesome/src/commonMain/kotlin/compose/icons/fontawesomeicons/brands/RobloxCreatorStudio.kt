package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.RobloxCreatorStudio: ImageVector
    get() {
        if (_robloxCreatorStudio != null) {
            return _robloxCreatorStudio!!
        }
        _robloxCreatorStudio = Builder(name = "RobloxCreatorStudio", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(330.3f, 329.5f)
                lineTo(349.0f, 259.7f)
                lineTo(498.9f, 299.9f)
                lineTo(440.0f, 519.5f)
                lineTo(24.0f, 408.0f)
                lineTo(64.2f, 258.2f)
                lineTo(330.3f, 329.5f)
                close()
                moveTo(551.5f, 103.5f)
                lineTo(511.3f, 253.3f)
                lineTo(245.2f, 182.0f)
                lineTo(226.5f, 251.8f)
                lineTo(76.6f, 211.7f)
                lineTo(135.5f, -8.0f)
                lineTo(551.5f, 103.5f)
                close()
            }
        }
        .build()
        return _robloxCreatorStudio!!
    }

private var _robloxCreatorStudio: ImageVector? = null
