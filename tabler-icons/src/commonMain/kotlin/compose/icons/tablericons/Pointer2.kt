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

public val TablerIcons.Pointer2: ImageVector
    get() {
        if (_pointer2 != null) {
            return _pointer2!!
        }
        _pointer2 = Builder(name = "Pointer2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.185f, 13.14f)
                lineToRelative(5.644f, -2.202f)
                curveToRelative(1.625f, -0.634f, 1.538f, -2.962f, -0.13f, -3.473f)
                lineToRelative(-14.319f, -4.382f)
                curveToRelative(-1.41f, -0.431f, -2.73f, 0.888f, -2.298f, 2.298f)
                lineToRelative(4.382f, 14.318f)
                curveToRelative(0.51f, 1.668f, 2.84f, 1.755f, 3.473f, 0.13f)
                lineToRelative(2.202f, -5.644f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 1.045f, -1.045f)
            }
        }
        .build()
        return _pointer2!!
    }

private var _pointer2: ImageVector? = null
