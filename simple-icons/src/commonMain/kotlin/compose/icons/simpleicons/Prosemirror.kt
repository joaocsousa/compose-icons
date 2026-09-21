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

public val SimpleIcons.Prosemirror: ImageVector
    get() {
        if (_prosemirror != null) {
            return _prosemirror!!
        }
        _prosemirror = Builder(name = "Prosemirror", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.47f, 10.47f)
                curveToRelative(0.0f, 2.831f, -1.123f, 5.4f, -2.948f, 7.284f)
                curveToRelative(0.659f, 1.65f, 1.139f, 3.287f, 2.179f, 6.246f)
                curveToRelative(-2.687f, -1.972f, -4.4f, -2.744f, -5.883f, -3.546f)
                horizontalLineToRelative(0.001f)
                curveToRelative(-1.008f, -0.545f, -1.917f, -1.106f, -2.946f, -2.07f)
                curveToRelative(-1.02f, -0.954f, -2.193f, -2.225f, -2.787f, -3.393f)
                curveToRelative(1.45f, 3.263f, 4.86f, 5.53f, 4.86f, 5.53f)
                lineToRelative(0.003f, -0.001f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 12.0f, 20.94f)
                curveToRelative(-5.783f, 0.0f, -10.47f, -4.688f, -10.47f, -10.47f)
                reflectiveCurveTo(6.217f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.47f, 4.688f, 10.47f, 10.47f)
                moveTo(12.0f, 1.53f)
                arcToRelative(8.94f, 8.94f, 0.0f, false, false, -8.941f, 8.94f)
                arcToRelative(8.94f, 8.94f, 0.0f, false, false, 7.517f, 8.827f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -1.532f, -0.748f)
                curveToRelative(-3.131f, -2.145f, -2.67f, -6.929f, -2.66f, -9.71f)
                curveToRelative(0.011f, -2.916f, 2.629f, -4.702f, 5.123f, -4.65f)
                curveToRelative(2.987f, 0.05f, 5.153f, 2.216f, 4.917f, 5.122f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, -0.143f, 2.49f)
                curveToRelative(0.337f, 0.352f, 0.659f, 0.78f, 0.954f, 1.308f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 1.619f, 3.103f)
                arcTo(8.941f, 8.941f, 0.0f, false, false, 12.0f, 1.53f)
                moveToRelative(0.39f, 10.224f)
                curveToRelative(4.065f, -0.01f, 4.024f, -5.071f, 1.653f, -5.092f)
                curveToRelative(-1.047f, -0.02f, -1.54f, 0.934f, -1.54f, 0.934f)
                reflectiveCurveToRelative(-0.41f, -1.19f, -1.848f, -1.18f)
                curveToRelative(-3.08f, 0.02f, -2.956f, 5.348f, 1.735f, 5.338f)
                moveToRelative(0.164f, -2.207f)
                curveToRelative(1.109f, 0.0f, 0.206f, 1.53f, -0.061f, 2.145f)
                curveToRelative(-0.185f, -0.862f, -1.047f, -2.145f, 0.061f, -2.145f)
                moveToRelative(-0.626f, -0.483f)
                curveToRelative(0.0f, 0.585f, -0.472f, 1.047f, -1.047f, 1.047f)
                arcToRelative(1.045f, 1.045f, 0.0f, false, true, -1.047f, -1.047f)
                curveToRelative(0.0f, -0.585f, 0.472f, -1.047f, 1.047f, -1.047f)
                curveToRelative(0.585f, 0.0f, 1.047f, 0.472f, 1.047f, 1.047f)
                moveToRelative(2.987f, -0.01f)
                curveToRelative(0.0f, 0.585f, -0.41f, 1.047f, -0.903f, 1.047f)
                curveToRelative(-0.503f, 0.0f, -0.903f, -0.472f, -0.903f, -1.047f)
                curveToRelative(0.0f, -0.585f, 0.41f, -1.047f, 0.903f, -1.047f)
                curveToRelative(0.503f, 0.0f, 0.903f, 0.472f, 0.903f, 1.047f)
            }
        }
        .build()
        return _prosemirror!!
    }

private var _prosemirror: ImageVector? = null
