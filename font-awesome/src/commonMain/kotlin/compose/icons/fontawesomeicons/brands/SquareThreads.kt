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

public val BrandsGroup.SquareThreads: ImageVector
    get() {
        if (_squareThreads != null) {
            return _squareThreads!!
        }
        _squareThreads = Builder(name = "SquareThreads", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                close()
                moveTo(237.8f, 96.3f)
                curveToRelative(-99.0f, 0.0f, -166.3f, 70.2f, -166.3f, 172.1f)
                curveToRelative(0.0f, 93.2f, 65.9f, 147.3f, 144.5f, 147.3f)
                curveToRelative(64.9f, 0.0f, 130.6f, -37.9f, 130.6f, -102.7f)
                curveToRelative(0.0f, -33.9f, -19.4f, -56.3f, -47.5f, -69.0f)
                curveToRelative(-0.4f, -46.4f, -25.6f, -74.3f, -68.0f, -74.3f)
                curveToRelative(-28.3f, 0.0f, -52.2f, 12.8f, -64.7f, 33.3f)
                lineTo(193.8f, 222.0f)
                curveToRelative(7.1f, -11.2f, 16.9f, -20.5f, 35.0f, -20.5f)
                curveToRelative(20.3f, 0.0f, 30.8f, 11.3f, 33.8f, 32.3f)
                curveToRelative(-9.8f, -1.5f, -19.6f, -2.3f, -29.8f, -2.3f)
                curveToRelative(-54.9f, 0.0f, -80.7f, 24.8f, -80.8f, 57.7f)
                reflectiveCurveToRelative(25.8f, 53.1f, 63.9f, 53.1f)
                curveToRelative(41.8f, 0.0f, 66.7f, -28.2f, 77.0f, -63.0f)
                curveToRelative(10.6f, 4.8f, 17.9f, 16.0f, 17.9f, 32.9f)
                curveToRelative(0.0f, 45.1f, -52.0f, 69.6f, -96.1f, 69.6f)
                curveToRelative(-65.0f, 0.0f, -107.5f, -42.7f, -107.5f, -112.1f)
                curveToRelative(0.0f, -85.1f, 56.2f, -139.6f, 131.7f, -139.6f)
                curveToRelative(50.7f, 0.0f, 75.8f, 22.2f, 92.8f, 52.1f)
                lineToRelative(28.0f, -19.6f)
                curveToRelative(-18.5f, -38.7f, -59.9f, -66.3f, -122.0f, -66.3f)
                close()
                moveTo(235.8f, 263.5f)
                curveToRelative(9.0f, 0.0f, 17.8f, 0.6f, 25.7f, 2.3f)
                curveToRelative(-5.6f, 25.6f, -22.2f, 42.8f, -46.7f, 42.8f)
                curveToRelative(-14.3f, 0.0f, -26.9f, -6.8f, -26.9f, -19.3f)
                curveToRelative(0.0f, -19.7f, 24.2f, -25.7f, 48.0f, -25.7f)
                close()
            }
        }
        .build()
        return _squareThreads!!
    }

private var _squareThreads: ImageVector? = null
