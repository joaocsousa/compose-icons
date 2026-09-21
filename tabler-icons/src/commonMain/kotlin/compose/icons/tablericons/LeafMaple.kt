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

public val TablerIcons.LeafMaple: ImageVector
    get() {
        if (_leafMaple != null) {
            return _leafMaple!!
        }
        _leafMaple = Builder(name = "LeafMaple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                curveToRelative(0.5f, -4.5f, 2.5f, -8.0f, 7.0f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveToRelative(-2.733f, 0.0f, -4.16f, -3.11f, -5.0f, -5.0f)
                curveToRelative(-1.892f, -0.84f, -4.0f, -1.826f, -4.0f, -4.556f)
                curveToRelative(1.014f, -0.644f, 2.816f, -0.649f, 4.0f, -0.444f)
                curveToRelative(-0.312f, -2.071f, -0.37f, -4.414f, 1.0f, -6.0f)
                curveToRelative(2.364f, 0.369f, 3.0f, 4.0f, 3.0f, 4.0f)
                curveToRelative(1.463f, -1.368f, 4.0f, -2.0f, 6.0f, -2.0f)
                curveToRelative(0.0f, 2.0f, -0.63f, 4.538f, -2.0f, 6.0f)
                quadToRelative(3.687f, 0.996f, 4.0f, 3.0f)
                curveToRelative(-1.586f, 1.36f, -3.933f, 1.311f, -6.0f, 1.0f)
                quadToRelative(0.19f, 1.098f, -1.0f, 4.0f)
            }
        }
        .build()
        return _leafMaple!!
    }

private var _leafMaple: ImageVector? = null
