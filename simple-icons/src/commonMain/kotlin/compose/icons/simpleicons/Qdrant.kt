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

public val SimpleIcons.Qdrant: ImageVector
    get() {
        if (_qdrant != null) {
            return _qdrant!!
        }
        _qdrant = Builder(name = "Qdrant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 16.5f)
                lineToRelative(3.897f, -2.25f)
                verticalLineToRelative(-4.5f)
                lineTo(12.0f, 7.5f)
                lineTo(8.103f, 9.75f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(1.607f, 18.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(3.897f, -2.25f)
                verticalLineToRelative(-4.5f)
                lineTo(12.0f, 19.5f)
                lineToRelative(-6.495f, -3.75f)
                verticalLineToRelative(-7.5f)
                lineTo(12.0f, 4.5f)
                lineToRelative(6.495f, 3.75f)
                verticalLineToRelative(15.0f)
                lineTo(22.393f, 21.0f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 0.0f)
                lineTo(1.607f, 6.0f)
                close()
            }
        }
        .build()
        return _qdrant!!
    }

private var _qdrant: ImageVector? = null
