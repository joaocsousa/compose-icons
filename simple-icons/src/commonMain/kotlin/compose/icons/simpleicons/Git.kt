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

public val SimpleIcons.Git: ImageVector
    get() {
        if (_git != null) {
            return _git!!
        }
        _git = Builder(name = "Git", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.09f, 23.549f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, -2.18f, 0.0f)
                lineTo(0.451f, 13.089f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 0.0f, -2.179f)
                lineToRelative(7.191f, -7.19f)
                lineToRelative(2.733f, 2.733f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, 0.964f, 2.326f)
                verticalLineToRelative(6.66f)
                arcToRelative(1.849f, 1.849f, 0.0f, true, false, 1.54f, 0.0f)
                verticalLineTo(8.957f)
                lineToRelative(2.508f, 2.508f)
                arcToRelative(1.85f, 1.85f, 0.0f, true, false, 1.09f, -1.09f)
                lineToRelative(-2.634f, -2.634f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, -2.378f, -2.377f)
                lineTo(8.73f, 2.63f)
                lineTo(10.91f, 0.451f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 2.179f, 0.0f)
                lineToRelative(10.459f, 10.46f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 0.0f, 2.179f)
                close()
            }
        }
        .build()
        return _git!!
    }

private var _git: ImageVector? = null
