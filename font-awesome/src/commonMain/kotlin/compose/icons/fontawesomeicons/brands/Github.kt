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

public val BrandsGroup.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.5f, 362.5f)
                curveToRelative(-66.0f, -8.0f, -112.5f, -55.5f, -112.5f, -117.0f)
                curveToRelative(0.0f, -25.0f, 9.0f, -52.0f, 24.0f, -70.0f)
                curveToRelative(-6.5f, -16.5f, -5.5f, -51.5f, 2.0f, -66.0f)
                curveToRelative(20.0f, -2.5f, 47.0f, 8.0f, 63.0f, 22.5f)
                curveToRelative(19.0f, -6.0f, 39.0f, -9.0f, 63.5f, -9.0f)
                reflectiveCurveToRelative(44.5f, 3.0f, 62.5f, 8.5f)
                curveToRelative(15.5f, -14.0f, 43.0f, -24.5f, 63.0f, -22.0f)
                curveToRelative(7.0f, 13.5f, 8.0f, 48.5f, 1.5f, 65.5f)
                curveToRelative(16.0f, 19.0f, 24.5f, 44.5f, 24.5f, 70.5f)
                curveToRelative(0.0f, 61.5f, -46.5f, 108.0f, -113.5f, 116.5f)
                curveToRelative(17.0f, 11.0f, 28.5f, 35.0f, 28.5f, 62.5f)
                lineToRelative(0.0f, 52.0f)
                curveTo(323.0f, 491.5f, 335.5f, 500.0f, 350.5f, 494.0f)
                curveTo(441.0f, 459.5f, 512.0f, 369.0f, 512.0f, 257.0f)
                curveTo(512.0f, 115.5f, 397.0f, 0.0f, 255.5f, 0.0f)
                reflectiveCurveTo(0.0f, 115.5f, 0.0f, 257.0f)
                curveToRelative(0.0f, 111.0f, 70.5f, 203.0f, 165.5f, 237.5f)
                curveToRelative(13.5f, 5.0f, 26.5f, -4.0f, 26.5f, -17.5f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(-7.0f, 3.0f, -16.0f, 5.0f, -24.0f, 5.0f)
                curveToRelative(-33.0f, 0.0f, -52.5f, -18.0f, -66.5f, -51.5f)
                curveToRelative(-5.5f, -13.5f, -11.5f, -21.5f, -23.0f, -23.0f)
                curveToRelative(-6.0f, -0.5f, -8.0f, -3.0f, -8.0f, -6.0f)
                curveToRelative(0.0f, -6.0f, 10.0f, -10.5f, 20.0f, -10.5f)
                curveToRelative(14.5f, 0.0f, 27.0f, 9.0f, 40.0f, 27.5f)
                curveToRelative(10.0f, 14.5f, 20.5f, 21.0f, 33.0f, 21.0f)
                reflectiveCurveToRelative(20.5f, -4.5f, 32.0f, -16.0f)
                curveToRelative(8.5f, -8.5f, 15.0f, -16.0f, 21.0f, -21.0f)
                close()
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
