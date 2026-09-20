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

public val SimpleIcons.Zdotai: ImageVector
    get() {
        if (_zdotai != null) {
            return _zdotai!!
        }
        _zdotai = Builder(name = "Zdotai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.606f, 1.806f)
                lineToRelative(-1.677f, 2.388f)
                curveToRelative(-0.258f, 0.374f, -0.697f, 0.606f, -1.161f, 0.606f)
                horizontalLineToRelative(-9.162f)
                verticalLineTo(1.794f)
                curveTo(0.594f, 1.806f, 12.606f, 1.806f, 12.606f, 1.806f)
                close()
                moveTo(24.0f, 1.806f)
                lineTo(9.6f, 22.206f)
                lineTo(0.0f, 22.206f)
                lineTo(14.4f, 1.806f)
                close()
                moveTo(11.394f, 22.206f)
                lineToRelative(1.69f, -2.4f)
                curveToRelative(0.258f, -0.374f, 0.697f, -0.606f, 1.161f, -0.606f)
                horizontalLineToRelative(9.149f)
                verticalLineToRelative(3.006f)
                horizontalLineTo(11.394f)
                close()
            }
        }
        .build()
        return _zdotai!!
    }

private var _zdotai: ImageVector? = null
