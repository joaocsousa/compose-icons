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

public val TablerIcons.OlympicTorch: ImageVector
    get() {
        if (_olympicTorch != null) {
            return _olympicTorch!!
        }
        _olympicTorch = Builder(name = "OlympicTorch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -4.364f, -1.0f, -7.0f, -2.0f, -11.0f)
                quadToRelative(4.0f, 2.0f, 8.0f, 0.0f)
                curveToRelative(-1.0f, 4.0f, -2.0f, 6.636f, -2.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveToRelative(0.0f, 2.5f, -1.0f, 2.66f, -1.0f, 4.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 2.0f, 2.0f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.41f, -1.0f, -3.0f, -3.0f, -4.0f)
            }
        }
        .build()
        return _olympicTorch!!
    }

private var _olympicTorch: ImageVector? = null
