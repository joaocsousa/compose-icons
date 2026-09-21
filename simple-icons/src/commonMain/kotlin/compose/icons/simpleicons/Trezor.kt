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

public val SimpleIcons.Trezor: ImageVector
    get() {
        if (_trezor != null) {
            return _trezor!!
        }
        _trezor = Builder(name = "Trezor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.858f, 5.569f)
                curveToRelative(0.0f, -3.044f, -2.643f, -5.569f, -5.86f, -5.569f)
                curveToRelative(-3.216f, 0.0f, -5.856f, 2.525f, -5.856f, 5.569f)
                verticalLineToRelative(1.78f)
                lineTo(3.731f, 7.349f)
                lineTo(3.731f, 20.15f)
                lineTo(11.998f, 24.0f)
                lineToRelative(8.271f, -3.849f)
                lineTo(20.269f, 7.403f)
                horizontalLineToRelative(-2.411f)
                close()
                moveTo(9.128f, 5.569f)
                curveToRelative(0.0f, -1.434f, 1.264f, -2.584f, 2.87f, -2.584f)
                curveToRelative(1.61f, 0.0f, 2.87f, 1.15f, 2.87f, 2.584f)
                verticalLineToRelative(1.78f)
                horizontalLineToRelative(-5.74f)
                close()
                moveTo(16.938f, 18.085f)
                lineTo(11.998f, 20.383f)
                lineTo(7.061f, 18.085f)
                verticalLineToRelative(-7.693f)
                horizontalLineToRelative(9.878f)
                close()
            }
        }
        .build()
        return _trezor!!
    }

private var _trezor: ImageVector? = null
