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

public val BrandsGroup.GithubSquare: ImageVector
    get() {
        if (_githubSquare != null) {
            return _githubSquare!!
        }
        _githubSquare = Builder(name = "GithubSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
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
                moveTo(223.7f, 96.0f)
                curveToRelative(-88.4f, 0.0f, -159.7f, 72.2f, -159.7f, 160.6f)
                curveToRelative(0.0f, 69.4f, 44.1f, 126.9f, 103.4f, 148.4f)
                curveToRelative(8.4f, 3.1f, 16.6f, -2.5f, 16.6f, -10.9f)
                lineToRelative(0.0f, -25.0f)
                curveToRelative(-4.4f, 1.9f, -10.0f, 3.1f, -15.0f, 3.1f)
                curveToRelative(-20.6f, 0.0f, -32.8f, -11.2f, -41.6f, -32.2f)
                curveToRelative(-3.4f, -8.4f, -7.2f, -13.4f, -14.4f, -14.4f)
                curveToRelative(-3.7f, -0.3f, -5.0f, -1.9f, -5.0f, -3.8f)
                curveToRelative(0.0f, -3.7f, 6.2f, -6.6f, 12.5f, -6.6f)
                curveToRelative(9.1f, 0.0f, 16.9f, 5.6f, 25.0f, 17.2f)
                curveToRelative(6.2f, 9.1f, 12.8f, 13.1f, 20.6f, 13.1f)
                reflectiveCurveToRelative(12.8f, -2.8f, 20.0f, -10.0f)
                curveToRelative(5.3f, -5.3f, 9.4f, -10.0f, 13.1f, -13.1f)
                curveToRelative(-41.3f, -5.0f, -70.3f, -34.7f, -70.3f, -73.1f)
                curveToRelative(0.0f, -15.6f, 5.6f, -32.5f, 15.0f, -43.8f)
                curveToRelative(-4.1f, -10.3f, -3.4f, -32.2f, 1.2f, -41.2f)
                curveToRelative(12.5f, -1.6f, 29.4f, 5.0f, 39.4f, 14.1f)
                curveToRelative(11.9f, -3.7f, 24.4f, -5.6f, 39.7f, -5.6f)
                reflectiveCurveToRelative(27.8f, 1.9f, 39.1f, 5.3f)
                curveToRelative(9.7f, -8.8f, 26.9f, -15.3f, 39.4f, -13.8f)
                curveToRelative(4.4f, 8.4f, 5.0f, 30.3f, 0.9f, 40.9f)
                curveToRelative(10.0f, 11.9f, 15.3f, 27.8f, 15.3f, 44.1f)
                curveToRelative(0.0f, 38.4f, -29.1f, 67.5f, -70.9f, 72.8f)
                curveToRelative(10.6f, 6.9f, 17.8f, 21.9f, 17.8f, 39.1f)
                lineToRelative(0.0f, 32.5f)
                curveToRelative(0.0f, 9.4f, 7.8f, 14.7f, 17.2f, 10.9f)
                curveToRelative(56.6f, -21.6f, 100.9f, -78.1f, 100.9f, -148.1f)
                curveToRelative(0.0f, -88.4f, -71.9f, -160.6f, -160.3f, -160.6f)
                close()
            }
        }
        .build()
        return _githubSquare!!
    }

private var _githubSquare: ImageVector? = null
