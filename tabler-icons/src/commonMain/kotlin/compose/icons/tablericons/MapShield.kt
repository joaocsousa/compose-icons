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

public val TablerIcons.MapShield: ImageVector
    get() {
        if (_mapShield != null) {
            return _mapShield!!
        }
        _mapShield = Builder(name = "MapShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.249f, 21.47f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.662f, -0.57f)
                lineToRelative(-4.244f, -4.243f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.655f, -5.828f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 4.0f, -2.5f, 6.0f, -3.5f, 6.0f)
                reflectiveCurveToRelative(-3.5f, -2.0f, -3.5f, -6.0f)
                curveToRelative(1.0f, 0.0f, 2.5f, -0.5f, 3.5f, -1.5f)
                curveToRelative(1.0f, 1.0f, 2.5f, 1.5f, 3.5f, 1.5f)
            }
        }
        .build()
        return _mapShield!!
    }

private var _mapShield: ImageVector? = null
