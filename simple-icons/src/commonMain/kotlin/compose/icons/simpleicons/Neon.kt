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

public val SimpleIcons.Neon: ImageVector
    get() {
        if (_neon != null) {
            return _neon!!
        }
        _neon = Builder(name = "Neon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                verticalLineTo(24.0f)
                lineToRelative(-9.365f, -8.045f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(2.942f, 21.087f)
                horizontalLineToRelative(8.751f)
                verticalLineTo(9.563f)
                lineToRelative(9.365f, 8.204f)
                verticalLineTo(2.919f)
                lineTo(2.942f, 2.914f)
                close()
            }
        }
        .build()
        return _neon!!
    }

private var _neon: ImageVector? = null
