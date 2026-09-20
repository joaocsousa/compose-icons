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

public val SimpleIcons.Alphaxiv: ImageVector
    get() {
        if (_alphaxiv != null) {
            return _alphaxiv!!
        }
        _alphaxiv = Builder(name = "Alphaxiv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.749f, 12.21f)
                lineTo(24.0f, 16.46f)
                lineToRelative(-1.827f, 1.821f)
                lineToRelative(-4.248f, -4.23f)
                close()
                moveTo(9.149f, 3.584f)
                arcToRelative(4.03f, 4.03f, 0.0f, false, true, 3.09f, 1.12f)
                lineTo(15.4f, 7.867f)
                lineToRelative(-1.841f, 1.822f)
                lineToRelative(-3.232f, -3.226f)
                arcTo(1.38f, 1.38f, 0.0f, false, false, 8.55f, 6.5f)
                lineToRelative(-6.725f, 6.722f)
                lineTo(0.0f, 11.399f)
                lineToRelative(6.84f, -6.837f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 2.309f, -0.979f)
                moveToRelative(13.026f, 0.033f)
                lineTo(24.0f, 5.44f)
                lineTo(10.032f, 19.403f)
                curveToRelative(-3.823f, 3.204f, -8.805f, -1.788f, -5.58f, -5.598f)
                lineToRelative(5.361f, -5.356f)
                lineToRelative(1.825f, 1.824f)
                lineToRelative(-5.274f, 5.271f)
                curveToRelative(-1.108f, 1.347f, 0.633f, 3.054f, 1.96f, 1.921f)
                close()
            }
        }
        .build()
        return _alphaxiv!!
    }

private var _alphaxiv: ImageVector? = null
