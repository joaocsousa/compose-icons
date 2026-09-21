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

public val SimpleIcons.Langchaincorporate: ImageVector
    get() {
        if (_langchaincorporate != null) {
            return _langchaincorporate!!
        }
        _langchaincorporate = Builder(name = "Langchaincorporate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.53f, 15.975f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, false, 2.206f, -5.325f)
                arcTo(7.54f, 7.54f, 0.0f, false, false, 7.53f, 5.325f)
                lineTo(2.205f, 0.0f)
                arcTo(7.54f, 7.54f, 0.0f, false, false, 0.0f, 5.325f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 2.205f, 5.325f)
                close()
                moveTo(18.674f, 16.468f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, -5.325f, -2.206f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, -5.325f, 2.206f)
                lineToRelative(5.325f, 5.325f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 5.325f, 2.205f)
                arcTo(7.54f, 7.54f, 0.0f, false, false, 24.0f, 21.793f)
                close()
                moveTo(2.219f, 21.78f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 5.325f, 2.205f)
                verticalLineToRelative(-7.53f)
                lineTo(0.014f, 16.455f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 2.205f, 5.325f)
                moveTo(20.73f, 8.595f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, false, -5.327f, -2.206f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, false, -5.325f, 2.207f)
                lineToRelative(5.325f, 5.325f)
                close()
            }
        }
        .build()
        return _langchaincorporate!!
    }

private var _langchaincorporate: ImageVector? = null
