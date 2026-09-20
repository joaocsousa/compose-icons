package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.1f, 16.0f)
                curveToRelative(20.7f, 0.0f, 40.1f, 10.0f, 52.1f, 26.8f)
                lineToRelative(48.9f, 68.5f)
                curveToRelative(7.7f, 10.8f, 11.9f, 23.9f, 11.9f, 37.2f)
                lineTo(448.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-320.0f, 0.0f)
                lineToRelative(-6.5f, -0.3f)
                curveTo(25.2f, 476.4f, 0.0f, 449.1f, 0.0f, 416.0f)
                lineTo(0.0f, 148.5f)
                curveToRelative(0.0f, -11.7f, 3.2f, -23.1f, 9.2f, -33.0f)
                lineToRelative(2.7f, -4.2f)
                lineToRelative(48.9f, -68.5f)
                curveToRelative(10.5f, -14.7f, 26.7f, -24.2f, 44.4f, -26.3f)
                lineToRelative(7.7f, -0.5f)
                lineToRelative(222.1f, 0.0f)
                close()
                moveTo(248.0f, 128.0f)
                lineToRelative(121.3f, 0.0f)
                lineToRelative(-34.3f, -48.0f)
                lineToRelative(-87.1f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(78.7f, 128.0f)
                lineToRelative(121.3f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-87.1f, 0.0f)
                lineToRelative(-34.3f, 48.0f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
