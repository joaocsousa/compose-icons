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

public val BrandsGroup.Codeberg: ImageVector
    get() {
        if (_codeberg != null) {
            return _codeberg!!
        }
        _codeberg = Builder(name = "Codeberg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, 48.1f, 13.5f, 95.3f, 39.1f, 136.0f)
                lineTo(252.5f, 116.1f)
                curveToRelative(1.5f, -2.0f, 5.4f, -2.0f, 6.9f, 0.0f)
                lineToRelative(89.1f, 115.2f)
                lineToRelative(-63.8f, 0.0f)
                lineToRelative(1.4f, 5.1f)
                lineToRelative(66.4f, 0.0f)
                lineToRelative(18.8f, 24.3f)
                lineToRelative(-78.4f, 0.0f)
                lineToRelative(2.2f, 8.0f)
                lineToRelative(82.4f, 0.0f)
                lineToRelative(16.6f, 21.4f)
                lineToRelative(-93.0f, 0.0f)
                lineToRelative(2.9f, 10.3f)
                lineToRelative(98.0f, 0.0f)
                lineToRelative(14.8f, 19.1f)
                lineToRelative(-107.5f, 0.0f)
                lineToRelative(3.5f, 12.6f)
                lineToRelative(113.6f, 0.0f)
                lineToRelative(13.0f, 16.8f)
                lineToRelative(-122.0f, 0.0f)
                lineToRelative(3.9f, 13.9f)
                lineToRelative(128.8f, 0.0f)
                lineToRelative(12.0f, 15.5f)
                lineToRelative(-136.5f, 0.0f)
                lineToRelative(3.9f, 13.9f)
                lineToRelative(143.3f, 0.0f)
                curveTo(498.5f, 351.2f, 512.0f, 304.0f, 512.0f, 256.0f)
                curveTo(512.0f, 114.6f, 397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 114.6f, 0.0f, 256.0f)
                close()
                moveTo(333.9f, 407.5f)
                lineToRelative(3.9f, 13.9f)
                lineToRelative(113.6f, 0.0f)
                curveToRelative(3.7f, -4.4f, 7.5f, -9.2f, 11.0f, -13.9f)
                lineToRelative(-128.5f, 0.0f)
                close()
                moveTo(342.1f, 436.9f)
                lineToRelative(3.8f, 13.9f)
                lineToRelative(76.0f, 0.0f)
                curveToRelative(5.0f, -4.2f, 10.4f, -9.1f, 15.2f, -13.9f)
                lineToRelative(-95.0f, 0.0f)
                close()
                moveTo(350.3f, 466.3f)
                lineToRelative(3.9f, 13.8f)
                lineToRelative(25.7f, 0.0f)
                curveToRelative(7.6f, -4.4f, 14.6f, -8.8f, 22.2f, -13.8f)
                lineToRelative(-51.8f, 0.0f)
                close()
            }
        }
        .build()
        return _codeberg!!
    }

private var _codeberg: ImageVector? = null
