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

public val BrandsGroup.Dolibarr: ImageVector
    get() {
        if (_dolibarr != null) {
            return _dolibarr!!
        }
        _dolibarr = Builder(name = "Dolibarr", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.6f, 160.2f)
                lineToRelative(0.0f, 319.5f)
                lineToRelative(-119.4f, -1.3f)
                lineToRelative(0.0f, -446.4f)
                lineToRelative(155.6f, 0.0f)
                curveToRelative(68.2f, 0.0f, 121.7f, 17.2f, 160.3f, 51.7f)
                curveToRelative(45.9f, 41.2f, 68.8f, 97.1f, 68.8f, 167.8f)
                curveToRelative(0.0f, 67.6f, -19.6f, 122.7f, -58.8f, 165.5f)
                reflectiveCurveTo(285.3f, 480.0f, 223.6f, 480.0f)
                curveToRelative(-7.3f, 0.0f, -20.3f, -0.2f, -36.6f, -0.3f)
                lineToRelative(0.0f, -131.1f)
                lineToRelative(32.9f, -0.2f)
                curveToRelative(69.6f, -0.4f, 90.6f, -32.2f, 90.6f, -97.0f)
                curveToRelative(0.0f, -60.8f, -34.2f, -91.2f, -102.6f, -91.2f)
                lineToRelative(-40.3f, 0.0f)
                close()
            }
        }
        .build()
        return _dolibarr!!
    }

private var _dolibarr: ImageVector? = null
