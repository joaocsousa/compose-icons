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

public val BrandsGroup.Mattermost: ImageVector
    get() {
        if (_mattermost != null) {
            return _mattermost!!
        }
        _mattermost = Builder(name = "Mattermost", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(262.9f, 0.1f)
                lineToRelative(-35.0f, 41.4f)
                curveTo(163.0f, 53.2f, 107.0f, 97.5f, 85.0f, 162.5f)
                curveTo(52.3f, 259.1f, 107.2f, 365.1f, 207.6f, 399.1f)
                reflectiveCurveToRelative(208.4f, -16.9f, 241.1f, -113.6f)
                curveToRelative(21.9f, -64.8f, 4.5f, -133.7f, -39.5f, -182.3f)
                lineToRelative(-2.7f, -54.3f)
                curveTo(494.8f, 113.0f, 535.3f, 229.3f, 498.5f, 338.1f)
                curveTo(453.1f, 472.0f, 307.8f, 543.7f, 174.0f, 498.4f)
                reflectiveCurveTo(-31.7f, 307.8f, 13.6f, 173.9f)
                curveTo(50.5f, 65.0f, 153.6f, -2.9f, 262.9f, 0.1f)
                close()
                moveTo(334.7f, 23.7f)
                curveToRelative(1.4f, 0.5f, 2.5f, 1.5f, 3.2f, 2.7f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.1f, 0.2f, 0.2f)
                reflectiveCurveToRelative(0.1f, 0.2f, 0.1f, 0.3f)
                curveToRelative(0.3f, 0.6f, 0.6f, 1.4f, 0.8f, 2.3f)
                curveToRelative(0.6f, 4.3f, 0.4f, 22.1f, 0.4f, 22.5f)
                lineToRelative(1.0f, 37.9f)
                lineToRelative(1.5f, 43.7f)
                lineToRelative(1.9f, 76.0f)
                curveToRelative(0.0f, 0.7f, 0.5f, 35.2f, -23.4f, 58.7f)
                curveToRelative(-24.2f, 23.7f, -54.0f, 21.6f, -73.3f, 15.0f)
                reflectiveCurveToRelative(-44.3f, -22.9f, -49.2f, -56.5f)
                reflectiveCurveToRelative(17.0f, -60.8f, 17.0f, -60.8f)
                lineTo(262.4f, 106.3f)
                lineTo(290.1f, 72.5f)
                lineTo(314.0f, 43.0f)
                curveToRelative(0.2f, -0.3f, 11.0f, -14.7f, 14.0f, -17.7f)
                curveToRelative(0.6f, -0.6f, 1.3f, -1.0f, 1.9f, -1.3f)
                curveToRelative(0.1f, -0.1f, 0.3f, -0.2f, 0.4f, -0.2f)
                lineToRelative(0.1f, 0.0f)
                curveToRelative(1.3f, -0.6f, 2.8f, -0.7f, 4.3f, -0.2f)
                close()
            }
        }
        .build()
        return _mattermost!!
    }

private var _mattermost: ImageVector? = null
