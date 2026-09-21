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

public val TablerIcons.BrandInfakt: ImageVector
    get() {
        if (_brandInfakt != null) {
            return _brandInfakt!!
        }
        _brandInfakt = Builder(name = "BrandInfakt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.936f, 6.063f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.52f, 5.0f)
                curveToRelative(0.002f, -0.033f, -1.69f, 1.568f, 1.02f, 3.733f)
                curveToRelative(-1.092f, 2.015f, 0.853f, 2.992f, 0.853f, 2.992f)
                curveToRelative(-0.972f, 1.879f, 1.39f, 2.805f, 1.39f, 2.805f)
                curveToRelative(-1.0f, 2.39f, -2.0f, 4.68f, -3.555f, 6.454f)
                curveToRelative(1.495f, 0.09f, 2.04f, -0.196f, 2.9f, -0.844f)
                curveToRelative(3.386f, -2.552f, 4.937f, -6.471f, 5.765f, -8.62f)
                curveToRelative(0.385f, -1.001f, -0.323f, -2.47f, -1.247f, -2.964f)
                curveToRelative(-2.52f, -1.35f, -7.178f, -3.526f, -7.127f, -3.555f)
            }
        }
        .build()
        return _brandInfakt!!
    }

private var _brandInfakt: ImageVector? = null
