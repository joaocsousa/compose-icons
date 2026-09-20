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

public val TablerIcons.Loader4: ImageVector
    get() {
        if (_loader4 != null) {
            return _loader4!!
        }
        _loader4 = Builder(name = "Loader4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                moveToRelative(6.36f, 0.36f)
                lineToRelative(-2.12f, -2.12f)
                moveToRelative(4.76f, -4.24f)
                horizontalLineToRelative(-3.0f)
                moveToRelative(0.36f, -6.36f)
                lineToRelative(-2.12f, 2.12f)
                moveToRelative(-4.24f, -4.76f)
                verticalLineToRelative(3.0f)
                moveToRelative(-6.36f, -0.36f)
                lineToRelative(2.12f, 2.12f)
                moveToRelative(-3.76f, 4.24f)
                horizontalLineToRelative(2.0f)
                moveToRelative(1.0f, 4.95f)
                lineToRelative(0.71f, -0.71f)
            }
        }
        .build()
        return _loader4!!
    }

private var _loader4: ImageVector? = null
