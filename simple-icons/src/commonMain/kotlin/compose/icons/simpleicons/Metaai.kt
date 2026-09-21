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

public val SimpleIcons.Metaai: ImageVector
    get() {
        if (_metaai != null) {
            return _metaai!!
        }
        _metaai = Builder(name = "Metaai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.73f, 0.032f)
                curveToRelative(-1.333f, 0.0f, -2.032f, 1.016f, -2.032f, 2.285f)
                curveToRelative(0.0f, 2.223f, 2.127f, 4.953f, 4.318f, 4.953f)
                curveToRelative(1.301f, 0.0f, 2.0f, -0.953f, 2.0f, -2.254f)
                curveToRelative(0.0f, -2.254f, -2.095f, -4.984f, -4.286f, -4.984f)
                moveToRelative(8.413f, 2.984f)
                curveToRelative(-1.968f, 0.0f, -3.397f, 2.73f, -3.397f, 4.825f)
                curveToRelative(0.0f, 1.556f, 0.794f, 3.016f, 2.254f, 3.016f)
                curveToRelative(2.0f, 0.0f, 3.365f, -2.762f, 3.365f, -4.794f)
                curveToRelative(0.0f, -1.523f, -0.762f, -3.047f, -2.222f, -3.047f)
                moveTo(4.857f, 4.159f)
                curveToRelative(-1.968f, 0.0f, -3.778f, 1.016f, -3.778f, 2.54f)
                curveToRelative(0.0f, 1.65f, 2.16f, 2.793f, 4.254f, 2.793f)
                curveToRelative(1.873f, 0.0f, 3.778f, -0.92f, 3.778f, -2.508f)
                curveToRelative(0.0f, -1.682f, -2.159f, -2.825f, -4.254f, -2.825f)
                moveToRelative(-0.222f, 6.476f)
                curveTo(2.413f, 10.635f, 0.0f, 13.175f, 0.0f, 15.397f)
                curveToRelative(0.0f, 1.301f, 0.825f, 2.159f, 2.095f, 2.159f)
                curveToRelative(2.19f, 0.0f, 4.603f, -2.508f, 4.603f, -4.794f)
                curveToRelative(0.0f, -1.27f, -0.761f, -2.127f, -2.063f, -2.127f)
                moveToRelative(16.667f, 0.698f)
                curveToRelative(-2.223f, 0.0f, -5.016f, 1.62f, -5.016f, 3.651f)
                curveToRelative(0.0f, 1.238f, 1.047f, 2.19f, 2.698f, 2.19f)
                curveToRelative(2.159f, 0.0f, 5.016f, -1.587f, 5.016f, -3.682f)
                curveToRelative(0.0f, -1.302f, -1.08f, -2.159f, -2.698f, -2.159f)
                moveTo(7.619f, 16.0f)
                curveToRelative(-1.524f, 0.0f, -2.38f, 1.746f, -2.38f, 3.429f)
                curveToRelative(0.0f, 2.063f, 1.269f, 4.54f, 3.047f, 4.54f)
                curveToRelative(1.524f, 0.0f, 2.38f, -1.81f, 2.38f, -3.461f)
                curveTo(10.667f, 18.57f, 9.46f, 16.0f, 7.62f, 16.0f)
                moveToRelative(6.571f, 1.016f)
                curveToRelative(-1.333f, 0.0f, -2.476f, 0.667f, -2.476f, 2.032f)
                curveToRelative(0.0f, 2.095f, 2.667f, 4.063f, 4.92f, 4.063f)
                curveToRelative(1.366f, 0.0f, 2.54f, -0.73f, 2.54f, -2.063f)
                curveToRelative(0.0f, -2.032f, -2.698f, -4.032f, -4.984f, -4.032f)
            }
        }
        .build()
        return _metaai!!
    }

private var _metaai: ImageVector? = null
