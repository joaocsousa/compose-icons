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

public val BrandsGroup.Devpost: ImageVector
    get() {
        if (_devpost != null) {
            return _devpost!!
        }
        _devpost = Builder(name = "Devpost", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 35.0f)
                lineTo(512.0f, 256.0f)
                lineTo(384.0f, 477.0f)
                lineTo(128.0f, 477.0f)
                lineTo(0.0f, 256.0f)
                lineTo(128.0f, 35.0f)
                lineTo(384.0f, 35.0f)
                close()
                moveTo(162.6f, 120.8f)
                lineToRelative(0.0f, 270.3f)
                lineToRelative(79.8f, 0.0f)
                curveToRelative(69.2f, 0.0f, 137.7f, -40.6f, 137.7f, -135.2f)
                curveToRelative(0.0f, -98.5f, -57.0f, -135.2f, -133.9f, -135.2f)
                lineToRelative(-83.7f, 0.0f)
                close()
                moveTo(244.3f, 173.8f)
                curveToRelative(57.0f, 0.0f, 80.6f, 27.2f, 80.6f, 82.2f)
                curveToRelative(0.0f, 49.1f, -26.0f, 82.2f, -82.4f, 82.2f)
                lineToRelative(-26.8f, 0.0f)
                lineToRelative(0.0f, -164.4f)
                lineToRelative(28.7f, 0.0f)
                close()
            }
        }
        .build()
        return _devpost!!
    }

private var _devpost: ImageVector? = null
