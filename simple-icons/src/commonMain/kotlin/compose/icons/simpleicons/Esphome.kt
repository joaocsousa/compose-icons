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

public val SimpleIcons.Esphome: ImageVector
    get() {
        if (_esphome != null) {
            return _esphome!!
        }
        _esphome = Builder(name = "Esphome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.311f)
                curveToRelative(-0.384f, 0.0f, -0.769f, 0.146f, -1.06f, 0.437f)
                lineToRelative(-9.878f, 9.88f)
                curveTo(0.478f, 11.21f, 0.0f, 12.364f, 0.0f, 13.189f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.825f, 0.675f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.899f)
                verticalLineTo(8.755f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.6f, -0.6f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.6f, 0.6f)
                verticalLineToRelative(2.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, 0.6f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.6f, 0.6f)
                verticalLineToRelative(2.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, 0.6f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.6f, 0.6f)
                verticalLineToRelative(2.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, 0.6f)
                horizontalLineToRelative(-5.6f)
                arcToRelative(0.6f, 0.6f, 0.0f, true, true, 0.0f, -1.2f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, -0.6f)
                verticalLineToRelative(-2.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.6f, -0.6f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, -0.6f)
                verticalLineToRelative(-2.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.6f, -0.6f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.2f)
                horizontalLineTo(8.6f)
                verticalLineToRelative(14.334f)
                horizontalLineToRelative(13.9f)
                curveToRelative(0.825f, 0.0f, 1.5f, -0.675f, 1.5f, -1.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.825f, -0.478f, -1.978f, -1.061f, -2.561f)
                lineToRelative(-9.88f, -9.88f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 0.311f)
            }
        }
        .build()
        return _esphome!!
    }

private var _esphome: ImageVector? = null
