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

public val SimpleIcons.Qwen: ImageVector
    get() {
        if (_qwen != null) {
            return _qwen!!
        }
        _qwen = Builder(name = "Qwen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.919f, 14.545f)
                lineTo(20.817f, 9.17f)
                lineToRelative(1.47f, -2.544f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.0f, -0.566f)
                lineToRelative(-1.633f, -2.83f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.49f, -0.283f)
                horizontalLineToRelative(-6.207f)
                lineTo(12.487f, 0.402f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.49f, -0.284f)
                lineTo(8.732f, 0.118f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.49f, 0.284f)
                lineTo(5.139f, 5.775f)
                horizontalLineToRelative(-2.94f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.49f, 0.284f)
                lineTo(0.077f, 8.887f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.0f, 0.567f)
                lineTo(3.18f, 14.83f)
                lineToRelative(-1.47f, 2.545f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.0f, 0.566f)
                lineToRelative(1.634f, 2.83f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.49f, 0.283f)
                horizontalLineToRelative(6.205f)
                lineToRelative(1.47f, 2.545f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.49f, 0.284f)
                horizontalLineToRelative(3.266f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.49f, -0.284f)
                lineToRelative(3.104f, -5.375f)
                horizontalLineToRelative(2.94f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.49f, -0.283f)
                lineToRelative(1.634f, -2.828f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.004f, -0.568f)
                moveTo(8.733f, 0.686f)
                lineToRelative(1.634f, 2.828f)
                lineToRelative(-1.634f, 2.828f)
                lineTo(21.8f, 6.342f)
                lineTo(20.164f, 9.17f)
                lineTo(7.425f, 9.17f)
                lineTo(5.63f, 6.06f)
                close()
                moveTo(10.039f, 20.487f)
                lineTo(3.834f, 20.485f)
                lineTo(5.468f, 17.655f)
                horizontalLineToRelative(3.265f)
                lineTo(2.201f, 6.344f)
                horizontalLineToRelative(3.267f)
                quadToRelative(3.182f, 5.517f, 6.367f, 11.032f)
                close()
                moveTo(20.163f, 14.827f)
                lineTo(18.53f, 12.0f)
                lineToRelative(-6.532f, 11.315f)
                lineToRelative(-1.634f, -2.83f)
                curveToRelative(2.129f, -3.673f, 4.25f, -7.351f, 6.373f, -11.028f)
                horizontalLineToRelative(3.592f)
                lineToRelative(3.102f, 5.374f)
                close()
            }
        }
        .build()
        return _qwen!!
    }

private var _qwen: ImageVector? = null
