package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Cline: ImageVector
    get() {
        if (_cline != null) {
            return _cline!!
        }
        _cline = Builder(name = "Cline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.365f, 13.556f)
                lineToRelative(-1.442f, -2.895f)
                lineTo(21.923f, 8.994f)
                curveToRelative(0.0f, -2.764f, -2.218f, -5.002f, -4.954f, -5.002f)
                horizontalLineToRelative(-2.464f)
                curveToRelative(0.178f, -0.367f, 0.276f, -0.779f, 0.276f, -1.213f)
                arcTo(2.77f, 2.77f, 0.0f, false, false, 12.018f, 0.0f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, false, -2.763f, 2.779f)
                curveToRelative(0.0f, 0.434f, 0.098f, 0.846f, 0.276f, 1.213f)
                lineTo(7.067f, 3.992f)
                curveToRelative(-2.736f, 0.0f, -4.954f, 2.238f, -4.954f, 5.002f)
                verticalLineToRelative(1.667f)
                lineTo(0.64f, 13.549f)
                curveToRelative(-0.149f, 0.29f, -0.149f, 0.636f, 0.0f, 0.927f)
                lineToRelative(1.472f, 2.855f)
                verticalLineToRelative(1.667f)
                curveTo(2.113f, 21.762f, 4.33f, 24.0f, 7.067f, 24.0f)
                horizontalLineToRelative(9.902f)
                curveToRelative(2.736f, 0.0f, 4.954f, -2.238f, 4.954f, -5.002f)
                lineTo(21.923f, 17.33f)
                lineToRelative(1.44f, -2.865f)
                curveToRelative(0.143f, -0.286f, 0.143f, -0.622f, 0.002f, -0.91f)
                moveToRelative(-12.854f, 2.36f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, -2.261f, 2.273f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, -2.261f, -2.273f)
                verticalLineToRelative(-4.042f)
                arcTo(2.27f, 2.27f, 0.0f, false, true, 8.249f, 9.6f)
                arcToRelative(2.267f, 2.267f, 0.0f, false, true, 2.262f, 2.274f)
                close()
                moveTo(17.796f, 15.915f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, -2.26f, 2.273f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, -2.262f, -2.273f)
                verticalLineToRelative(-4.042f)
                arcTo(2.267f, 2.267f, 0.0f, false, true, 15.535f, 9.6f)
                arcToRelative(2.267f, 2.267f, 0.0f, false, true, 2.261f, 2.274f)
                close()
            }
        }
        .build()
        return _cline!!
    }

private var _cline: ImageVector? = null
