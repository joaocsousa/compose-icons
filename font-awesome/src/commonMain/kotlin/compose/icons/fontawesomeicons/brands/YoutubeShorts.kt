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

public val BrandsGroup.YoutubeShorts: ImageVector
    get() {
        if (_youtubeShorts != null) {
            return _youtubeShorts!!
        }
        _youtubeShorts = Builder(name = "YoutubeShorts", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.1f, 52.3f)
                curveToRelative(-25.4f, -47.8f, -85.2f, -66.1f, -133.5f, -41.0f)
                lineTo(70.9f, 122.5f)
                curveToRelative(-48.3f, 25.2f, -66.8f, 84.3f, -41.4f, 132.1f)
                curveToRelative(17.1f, 32.1f, 49.7f, 50.9f, 83.9f, 52.2f)
                lineTo(73.7f, 327.7f)
                curveTo(25.4f, 352.8f, 6.8f, 412.0f, 32.2f, 459.8f)
                reflectiveCurveToRelative(85.2f, 66.1f, 133.5f, 41.0f)
                lineTo(377.5f, 389.5f)
                curveToRelative(48.3f, -25.2f, 66.8f, -84.3f, 41.4f, -132.1f)
                curveToRelative(-17.1f, -32.1f, -49.7f, -50.9f, -83.9f, -52.2f)
                lineToRelative(39.7f, -20.9f)
                curveTo(423.0f, 159.2f, 441.5f, 100.0f, 416.1f, 52.3f)
                close()
                moveTo(296.5f, 256.3f)
                lineToRelative(-128.2f, 78.7f)
                lineToRelative(0.0f, -157.9f)
                lineToRelative(128.2f, 79.1f)
                close()
            }
        }
        .build()
        return _youtubeShorts!!
    }

private var _youtubeShorts: ImageVector? = null
