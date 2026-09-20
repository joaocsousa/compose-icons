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

public val SimpleIcons.Simpleicons: ImageVector
    get() {
        if (_simpleicons != null) {
            return _simpleicons!!
        }
        _simpleicons = Builder(name = "Simpleicons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.35f, 9.0f)
                horizontalLineToRelative(1.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 12.0f, 10.5f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 16.5f, 6.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -6.0f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -3.0f)
                moveTo(7.5f, 15.0f)
                verticalLineToRelative(1.5f)
                lineTo(9.0f, 16.5f)
                verticalLineToRelative(6.0f)
                lineTo(4.5f, 22.5f)
                lineTo(4.5f, 24.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.5f)
                lineTo(15.0f, 22.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                lineTo(16.5f, 15.0f)
                close()
                moveTo(10.5f, 16.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(4.5f, 18.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.7f, 3.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.7f, -3.0f)
                close()
            }
        }
        .build()
        return _simpleicons!!
    }

private var _simpleicons: ImageVector? = null
