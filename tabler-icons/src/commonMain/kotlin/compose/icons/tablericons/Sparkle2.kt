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

public val TablerIcons.Sparkle2: ImageVector
    get() {
        if (_sparkle2 != null) {
            return _sparkle2!!
        }
        _sparkle2 = Builder(name = "Sparkle2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(0.375f, 0.0f, 0.711f, 0.231f, 0.846f, 0.581f)
                lineToRelative(1.65f, 4.29f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, false, 1.632f, 1.633f)
                lineToRelative(4.291f, 1.65f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, true, 0.0f, 1.692f)
                lineToRelative(-4.29f, 1.65f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, -1.633f, 1.632f)
                lineToRelative(-1.65f, 4.291f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, true, -1.692f, 0.0f)
                lineToRelative(-1.65f, -4.29f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, -1.632f, -1.633f)
                lineToRelative(-4.291f, -1.65f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, true, 0.0f, -1.692f)
                lineToRelative(4.29f, -1.65f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, 1.633f, -1.632f)
                lineToRelative(1.65f, -4.291f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, 0.846f, -0.581f)
            }
        }
        .build()
        return _sparkle2!!
    }

private var _sparkle2: ImageVector? = null
