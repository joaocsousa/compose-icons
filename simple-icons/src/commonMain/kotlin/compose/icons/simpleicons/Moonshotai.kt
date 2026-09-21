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

public val SimpleIcons.Moonshotai: ImageVector
    get() {
        if (_moonshotai != null) {
            return _moonshotai!!
        }
        _moonshotai = Builder(name = "Moonshotai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.053f, 16.91f)
                lineToRelative(9.538f, 2.55f)
                arcToRelative(21.0f, 20.981f, 0.0f, false, false, 0.06f, 2.031f)
                lineToRelative(5.956f, 1.592f)
                arcToRelative(12.0f, 11.99f, 0.0f, false, true, -15.554f, -6.172f)
                moveToRelative(-1.02f, -5.79f)
                lineToRelative(11.352f, 3.035f)
                arcToRelative(21.0f, 20.981f, 0.0f, false, false, -0.469f, 2.01f)
                lineToRelative(10.817f, 2.89f)
                arcToRelative(12.0f, 11.99f, 0.0f, false, true, -1.845f, 2.004f)
                lineTo(0.658f, 15.918f)
                arcToRelative(12.0f, 11.99f, 0.0f, false, true, -0.625f, -4.796f)
                moveToRelative(1.593f, -5.146f)
                lineTo(13.573f, 9.17f)
                arcToRelative(21.0f, 20.981f, 0.0f, false, false, -1.01f, 1.874f)
                lineToRelative(11.297f, 3.02f)
                arcToRelative(21.0f, 20.981f, 0.0f, false, true, -0.67f, 2.362f)
                lineToRelative(-11.55f, -3.087f)
                lineTo(0.125f, 10.26f)
                arcToRelative(12.0f, 11.99f, 0.0f, false, true, 1.499f, -4.285f)
                close()
                moveTo(6.067f, 1.58f)
                lineToRelative(11.285f, 3.016f)
                arcToRelative(21.0f, 20.981f, 0.0f, false, false, -1.688f, 1.719f)
                lineToRelative(7.824f, 2.091f)
                arcToRelative(21.0f, 20.981f, 0.0f, false, true, 0.513f, 2.664f)
                lineTo(2.107f, 5.218f)
                arcToRelative(12.0f, 11.99f, 0.0f, false, true, 3.96f, -3.638f)
                moveTo(21.68f, 4.866f)
                lineTo(7.222f, 1.003f)
                arcTo(12.0f, 11.99f, 0.0f, false, true, 21.68f, 4.866f)
            }
        }
        .build()
        return _moonshotai!!
    }

private var _moonshotai: ImageVector? = null
