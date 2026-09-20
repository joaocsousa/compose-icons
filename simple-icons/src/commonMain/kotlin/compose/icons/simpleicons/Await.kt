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

public val SimpleIcons.Await: ImageVector
    get() {
        if (_await != null) {
            return _await!!
        }
        _await = Builder(name = "Await", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.125f, 3.125f, 0.0f, false, true, -4.694f, 2.703f)
                arcTo(3.126f, 3.126f, 0.0f, false, true, 12.0f, 23.0f)
                arcToRelative(3.126f, 3.126f, 0.0f, false, true, -5.306f, -1.297f)
                arcTo(3.125f, 3.125f, 0.0f, false, true, 2.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                curveTo(2.0f, 4.477f, 6.477f, 0.0f, 12.0f, 0.0f)
                moveToRelative(-1.25f, 10.625f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.625f, 0.625f)
                arcToRelative(1.875f, 1.875f, 0.0f, false, false, 3.75f, 0.0f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.625f, -0.625f)
                close()
                moveTo(8.875f, 5.625f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                moveToRelative(6.25f, 0.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            }
        }
        .build()
        return _await!!
    }

private var _await: ImageVector? = null
