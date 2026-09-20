package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.XMark: ImageVector
    get() {
        if (_xMark != null) {
            return _xMark!!
        }
        _xMark = Builder(name = "XMark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineToRelative(3.644f, 3.644f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 1.712f, 0.0f)
                lineToRelative(2.288f, -2.288f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 0.0f, -1.712f)
                lineToRelative(-3.644f, -3.644f)
                lineToRelative(3.644f, -3.644f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 0.0f, -1.712f)
                lineToRelative(-2.288f, -2.288f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, -1.712f, 0.0f)
                lineToRelative(-3.644f, 3.644f)
                lineToRelative(-3.644f, -3.644f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, -1.712f, 0.0f)
                lineToRelative(-2.288f, 2.288f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 0.0f, 1.712f)
                lineToRelative(3.644f, 3.644f)
                lineToRelative(-3.644f, 3.644f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 0.0f, 1.712f)
                lineToRelative(2.288f, 2.288f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 1.712f, 0.0f)
                lineToRelative(3.644f, -3.644f)
            }
        }
        .build()
        return _xMark!!
    }

private var _xMark: ImageVector? = null
