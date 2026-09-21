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

public val SimpleIcons.Cinny: ImageVector
    get() {
        if (_cinny != null) {
            return _cinny!!
        }
        _cinny = Builder(name = "Cinny", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.333f, 0.0f, 0.0f, 5.333f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.333f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.333f, 12.0f, -12.0f)
                reflectiveCurveTo(18.667f, 0.0f, 12.0f, 0.0f)
                moveToRelative(-1.599f, 6.401f)
                horizontalLineToRelative(0.531f)
                curveToRelative(1.6f, 0.0f, 3.067f, 0.8f, 3.867f, 2.133f)
                curveTo(15.2f, 8.4f, 15.6f, 8.4f, 16.0f, 8.4f)
                curveToRelative(0.533f, 0.0f, 1.066f, 0.0f, 1.599f, 0.133f)
                curveToRelative(0.933f, 0.267f, 1.867f, 0.667f, 2.667f, 1.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.532f, -0.4f)
                curveToRelative(-1.6f, 0.0f, -2.933f, 0.533f, -3.867f, 1.867f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -1.466f, 4.265f)
                curveToRelative(0.0f, 2.0f, -0.534f, 3.868f, -1.734f, 5.602f)
                curveToRelative(-0.4f, 0.533f, -0.668f, 0.933f, -1.068f, 1.333f)
                curveToRelative(-4.0f, -0.933f, -7.067f, -4.0f, -8.0f, -8.0f)
                lineToRelative(4.667f, -3.068f)
                verticalLineToRelative(-0.4f)
                curveTo(6.266f, 8.532f, 8.0f, 6.667f, 10.4f, 6.4f)
                moveToRelative(2.266f, 1.466f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -0.667f, 0.667f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.667f, 0.667f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.666f, -0.667f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -0.666f, -0.667f)
            }
        }
        .build()
        return _cinny!!
    }

private var _cinny: ImageVector? = null
