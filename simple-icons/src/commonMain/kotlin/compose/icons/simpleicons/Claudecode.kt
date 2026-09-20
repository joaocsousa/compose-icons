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

public val SimpleIcons.Claudecode: ImageVector
    get() {
        if (_claudecode != null) {
            return _claudecode!!
        }
        _claudecode = Builder(name = "Claudecode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                lineTo(18.0f, 19.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                lineTo(15.0f, 19.5f)
                verticalLineToRelative(-3.0f)
                lineTo(9.0f, 16.5f)
                verticalLineToRelative(3.0f)
                lineTo(7.5f, 19.5f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 16.5f)
                verticalLineToRelative(3.0f)
                lineTo(4.5f, 19.5f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 16.5f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(6.0f, 10.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 7.5f)
                close()
                moveTo(16.5f, 10.5f)
                lineTo(18.0f, 10.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _claudecode!!
    }

private var _claudecode: ImageVector? = null
