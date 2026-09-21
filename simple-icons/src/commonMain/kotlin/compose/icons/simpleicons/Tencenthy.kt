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

public val SimpleIcons.Tencenthy: ImageVector
    get() {
        if (_tencenthy != null) {
            return _tencenthy!!
        }
        _tencenthy = Builder(name = "Tencenthy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -24.0f)
                moveToRelative(1.65f, 1.12f)
                curveToRelative(0.533f, 0.097f, 1.023f, 0.233f, 1.41f, 0.404f)
                curveToRelative(6.086f, 2.686f, 7.398f, 9.217f, 1.603f, 14.341f)
                arcToRelative(3.782f, 3.782f, 0.0f, false, true, -6.126f, -1.75f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, true, -0.095f, -1.622f)
                curveToRelative(-1.934f, 0.6f, -3.295f, 2.305f, -3.524f, 4.45f)
                curveToRelative(-0.204f, 1.912f, 0.324f, 4.044f, 2.056f, 5.634f)
                arcTo(11.0f, 11.0f, 0.0f, true, false, 13.65f, 1.12f)
                moveTo(2.748f, 6.21f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 8.9f, 22.55f)
                curveToRelative(-5.377f, -4.022f, -6.06f, -8.4f, -2.43f, -13.87f)
                arcToRelative(2.234f, 2.234f, 0.0f, true, false, -3.722f, -2.47f)
                moveToRelative(10.157f, -5.172f)
                curveToRelative(4.408f, 1.33f, 3.61f, 5.41f, 2.447f, 6.924f)
                curveToRelative(-0.86f, 1.117f, -2.922f, 1.46f, -3.708f, 2.238f)
                arcToRelative(4.18f, 4.18f, 0.0f, false, false, -1.212f, 2.292f)
                arcTo(5.3f, 5.3f, 0.0f, false, true, 12.0f, 12.258f)
                arcToRelative(5.672f, 5.672f, 0.0f, false, false, 1.404f, -11.169f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -0.5f, -0.052f)
            }
        }
        .build()
        return _tencenthy!!
    }

private var _tencenthy: ImageVector? = null
