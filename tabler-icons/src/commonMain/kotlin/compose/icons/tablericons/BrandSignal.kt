package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandSignal: ImageVector
    get() {
        if (_brandSignal != null) {
            return _brandSignal!!
        }
        _brandSignal = Builder(name = "BrandSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.708f, 22.726f)
                lineToRelative(0.148f, -0.034f)
                lineToRelative(0.822f, -0.191f)
                moveToRelative(2.754f, -0.642f)
                lineToRelative(0.472f, -0.11f)
                curveToRelative(0.485f, 0.254f, 0.987f, 0.469f, 1.501f, 0.647f)
                moveToRelative(2.939f, 0.584f)
                curveToRelative(0.218f, 0.013f, 0.437f, 0.02f, 0.656f, 0.02f)
                curveToRelative(0.22f, 0.0f, 0.439f, -0.008f, 0.657f, -0.02f)
                moveToRelative(2.939f, -0.583f)
                curveToRelative(0.418f, -0.144f, 0.824f, -0.312f, 1.217f, -0.504f)
                moveToRelative(2.484f, -1.663f)
                curveToRelative(0.329f, -0.292f, 0.641f, -0.604f, 0.933f, -0.933f)
                moveToRelative(1.663f, -2.485f)
                curveToRelative(0.192f, -0.393f, 0.36f, -0.799f, 0.505f, -1.216f)
                moveToRelative(0.582f, -2.94f)
                curveToRelative(0.012f, -0.217f, 0.02f, -0.436f, 0.02f, -0.656f)
                curveToRelative(0.0f, -0.22f, -0.008f, -0.439f, -0.02f, -0.657f)
                moveToRelative(-0.583f, -2.939f)
                curveToRelative(-0.144f, -0.418f, -0.313f, -0.824f, -0.504f, -1.217f)
                moveToRelative(-1.663f, -2.484f)
                curveToRelative(-0.292f, -0.329f, -0.604f, -0.641f, -0.933f, -0.933f)
                moveToRelative(-2.485f, -1.663f)
                curveToRelative(-0.393f, -0.192f, -0.799f, -0.36f, -1.216f, -0.505f)
                moveToRelative(-2.94f, -0.582f)
                curveToRelative(-0.217f, -0.012f, -0.436f, -0.02f, -0.656f, -0.02f)
                curveToRelative(-0.22f, 0.0f, -0.439f, 0.008f, -0.657f, 0.02f)
                moveToRelative(-2.939f, 0.583f)
                curveToRelative(-0.418f, 0.144f, -0.824f, 0.313f, -1.217f, 0.504f)
                moveToRelative(-2.484f, 1.663f)
                curveToRelative(-0.329f, 0.292f, -0.641f, 0.604f, -0.933f, 0.933f)
                moveToRelative(-1.663f, 2.485f)
                curveToRelative(-0.192f, 0.393f, -0.36f, 0.799f, -0.505f, 1.216f)
                moveToRelative(-0.582f, 2.94f)
                curveToRelative(-0.012f, 0.217f, -0.02f, 0.436f, -0.02f, 0.656f)
                curveToRelative(0.0f, 0.219f, 0.007f, 0.438f, 0.02f, 0.657f)
                moveToRelative(0.584f, 2.939f)
                curveToRelative(0.178f, 0.514f, 0.394f, 1.016f, 0.648f, 1.501f)
                lineToRelative(-0.11f, 0.471f)
                moveToRelative(-0.643f, 2.754f)
                lineToRelative(-0.217f, 0.93f)
                lineToRelative(-0.009f, 0.039f)
                curveToRelative(-0.15f, 0.643f, 0.249f, 1.286f, 0.892f, 1.436f)
                curveToRelative(0.179f, 0.041f, 0.365f, 0.041f, 0.543f, -0.001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.848f, 19.152f)
                lineToRelative(2.446f, -0.57f)
                lineToRelative(0.993f, 0.519f)
                curveToRelative(0.56f, 0.292f, 1.167f, 0.519f, 1.805f, 0.675f)
                curveToRelative(0.597f, 0.149f, 1.238f, 0.223f, 1.908f, 0.223f)
                curveToRelative(2.21f, 0.0f, 4.21f, -0.895f, 5.657f, -2.342f)
                curveToRelative(1.447f, -1.447f, 2.342f, -3.447f, 2.342f, -5.657f)
                curveToRelative(0.0f, -2.21f, -0.895f, -4.21f, -2.342f, -5.657f)
                curveToRelative(-1.447f, -1.447f, -3.447f, -2.342f, -5.657f, -2.342f)
                curveToRelative(-2.21f, 0.0f, -4.21f, 0.895f, -5.657f, 2.342f)
                curveToRelative(-1.447f, 1.447f, -2.342f, 3.447f, -2.342f, 5.657f)
                curveToRelative(0.0f, 0.666f, 0.075f, 1.308f, 0.223f, 1.909f)
                curveToRelative(0.156f, 0.637f, 0.383f, 1.244f, 0.676f, 1.805f)
                lineToRelative(0.519f, 0.993f)
                lineToRelative(-0.571f, 2.445f)
            }
        }
        .build()
        return _brandSignal!!
    }

private var _brandSignal: ImageVector? = null
