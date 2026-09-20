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

public val TablerIcons.VirtualSpace: ImageVector
    get() {
        if (_virtualSpace != null) {
            return _virtualSpace!!
        }
        _virtualSpace = Builder(name = "VirtualSpace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 14.808f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -4.0f, -0.312f)
                curveToRelative(-1.439f, 0.0f, -2.796f, 0.113f, -4.0f, 0.312f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 17.439f)
                curveToRelative(0.0f, 1.148f, -2.034f, 2.142f, -4.997f, 2.625f)
                lineToRelative(-0.003f, -10.439f)
                curveToRelative(2.965f, -0.482f, 5.0f, -1.477f, 5.0f, -2.625f)
                verticalLineToRelative(-0.064f)
                curveToRelative(0.0f, -1.622f, -4.03f, -2.936f, -9.0f, -2.936f)
                reflectiveCurveToRelative(-9.0f, 1.314f, -9.0f, 2.936f)
                curveToRelative(0.0f, 1.148f, 2.035f, 2.142f, 5.0f, 2.624f)
                lineToRelative(-0.003f, 10.44f)
                curveToRelative(-2.963f, -0.483f, -4.997f, -1.477f, -4.997f, -2.625f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.936f)
                verticalLineToRelative(10.439f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 6.936f)
                verticalLineToRelative(10.439f)
            }
        }
        .build()
        return _virtualSpace!!
    }

private var _virtualSpace: ImageVector? = null
