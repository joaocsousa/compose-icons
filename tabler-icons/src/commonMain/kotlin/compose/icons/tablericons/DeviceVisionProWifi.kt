package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DeviceVisionProWifi: ImageVector
    get() {
        if (_deviceVisionProWifi != null) {
            return _deviceVisionProWifi!!
        }
        _deviceVisionProWifi = Builder(name = "DeviceVisionProWifi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                quadToRelative(1.715f, 0.0f, 3.275f, 0.104f)
                quadToRelative(1.526f, 0.101f, 2.798f, 0.42f)
                quadToRelative(1.22f, 0.304f, 2.119f, 0.909f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.328f, 1.531f)
                curveToRelative(0.326f, 0.657f, 0.48f, 1.48f, 0.48f, 2.466f)
                quadToRelative(0.002f, 1.51f, -0.574f, 2.707f)
                quadToRelative(-0.562f, 1.17f, -1.537f, 1.848f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.16f, 0.66f)
                quadToRelative(-0.764f, 0.002f, -1.382f, -0.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.17f, -0.548f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, -1.045f, -0.695f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.001f, -0.63f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -1.13f, -0.301f)
                curveToRelative(-0.373f, 0.0f, -0.75f, 0.097f, -1.132f, 0.3f)
                quadToRelative(-0.475f, 0.255f, -1.0f, 0.63f)
                quadToRelative(-0.482f, 0.345f, -1.047f, 0.695f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -1.168f, 0.548f)
                quadToRelative(-0.62f, 0.211f, -1.378f, 0.21f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.165f, -0.659f)
                quadToRelative(-0.976f, -0.68f, -1.537f, -1.848f)
                quadToRelative(-0.576f, -1.196f, -0.574f, -2.709f)
                curveToRelative(-0.004f, -0.98f, 0.15f, -1.802f, 0.477f, -2.46f)
                curveToRelative(0.3f, -0.619f, 0.76f, -1.147f, 1.33f, -1.531f)
                quadToRelative(0.9f, -0.604f, 2.12f, -0.907f)
                quadToRelative(1.382f, -0.335f, 2.8f, -0.423f)
                quadToRelative(1.56f, -0.107f, 3.273f, -0.107f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 4.071f)
                arcToRelative(7.07f, 7.07f, 0.0f, false, true, 10.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 6.572f)
                arcToRelative(3.535f, 3.535f, 0.0f, false, true, 5.001f, 0.0f)
            }
        }
        .build()
        return _deviceVisionProWifi!!
    }

private var _deviceVisionProWifi: ImageVector? = null
