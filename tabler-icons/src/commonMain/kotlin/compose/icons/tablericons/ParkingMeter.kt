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

public val TablerIcons.ParkingMeter: ImageVector
    get() {
        if (_parkingMeter != null) {
            return _parkingMeter!!
        }
        _parkingMeter = Builder(name = "ParkingMeter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.938f, 19.0f)
                horizontalLineToRelative(2.122f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, false, 3.868f, -2.82f)
                lineToRelative(1.775f, -5.68f)
                curveToRelative(1.082f, -3.463f, -0.882f, -7.138f, -4.386f, -8.208f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, -1.96f, -0.292f)
                horizontalLineToRelative(-0.716f)
                curveToRelative(-3.668f, 0.0f, -6.641f, 2.939f, -6.641f, 6.563f)
                curveToRelative(0.0f, 0.657f, 0.1f, 1.31f, 0.296f, 1.937f)
                lineToRelative(1.775f, 5.68f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, false, 3.867f, 2.82f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(3.0f)
            }
        }
        .build()
        return _parkingMeter!!
    }

private var _parkingMeter: ImageVector? = null
