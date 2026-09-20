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

public val TablerIcons.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 5.49f)
                arcToRelative(1.764f, 1.764f, 0.0f, false, true, -2.5f, -2.49f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 1.0f, -3.67f)
                curveToRelative(0.0f, -2.0f, -0.92f, -3.25f, -3.24f, -4.51f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, true, -4.76f, -3.82f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, true, -4.76f, 3.82f)
                curveToRelative(-2.32f, 1.26f, -3.24f, 2.55f, -3.24f, 4.51f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 1.0f, 3.67f)
                horizontalLineToRelative(14.0f)
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
