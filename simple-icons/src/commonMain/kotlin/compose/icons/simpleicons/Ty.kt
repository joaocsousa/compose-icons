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

public val SimpleIcons.Ty: ImageVector
    get() {
        if (_ty != null) {
            return _ty!!
        }
        _ty = Builder(name = "Ty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.84f)
                horizontalLineTo(13.92f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(3.84f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(9.12f)
                horizontalLineToRelative(1.92f)
                verticalLineToRelative(7.147f)
                arcTo(3.893f, 3.893f, 0.0f, false, false, 5.813f, 24.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-9.12f)
                horizontalLineTo(13.92f)
                verticalLineToRelative(-1.92f)
                horizontalLineToRelative(6.187f)
                arcTo(3.893f, 3.893f, 0.0f, false, false, 24.0f, 9.067f)
                close()
            }
        }
        .build()
        return _ty!!
    }

private var _ty: ImageVector? = null
