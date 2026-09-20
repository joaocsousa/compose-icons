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

public val BrandsGroup.SquareBuildAwesomeStroke: ImageVector
    get() {
        if (_squareBuildAwesomeStroke != null) {
            return _squareBuildAwesomeStroke!!
        }
        _squareBuildAwesomeStroke = Builder(name = "SquareBuildAwesomeStroke", defaultWidth =
                448.0.dp, defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                close()
                moveTo(64.0f, 64.0f)
                curveTo(46.3f, 64.0f, 32.0f, 78.3f, 32.0f, 96.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(224.0f, 128.0f)
                curveToRelative(57.4f, 0.0f, 104.0f, 46.6f, 104.0f, 104.0f)
                curveToRelative(0.0f, 47.1f, -36.7f, 97.6f, -77.2f, 114.3f)
                lineToRelative(12.1f, 27.2f)
                curveToRelative(0.8f, 1.7f, 1.1f, 3.5f, 1.1f, 5.4f)
                curveToRelative(0.0f, 7.3f, -5.9f, 13.2f, -13.2f, 13.2f)
                lineToRelative(-53.6f, 0.0f)
                curveToRelative(-7.3f, 0.0f, -13.2f, -5.9f, -13.2f, -13.2f)
                curveToRelative(0.0f, -1.8f, 0.4f, -3.7f, 1.1f, -5.4f)
                lineToRelative(12.1f, -27.2f)
                curveToRelative(-40.5f, -16.7f, -77.2f, -67.2f, -77.2f, -114.3f)
                curveToRelative(0.0f, -57.4f, 46.6f, -104.0f, 104.0f, -104.0f)
                close()
                moveTo(209.5f, 161.5f)
                curveToRelative(-31.3f, 6.4f, -55.2f, 33.1f, -57.4f, 65.8f)
                curveToRelative(-0.4f, 6.6f, 4.6f, 12.3f, 11.2f, 12.8f)
                reflectiveCurveToRelative(12.3f, -4.6f, 12.8f, -11.2f)
                curveToRelative(1.4f, -21.7f, 17.4f, -39.6f, 38.2f, -43.8f)
                curveToRelative(6.5f, -1.3f, 10.7f, -7.7f, 9.3f, -14.2f)
                reflectiveCurveToRelative(-7.7f, -10.7f, -14.2f, -9.3f)
                close()
            }
        }
        .build()
        return _squareBuildAwesomeStroke!!
    }

private var _squareBuildAwesomeStroke: ImageVector? = null
