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

public val TablerIcons.Orbits: ImageVector
    get() {
        if (_orbits != null) {
            return _orbits!!
        }
        _orbits = Builder(name = "Orbits", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.628f, 7.629f)
                curveToRelative(-2.76f, 0.854f, -4.628f, 2.491f, -4.628f, 4.371f)
                curveToRelative(0.0f, 2.761f, 4.03f, 5.0f, 9.0f, 5.0f)
                reflectiveCurveToRelative(9.0f, -2.239f, 9.0f, -5.0f)
                reflectiveCurveToRelative(-4.03f, -5.0f, -9.0f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.372f, 16.372f)
                curveToRelative(0.4f, -1.295f, 0.628f, -2.785f, 0.628f, -4.372f)
                curveToRelative(0.0f, -4.97f, -2.239f, -9.0f, -5.0f, -9.0f)
                reflectiveCurveToRelative(-5.0f, 4.03f, -5.0f, 9.0f)
                reflectiveCurveToRelative(2.239f, 9.0f, 5.0f, 9.0f)
                curveToRelative(0.596f, 0.0f, 1.168f, -0.188f, 1.698f, -0.533f)
            }
        }
        .build()
        return _orbits!!
    }

private var _orbits: ImageVector? = null
