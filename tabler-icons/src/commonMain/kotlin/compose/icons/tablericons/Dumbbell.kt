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

public val TablerIcons.Dumbbell: ImageVector
    get() {
        if (_dumbbell != null) {
            return _dumbbell!!
        }
        _dumbbell = Builder(name = "Dumbbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.026f, 9.61f)
                lineToRelative(-0.95f, -4.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.95f, -2.43f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.43f)
                lineToRelative(-1.0f, 4.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.026f, 17.001f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.906f, 20.06f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 1.0f, -5.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.77f, 5.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.71f, 0.94f)
                horizontalLineToRelative(10.36f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.7f, -0.94f)
            }
        }
        .build()
        return _dumbbell!!
    }

private var _dumbbell: ImageVector? = null
