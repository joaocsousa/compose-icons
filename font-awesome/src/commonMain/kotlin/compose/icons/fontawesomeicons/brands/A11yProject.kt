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

public val BrandsGroup.A11yProject: ImageVector
    get() {
        if (_a11yProject != null) {
            return _a11yProject!!
        }
        _a11yProject = Builder(name = "A11yProject", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                close()
                moveTo(252.3f, 117.0f)
                arcToRelative(33.1f, 33.1f, 0.0f, true, true, -0.1f, -66.2f)
                arcToRelative(33.1f, 33.1f, 0.0f, true, true, 0.1f, 66.2f)
                close()
                moveTo(395.6f, 157.8f)
                lineToRelative(-98.5f, 12.4f)
                lineToRelative(0.1f, 98.6f)
                lineToRelative(47.7f, 159.3f)
                curveToRelative(0.6f, 2.4f, 0.7f, 4.8f, 0.4f, 7.3f)
                reflectiveCurveToRelative(-1.2f, 4.7f, -2.4f, 6.8f)
                reflectiveCurveToRelative(-2.9f, 3.9f, -4.9f, 5.4f)
                reflectiveCurveToRelative(-4.2f, 2.5f, -6.6f, 3.1f)
                curveToRelative(-9.9f, 2.5f, -20.1f, -3.0f, -22.6f, -13.0f)
                lineToRelative(-48.9f, -145.0f)
                lineToRelative(-15.0f, 0.0f)
                lineToRelative(-45.0f, 148.0f)
                curveToRelative(-3.8f, 9.7f, -14.5f, 14.1f, -24.2f, 10.3f)
                curveToRelative(-9.6f, -3.7f, -15.4f, -14.6f, -11.6f, -24.3f)
                lineToRelative(41.3f, -156.3f)
                lineToRelative(0.0f, -100.2f)
                lineToRelative(-90.8f, -12.3f)
                curveToRelative(-9.3f, -0.8f, -15.6f, -8.9f, -14.9f, -18.3f)
                curveToRelative(0.7f, -9.4f, 9.2f, -16.3f, 18.5f, -15.6f)
                lineToRelative(110.3f, 9.5f)
                lineToRelative(48.3f, 0.0f)
                lineToRelative(117.4f, -9.7f)
                curveToRelative(2.2f, -0.1f, 4.4f, 0.3f, 6.5f, 1.0f)
                reflectiveCurveToRelative(4.0f, 1.9f, 5.6f, 3.5f)
                reflectiveCurveToRelative(3.0f, 3.3f, 3.9f, 5.4f)
                reflectiveCurveToRelative(1.4f, 4.2f, 1.5f, 6.4f)
                curveToRelative(0.4f, 9.3f, -6.8f, 17.2f, -16.1f, 17.6f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _a11yProject!!
    }

private var _a11yProject: ImageVector? = null
