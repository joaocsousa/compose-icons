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

public val SimpleIcons.Zx: ImageVector
    get() {
        if (_zx != null) {
            return _zx!!
        }
        _zx = Builder(name = "Zx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.036f, 18.327f)
                verticalLineToRelative(5.673f)
                horizontalLineToRelative(-20.072f)
                verticalLineToRelative(-5.673f)
                lineToRelative(6.152f, -6.56f)
                lineTo(2.4f, 5.673f)
                lineTo(2.4f, 0.0f)
                horizontalLineToRelative(19.156f)
                verticalLineToRelative(5.673f)
                lineToRelative(-5.716f, 6.094f)
                lineToRelative(6.153f, 6.56f)
                horizontalLineToRelative(0.043f)
                close()
                moveTo(11.978f, 7.65f)
                lineToRelative(1.855f, -1.977f)
                horizontalLineToRelative(-3.709f)
                lineToRelative(1.854f, 1.977f)
                close()
                moveTo(11.978f, 15.885f)
                lineToRelative(-2.291f, 2.442f)
                horizontalLineToRelative(4.582f)
                lineToRelative(-2.291f, -2.442f)
                close()
            }
        }
        .build()
        return _zx!!
    }

private var _zx: ImageVector? = null
