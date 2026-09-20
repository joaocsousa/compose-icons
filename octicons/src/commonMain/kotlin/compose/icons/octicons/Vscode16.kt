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

public val Octicons.Vscode16: ImageVector
    get() {
        if (_vscode16 != null) {
            return _vscode16!!
        }
        _vscode16 = Builder(name = "Vscode16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.098f, 1.013f)
                curveToRelative(0.178f, -0.031f, 0.362f, -0.005f, 0.524f, 0.073f)
                lineToRelative(2.883f, 1.395f)
                curveToRelative(0.303f, 0.146f, 0.495f, 0.455f, 0.495f, 0.793f)
                verticalLineToRelative(9.453f)
                curveToRelative(-0.0f, 0.338f, -0.193f, 0.646f, -0.495f, 0.792f)
                lineToRelative(-2.883f, 1.394f)
                curveToRelative(-0.107f, 0.052f, -0.225f, 0.082f, -0.345f, 0.087f)
                curveToRelative(-0.119f, 0.004f, -0.239f, -0.015f, -0.35f, -0.06f)
                curveToRelative(-0.113f, -0.044f, -0.215f, -0.111f, -0.3f, -0.197f)
                lineTo(5.109f, 9.683f)
                lineTo(2.706f, 11.517f)
                curveToRelative(-0.108f, 0.082f, -0.242f, 0.124f, -0.378f, 0.118f)
                curveToRelative(-0.136f, -0.006f, -0.266f, -0.06f, -0.366f, -0.151f)
                lineToRelative(-0.771f, -0.705f)
                curveToRelative(-0.06f, -0.055f, -0.108f, -0.123f, -0.141f, -0.197f)
                curveToRelative(-0.033f, -0.075f, -0.05f, -0.155f, -0.05f, -0.236f)
                curveToRelative(0.0f, -0.082f, 0.017f, -0.163f, 0.05f, -0.237f)
                curveToRelative(0.033f, -0.074f, 0.081f, -0.141f, 0.141f, -0.196f)
                lineToRelative(2.084f, -1.911f)
                lineToRelative(-2.084f, -1.912f)
                curveToRelative(-0.06f, -0.055f, -0.108f, -0.122f, -0.141f, -0.196f)
                curveToRelative(-0.033f, -0.074f, -0.05f, -0.155f, -0.05f, -0.236f)
                curveToRelative(0.0f, -0.082f, 0.017f, -0.163f, 0.05f, -0.237f)
                curveToRelative(0.033f, -0.074f, 0.081f, -0.141f, 0.141f, -0.196f)
                lineToRelative(0.771f, -0.706f)
                curveToRelative(0.1f, -0.092f, 0.23f, -0.145f, 0.366f, -0.151f)
                curveToRelative(0.136f, -0.006f, 0.27f, 0.036f, 0.378f, 0.118f)
                lineToRelative(2.403f, 1.834f)
                lineToRelative(5.519f, -5.059f)
                curveToRelative(0.127f, -0.129f, 0.292f, -0.214f, 0.47f, -0.245f)
                moveTo(7.315f, 8.0f)
                lineTo(11.502f, 11.193f)
                verticalLineToRelative(-0.193f)
                horizontalLineTo(11.5f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(0.002f)
                verticalLineTo(4.806f)
                close()
            }
        }
        .build()
        return _vscode16!!
    }

private var _vscode16: ImageVector? = null
