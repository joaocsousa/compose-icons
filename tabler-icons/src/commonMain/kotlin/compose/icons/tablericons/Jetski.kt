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

public val TablerIcons.Jetski: ImageVector
    get() {
        if (_jetski != null) {
            return _jetski!!
        }
        _jetski = Builder(name = "Jetski", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(1.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.882f, 0.53f)
                lineToRelative(1.718f, 3.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.485f, 16.94f)
                lineToRelative(0.136f, 0.545f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.94f, 1.515f)
                horizontalLineToRelative(7.439f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 8.0f, -4.0f)
                curveToRelative(0.0f, -6.0f, -5.0f, -8.0f, -5.0f, -8.0f)
                curveToRelative(-1.889f, 2.518f, -5.852f, 4.0f, -9.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                curveToRelative(0.0f, 1.328f, 0.163f, 2.652f, 0.485f, 3.94f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.25f, 15.0f)
                horizontalLineToRelative(17.75f)
            }
        }
        .build()
        return _jetski!!
    }

private var _jetski: ImageVector? = null
