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

public val SimpleIcons.Ghostfolio: ImageVector
    get() {
        if (_ghostfolio != null) {
            return _ghostfolio!!
        }
        _ghostfolio = Builder(name = "Ghostfolio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.983f, 0.0f)
                arcToRelative(9.375f, 9.375f, 0.0f, false, false, -9.358f, 9.375f)
                verticalLineToRelative(13.062f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, 1.334f, 0.553f)
                lineToRelative(1.791f, -1.844f)
                lineToRelative(2.573f, 2.625f)
                curveToRelative(0.305f, 0.305f, 0.8f, 0.305f, 1.105f, 0.0f)
                lineTo(12.0f, 21.146f)
                lineToRelative(2.573f, 2.625f)
                curveToRelative(0.305f, 0.305f, 0.8f, 0.305f, 1.105f, 0.0f)
                lineToRelative(2.572f, -2.625f)
                lineToRelative(1.792f, 1.844f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, 1.333f, -0.553f)
                verticalLineTo(9.455f)
                curveToRelative(0.0f, -5.166f, -4.226f, -9.464f, -9.392f, -9.455f)
                moveToRelative(-3.89f, 12.5f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, -2.343f, -2.344f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, 2.344f, -2.344f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, 2.344f, 2.344f)
                arcTo(2.346f, 2.346f, 0.0f, false, true, 8.094f, 12.5f)
                moveToRelative(7.814f, 0.0f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, -2.344f, -2.344f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, 2.344f, -2.344f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, 2.343f, 2.344f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, -2.343f, 2.344f)
            }
        }
        .build()
        return _ghostfolio!!
    }

private var _ghostfolio: ImageVector? = null
