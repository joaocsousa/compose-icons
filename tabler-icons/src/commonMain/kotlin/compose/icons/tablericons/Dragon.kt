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

public val TablerIcons.Dragon: ImageVector
    get() {
        if (_dragon != null) {
            return _dragon!!
        }
        _dragon = Builder(name = "Dragon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.706f, 8.849f)
                lineToRelative(-5.706f, -3.301f)
                lineToRelative(-2.0f, 6.452f)
                lineToRelative(3.5f, -1.973f)
                lineToRelative(0.5f, 2.973f)
                lineToRelative(3.555f, -1.385f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                curveToRelative(0.0f, 3.5f, 4.0f, 3.0f, 4.0f, 7.0f)
                curveToRelative(0.0f, 3.0f, -3.0f, 5.0f, -5.5f, 5.0f)
                reflectiveCurveToRelative(-6.0f, -0.5f, -6.5f, -5.0f)
                curveToRelative(2.0f, 2.0f, 6.592f, 3.043f, 7.5f, 1.0f)
                curveToRelative(1.094f, -2.461f, -4.0f, -3.459f, -4.0f, -6.5f)
                curveToRelative(0.0f, -2.062f, 0.5f, -2.5f, 1.8f, -3.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 270.0f, true, false, -3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(1.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(5.0f, 3.0f)
            }
        }
        .build()
        return _dragon!!
    }

private var _dragon: ImageVector? = null
