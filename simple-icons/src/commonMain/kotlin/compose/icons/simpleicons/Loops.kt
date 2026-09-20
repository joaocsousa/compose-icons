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

public val SimpleIcons.Loops: ImageVector
    get() {
        if (_loops != null) {
            return _loops!!
        }
        _loops = Builder(name = "Loops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.608f, 1.622f)
                horizontalLineToRelative(-3.231f)
                arcTo(10.39f, 10.39f, 0.0f, false, false, 0.0f, 12.002f)
                arcToRelative(10.39f, 10.39f, 0.0f, false, false, 10.377f, 10.376f)
                horizontalLineToRelative(3.243f)
                arcTo(10.39f, 10.39f, 0.0f, false, false, 24.0f, 12.001f)
                arcTo(10.39f, 10.39f, 0.0f, false, false, 13.608f, 1.622f)
                moveTo(1.284f, 12.0f)
                arcToRelative(9.085f, 9.085f, 0.0f, false, true, 10.6f, -8.96f)
                arcToRelative(9.044f, 9.044f, 0.0f, false, true, 7.568f, 8.955f)
                arcToRelative(5.85f, 5.85f, 0.0f, false, true, -4.87f, 5.756f)
                arcToRelative(7.12f, 7.12f, 0.0f, false, false, 2.923f, -5.756f)
                arcToRelative(7.121f, 7.121f, 0.0f, false, false, -12.17f, -5.038f)
                arcToRelative(7.14f, 7.14f, 0.0f, false, false, -2.087f, 5.038f)
                arcToRelative(10.35f, 10.35f, 0.0f, false, false, 4.83f, 8.783f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 1.291f, 12.0f)
                close()
                moveTo(11.988f, 6.394f)
                arcTo(5.83f, 5.83f, 0.0f, false, true, 16.204f, 12.0f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, true, -4.216f, 5.603f)
                arcTo(5.83f, 5.83f, 0.0f, false, true, 7.772f, 12.0f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, true, 4.216f, -5.606f)
                moveToRelative(1.62f, 14.686f)
                horizontalLineToRelative(-0.036f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.474f, -0.125f)
                arcToRelative(9.04f, 9.04f, 0.0f, false, true, -7.558f, -8.651f)
                lineTo(4.54f, 12.0f)
                arcToRelative(5.844f, 5.844f, 0.0f, false, true, 4.87f, -5.756f)
                arcTo(7.12f, 7.12f, 0.0f, false, false, 6.485f, 12.0f)
                arcToRelative(7.12f, 7.12f, 0.0f, false, false, 5.35f, 6.907f)
                arcTo(7.143f, 7.143f, 0.0f, false, false, 20.756f, 12.0f)
                arcToRelative(10.34f, 10.34f, 0.0f, false, false, -4.828f, -8.784f)
                arcTo(9.086f, 9.086f, 0.0f, false, true, 22.702f, 12.0f)
                arcToRelative(9.086f, 9.086f, 0.0f, false, true, -9.092f, 9.08f)
            }
        }
        .build()
        return _loops!!
    }

private var _loops: ImageVector? = null
