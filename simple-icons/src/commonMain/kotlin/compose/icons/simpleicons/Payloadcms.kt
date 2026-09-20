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

public val SimpleIcons.Payloadcms: ImageVector
    get() {
        if (_payloadcms != null) {
            return _payloadcms!!
        }
        _payloadcms = Builder(name = "Payloadcms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9f, 20.4f)
                quadToRelative(0.1f, 0.1f, 0.2f, 0.0f)
                lineToRelative(5.5f, -3.2f)
                quadToRelative(0.1f, -0.05f, 0.2f, 0.0f)
                lineToRelative(2.6f, 1.5f)
                quadToRelative(0.2f, 0.15f, 0.0f, 0.3f)
                lineToRelative(-8.3f, 5.0f)
                horizontalLineToRelative(-0.2f)
                lineTo(1.8f, 18.1f)
                quadToRelative(-0.2f, -0.1f, -0.2f, -0.3f)
                verticalLineTo(6.2f)
                quadToRelative(0.0f, -0.2f, 0.2f, -0.3f)
                lineToRelative(1.3f, -0.8f)
                quadToRelative(0.15f, -0.1f, 0.3f, 0.0f)
                lineToRelative(9.8f, 5.7f)
                quadToRelative(0.2f, 0.1f, 0.2f, 0.3f)
                verticalLineToRelative(3.1f)
                quadToRelative(0.0f, 0.3f, -0.2f, 0.2f)
                lineTo(4.9f, 9.6f)
                quadToRelative(-0.2f, -0.1f, -0.2f, 0.2f)
                verticalLineTo(16.0f)
                quadToRelative(0.0f, 0.2f, 0.2f, 0.3f)
                close()
                moveTo(22.3f, 5.9f)
                quadToRelative(0.1f, 0.1f, 0.1f, 0.2f)
                verticalLineToRelative(9.8f)
                quadToRelative(0.0f, 0.2f, -0.2f, 0.1f)
                lineToRelative(-2.7f, -1.5f)
                quadToRelative(-0.2f, -0.1f, -0.2f, -0.3f)
                verticalLineTo(7.9f)
                quadToRelative(0.0f, -0.2f, -0.2f, -0.3f)
                lineToRelative(-7.0f, -4.0f)
                quadToRelative(-0.1f, -0.05f, -0.2f, 0.0f)
                lineTo(9.5f, 5.0f)
                quadToRelative(-0.1f, 0.05f, -0.2f, 0.0f)
                lineTo(6.7f, 3.4f)
                quadToRelative(-0.2f, -0.15f, 0.0f, -0.3f)
                lineTo(11.9f, 0.0f)
                horizontalLineToRelative(0.2f)
                close()
            }
        }
        .build()
        return _payloadcms!!
    }

private var _payloadcms: ImageVector? = null
