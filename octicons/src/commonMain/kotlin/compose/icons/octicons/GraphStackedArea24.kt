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

public val Octicons.GraphStackedArea24: ImageVector
    get() {
        if (_graphStackedArea24 != null) {
            return _graphStackedArea24!!
        }
        _graphStackedArea24 = Builder(name = "GraphStackedArea24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.523f, 8.68f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, 1.227f, 0.63f)
                verticalLineToRelative(11.94f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 22.0f, 22.0f)
                lineToRelative(-0.016f, -0.001f)
                lineToRelative(-0.015f, 0.001f)
                lineTo(2.03f, 22.0f)
                lineToRelative(-0.02f, -0.002f)
                lineToRelative(-0.046f, -0.002f)
                lineToRelative(-0.018f, -0.002f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.477f, -0.214f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(8.482f, -8.483f)
                lineToRelative(0.059f, -0.052f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, 1.037f, 0.052f)
                lineTo(14.5f, 15.69f)
                lineToRelative(6.927f, -6.927f)
                close()
                moveTo(15.048f, 17.263f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, -1.096f, 0.0f)
                lineTo(10.5f, 13.81f)
                lineTo(3.81f, 20.5f)
                horizontalLineToRelative(17.44f)
                verticalLineToRelative(-9.44f)
                close()
                moveTo(21.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-7.482f, 7.483f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, -1.096f, 0.0f)
                lineTo(10.5f, 7.56f)
                lineToRelative(-7.97f, 7.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.061f)
                lineToRelative(8.482f, -8.483f)
                lineToRelative(0.059f, -0.052f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, 1.037f, 0.052f)
                lineTo(14.5f, 9.44f)
                close()
            }
        }
        .build()
        return _graphStackedArea24!!
    }

private var _graphStackedArea24: ImageVector? = null
