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

public val SimpleIcons.Longhorn: ImageVector
    get() {
        if (_longhorn != null) {
            return _longhorn!!
        }
        _longhorn = Builder(name = "Longhorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.46f, 2.172f)
                horizontalLineTo(2.54f)
                arcTo(2.55f, 2.55f, 0.0f, false, false, 0.0f, 4.712f)
                verticalLineToRelative(14.575f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, false, 2.54f, 2.54f)
                horizontalLineToRelative(18.92f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, false, 2.54f, -2.54f)
                verticalLineTo(4.713f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, false, -2.54f, -2.54f)
                moveToRelative(0.427f, 5.138f)
                lineToRelative(-0.31f, 2.1f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, true, -0.98f, 1.032f)
                lineToRelative(-5.024f, 1.003f)
                lineToRelative(-0.002f, 0.015f)
                lineToRelative(-0.787f, 4.306f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, true, -2.467f, 2.34f)
                horizontalLineToRelative(-0.634f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, true, -2.468f, -2.355f)
                lineToRelative(-0.697f, -4.288f)
                lineToRelative(-5.115f, -1.021f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, true, -0.98f, -1.032f)
                lineToRelative(-0.31f, -2.1f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, true, 2.445f, -0.36f)
                lineTo(4.74f, 8.19f)
                lineTo(12.0f, 9.639f)
                lineToRelative(7.26f, -1.45f)
                lineToRelative(0.182f, -1.24f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, true, 2.445f, 0.36f)
                moveTo(12.0f, 12.134f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.242f, -0.024f)
                lineToRelative(-0.653f, -0.13f)
                lineToRelative(0.562f, 3.457f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.016f, 0.198f)
                horizontalLineToRelative(0.634f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.02f, -0.222f)
                lineToRelative(0.63f, -3.448f)
                lineToRelative(-0.725f, 0.145f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.242f, 0.024f)
            }
        }
        .build()
        return _longhorn!!
    }

private var _longhorn: ImageVector? = null
