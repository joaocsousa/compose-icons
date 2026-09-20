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

public val SimpleIcons.Traxsource: ImageVector
    get() {
        if (_traxsource != null) {
            return _traxsource!!
        }
        _traxsource = Builder(name = "Traxsource", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.068f, 10.942f)
                curveToRelative(0.067f, -0.457f, 0.092f, -0.904f, 0.101f, -1.587f)
                curveToRelative(0.073f, -5.269f, -4.504f, -9.32f, -9.608f, -9.349f)
                arcToRelative(198.0f, 198.0f, 0.0f, false, false, -3.123f, 0.0f)
                curveTo(5.333f, 0.036f, 0.77f, 4.036f, 0.83f, 9.355f)
                curveToRelative(0.008f, 0.669f, 0.03f, 1.14f, 0.093f, 1.6f)
                curveToRelative(-0.655f, 0.957f, -0.992f, 2.233f, -0.85f, 3.592f)
                lineToRelative(0.043f, 0.403f)
                curveToRelative(0.28f, 2.673f, 2.305f, 4.652f, 4.52f, 4.419f)
                lineToRelative(0.118f, -0.012f)
                curveToRelative(1.513f, 2.836f, 4.19f, 4.631f, 7.244f, 4.643f)
                horizontalLineToRelative(0.007f)
                curveToRelative(0.248f, 0.0f, 0.449f, -0.2f, 0.449f, -0.45f)
                verticalLineToRelative(-1.598f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.448f, -0.449f)
                verticalLineTo(21.5f)
                curveToRelative(-3.104f, 0.0f, -5.901f, -3.795f, -5.901f, -7.614f)
                curveToRelative(0.0f, -3.775f, 2.797f, -7.634f, 5.888f, -7.634f)
                horizontalLineTo(12.0f)
                curveToRelative(0.248f, 0.0f, 0.449f, -0.2f, 0.449f, -0.449f)
                verticalLineTo(4.225f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.443f, -0.45f)
                verticalLineToRelative(-0.003f)
                curveTo(8.675f, 3.78f, 5.792f, 5.91f, 4.378f, 9.2f)
                lineToRelative(-0.801f, 0.084f)
                curveToRelative(-0.042f, 0.005f, -0.081f, 0.015f, -0.123f, 0.02f)
                curveToRelative(-0.184f, -3.99f, 3.493f, -6.872f, 7.434f, -6.893f)
                curveToRelative(1.007f, -0.007f, 1.511f, -0.007f, 2.519f, 0.0f)
                curveToRelative(3.936f, 0.021f, 7.328f, 2.91f, 7.201f, 6.904f)
                curveToRelative(-0.061f, -0.01f, -0.122f, -0.024f, -0.185f, -0.03f)
                lineToRelative(-1.282f, -0.136f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.012f, -0.002f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, -0.558f, 0.45f)
                lineToRelative(-0.953f, 9.077f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, false, 0.45f, 0.557f)
                horizontalLineToRelative(0.013f)
                verticalLineToRelative(0.002f)
                lineToRelative(1.282f, 0.134f)
                curveToRelative(2.216f, 0.233f, 4.24f, -1.746f, 4.52f, -4.419f)
                lineToRelative(0.043f, -0.403f)
                curveToRelative(0.144f, -1.366f, -0.197f, -2.646f, -0.858f, -3.605f)
            }
        }
        .build()
        return _traxsource!!
    }

private var _traxsource: ImageVector? = null
