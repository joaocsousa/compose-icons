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

public val SimpleIcons.Tidb: ImageVector
    get() {
        if (_tidb != null) {
            return _tidb!!
        }
        _tidb = Builder(name = "Tidb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.609f, 6.001f)
                verticalLineToRelative(11.998f)
                lineTo(11.999f, 24.0f)
                lineToRelative(10.393f, -6.001f)
                lineTo(22.392f, 6.001f)
                close()
                moveTo(8.535f, 17.999f)
                verticalLineToRelative(-7.998f)
                lineTo(5.07f, 12.0f)
                lineTo(5.07f, 8.0f)
                lineTo(12.0f, 4.0f)
                lineToRelative(3.462f, 2.0f)
                lineToRelative(-3.464f, 2.001f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(15.465f, 17.999f)
                verticalLineToRelative(-7.997f)
                lineToRelative(3.464f, -2.0f)
                verticalLineToRelative(7.997f)
                close()
            }
        }
        .build()
        return _tidb!!
    }

private var _tidb: ImageVector? = null
