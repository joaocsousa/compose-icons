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

public val SimpleIcons.Langgraph: ImageVector
    get() {
        if (_langgraph != null) {
            return _langgraph!!
        }
        _langgraph = Builder(name = "Langgraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(10.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 5.0f, 14.0f)
                close()
                moveTo(19.0f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 14.0f, 19.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(10.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 5.0f, 10.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(19.0f, 5.0f)
                verticalLineTo(10.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 14.0f, 5.0f)
                close()
            }
        }
        .build()
        return _langgraph!!
    }

private var _langgraph: ImageVector? = null
