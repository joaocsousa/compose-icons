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

public val SimpleIcons.Shortcut: ImageVector
    get() {
        if (_shortcut != null) {
            return _shortcut!!
        }
        _shortcut = Builder(name = "Shortcut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.665f, 0.545f)
                lineTo(24.0f, 0.545f)
                lineTo(16.604f, 8.44f)
                lineToRelative(7.254f, 7.036f)
                lineToRelative(-7.473f, 7.978f)
                lineTo(0.0f, 23.451f)
                lineToRelative(7.427f, -7.929f)
                lineTo(0.202f, 8.514f)
                close()
                moveTo(8.76f, 16.815f)
                lineTo(4.284f, 21.595f)
                lineTo(13.69f, 21.597f)
                close()
                moveTo(15.95f, 21.202f)
                lineTo(21.254f, 15.539f)
                lineTo(15.334f, 9.797f)
                lineTo(10.03f, 15.46f)
                close()
                moveTo(14.0f, 8.503f)
                lineTo(8.11f, 2.788f)
                lineTo(2.805f, 8.452f)
                lineToRelative(5.892f, 5.714f)
                close()
                moveTo(15.27f, 7.147f)
                lineTo(19.715f, 2.402f)
                horizontalLineToRelative(-9.336f)
                close()
            }
        }
        .build()
        return _shortcut!!
    }

private var _shortcut: ImageVector? = null
