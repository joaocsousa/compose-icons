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

public val BrandsGroup.Storybook: ImageVector
    get() {
        if (_storybook != null) {
            return _storybook!!
        }
        _storybook = Builder(name = "Storybook", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 35.1f)
                lineTo(27.0f, 474.1f)
                curveToRelative(0.5f, 13.9f, 11.6f, 25.1f, 25.5f, 25.7f)
                lineToRelative(357.0f, 16.0f)
                curveToRelative(0.4f, 0.0f, 0.8f, 0.0f, 1.2f, 0.0f)
                curveToRelative(14.8f, 0.0f, 26.7f, -12.0f, 26.7f, -26.7f)
                lineToRelative(0.0f, -478.4f)
                curveToRelative(0.0f, -0.6f, 0.0f, -1.1f, -0.1f, -1.7f)
                curveToRelative(-0.9f, -14.7f, -13.6f, -25.9f, -28.4f, -25.0f)
                lineToRelative(-29.4f, 1.8f)
                lineToRelative(2.1f, 61.4f)
                curveToRelative(0.1f, 2.2f, -1.6f, 4.0f, -3.8f, 4.1f)
                curveToRelative(-0.9f, 0.0f, -1.9f, -0.3f, -2.6f, -0.9f)
                lineTo(355.6f, 35.0f)
                lineTo(332.2f, 52.7f)
                curveToRelative(-1.8f, 1.3f, -4.3f, 1.0f, -5.6f, -0.8f)
                curveToRelative(-0.6f, -0.7f, -0.8f, -1.6f, -0.8f, -2.6f)
                lineTo(328.3f, -10.9f)
                lineTo(35.6f, 7.4f)
                curveTo(21.1f, 8.3f, 10.0f, 20.6f, 10.5f, 35.1f)
                close()
                moveTo(339.7f, 187.8f)
                curveToRelative(-9.4f, 7.3f, -79.5f, 12.3f, -79.5f, 1.9f)
                curveToRelative(1.5f, -39.7f, -16.3f, -41.4f, -26.2f, -41.4f)
                curveToRelative(-9.4f, 0.0f, -25.2f, 2.8f, -25.2f, 24.1f)
                curveToRelative(0.0f, 21.7f, 23.1f, 33.9f, 50.2f, 48.3f)
                curveToRelative(38.5f, 20.4f, 85.1f, 45.1f, 85.1f, 107.2f)
                curveToRelative(0.0f, 59.6f, -48.4f, 92.5f, -110.1f, 92.5f)
                curveToRelative(-63.7f, 0.0f, -119.4f, -25.8f, -113.1f, -115.1f)
                curveToRelative(2.5f, -10.5f, 83.4f, -8.0f, 83.4f, 0.0f)
                curveToRelative(-1.0f, 36.9f, 7.4f, 47.7f, 28.6f, 47.7f)
                curveToRelative(16.3f, 0.0f, 23.7f, -9.0f, 23.7f, -24.1f)
                curveToRelative(0.0f, -22.9f, -24.1f, -36.4f, -51.7f, -51.9f)
                curveToRelative(-37.5f, -21.0f, -81.6f, -45.8f, -81.6f, -102.6f)
                curveToRelative(0.0f, -56.7f, 39.0f, -94.5f, 108.6f, -94.5f)
                reflectiveCurveToRelative(107.6f, 37.2f, 107.6f, 108.1f)
                close()
            }
        }
        .build()
        return _storybook!!
    }

private var _storybook: ImageVector? = null
