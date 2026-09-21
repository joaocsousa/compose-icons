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

public val SimpleIcons.Lmstudio: ImageVector
    get() {
        if (_lmstudio != null) {
            return _lmstudio!!
        }
        _lmstudio = Builder(name = "Lmstudio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.025f, 0.0f)
                curveToRelative(3.492f, 0.0f, 5.237f, 0.0f, 6.571f, 0.68f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, true, 2.725f, 2.724f)
                curveTo(24.0f, 4.738f, 24.0f, 6.484f, 24.0f, 9.975f)
                verticalLineToRelative(4.05f)
                curveToRelative(0.0f, 3.492f, 0.0f, 5.237f, -0.68f, 6.571f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, true, -2.724f, 2.725f)
                curveToRelative(-1.334f, 0.679f, -3.08f, 0.679f, -6.571f, 0.679f)
                horizontalLineToRelative(-4.05f)
                curveToRelative(-3.492f, 0.0f, -5.237f, 0.0f, -6.571f, -0.68f)
                arcTo(6.24f, 6.24f, 0.0f, false, true, 0.68f, 20.597f)
                curveTo(0.0f, 19.262f, 0.0f, 17.516f, 0.0f, 14.025f)
                verticalLineToRelative(-4.05f)
                curveToRelative(0.0f, -3.492f, 0.0f, -5.237f, 0.68f, -6.571f)
                arcTo(6.23f, 6.23f, 0.0f, false, true, 3.404f, 0.68f)
                curveTo(4.738f, 0.0f, 6.484f, 0.0f, 9.975f, 0.0f)
                close()
                moveTo(7.688f, 16.313f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, 2.625f)
                horizontalLineToRelative(11.625f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, -2.625f)
                close()
                moveTo(4.688f, 12.563f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, 2.624f)
                horizontalLineToRelative(11.625f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, -2.624f)
                close()
                moveTo(7.688f, 8.813f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, 2.624f)
                horizontalLineToRelative(11.625f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, -2.624f)
                close()
                moveTo(4.688f, 5.063f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, 2.625f)
                horizontalLineToRelative(11.625f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, false, 0.0f, -2.625f)
                close()
            }
        }
        .build()
        return _lmstudio!!
    }

private var _lmstudio: ImageVector? = null
