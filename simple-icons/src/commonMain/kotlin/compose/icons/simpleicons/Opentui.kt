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

public val SimpleIcons.Opentui: ImageVector
    get() {
        if (_opentui != null) {
            return _opentui!!
        }
        _opentui = Builder(name = "Opentui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.2f)
                verticalLineToRelative(21.6f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 1.2f)
                close()
                moveTo(4.8f, 7.2f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(9.6f)
                lineTo(4.8f, 16.8f)
                close()
            }
        }
        .build()
        return _opentui!!
    }

private var _opentui: ImageVector? = null
