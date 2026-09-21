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

public val SimpleIcons.Dlthub: ImageVector
    get() {
        if (_dlthub != null) {
            return _dlthub!!
        }
        _dlthub = Builder(name = "Dlthub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.498f)
                horizontalLineToRelative(-1.008f)
                verticalLineToRelative(3.01f)
                lineTo(24.0f, 14.508f)
                close()
                moveTo(20.976f, 11.498f)
                horizontalLineToRelative(2.016f)
                verticalLineToRelative(-1.004f)
                horizontalLineToRelative(-2.016f)
                lineTo(20.976f, 8.487f)
                horizontalLineToRelative(-1.008f)
                verticalLineToRelative(7.025f)
                horizontalLineToRelative(3.024f)
                verticalLineToRelative(-1.004f)
                horizontalLineToRelative(-2.016f)
                close()
                moveTo(17.99f, 14.508f)
                horizontalLineToRelative(-2.016f)
                verticalLineToRelative(1.004f)
                horizontalLineToRelative(3.024f)
                verticalLineToRelative(-5.017f)
                lineTo(17.99f, 10.495f)
                close()
                moveTo(15.974f, 10.495f)
                horizontalLineToRelative(-1.008f)
                verticalLineToRelative(4.014f)
                horizontalLineToRelative(1.008f)
                close()
                moveTo(12.989f, 11.498f)
                horizontalLineToRelative(-2.016f)
                verticalLineToRelative(-3.01f)
                lineTo(9.965f, 8.488f)
                verticalLineToRelative(7.024f)
                horizontalLineToRelative(1.008f)
                verticalLineToRelative(-3.01f)
                horizontalLineToRelative(2.016f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(1.008f)
                lineTo(13.997f, 8.488f)
                horizontalLineToRelative(-1.008f)
                close()
                moveTo(1.008f, 11.498f)
                lineTo(0.0f, 11.498f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(1.008f)
                close()
                moveTo(3.024f, 10.495f)
                lineTo(1.008f, 10.495f)
                verticalLineToRelative(1.003f)
                horizontalLineToRelative(2.016f)
                verticalLineToRelative(3.01f)
                lineTo(1.008f, 14.508f)
                verticalLineToRelative(1.004f)
                horizontalLineToRelative(3.024f)
                lineTo(4.032f, 8.488f)
                lineTo(3.024f, 8.488f)
                close()
                moveTo(5.0f, 15.512f)
                horizontalLineToRelative(1.01f)
                lineTo(6.01f, 8.488f)
                lineTo(5.001f, 8.488f)
                close()
                moveTo(7.986f, 8.488f)
                lineTo(6.98f, 8.488f)
                verticalLineToRelative(6.02f)
                horizontalLineToRelative(1.008f)
                verticalLineToRelative(-3.01f)
                horizontalLineToRelative(1.008f)
                verticalLineToRelative(-1.003f)
                lineTo(7.987f, 10.495f)
                close()
                moveTo(8.994f, 14.508f)
                lineTo(7.987f, 14.508f)
                verticalLineToRelative(1.004f)
                horizontalLineToRelative(1.008f)
                close()
            }
        }
        .build()
        return _dlthub!!
    }

private var _dlthub: ImageVector? = null
