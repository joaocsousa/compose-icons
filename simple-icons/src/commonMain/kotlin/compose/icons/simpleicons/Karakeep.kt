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

public val SimpleIcons.Karakeep: ImageVector
    get() {
        if (_karakeep != null) {
            return _karakeep!!
        }
        _karakeep = Builder(name = "Karakeep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.582f, 0.054f)
                lineTo(1.418f, 0.054f)
                curveTo(0.635f, 0.054f, 0.0f, 0.69f, 0.0f, 1.472f)
                verticalLineToRelative(21.056f)
                curveToRelative(0.0f, 0.783f, 0.635f, 1.418f, 1.418f, 1.418f)
                horizontalLineToRelative(21.164f)
                curveToRelative(0.783f, 0.0f, 1.418f, -0.635f, 1.418f, -1.418f)
                lineTo(24.0f, 1.472f)
                curveTo(24.0f, 0.69f, 23.365f, 0.054f, 22.582f, 0.054f)
                moveTo(10.487f, 20.437f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.37f, 0.37f)
                lineTo(3.592f, 20.807f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.37f, -0.37f)
                lineTo(3.222f, 3.485f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.37f, -0.37f)
                horizontalLineToRelative(6.422f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.37f, 0.37f)
                verticalLineToRelative(6.452f)
                reflectiveCurveToRelative(-0.035f, 2.776f, 0.103f, 4.955f)
                close()
                moveTo(20.675f, 20.437f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.575f, 0.31f)
                lineToRelative(-2.975f, -1.945f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.42f, 0.01f)
                lineToRelative(-2.608f, 1.887f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, -0.345f, 0.042f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.159f, -0.302f)
                lineTo(13.593f, 7.274f)
                curveToRelative(0.353f, -0.07f, 0.746f, -0.106f, 1.2f, -0.106f)
                curveToRelative(2.229f, 0.0f, 5.882f, 1.257f, 5.882f, 4.81f)
                close()
            }
        }
        .build()
        return _karakeep!!
    }

private var _karakeep: ImageVector? = null
