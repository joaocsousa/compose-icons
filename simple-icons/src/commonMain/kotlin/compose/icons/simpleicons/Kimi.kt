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

public val SimpleIcons.Kimi: ImageVector
    get() {
        if (_kimi != null) {
            return _kimi!!
        }
        _kimi = Builder(name = "Kimi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.765f, 0.351f)
                curveTo(22.998f, 0.351f, 24.0f, 1.353f, 24.0f, 2.586f)
                reflectiveCurveTo(22.998f, 4.82f, 21.765f, 4.82f)
                horizontalLineToRelative(-1.974f)
                curveToRelative(-0.15f, 0.0f, -0.26f, -0.12f, -0.26f, -0.26f)
                verticalLineTo(2.586f)
                arcTo(2.237f, 2.237f, 0.0f, false, true, 21.765f, 0.35f)
                moveTo(9.41f, 13.388f)
                lineToRelative(8.447f, -8.377f)
                curveToRelative(0.16f, -0.16f, 0.07f, -0.471f, -0.14f, -0.471f)
                horizontalLineToRelative(-4.55f)
                reflectiveCurveToRelative(-0.1f, 0.02f, -0.14f, 0.06f)
                lineToRelative(-9.099f, 9.029f)
                curveToRelative(-0.14f, 0.14f, -0.35f, 0.02f, -0.35f, -0.21f)
                verticalLineTo(4.81f)
                curveToRelative(0.0f, -0.15f, -0.1f, -0.27f, -0.221f, -0.27f)
                horizontalLineTo(0.22f)
                curveToRelative(-0.12f, 0.0f, -0.22f, 0.12f, -0.22f, 0.27f)
                verticalLineToRelative(18.57f)
                curveToRelative(0.0f, 0.15f, 0.1f, 0.27f, 0.22f, 0.27f)
                horizontalLineToRelative(3.137f)
                curveToRelative(0.12f, 0.0f, 0.22f, -0.12f, 0.22f, -0.27f)
                verticalLineToRelative(-3.79f)
                curveToRelative(0.0f, -0.08f, 0.03f, -0.16f, 0.08f, -0.21f)
                lineToRelative(2.826f, -2.796f)
                curveToRelative(0.07f, -0.07f, 0.16f, -0.08f, 0.241f, -0.03f)
                lineToRelative(7.546f, 5.551f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 4.018f, 1.493f)
                curveToRelative(0.12f, 0.01f, 0.23f, -0.11f, 0.23f, -0.27f)
                verticalLineTo(19.76f)
                curveToRelative(0.0f, -0.14f, -0.08f, -0.25f, -0.19f, -0.26f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -2.355f, -0.942f)
                lineToRelative(-6.533f, -4.73f)
                curveToRelative(-0.14f, -0.09f, -0.15f, -0.32f, -0.03f, -0.441f)
            }
        }
        .build()
        return _kimi!!
    }

private var _kimi: ImageVector? = null
