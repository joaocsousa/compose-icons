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

public val BrandsGroup.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.2f, 61.9f)
                curveToRelative(5.3f, -0.5f, 10.6f, 0.6f, 15.3f, 3.0f)
                reflectiveCurveToRelative(8.6f, 6.2f, 11.3f, 10.8f)
                curveToRelative(17.0f, 29.5f, 34.2f, 58.9f, 51.2f, 88.4f)
                curveToRelative(3.5f, -1.4f, 7.0f, -2.7f, 10.5f, -3.9f)
                curveToRelative(31.3f, -10.9f, 64.2f, -16.6f, 97.4f, -16.9f)
                curveToRelative(1.0f, 0.0f, 2.1f, 0.0f, 3.2f, 0.0f)
                curveToRelative(38.1f, 0.0f, 76.2f, 7.0f, 111.6f, 21.1f)
                lineTo(483.0f, 75.7f)
                curveToRelative(1.8f, -3.2f, 4.3f, -6.0f, 7.2f, -8.2f)
                reflectiveCurveToRelative(6.2f, -3.9f, 9.8f, -4.8f)
                curveToRelative(3.1f, -0.8f, 6.4f, -1.1f, 9.6f, -0.8f)
                curveToRelative(4.2f, 0.4f, 8.3f, 1.7f, 11.9f, 3.8f)
                curveToRelative(4.0f, 2.4f, 7.3f, 5.7f, 9.7f, 9.7f)
                curveToRelative(2.0f, 3.4f, 3.3f, 7.2f, 3.8f, 11.2f)
                reflectiveCurveToRelative(0.1f, 8.0f, -1.2f, 11.7f)
                curveToRelative(-0.6f, 1.9f, -1.4f, 3.7f, -2.4f, 5.5f)
                lineToRelative(-49.7f, 85.8f)
                curveToRelative(19.5f, 12.2f, 37.6f, 26.5f, 53.9f, 42.8f)
                curveToRelative(12.3f, 12.2f, 23.5f, 25.4f, 33.5f, 39.5f)
                curveToRelative(8.2f, 11.5f, 15.6f, 23.6f, 22.2f, 36.2f)
                curveToRelative(17.5f, 33.6f, 28.6f, 70.5f, 32.7f, 108.1f)
                lineToRelative(-608.0f, 0.0f)
                curveToRelative(4.1f, -37.7f, 15.2f, -74.5f, 32.7f, -108.1f)
                curveToRelative(14.5f, -27.9f, 33.4f, -53.5f, 55.7f, -75.7f)
                curveToRelative(16.5f, -16.4f, 34.7f, -30.9f, 54.5f, -43.1f)
                lineToRelative(-49.5f, -85.4f)
                curveToRelative(-3.7f, -6.4f, -4.7f, -14.1f, -2.8f, -21.2f)
                curveToRelative(1.9f, -7.1f, 6.4f, -13.1f, 12.7f, -16.8f)
                curveToRelative(3.6f, -2.2f, 7.7f, -3.5f, 11.9f, -3.8f)
                close()
                moveTo(198.5f, 277.7f)
                curveToRelative(-12.2f, -8.1f, -30.1f, -2.5f, -40.1f, 12.5f)
                reflectiveCurveToRelative(-8.2f, 33.8f, 3.9f, 41.9f)
                reflectiveCurveToRelative(30.1f, 2.5f, 40.1f, -12.5f)
                reflectiveCurveToRelative(8.2f, -33.8f, -3.9f, -41.9f)
                close()
                moveTo(482.1f, 290.2f)
                curveToRelative(-10.0f, -15.0f, -27.9f, -20.6f, -40.1f, -12.5f)
                reflectiveCurveToRelative(-13.9f, 26.9f, -3.9f, 41.9f)
                curveToRelative(10.0f, 15.0f, 27.9f, 20.6f, 40.1f, 12.5f)
                reflectiveCurveToRelative(13.9f, -26.9f, 3.9f, -41.9f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
