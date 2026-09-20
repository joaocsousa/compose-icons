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

public val SimpleIcons.Trmnl: ImageVector
    get() {
        if (_trmnl != null) {
            return _trmnl!!
        }
        _trmnl = Builder(name = "Trmnl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.024f, 0.913f)
                lineToRelative(6.661f, 2.498f)
                lineToRelative(-1.237f, 3.299f)
                lineToRelative(-6.661f, -2.498f)
                close()
                moveTo(16.705f, 0.097f)
                lineToRelative(2.2f, 6.766f)
                lineToRelative(-3.35f, 1.09f)
                lineToRelative(-2.2f, -6.766f)
                close()
                moveTo(24.0f, 7.942f)
                lineToRelative(-3.917f, 5.939f)
                lineToRelative(-2.941f, -1.94f)
                lineTo(21.06f, 6.0f)
                close()
                moveTo(22.417f, 18.535f)
                lineTo(15.331f, 19.175f)
                lineTo(15.014f, 15.666f)
                lineTo(22.1f, 15.026f)
                close()
                moveTo(13.146f, 23.902f)
                lineTo(8.228f, 18.76f)
                lineToRelative(2.546f, -2.436f)
                lineToRelative(4.918f, 5.141f)
                close()
                moveTo(3.17f, 20.002f)
                lineTo(4.123f, 12.952f)
                lineTo(7.614f, 13.424f)
                lineTo(6.661f, 20.474f)
                close()
                moveTo(0.0f, 9.768f)
                lineToRelative(6.107f, -3.65f)
                lineTo(7.915f, 9.14f)
                lineToRelative(-6.107f, 3.65f)
                close()
            }
        }
        .build()
        return _trmnl!!
    }

private var _trmnl: ImageVector? = null
