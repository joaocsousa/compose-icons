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

public val BrandsGroup.VisualStudio: ImageVector
    get() {
        if (_visualStudio != null) {
            return _visualStudio!!
        }
        _visualStudio = Builder(name = "VisualStudio", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(317.8f, 18.7f)
                curveToRelative(13.2f, 0.0f, -1.4f, -2.2f, 162.8f, 57.0f)
                curveToRelative(0.7f, 0.4f, 1.1f, 0.4f, 1.8f, 0.8f)
                curveToRelative(17.6f, 7.3f, 29.6f, 24.5f, 29.6f, 44.2f)
                lineToRelative(0.0f, 267.0f)
                curveToRelative(0.0f, 19.7f, -12.1f, 36.9f, -29.6f, 44.2f)
                curveToRelative(-0.4f, 0.0f, -1.1f, 0.4f, -2.9f, 1.1f)
                lineTo(335.0f, 484.6f)
                curveToRelative(-5.5f, 2.2f, -11.3f, 3.3f, -17.2f, 3.3f)
                curveToRelative(-16.8f, 0.0f, -31.8f, -8.8f, -40.2f, -22.0f)
                curveToRelative(-0.5f, -0.5f, -6.2f, -10.3f, -10.2f, -16.1f)
                curveToRelative(-1.1f, -1.5f, -1.8f, -2.9f, -2.9f, -4.4f)
                lineTo(92.5f, 155.5f)
                curveTo(81.9f, 137.2f, 64.0f, 125.8f, 44.2f, 122.9f)
                lineToRelative(92.2f, -45.0f)
                lineToRelative(0.4f, -0.4f)
                curveToRelative(6.2f, -2.9f, 13.5f, -4.8f, 20.8f, -4.8f)
                curveToRelative(16.1f, 0.0f, 30.3f, 8.0f, 39.1f, 20.1f)
                lineToRelative(0.0f, 0.4f)
                lineToRelative(169.0f, 238.1f)
                lineToRelative(0.0f, -166.0f)
                lineToRelative(-36.6f, 51.6f)
                lineToRelative(-84.9f, -119.6f)
                lineToRelative(31.8f, -54.9f)
                curveToRelative(0.7f, -0.7f, 1.1f, -1.4f, 1.4f, -1.8f)
                curveToRelative(8.4f, -13.2f, 23.4f, -21.9f, 40.2f, -21.9f)
                close()
                moveTo(200.8f, 409.6f)
                lineToRelative(-4.0f, 5.5f)
                lineToRelative(0.0f, 0.3f)
                curveToRelative(-8.8f, 12.1f, -23.0f, 20.1f, -39.1f, 20.1f)
                curveToRelative(-7.3f, 0.0f, -14.6f, -1.8f, -20.8f, -4.7f)
                lineToRelative(-0.4f, -0.4f)
                lineToRelative(-92.9f, -45.0f)
                curveToRelative(20.1f, -2.9f, 38.0f, -13.9f, 49.0f, -32.6f)
                lineToRelative(17.2f, -28.5f)
                lineToRelative(20.5f, -34.4f)
                lineToRelative(70.6f, 119.6f)
                close()
                moveTo(24.1f, 159.1f)
                curveToRelative(11.7f, -2.9f, 27.8f, -0.7f, 36.9f, 15.0f)
                lineToRelative(47.9f, 80.1f)
                lineToRelative(-47.9f, 80.1f)
                curveToRelative(-6.9f, 12.1f, -17.5f, 16.5f, -27.4f, 16.5f)
                curveToRelative(-3.3f, 0.0f, -6.6f, -0.7f, -9.5f, -1.5f)
                curveToRelative(-11.7f, -3.3f, -24.1f, -13.2f, -24.1f, -31.8f)
                lineTo(0.0f, 190.9f)
                curveToRelative(0.0f, -18.6f, 12.4f, -28.5f, 24.1f, -31.8f)
                close()
            }
        }
        .build()
        return _visualStudio!!
    }

private var _visualStudio: ImageVector? = null
