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

public val Octicons.StackAdd16: ImageVector
    get() {
        if (_stackAdd16 != null) {
            return _stackAdd16!!
        }
        _stackAdd16 = Builder(name = "StackAdd16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.122f, 0.392f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.756f, 0.0f)
                lineToRelative(5.003f, 2.902f)
                curveToRelative(0.83f, 0.481f, 0.83f, 1.68f, 0.0f, 2.162f)
                lineTo(8.878f, 8.358f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.756f, 0.0f)
                lineTo(2.119f, 5.456f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.162f)
                close()
                moveTo(8.125f, 1.69f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.0f)
                lineTo(3.244f, 4.375f)
                lineTo(7.875f, 7.06f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.0f)
                lineToRelative(4.63f, -2.685f)
                close()
                moveTo(1.602f, 7.789f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.024f, -0.272f)
                lineToRelative(5.249f, 3.044f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -0.753f, 1.296f)
                lineTo(1.874f, 8.813f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.272f, -1.024f)
                moveToRelative(0.0f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.024f, -0.272f)
                lineToRelative(5.249f, 3.044f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -0.753f, 1.296f)
                lineToRelative(-5.248f, -3.044f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.272f, -1.024f)
                moveTo(11.75f, 15.25f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
            }
        }
        .build()
        return _stackAdd16!!
    }

private var _stackAdd16: ImageVector? = null
