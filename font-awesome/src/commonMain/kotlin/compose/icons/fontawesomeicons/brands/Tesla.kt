package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Tesla: ImageVector
    get() {
        if (_tesla != null) {
            return _tesla!!
        }
        _tesla = Builder(name = "Tesla", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.1f, 49.8f)
                curveToRelative(1.0f, 0.0f, 91.5f, 2.1f, 181.5f, 43.8f)
                curveToRelative(-23.2f, 34.8f, -69.2f, 52.0f, -69.2f, 52.0f)
                curveToRelative(-3.1f, -30.7f, -24.7f, -38.2f, -93.3f, -38.2f)
                lineTo(256.1f, 512.0f)
                lineTo(183.6f, 107.4f)
                curveToRelative(-68.1f, 0.0f, -89.7f, 7.6f, -92.9f, 38.2f)
                curveToRelative(-0.9f, -0.4f, -46.3f, -17.5f, -69.2f, -52.0f)
                curveToRelative(90.5f, -41.9f, 181.5f, -43.8f, 181.5f, -43.8f)
                lineToRelative(53.0f, 64.6f)
                lineToRelative(53.0f, -64.6f)
                close()
                moveTo(256.1f, 0.0f)
                curveToRelative(75.6f, 0.3f, 163.4f, 13.0f, 257.1f, 50.1f)
                curveToRelative(0.0f, 0.1f, -3.0f, 9.3f, -14.4f, 29.8f)
                curveToRelative(-80.4f, -35.0f, -159.0f, -47.7f, -228.8f, -48.7f)
                lineToRelative(-13.8f, 0.0f)
                curveTo(182.9f, 30.6f, 99.1f, 42.5f, 13.4f, 79.8f)
                curveTo(3.2f, 61.3f, -1.0f, 50.1f, -1.0f, 50.1f)
                curveTo(92.7f, 13.0f, 180.5f, 0.3f, 256.1f, 0.0f)
                close()
            }
        }
        .build()
        return _tesla!!
    }

private var _tesla: ImageVector? = null
