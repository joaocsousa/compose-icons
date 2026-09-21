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

public val SimpleIcons.Pangolin: ImageVector
    get() {
        if (_pangolin != null) {
            return _pangolin!!
        }
        _pangolin = Builder(name = "Pangolin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.729f, 7.988f)
                arcToRelative(0.852f, 0.852f, 0.0f, true, true, 0.0f, 1.705f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, 0.0f, -1.701f)
                moveToRelative(3.345f, 3.557f)
                curveToRelative(-0.087f, 2.835f, -2.249f, 6.577f, -5.178f, 7.537f)
                curveToRelative(-3.425f, 1.123f, -6.022f, -0.563f, -6.846f, -2.54f)
                curveToRelative(-0.642f, -1.542f, -0.159f, -3.383f, 1.04f, -4.162f)
                curveToRelative(1.013f, -0.661f, 2.895f, -0.831f, 4.479f, 0.208f)
                curveToRelative(-0.556f, -1.459f, -2.053f, -2.419f, -3.38f, -2.706f)
                arcToRelative(5.67f, 5.67f, 0.0f, false, false, -3.681f, 0.54f)
                curveToRelative(1.263f, -1.398f, 4.218f, -2.748f, 7.431f, -1.043f)
                curveToRelative(2.155f, 1.145f, 3.081f, 2.748f, 3.996f, 4.914f)
                curveTo(23.33f, 10.63f, 21.66f, 6.219f, 18.75f, 3.6f)
                arcTo(14.44f, 14.44f, 0.0f, false, false, 8.71f, 0.009f)
                curveToRelative(1.013f, 0.627f, 2.2f, 1.52f, 3.3f, 2.562f)
                curveToRelative(-4.853f, -0.6f, -8.856f, 0.503f, -11.328f, 3.867f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, true, 5.02f, -0.355f)
                curveTo(2.164f, 8.578f, 0.107f, 12.766f, 1.154f, 17.139f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 2.73f, -3.666f)
                curveToRelative(-0.353f, 3.262f, 0.136f, 7.673f, 4.33f, 10.527f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, -0.465f, -3.137f)
                curveToRelative(1.962f, 1.534f, 4.812f, 2.797f, 8.35f, 1.924f)
                curveToRelative(6.245f, -1.543f, 7.915f, -7.58f, 6.974f, -11.242f)
            }
        }
        .build()
        return _pangolin!!
    }

private var _pangolin: ImageVector? = null
