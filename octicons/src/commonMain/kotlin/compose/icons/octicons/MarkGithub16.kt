package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.MarkGithub16: ImageVector
    get() {
        if (_markGithub16 != null) {
            return _markGithub16!!
        }
        _markGithub16 = Builder(name = "MarkGithub16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.766f, 11.328f)
                curveToRelative(-2.063f, -0.25f, -3.516f, -1.734f, -3.516f, -3.656f)
                curveToRelative(0.0f, -0.781f, 0.281f, -1.625f, 0.75f, -2.188f)
                curveToRelative(-0.203f, -0.515f, -0.172f, -1.609f, 0.063f, -2.062f)
                curveToRelative(0.625f, -0.078f, 1.468f, 0.25f, 1.968f, 0.703f)
                curveToRelative(0.594f, -0.187f, 1.219f, -0.281f, 1.985f, -0.281f)
                curveToRelative(0.765f, 0.0f, 1.39f, 0.094f, 1.953f, 0.265f)
                curveToRelative(0.484f, -0.437f, 1.344f, -0.765f, 1.969f, -0.687f)
                curveToRelative(0.218f, 0.422f, 0.25f, 1.515f, 0.046f, 2.047f)
                curveToRelative(0.5f, 0.593f, 0.766f, 1.39f, 0.766f, 2.203f)
                curveToRelative(0.0f, 1.922f, -1.453f, 3.375f, -3.547f, 3.64f)
                curveToRelative(0.531f, 0.344f, 0.89f, 1.094f, 0.89f, 1.954f)
                verticalLineToRelative(1.625f)
                curveToRelative(0.0f, 0.468f, 0.391f, 0.734f, 0.86f, 0.547f)
                curveTo(13.781f, 14.359f, 16.0f, 11.53f, 16.0f, 8.03f)
                curveTo(16.0f, 3.61f, 12.406f, 0.0f, 7.984f, 0.0f)
                curveTo(3.563f, 0.0f, 0.0f, 3.61f, 0.0f, 8.031f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, false, 5.172f, 7.422f)
                curveToRelative(0.422f, 0.156f, 0.828f, -0.125f, 0.828f, -0.547f)
                verticalLineToRelative(-1.25f)
                curveToRelative(-0.219f, 0.094f, -0.5f, 0.156f, -0.75f, 0.156f)
                curveToRelative(-1.031f, 0.0f, -1.64f, -0.562f, -2.078f, -1.609f)
                curveToRelative(-0.172f, -0.422f, -0.36f, -0.672f, -0.719f, -0.719f)
                curveToRelative(-0.187f, -0.015f, -0.25f, -0.093f, -0.25f, -0.187f)
                curveToRelative(0.0f, -0.188f, 0.313f, -0.328f, 0.625f, -0.328f)
                curveToRelative(0.453f, 0.0f, 0.844f, 0.281f, 1.25f, 0.86f)
                curveToRelative(0.313f, 0.452f, 0.64f, 0.655f, 1.031f, 0.655f)
                reflectiveCurveToRelative(0.641f, -0.14f, 1.0f, -0.5f)
                curveToRelative(0.266f, -0.265f, 0.47f, -0.5f, 0.657f, -0.656f)
            }
        }
        .build()
        return _markGithub16!!
    }

private var _markGithub16: ImageVector? = null
