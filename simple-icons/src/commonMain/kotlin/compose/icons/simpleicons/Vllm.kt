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

public val SimpleIcons.Vllm: ImageVector
    get() {
        if (_vllm != null) {
            return _vllm!!
        }
        _vllm = Builder(name = "Vllm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.6f, 0.0f)
                lineToRelative(-8.721f, 4.59f)
                lineTo(9.829f, 24.0f)
                horizontalLineToRelative(7.41f)
                close()
                moveTo(9.83f, 24.0f)
                verticalLineTo(5.142f)
                horizontalLineTo(0.4f)
                close()
            }
        }
        .build()
        return _vllm!!
    }

private var _vllm: ImageVector? = null
