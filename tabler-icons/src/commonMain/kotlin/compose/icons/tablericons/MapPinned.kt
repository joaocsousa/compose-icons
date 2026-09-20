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

public val TablerIcons.MapPinned: ImageVector
    get() {
        if (_mapPinned != null) {
            return _mapPinned!!
        }
        _mapPinned = Builder(name = "MapPinned", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.828f, 10.828f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.656f, 0.0f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(2.828f, -2.829f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(-0.142f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.923f, 1.45f)
                lineToRelative(-0.858f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.924f, 2.55f)
                horizontalLineToRelative(13.999f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.923f, -2.55f)
                lineToRelative(-0.857f, -3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.923f, -1.45f)
                horizontalLineToRelative(-0.143f)
            }
        }
        .build()
        return _mapPinned!!
    }

private var _mapPinned: ImageVector? = null
