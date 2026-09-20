package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Vscode24: ImageVector
    get() {
        if (_vscode24 != null) {
            return _vscode24!!
        }
        _vscode24 = Builder(name = "Vscode24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.868f, 1.02f)
                curveToRelative(0.28f, -0.048f, 0.568f, -0.009f, 0.824f, 0.115f)
                lineToRelative(4.53f, 2.191f)
                curveToRelative(0.475f, 0.23f, 0.778f, 0.715f, 0.778f, 1.246f)
                verticalLineTo(19.428f)
                curveToRelative(-0.0f, 0.531f, -0.303f, 1.014f, -0.778f, 1.245f)
                lineToRelative(-4.53f, 2.19f)
                curveToRelative(-0.169f, 0.083f, -0.354f, 0.129f, -0.542f, 0.137f)
                curveToRelative(-0.187f, 0.007f, -0.375f, -0.024f, -0.549f, -0.094f)
                curveToRelative(-0.177f, -0.069f, -0.338f, -0.175f, -0.471f, -0.31f)
                lineToRelative(-8.672f, -7.951f)
                lineToRelative(-3.777f, 2.882f)
                curveToRelative(-0.17f, 0.129f, -0.38f, 0.195f, -0.594f, 0.186f)
                curveToRelative(-0.214f, -0.01f, -0.418f, -0.094f, -0.575f, -0.238f)
                lineToRelative(-1.212f, -1.108f)
                curveToRelative(-0.094f, -0.087f, -0.169f, -0.193f, -0.221f, -0.31f)
                curveToRelative(-0.051f, -0.117f, -0.078f, -0.243f, -0.078f, -0.371f)
                curveToRelative(0.0f, -0.128f, 0.027f, -0.256f, 0.078f, -0.373f)
                curveToRelative(0.052f, -0.117f, 0.127f, -0.222f, 0.221f, -0.308f)
                lineToRelative(3.275f, -3.003f)
                lineToRelative(-3.275f, -3.005f)
                curveToRelative(-0.094f, -0.086f, -0.169f, -0.191f, -0.221f, -0.308f)
                curveTo(1.027f, 8.57f, 1.0f, 8.443f, 1.0f, 8.316f)
                curveToRelative(0.0f, -0.128f, 0.027f, -0.256f, 0.078f, -0.373f)
                curveToRelative(0.052f, -0.117f, 0.127f, -0.222f, 0.221f, -0.308f)
                lineToRelative(1.212f, -1.11f)
                curveToRelative(0.158f, -0.144f, 0.362f, -0.228f, 0.575f, -0.238f)
                curveToRelative(0.213f, -0.009f, 0.424f, 0.056f, 0.594f, 0.186f)
                lineToRelative(3.777f, 2.882f)
                lineToRelative(8.672f, -7.949f)
                curveToRelative(0.2f, -0.202f, 0.458f, -0.337f, 0.738f, -0.385f)
                moveTo(10.924f, 12.0f)
                lineToRelative(6.579f, 5.018f)
                verticalLineToRelative(-0.304f)
                horizontalLineTo(17.5f)
                verticalLineTo(8.857f)
                horizontalLineToRelative(0.003f)
                verticalLineTo(6.98f)
                close()
            }
        }
        .build()
        return _vscode24!!
    }

private var _vscode24: ImageVector? = null
