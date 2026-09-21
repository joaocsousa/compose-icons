package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Sketching: ImageVector
    get() {
        if (_sketching != null) {
            return _sketching!!
        }
        _sketching = Builder(name = "Sketching", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                curveToRelative(2.0f, -4.97f, 7.356f, -11.0f, 9.0f, -11.0f)
                curveToRelative(4.25f, 0.0f, -5.5f, 11.958f, -3.0f, 13.0f)
                reflectiveCurveToRelative(5.65f, -6.678f, 7.4f, -5.902f)
                curveToRelative(1.75f, 0.777f, -1.05f, 7.589f, -0.3f, 8.63f)
                reflectiveCurveToRelative(3.15f, -0.897f, 3.9f, -2.728f)
            }
        }
        .build()
        return _sketching!!
    }

private var _sketching: ImageVector? = null
