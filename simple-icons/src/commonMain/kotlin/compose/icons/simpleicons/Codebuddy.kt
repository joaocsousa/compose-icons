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

public val SimpleIcons.Codebuddy: ImageVector
    get() {
        if (_codebuddy != null) {
            return _codebuddy!!
        }
        _codebuddy = Builder(name = "Codebuddy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.636f, 0.289f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.11f, 0.0f)
                curveToRelative(-0.18f, 0.01f, -0.195f, 0.02f, -0.442f, 0.24f)
                curveToRelative(-0.716f, 0.636f, -1.722f, 2.546f, -2.703f, 5.137f)
                lineToRelative(-0.274f, 0.72f)
                lineToRelative(-0.499f, 0.16f)
                curveToRelative(-1.554f, 0.498f, -2.934f, 1.128f, -4.157f, 1.893f)
                curveToRelative(-1.174f, 0.73f, -1.81f, 1.207f, -2.768f, 2.056f)
                lineToRelative(-0.578f, 0.51f)
                lineToRelative(-0.262f, -0.045f)
                curveToRelative(-2.528f, -0.447f, -4.8f, -0.612f, -5.843f, -0.43f)
                curveToRelative(-0.414f, 0.077f, -0.757f, 0.216f, -0.862f, 0.35f)
                curveToRelative(-0.092f, 0.12f, -0.138f, 0.263f, -0.138f, 0.474f)
                curveToRelative(0.0f, 0.182f, 0.034f, 0.414f, 0.098f, 0.727f)
                curveToRelative(0.265f, 1.236f, 0.952f, 2.854f, 2.035f, 4.78f)
                lineToRelative(0.7f, 1.236f)
                lineToRelative(-0.023f, 0.466f)
                curveToRelative(-0.027f, 0.499f, 0.0f, 1.27f, 0.06f, 1.793f)
                curveToRelative(0.036f, 0.319f, 0.031f, 0.327f, -0.135f, 0.516f)
                curveToRelative(-0.565f, 0.647f, -0.708f, 1.676f, -0.408f, 2.84f)
                horizontalLineToRelative(5.364f)
                lineToRelative(-0.33f, -0.57f)
                curveToRelative(-0.64f, -1.108f, -0.96f, -1.663f, -1.134f, -2.177f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, true, 1.564f, -5.84f)
                curveToRelative(0.408f, -0.358f, 0.962f, -0.678f, 2.072f, -1.32f)
                lineToRelative(6.38f, -3.683f)
                curveToRelative(1.11f, -0.64f, 1.665f, -0.96f, 2.18f, -1.134f)
                arcTo(5.46f, 5.46f, 0.0f, false, true, 24.0f, 10.275f)
                verticalLineTo(6.462f)
                lineToRelative(-0.117f, -0.06f)
                lineToRelative(-0.504f, -0.25f)
                lineToRelative(-0.357f, -0.662f)
                curveToRelative(-0.924f, -1.702f, -2.41f, -3.696f, -3.477f, -4.666f)
                curveToRelative(-0.4f, -0.364f, -0.655f, -0.517f, -0.91f, -0.535f)
                moveTo(11.57f, 17.634f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 1.722f, 0.462f)
                lineToRelative(1.358f, 2.35f)
                curveToRelative(0.842f, 1.455f, -1.341f, 2.717f, -2.183f, 1.262f)
                lineToRelative(-1.358f, -2.352f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 0.461f, -1.722f)
                moveToRelative(6.802f, -3.926f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 1.721f, 0.46f)
                lineToRelative(1.358f, 2.352f)
                curveToRelative(0.84f, 1.455f, -1.343f, 2.715f, -2.183f, 1.26f)
                lineToRelative(-1.358f, -2.35f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 0.462f, -1.722f)
            }
        }
        .build()
        return _codebuddy!!
    }

private var _codebuddy: ImageVector? = null
