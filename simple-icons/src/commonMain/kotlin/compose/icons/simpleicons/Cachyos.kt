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

public val SimpleIcons.Cachyos: ImageVector
    get() {
        if (_cachyos != null) {
            return _cachyos!!
        }
        _cachyos = Builder(name = "Cachyos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.301f, 2.646f)
                lineTo(0.0f, 11.771f)
                lineToRelative(5.541f, 9.583f)
                horizontalLineToRelative(11.486f)
                lineToRelative(2.904f, -5.017f)
                horizontalLineTo(8.102f)
                lineToRelative(-2.56f, -4.429f)
                lineTo(8.067f, 7.54f)
                horizontalLineToRelative(6.063f)
                lineToRelative(2.83f, -4.893f)
                close()
                moveTo(20.058f, 4.12f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, 0.0f, 1.496f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, 0.0f, -1.496f)
                moveToRelative(-1.983f, 4.303f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, false, 0.0f, 2.9f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, false, 0.0f, -2.9f)
                moveToRelative(4.02f, 3.98f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, false, 0.0f, 3.809f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, false, 0.0f, -3.81f)
            }
        }
        .build()
        return _cachyos!!
    }

private var _cachyos: ImageVector? = null
