package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Substack: ImageVector
    get() {
        if (_substack != null) {
            return _substack!!
        }
        _substack = Builder(name = "Substack", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 512.0f)
                lineTo(224.0f, 386.4f)
                lineTo(0.0f, 512.0f)
                lineTo(0.0f, 230.7f)
                lineTo(448.0f, 230.7f)
                lineTo(448.0f, 512.0f)
                close()
                moveTo(448.0f, 175.8f)
                lineToRelative(-448.0f, 0.0f)
                lineToRelative(0.0f, -60.5f)
                lineToRelative(448.0f, 0.0f)
                lineToRelative(0.0f, 60.5f)
                close()
                moveTo(448.0f, 0.0f)
                lineTo(448.0f, 60.5f)
                lineTo(0.0f, 60.5f)
                lineTo(0.0f, 0.0f)
                lineTo(448.0f, 0.0f)
                close()
            }
        }
        .build()
        return _substack!!
    }

private var _substack: ImageVector? = null
