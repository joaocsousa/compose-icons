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

public val BrandsGroup.Threads: ImageVector
    get() {
        if (_threads != null) {
            return _threads!!
        }
        _threads = Builder(name = "Threads", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.8f, 238.0f)
                curveToRelative(-0.6f, -69.6f, -38.3f, -111.5f, -102.0f, -111.5f)
                curveToRelative(-42.5f, 0.0f, -78.3f, 19.2f, -97.1f, 49.9f)
                lineToRelative(41.2f, 28.7f)
                curveToRelative(10.7f, -16.8f, 25.4f, -30.8f, 52.4f, -30.8f)
                curveToRelative(30.5f, 0.0f, 46.3f, 17.0f, 50.8f, 48.5f)
                curveToRelative(-14.7f, -2.3f, -29.5f, -3.5f, -44.6f, -3.5f)
                curveToRelative(-82.4f, 0.0f, -121.1f, 37.3f, -121.1f, 86.6f)
                reflectiveCurveToRelative(38.8f, 79.7f, 95.9f, 79.7f)
                curveToRelative(62.7f, 0.0f, 100.1f, -42.2f, 115.4f, -94.5f)
                curveToRelative(15.9f, 7.2f, 26.9f, 24.0f, 26.9f, 49.3f)
                curveToRelative(0.0f, 67.6f, -78.0f, 104.5f, -144.1f, 104.5f)
                curveToRelative(-97.5f, 0.0f, -161.3f, -64.0f, -161.3f, -168.2f)
                curveToRelative(0.0f, -127.6f, 84.3f, -209.4f, 197.6f, -209.4f)
                curveToRelative(76.0f, 0.0f, 113.6f, 33.4f, 139.2f, 78.1f)
                lineTo(432.0f, 115.9f)
                curveToRelative(-27.8f, -58.0f, -89.9f, -99.5f, -183.1f, -99.5f)
                curveToRelative(-148.5f, 0.0f, -249.5f, 105.4f, -249.5f, 258.2f)
                curveToRelative(0.0f, 139.8f, 98.9f, 220.9f, 216.7f, 220.9f)
                curveToRelative(97.4f, 0.0f, 195.8f, -56.8f, 195.8f, -154.0f)
                curveToRelative(0.0f, -50.8f, -29.2f, -84.5f, -71.2f, -103.5f)
                close()
                moveTo(214.4f, 334.9f)
                curveToRelative(-21.5f, 0.0f, -40.4f, -10.2f, -40.4f, -29.0f)
                curveToRelative(0.0f, -29.6f, 36.4f, -38.6f, 72.0f, -38.6f)
                curveToRelative(13.5f, 0.0f, 26.8f, 0.9f, 38.5f, 3.5f)
                curveToRelative(-8.4f, 38.5f, -33.4f, 64.2f, -70.0f, 64.2f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _threads!!
    }

private var _threads: ImageVector? = null
