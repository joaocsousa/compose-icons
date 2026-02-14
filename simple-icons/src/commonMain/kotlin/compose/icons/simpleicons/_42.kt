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

public val SimpleIcons._42: ImageVector
    get() {
        if (__42 != null) {
            return __42!!
        }
        __42 = Builder(name = "_42", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.581f, 16.851f)
                lineTo(24.0f, 16.851f)
                verticalLineToRelative(-4.439f)
                close()
                moveTo(24.0f, 3.574f)
                horizontalLineToRelative(-4.419f)
                verticalLineToRelative(4.42f)
                lineToRelative(-4.419f, 4.418f)
                verticalLineToRelative(4.44f)
                horizontalLineToRelative(4.419f)
                verticalLineToRelative(-4.44f)
                lineTo(24.0f, 7.993f)
                close()
                moveTo(19.581f, 3.574f)
                horizontalLineToRelative(-4.419f)
                verticalLineToRelative(4.42f)
                close()
                moveTo(13.257f, 12.412f)
                lineTo(4.419f, 12.412f)
                lineToRelative(8.838f, -8.838f)
                lineTo(8.838f, 3.574f)
                lineTo(0.0f, 12.412f)
                verticalLineToRelative(3.595f)
                horizontalLineToRelative(8.838f)
                verticalLineToRelative(4.419f)
                horizontalLineToRelative(4.419f)
                close()
            }
        }
        .build()
        return __42!!
    }

private var __42: ImageVector? = null
