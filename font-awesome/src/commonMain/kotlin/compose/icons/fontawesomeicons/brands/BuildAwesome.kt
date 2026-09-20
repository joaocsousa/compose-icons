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

public val BrandsGroup.BuildAwesome: ImageVector
    get() {
        if (_buildAwesome != null) {
            return _buildAwesome!!
        }
        _buildAwesome = Builder(name = "BuildAwesome", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(114.9f, 0.0f, 208.0f, 93.1f, 208.0f, 208.0f)
                curveToRelative(0.0f, 94.2f, -73.4f, 195.3f, -154.4f, 228.6f)
                lineToRelative(24.1f, 54.3f)
                curveToRelative(1.5f, 3.4f, 2.3f, 7.0f, 2.3f, 10.7f)
                curveToRelative(0.0f, 14.6f, -11.8f, 26.4f, -26.4f, 26.4f)
                lineToRelative(-107.2f, 0.0f)
                curveToRelative(-14.6f, 0.0f, -26.4f, -11.8f, -26.4f, -26.4f)
                curveToRelative(0.0f, -3.7f, 0.8f, -7.3f, 2.3f, -10.7f)
                lineToRelative(24.1f, -54.3f)
                curveTo(89.4f, 403.3f, 16.0f, 302.2f, 16.0f, 208.0f)
                curveTo(16.0f, 93.1f, 109.1f, 0.0f, 224.0f, 0.0f)
                close()
                moveTo(223.4f, 85.6f)
                curveToRelative(-2.7f, -13.0f, -15.3f, -21.4f, -28.3f, -18.8f)
                curveToRelative(-62.6f, 12.8f, -110.5f, 66.2f, -114.8f, 131.5f)
                curveToRelative(-0.9f, 13.2f, 9.2f, 24.7f, 22.4f, 25.5f)
                curveToRelative(13.2f, 0.9f, 24.6f, -9.2f, 25.5f, -22.4f)
                curveToRelative(2.9f, -43.5f, 34.8f, -79.1f, 76.5f, -87.6f)
                curveToRelative(13.0f, -2.6f, 21.4f, -15.3f, 18.7f, -28.3f)
                close()
            }
        }
        .build()
        return _buildAwesome!!
    }

private var _buildAwesome: ImageVector? = null
