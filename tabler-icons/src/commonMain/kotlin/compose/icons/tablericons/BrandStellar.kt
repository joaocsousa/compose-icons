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

public val TablerIcons.BrandStellar: ImageVector
    get() {
        if (_brandStellar != null) {
            return _brandStellar!!
        }
        _brandStellar = Builder(name = "BrandStellar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                lineToRelative(-17.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.004f, -1.259f, 0.234f, -2.5f, 0.81f, -3.62f)
                curveToRelative(1.363f, -2.686f, 4.178f, -4.378f, 7.19f, -4.38f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 2.61f, 0.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.38f, 19.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.81f, -3.92f)
                curveToRelative(0.576f, -1.12f, 0.814f, -2.361f, 0.81f, -3.62f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-17.0f, 7.0f)
            }
        }
        .build()
        return _brandStellar!!
    }

private var _brandStellar: ImageVector? = null
