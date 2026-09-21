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

public val SimpleIcons.Langchain: ImageVector
    get() {
        if (_langchain != null) {
            return _langchain!!
        }
        _langchain = Builder(name = "Langchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.796f, 0.0f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, -4.91f, 2.019f)
                lineTo(5.451f, 5.455f)
                lineToRelative(3.273f, 3.27f)
                lineToRelative(3.432f, -3.432f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, true, 3.277f, 0.0f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 0.0f, 3.275f)
                lineTo(12.0f, 12.001f)
                lineToRelative(3.273f, 3.273f)
                lineToRelative(3.433f, -3.435f)
                curveToRelative(2.692f, -2.692f, 2.692f, -7.127f, 0.0f, -9.82f)
                arcTo(6.92f, 6.92f, 0.0f, false, false, 13.796f, 0.0f)
                moveToRelative(-5.07f, 8.728f)
                lineToRelative(-3.433f, 3.434f)
                curveToRelative(-2.692f, 2.693f, -2.692f, 7.126f, 0.0f, 9.819f)
                arcTo(6.92f, 6.92f, 0.0f, false, false, 10.203f, 24.0f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, 4.911f, -2.02f)
                lineToRelative(3.432f, -3.432f)
                lineToRelative(-3.271f, -3.272f)
                lineToRelative(-3.433f, 3.433f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, true, -3.277f, 0.0f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 0.0f, -3.276f)
                lineTo(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _langchain!!
    }

private var _langchain: ImageVector? = null
