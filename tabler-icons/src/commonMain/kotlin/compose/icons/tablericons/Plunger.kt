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

public val TablerIcons.Plunger: ImageVector
    get() {
        if (_plunger != null) {
            return _plunger!!
        }
        _plunger = Builder(name = "Plunger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.71f, 14.12f)
                lineToRelative(7.81f, -7.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.82f, -2.82f)
                lineToRelative(-7.82f, 7.81f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.71f, 13.22f)
                lineToRelative(0.7f, -0.71f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.08f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 7.08f)
                lineToRelative(-0.71f, 0.7f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.5f)
                lineToRelative(8.5f, 8.5f)
            }
        }
        .build()
        return _plunger!!
    }

private var _plunger: ImageVector? = null
