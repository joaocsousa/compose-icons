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

public val BrandsGroup.Matrix: ImageVector
    get() {
        if (_matrix != null) {
            return _matrix!!
        }
        _matrix = Builder(name = "Matrix", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.6f, 27.0f)
                lineToRelative(-32.9f, 0.0f)
                lineToRelative(0.0f, 458.0f)
                lineToRelative(32.9f, 0.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(-45.6f, 0.0f)
                lineToRelative(0.0f, -480.0f)
                lineToRelative(45.6f, 0.0f)
                lineToRelative(0.0f, 11.0f)
                close()
                moveTo(496.0f, 496.0f)
                lineToRelative(-45.6f, 0.0f)
                lineToRelative(0.0f, -11.0f)
                lineToRelative(32.9f, 0.0f)
                lineToRelative(0.0f, -458.0f)
                lineToRelative(-32.9f, 0.0f)
                lineToRelative(0.0f, -11.0f)
                lineToRelative(45.6f, 0.0f)
                lineToRelative(0.0f, 480.0f)
                close()
                moveTo(324.1f, 167.6f)
                curveToRelative(9.0f, 0.0f, 17.4f, 1.1f, 25.2f, 3.3f)
                reflectiveCurveToRelative(14.3f, 5.7f, 19.8f, 10.6f)
                reflectiveCurveToRelative(9.8f, 11.2f, 12.9f, 19.0f)
                curveToRelative(3.0f, 7.8f, 4.6f, 17.3f, 4.6f, 28.3f)
                lineToRelative(0.0f, 114.5f)
                lineToRelative(-47.0f, 0.0f)
                lineToRelative(0.0f, -97.0f)
                curveToRelative(0.0f, -5.7f, -0.2f, -11.2f, -0.6f, -16.3f)
                reflectiveCurveToRelative(-1.7f, -9.5f, -3.6f, -13.2f)
                curveToRelative(-2.0f, -3.8f, -4.9f, -6.8f, -8.7f, -9.0f)
                reflectiveCurveToRelative(-9.1f, -3.3f, -15.7f, -3.3f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 1.3f, -16.1f, 3.8f)
                curveToRelative(-4.1f, 2.6f, -7.3f, 5.8f, -9.6f, 10.0f)
                curveToRelative(-2.3f, 4.1f, -3.9f, 8.7f, -4.6f, 13.9f)
                curveToRelative(-0.7f, 5.2f, -1.2f, 10.4f, -1.2f, 15.7f)
                lineToRelative(0.0f, 95.3f)
                lineToRelative(-47.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -5.1f, -0.1f, -10.1f, -0.4f, -15.0f)
                curveToRelative(-0.2f, -5.0f, -1.2f, -9.5f, -2.9f, -13.8f)
                curveToRelative(-1.7f, -4.1f, -4.4f, -7.6f, -8.3f, -10.1f)
                reflectiveCurveToRelative(-9.5f, -3.8f, -17.1f, -3.8f)
                curveToRelative(-2.2f, 0.0f, -5.2f, 0.5f, -8.8f, 1.5f)
                reflectiveCurveToRelative(-7.2f, 2.9f, -10.6f, 5.6f)
                reflectiveCurveToRelative(-6.4f, 6.7f, -8.8f, 11.9f)
                reflectiveCurveToRelative(-3.6f, 12.0f, -3.6f, 20.4f)
                lineToRelative(0.0f, 99.3f)
                lineToRelative(-47.0f, 0.0f)
                lineToRelative(0.0f, -171.3f)
                lineToRelative(44.3f, 0.0f)
                lineToRelative(0.0f, 23.2f)
                lineToRelative(0.7f, 0.0f)
                curveToRelative(6.2f, -8.9f, 13.7f, -15.7f, 22.3f, -20.5f)
                curveToRelative(8.7f, -4.9f, 18.7f, -7.3f, 30.0f, -7.3f)
                curveToRelative(10.8f, 0.0f, 20.7f, 2.1f, 29.6f, 6.3f)
                reflectiveCurveToRelative(15.7f, 11.6f, 20.4f, 22.2f)
                curveToRelative(5.1f, -7.5f, 12.0f, -14.1f, 20.7f, -19.8f)
                reflectiveCurveToRelative(19.0f, -8.6f, 30.9f, -8.6f)
                close()
            }
        }
        .build()
        return _matrix!!
    }

private var _matrix: ImageVector? = null
