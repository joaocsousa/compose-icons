package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.GraphStackedArea16: ImageVector
    get() {
        if (_graphStackedArea16 != null) {
            return _graphStackedArea16!!
        }
        _graphStackedArea16 = Builder(name = "GraphStackedArea16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.548f, 11.513f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, -1.096f, 0.0f)
                lineTo(7.0f, 9.06f)
                lineTo(2.56f, 13.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(7.56f)
                close()
                moveTo(14.72f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-5.232f, 5.233f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, -1.096f, 0.0f)
                lineTo(7.0f, 5.06f)
                lineToRelative(-5.72f, 5.72f)
                arcTo(0.75f, 0.75f, 0.0f, true, true, 0.22f, 9.72f)
                lineToRelative(6.232f, -6.233f)
                lineToRelative(0.059f, -0.052f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, 1.037f, 0.052f)
                lineTo(10.0f, 5.94f)
                close()
                moveTo(16.0f, 14.225f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, true, -0.775f, 0.775f)
                horizontalLineTo(0.81f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, -0.548f, -1.323f)
                lineToRelative(6.19f, -6.19f)
                lineToRelative(0.058f, -0.052f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, 1.037f, 0.052f)
                lineTo(10.0f, 9.94f)
                lineToRelative(4.677f, -4.676f)
                lineToRelative(0.096f, -0.082f)
                arcTo(0.775f, 0.775f, 0.0f, false, true, 16.0f, 5.81f)
                close()
            }
        }
        .build()
        return _graphStackedArea16!!
    }

private var _graphStackedArea16: ImageVector? = null
