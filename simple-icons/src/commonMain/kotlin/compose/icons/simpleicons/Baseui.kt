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

public val SimpleIcons.Baseui: ImageVector
    get() {
        if (_baseui != null) {
            return _baseui!!
        }
        _baseui = Builder(name = "Baseui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.082f, 6.562f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, -0.546f, 0.529f)
                verticalLineTo(24.0f)
                arcToRelative(8.727f, 8.727f, 0.0f, false, false, 0.546f, -17.438f)
                moveTo(11.446f, 9.6f)
                verticalLineTo(24.0f)
                curveToRelative(-4.82f, 0.0f, -8.728f, -4.298f, -8.728f, -9.6f)
                verticalLineTo(0.0f)
                curveToRelative(4.82f, 0.0f, 8.728f, 4.298f, 8.728f, 9.6f)
                close()
            }
        }
        .build()
        return _baseui!!
    }

private var _baseui: ImageVector? = null
