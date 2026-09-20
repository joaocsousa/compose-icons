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

public val SimpleIcons.Trae: ImageVector
    get() {
        if (_trae != null) {
            return _trae!!
        }
        _trae = Builder(name = "Trae", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.5f)
                lineTo(3.5f, 20.5f)
                lineTo(3.5f, 17.0f)
                lineTo(0.0f, 17.0f)
                lineTo(0.0f, 3.5f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(3.5f, 17.0f)
                horizontalLineToRelative(17.0f)
                lineTo(20.5f, 7.0f)
                horizontalLineToRelative(-17.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(9.5f, 14.5f)
                lineTo(7.0f, 12.0f)
                lineToRelative(2.5f, -2.5f)
                close()
                moveTo(19.0f, 12.0f)
                lineTo(16.5f, 14.5f)
                lineTo(14.0f, 12.0f)
                lineToRelative(2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _trae!!
    }

private var _trae: ImageVector? = null
