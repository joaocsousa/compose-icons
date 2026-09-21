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

public val SimpleIcons.Express: ImageVector
    get() {
        if (_express != null) {
            return _express!!
        }
        _express = Builder(name = "Express", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.262f, 16.666f)
                horizontalLineToRelative(1.146f)
                lineToRelative(6.975f, -9.325f)
                lineTo(19.22f, 7.341f)
                close()
                moveTo(22.04f, 18.107f)
                verticalLineToRelative(0.004f)
                lineToRelative(-4.334f, -5.706f)
                lineToRelative(-0.557f, 0.74f)
                lineToRelative(4.873f, 6.682f)
                lineTo(0.945f, 19.827f)
                lineTo(0.945f, 4.173f)
                horizontalLineToRelative(9.505f)
                lineToRelative(5.026f, 6.7f)
                lineToRelative(0.574f, -0.772f)
                lineToRelative(-4.374f, -5.928f)
                horizontalLineToRelative(0.003f)
                lineToRelative(-0.719f, -0.945f)
                lineTo(0.0f, 3.228f)
                verticalLineToRelative(17.544f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(10.917f, 8.705f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.292f, -1.183f)
                quadToRelative(-0.796f, -0.45f, -1.916f, -0.45f)
                curveToRelative(-0.746f, 0.0f, -1.37f, 0.14f, -1.906f, 0.424f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, -1.31f, 1.12f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -0.75f, 1.581f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, false, 0.0f, 3.696f)
                curveToRelative(0.148f, 0.567f, 0.402f, 1.101f, 0.75f, 1.573f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.31f, 1.066f)
                quadToRelative(0.803f, 0.39f, 1.906f, 0.389f)
                quadToRelative(1.77f, 0.0f, 2.739f, -0.868f)
                quadToRelative(0.966f, -0.867f, 1.328f, -2.457f)
                horizontalLineToRelative(-1.139f)
                quadToRelative(-0.271f, 1.084f, -0.977f, 1.734f)
                quadToRelative(-0.704f, 0.651f, -1.952f, 0.65f)
                quadToRelative(-0.812f, 0.0f, -1.392f, -0.342f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.957f, -0.869f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.551f, -1.182f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.17f, -1.133f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.015f, -0.286f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.015f, -0.829f)
                curveToRelative(0.047f, -0.418f, 0.147f, -0.83f, 0.296f, -1.223f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 5.54f, 9.05f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 0.922f, -0.742f)
                quadToRelative(0.541f, -0.28f, 1.246f, -0.28f)
                curveToRelative(0.47f, 0.0f, 0.869f, 0.093f, 1.23f, 0.28f)
                quadToRelative(0.541f, 0.281f, 0.922f, 0.742f)
                quadToRelative(0.379f, 0.461f, 0.587f, 1.057f)
                reflectiveQuadToRelative(0.225f, 1.246f)
                lineTo(5.625f, 11.353f)
                lineToRelative(0.004f, 0.957f)
                horizontalLineToRelative(6.182f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, -0.18f, -1.924f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -0.715f, -1.68f)
                close()
            }
        }
        .build()
        return _express!!
    }

private var _express: ImageVector? = null
