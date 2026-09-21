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

public val TablerIcons.Pillow: ImageVector
    get() {
        if (_pillow != null) {
            return _pillow!!
        }
        _pillow = Builder(name = "Pillow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                arcToRelative(9.34f, 9.34f, 0.0f, false, true, 0.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.699f, 16.607f)
                curveToRelative(0.481f, 0.934f, 0.28f, 2.088f, -0.486f, 2.79f)
                curveToRelative(-0.767f, 0.703f, -1.9f, 0.77f, -2.74f, 0.165f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -12.946f, 0.0f)
                arcToRelative(2.16f, 2.16f, 0.0f, false, true, -2.74f, -0.165f)
                arcToRelative(2.345f, 2.345f, 0.0f, false, true, -0.486f, -2.79f)
                arcToRelative(41.7f, 41.7f, 0.0f, false, true, 0.0f, -9.163f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, 0.433f, -2.856f)
                arcToRelative(2.16f, 2.16f, 0.0f, false, true, 2.793f, -0.145f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 12.946f, 0.0f)
                arcToRelative(2.16f, 2.16f, 0.0f, false, true, 2.793f, 0.145f)
                curveToRelative(0.78f, 0.726f, 0.961f, 1.918f, 0.433f, 2.856f)
                arcToRelative(41.7f, 41.7f, 0.0f, false, true, 0.0f, 9.163f)
            }
        }
        .build()
        return _pillow!!
    }

private var _pillow: ImageVector? = null
