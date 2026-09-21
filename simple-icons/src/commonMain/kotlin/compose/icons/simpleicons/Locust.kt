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

public val SimpleIcons.Locust: ImageVector
    get() {
        if (_locust != null) {
            return _locust!!
        }
        _locust = Builder(name = "Locust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.425f, 6.348f)
                lineToRelative(0.725f, 0.731f)
                lineToRelative(-1.901f, 1.916f)
                lineToRelative(0.501f, 0.502f)
                lineToRelative(2.52f, -2.519f)
                lineToRelative(0.73f, 0.73f)
                lineToRelative(-2.519f, 2.52f)
                verticalLineToRelative(2.887f)
                lineToRelative(-1.65f, 1.65f)
                lineToRelative(-1.875f, -1.9f)
                verticalLineToRelative(1.064f)
                lineToRelative(3.674f, 3.723f)
                horizontalLineToRelative(-2.722f)
                lineToRelative(-6.514f, -6.514f)
                lineToRelative(5.684f, -2.612f)
                horizontalLineToRelative(1.187f)
                close()
                moveTo(18.685f, 18.031f)
                horizontalLineToRelative(-3.924f)
                lineToRelative(-7.799f, -7.799f)
                lineToRelative(-2.038f, 7.799f)
                lineTo(2.012f, 18.031f)
                lineTo(4.948f, 6.783f)
                lineToRelative(0.157f, -0.076f)
                lineToRelative(1.517f, -0.738f)
                close()
                moveTo(2.137f, 15.85f)
                lineToRelative(-0.47f, 1.802f)
                lineTo(0.0f, 17.652f)
                verticalLineToRelative(-0.82f)
                close()
                moveTo(6.441f, 13.873f)
                lineTo(8.89f, 12.747f)
                lineTo(12.495f, 16.352f)
                lineTo(9.487f, 17.652f)
                lineTo(5.454f, 17.652f)
                close()
            }
        }
        .build()
        return _locust!!
    }

private var _locust: ImageVector? = null
