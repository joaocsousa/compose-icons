package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.MarkGithub24: ImageVector
    get() {
        if (_markGithub24 != null) {
            return _markGithub24!!
        }
        _markGithub24 = Builder(name = "MarkGithub24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.226f, 17.284f)
                curveToRelative(-2.965f, -0.36f, -5.054f, -2.493f, -5.054f, -5.256f)
                curveToRelative(0.0f, -1.123f, 0.404f, -2.336f, 1.078f, -3.144f)
                curveToRelative(-0.292f, -0.741f, -0.247f, -2.314f, 0.09f, -2.965f)
                curveToRelative(0.898f, -0.112f, 2.111f, 0.36f, 2.83f, 1.01f)
                curveToRelative(0.853f, -0.269f, 1.752f, -0.404f, 2.853f, -0.404f)
                curveToRelative(1.1f, 0.0f, 1.999f, 0.135f, 2.807f, 0.382f)
                curveToRelative(0.696f, -0.629f, 1.932f, -1.1f, 2.83f, -0.988f)
                curveToRelative(0.315f, 0.606f, 0.36f, 2.179f, 0.067f, 2.942f)
                curveToRelative(0.72f, 0.854f, 1.101f, 2.0f, 1.101f, 3.167f)
                curveToRelative(0.0f, 2.763f, -2.089f, 4.852f, -5.098f, 5.234f)
                curveToRelative(0.763f, 0.494f, 1.28f, 1.572f, 1.28f, 2.807f)
                verticalLineToRelative(2.336f)
                curveToRelative(0.0f, 0.674f, 0.561f, 1.056f, 1.235f, 0.786f)
                curveToRelative(4.066f, -1.55f, 7.255f, -5.615f, 7.255f, -10.646f)
                curveTo(23.5f, 6.188f, 18.334f, 1.0f, 11.978f, 1.0f)
                curveTo(5.62f, 1.0f, 0.5f, 6.188f, 0.5f, 12.545f)
                curveToRelative(0.0f, 4.986f, 3.167f, 9.12f, 7.435f, 10.669f)
                curveToRelative(0.606f, 0.225f, 1.19f, -0.18f, 1.19f, -0.786f)
                verticalLineTo(20.63f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -1.078f, 0.224f)
                curveToRelative(-1.483f, 0.0f, -2.359f, -0.808f, -2.987f, -2.313f)
                curveToRelative(-0.247f, -0.607f, -0.517f, -0.966f, -1.034f, -1.033f)
                curveToRelative(-0.27f, -0.023f, -0.359f, -0.135f, -0.359f, -0.27f)
                curveToRelative(0.0f, -0.27f, 0.45f, -0.471f, 0.898f, -0.471f)
                curveToRelative(0.652f, 0.0f, 1.213f, 0.404f, 1.797f, 1.235f)
                curveToRelative(0.45f, 0.651f, 0.921f, 0.943f, 1.483f, 0.943f)
                curveToRelative(0.561f, 0.0f, 0.92f, -0.202f, 1.437f, -0.719f)
                curveToRelative(0.382f, -0.381f, 0.674f, -0.718f, 0.944f, -0.943f)
            }
        }
        .build()
        return _markGithub24!!
    }

private var _markGithub24: ImageVector? = null
