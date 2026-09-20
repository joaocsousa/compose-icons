package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Corsair: ImageVector
    get() {
        if (_corsair != null) {
            return _corsair!!
        }
        _corsair = Builder(name = "Corsair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.073f, 0.411f)
                reflectiveCurveToRelative(1.912f, 3.883f, 1.56f, 5.5f)
                curveToRelative(0.0f, 0.0f, 4.988f, 1.615f, 5.543f, 4.275f)
                curveToRelative(0.0f, 0.0f, 2.731f, -3.595f, -7.103f, -9.775f)
                moveToRelative(-1.922f, 5.825f)
                curveToRelative(0.487f, 1.021f, 0.707f, 2.118f, 0.994f, 3.264f)
                lineTo(9.301f, 8.42f)
                curveToRelative(0.264f, -1.726f, -1.416f, -4.354f, -1.416f, -4.354f)
                close()
                moveTo(6.107f, 8.91f)
                curveToRelative(0.314f, 0.83f, 0.672f, 1.87f, 0.862f, 2.768f)
                lineToRelative(-2.564f, -0.638f)
                curveToRelative(0.263f, -1.726f, -1.362f, -3.813f, -1.362f, -3.813f)
                close()
                moveTo(11.692f, 4.76f)
                reflectiveCurveToRelative(11.436f, 8.031f, 12.19f, 11.147f)
                curveToRelative(0.568f, 2.344f, -1.085f, 4.51f, -1.085f, 4.51f)
                reflectiveCurveToRelative(-0.881f, -6.12f, -22.796f, 3.172f)
                curveToRelative(2.218f, -2.475f, 3.426f, -5.635f, 3.107f, -9.045f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -1.076f, -3.93f)
                lineToRelative(5.136f, 2.722f)
                lineToRelative(0.02f, 0.244f)
                curveToRelative(0.195f, 2.085f, 0.043f, 4.112f, -0.428f, 5.99f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 1.306f, -7.348f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 6.907f, 7.76f)
                lineToRelative(5.49f, 3.657f)
                curveToRelative(0.023f, 0.182f, 0.035f, 0.366f, 0.052f, 0.55f)
                curveToRelative(0.216f, 2.307f, 0.001f, 4.545f, -0.592f, 6.587f)
                curveToRelative(1.291f, -2.393f, 1.925f, -5.155f, 1.655f, -8.04f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -1.82f, -5.753f)
            }
        }
        .build()
        return _corsair!!
    }

private var _corsair: ImageVector? = null
