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

public val SimpleIcons.Glass: ImageVector
    get() {
        if (_glass != null) {
            return _glass!!
        }
        _glass = Builder(name = "Glass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 11.0f, 0.0f)
                moveToRelative(13.0f, 13.0f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -11.0f, 11.0f)
                lineTo(13.0f, 13.0f)
                close()
                moveTo(18.5f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 11.0f)
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null
