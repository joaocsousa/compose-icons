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

public val SimpleIcons.Heliumbrowser: ImageVector
    get() {
        if (_heliumbrowser != null) {
            return _heliumbrowser!!
        }
        _heliumbrowser = Builder(name = "Heliumbrowser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.308f, 22.298f)
                lineTo(12.0f, 24.0f)
                lineToRelative(-2.308f, -1.702f)
                lineToRelative(1.049f, -8.119f)
                lineToRelative(-6.517f, 4.966f)
                lineTo(1.594f, 18.0f)
                lineToRelative(0.321f, -2.847f)
                lineTo(9.481f, 12.0f)
                lineToRelative(-7.566f, -3.153f)
                lineTo(1.594f, 6.0f)
                lineToRelative(2.63f, -1.146f)
                lineToRelative(6.517f, 4.966f)
                lineToRelative(-1.049f, -8.119f)
                lineTo(12.0f, 0.0f)
                lineToRelative(2.308f, 1.702f)
                lineToRelative(-1.049f, 8.119f)
                lineToRelative(6.517f, -4.966f)
                lineTo(22.406f, 6.0f)
                lineToRelative(-0.321f, 2.847f)
                lineTo(14.519f, 12.0f)
                lineToRelative(7.566f, 3.153f)
                lineToRelative(0.321f, 2.847f)
                lineToRelative(-2.63f, 1.146f)
                lineToRelative(-6.517f, -4.966f)
                close()
            }
        }
        .build()
        return _heliumbrowser!!
    }

private var _heliumbrowser: ImageVector? = null
