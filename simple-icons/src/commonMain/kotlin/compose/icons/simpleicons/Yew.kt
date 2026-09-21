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

public val SimpleIcons.Yew: ImageVector
    get() {
        if (_yew != null) {
            return _yew!!
        }
        _yew = Builder(name = "Yew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.47f, 0.002f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.815f, 0.392f)
                lineTo(13.33f, 8.566f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.423f, -0.303f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.287f, 0.246f)
                horizontalLineToRelative(-0.002f)
                lineTo(3.345f, 0.394f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.815f, -0.39f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.853f, 0.298f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.092f, 1.667f)
                lineToRelative(7.246f, 8.083f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.466f, 1.75f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, 2.453f, 3.37f)
                verticalLineToRelative(7.647f)
                arcTo(1.18f, 1.18f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, 1.18f, -1.18f)
                verticalLineToRelative(-7.715f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, 2.267f, -3.302f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.396f, -1.62f)
                lineToRelative(7.364f, -8.213f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.092f, -1.668f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.854f, -0.3f)
                moveToRelative(-9.563f, 1.573f)
                arcToRelative(9.84f, 9.84f, 0.0f, false, false, -5.39f, 1.61f)
                lineToRelative(0.671f, 0.748f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, 4.72f, -1.357f)
                curveToRelative(1.787f, 0.0f, 3.448f, 0.527f, 4.836f, 1.435f)
                lineToRelative(0.67f, -0.748f)
                arcToRelative(9.84f, 9.84f, 0.0f, false, false, -5.507f, -1.688f)
                moveTo(4.06f, 5.482f)
                arcToRelative(9.84f, 9.84f, 0.0f, false, false, -1.99f, 5.93f)
                arcToRelative(9.835f, 9.835f, 0.0f, false, false, 8.248f, 9.705f)
                verticalLineToRelative(-1.013f)
                arcToRelative(8.82f, 8.82f, 0.0f, false, true, -7.247f, -8.693f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, 1.666f, -5.175f)
                close()
                moveTo(19.837f, 5.595f)
                lineTo(19.157f, 6.352f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, 1.584f, 5.058f)
                arcToRelative(8.82f, 8.82f, 0.0f, false, true, -7.062f, 8.657f)
                verticalLineToRelative(1.016f)
                arcToRelative(9.835f, 9.835f, 0.0f, false, false, 8.062f, -9.673f)
                arcToRelative(9.84f, 9.84f, 0.0f, false, false, -1.904f, -5.815f)
                moveToRelative(-7.93f, 4.241f)
                arcToRelative(1.955f, 1.955f, 0.0f, false, true, 1.965f, 1.967f)
                arcToRelative(1.955f, 1.955f, 0.0f, false, true, -1.966f, 1.967f)
                arcToRelative(1.955f, 1.955f, 0.0f, false, true, -1.967f, -1.969f)
                arcToRelative(1.955f, 1.955f, 0.0f, false, true, 1.967f, -1.966f)
            }
        }
        .build()
        return _yew!!
    }

private var _yew: ImageVector? = null
