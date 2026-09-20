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

public val TablerIcons.BrandVechain: ImageVector
    get() {
        if (_brandVechain != null) {
            return _brandVechain!!
        }
        _brandVechain = Builder(name = "BrandVechain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineToRelative(-8.0f, 16.0f)
                lineToRelative(-8.0f, -16.0f)
                horizontalLineToRelative(2.028f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.578f, 2.211f)
                lineToRelative(2.894f, 5.789f)
            }
        }
        .build()
        return _brandVechain!!
    }

private var _brandVechain: ImageVector? = null
