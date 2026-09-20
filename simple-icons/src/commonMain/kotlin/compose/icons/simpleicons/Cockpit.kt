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

public val SimpleIcons.Cockpit: ImageVector
    get() {
        if (_cockpit != null) {
            return _cockpit!!
        }
        _cockpit = Builder(name = "Cockpit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.733f, 6.487f)
                curveToRelative(-0.611f, 0.038f, -1.482f, 0.516f, -2.257f, 1.296f)
                lineTo(12.77f, 9.49f)
                lineTo(7.493f, 7.718f)
                lineTo(6.464f, 8.781f)
                lineToRelative(3.982f, 3.032f)
                lineToRelative(-0.884f, 0.884f)
                curveToRelative(-0.315f, 0.313f, -0.579f, 0.641f, -0.781f, 0.961f)
                lineToRelative(-2.398f, -0.178f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.587f, 0.587f)
                lineToRelative(1.838f, 1.347f)
                lineToRelative(0.547f, 0.405f)
                lineToRelative(0.405f, 0.547f)
                lineToRelative(1.347f, 1.839f)
                lineToRelative(0.588f, -0.588f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-0.18f, -2.398f)
                curveToRelative(0.32f, -0.203f, 0.65f, -0.467f, 0.962f, -0.782f)
                lineToRelative(0.884f, -0.884f)
                lineToRelative(3.032f, 3.982f)
                lineToRelative(1.063f, -1.028f)
                lineToRelative(-1.772f, -5.277f)
                lineToRelative(1.706f, -1.706f)
                curveToRelative(1.04f, -1.034f, 1.545f, -2.237f, 1.182f, -2.77f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.068f, -0.085f)
                curveToRelative(-0.025f, -0.025f, -0.084f, -0.067f, -0.084f, -0.067f)
                curveToRelative(-0.133f, -0.09f, -0.309f, -0.127f, -0.512f, -0.115f)
                close()
                moveTo(20.489f, 3.511f)
                curveTo(15.807f, -1.17f, 8.193f, -1.17f, 3.51f, 3.511f)
                curveToRelative(-4.682f, 4.682f, -4.681f, 12.296f, 0.0f, 16.978f)
                curveToRelative(4.682f, 4.681f, 12.296f, 4.682f, 16.978f, 0.0f)
                curveToRelative(4.681f, -4.682f, 4.681f, -12.296f, 0.0f, -16.978f)
                moveToRelative(-1.145f, 1.145f)
                arcToRelative(10.373f, 10.373f, 0.0f, false, true, 0.0f, 14.688f)
                arcToRelative(10.373f, 10.373f, 0.0f, false, true, -14.688f, 0.0f)
                arcToRelative(10.373f, 10.373f, 0.0f, false, true, 0.0f, -14.688f)
                arcToRelative(10.373f, 10.373f, 0.0f, false, true, 14.688f, 0.0f)
                close()
            }
        }
        .build()
        return _cockpit!!
    }

private var _cockpit: ImageVector? = null
