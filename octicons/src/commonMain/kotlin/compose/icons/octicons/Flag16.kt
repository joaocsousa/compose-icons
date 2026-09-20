package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Flag16: ImageVector
    get() {
        if (_flag16 != null) {
            return _flag16!!
        }
        _flag16 = Builder(name = "Flag16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.211f)
                verticalLineTo(2.221f)
                curveTo(15.0f, 2.141f, 14.98f, 2.071f, 14.95f, 1.991f)
                curveTo(14.95f, 1.971f, 14.95f, 1.951f, 14.94f, 1.931f)
                curveTo(14.92f, 1.881f, 14.88f, 1.841f, 14.85f, 1.801f)
                curveTo(14.82f, 1.761f, 14.81f, 1.721f, 14.78f, 1.691f)
                curveTo(14.76f, 1.671f, 14.74f, 1.671f, 14.72f, 1.651f)
                curveTo(14.66f, 1.601f, 14.6f, 1.561f, 14.53f, 1.531f)
                curveTo(11.75f, 0.421f, 9.67f, 1.281f, 7.84f, 2.031f)
                curveTo(6.11f, 2.751f, 4.6f, 3.361f, 2.5f, 2.601f)
                verticalLineTo(1.971f)
                curveTo(2.5f, 1.561f, 2.16f, 1.221f, 1.75f, 1.221f)
                curveTo(1.34f, 1.221f, 1.0f, 1.561f, 1.0f, 1.971f)
                verticalLineTo(14.471f)
                curveTo(1.0f, 14.881f, 1.34f, 15.221f, 1.75f, 15.221f)
                curveTo(2.16f, 15.221f, 2.5f, 14.881f, 2.5f, 14.471f)
                verticalLineTo(4.181f)
                curveTo(3.16f, 4.371f, 3.78f, 4.451f, 4.37f, 4.451f)
                curveTo(5.91f, 4.451f, 7.22f, 3.911f, 8.42f, 3.411f)
                curveTo(10.08f, 2.721f, 11.54f, 2.141f, 13.51f, 2.761f)
                verticalLineTo(9.191f)
                curveTo(11.23f, 8.631f, 9.45f, 9.361f, 7.85f, 10.031f)
                curveTo(6.6f, 10.551f, 5.44f, 11.031f, 4.06f, 10.951f)
                curveTo(3.68f, 10.921f, 3.29f, 11.241f, 3.26f, 11.651f)
                curveTo(3.23f, 12.061f, 3.55f, 12.421f, 3.96f, 12.451f)
                curveTo(4.1f, 12.451f, 4.25f, 12.461f, 4.38f, 12.461f)
                curveTo(5.9f, 12.461f, 7.18f, 11.931f, 8.42f, 11.421f)
                curveTo(10.21f, 10.681f, 11.76f, 10.041f, 13.98f, 10.921f)
                curveTo(14.04f, 10.941f, 14.1f, 10.951f, 14.17f, 10.951f)
                curveTo(14.2f, 10.951f, 14.23f, 10.971f, 14.26f, 10.971f)
                curveTo(14.49f, 10.971f, 14.71f, 10.851f, 14.85f, 10.661f)
                curveTo(14.89f, 10.611f, 14.93f, 10.571f, 14.95f, 10.511f)
                curveTo(14.97f, 10.461f, 14.97f, 10.411f, 14.98f, 10.361f)
                curveTo(14.98f, 10.321f, 15.01f, 10.281f, 15.01f, 10.231f)
                lineTo(15.0f, 10.211f)
                close()
            }
        }
        .build()
        return _flag16!!
    }

private var _flag16: ImageVector? = null
