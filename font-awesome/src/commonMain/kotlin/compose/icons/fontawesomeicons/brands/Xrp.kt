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

public val BrandsGroup.Xrp: ImageVector
    get() {
        if (_xrp != null) {
            return _xrp!!
        }
        _xrp = Builder(name = "Xrp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.1f, 313.5f)
                curveToRelative(54.7f, -54.1f, 143.4f, -54.2f, 198.2f, 0.0f)
                lineToRelative(152.1f, 150.5f)
                lineToRelative(-72.7f, 0.0f)
                lineToRelative(-115.8f, -114.6f)
                curveToRelative(-34.7f, -34.3f, -90.8f, -34.3f, -125.5f, 0.0f)
                lineTo(77.7f, 464.0f)
                lineTo(5.0f, 464.0f)
                lineTo(157.1f, 313.5f)
                close()
                moveTo(193.4f, 161.7f)
                curveToRelative(34.7f, 34.3f, 90.8f, 34.3f, 125.5f, 0.0f)
                lineTo(433.8f, 48.0f)
                lineTo(506.4f, 48.0f)
                lineTo(355.2f, 197.6f)
                curveToRelative(-54.7f, 54.1f, -143.4f, 54.1f, -198.1f, 0.0f)
                lineTo(5.9f, 48.0f)
                lineTo(78.6f, 48.0f)
                lineTo(193.4f, 161.7f)
                close()
            }
        }
        .build()
        return _xrp!!
    }

private var _xrp: ImageVector? = null
