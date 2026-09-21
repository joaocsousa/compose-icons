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

public val SimpleIcons.Tickettailor: ImageVector
    get() {
        if (_tickettailor != null) {
            return _tickettailor!!
        }
        _tickettailor = Builder(name = "Tickettailor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.328f, 19.239f)
                lineTo(15.283f, 0.631f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, false, -1.15f, -0.586f)
                lineToRelative(-3.374f, 1.096f)
                arcToRelative(2.146f, 2.146f, 0.0f, true, true, -4.083f, 1.325f)
                lineTo(3.131f, 3.62f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, -0.469f, 0.92f)
                lineToRelative(6.159f, 18.955f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, 0.92f, 0.469f)
                lineToRelative(3.545f, -1.152f)
                arcToRelative(2.148f, 2.148f, 0.0f, true, true, 4.085f, -1.327f)
                lineToRelative(3.372f, -1.096f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, false, 0.586f, -1.15f)
                close()
                moveTo(10.302f, 14.52f)
                lineTo(8.578f, 14.52f)
                lineTo(8.578f, 8.345f)
                lineTo(6.506f, 8.345f)
                lineTo(6.506f, 6.673f)
                horizontalLineToRelative(5.857f)
                verticalLineToRelative(1.672f)
                horizontalLineToRelative(-2.061f)
                close()
                moveTo(17.167f, 10.943f)
                horizontalLineToRelative(-2.061f)
                verticalLineToRelative(6.176f)
                lineTo(13.38f, 17.119f)
                verticalLineToRelative(-6.176f)
                horizontalLineToRelative(-2.073f)
                lineTo(11.307f, 9.271f)
                horizontalLineToRelative(5.86f)
                close()
            }
        }
        .build()
        return _tickettailor!!
    }

private var _tickettailor: ImageVector? = null
