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

public val SimpleIcons.Dicebear: ImageVector
    get() {
        if (_dicebear != null) {
            return _dicebear!!
        }
        _dicebear = Builder(name = "Dicebear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 1.5f)
                verticalLineToRelative(21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 24.0f)
                horizontalLineToRelative(12.84f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.87f, -1.468f)
                curveToRelative(-0.986f, -1.777f, -1.929f, -3.346f, -2.523f, -4.024f)
                curveToRelative(-1.69f, -1.933f, -9.626f, -0.13f, -9.877f, -6.435f)
                curveToRelative(-0.016f, -0.415f, 0.262f, -0.777f, 0.655f, -0.908f)
                lineToRelative(3.872f, -1.29f)
                curveToRelative(0.226f, -0.076f, 0.418f, -0.23f, 0.547f, -0.43f)
                curveToRelative(0.365f, -0.569f, 1.182f, -1.768f, 1.928f, -2.375f)
                curveToRelative(0.707f, -0.574f, 1.85f, -1.301f, 3.936f, -1.636f)
                curveToRelative(0.417f, -0.067f, 0.749f, -0.379f, 0.952f, -0.75f)
                curveToRelative(0.488f, -0.89f, 1.457f, -1.432f, 2.478f, -1.285f)
                curveToRelative(1.332f, 0.192f, 2.249f, 1.483f, 2.048f, 2.883f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.094f, 0.276f)
                curveToRelative(0.889f, 0.794f, 1.829f, 1.894f, 2.759f, 3.137f)
                curveToRelative(0.596f, 0.797f, 1.921f, 0.393f, 1.921f, -0.602f)
                lineTo(24.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 0.0f)
                close()
                moveTo(10.875f, 9.625f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
            }
        }
        .build()
        return _dicebear!!
    }

private var _dicebear: ImageVector? = null
