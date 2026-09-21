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

public val Octicons.Sandbox16: ImageVector
    get() {
        if (_sandbox16 != null) {
            return _sandbox16!!
        }
        _sandbox16 = Builder(name = "Sandbox16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.72f, 8.97f)
                curveTo(8.013f, 8.677f, 8.487f, 8.677f, 8.78f, 8.97f)
                curveTo(9.073f, 9.263f, 9.073f, 9.737f, 8.78f, 10.03f)
                lineTo(7.311f, 11.5f)
                lineTo(8.78f, 12.97f)
                curveTo(9.073f, 13.263f, 9.073f, 13.737f, 8.78f, 14.03f)
                curveTo(8.487f, 14.323f, 8.013f, 14.323f, 7.72f, 14.03f)
                lineTo(5.72f, 12.03f)
                curveTo(5.427f, 11.737f, 5.427f, 11.263f, 5.72f, 10.97f)
                lineTo(7.72f, 8.97f)
                close()
                moveTo(11.22f, 8.97f)
                curveTo(11.513f, 8.677f, 11.987f, 8.677f, 12.28f, 8.97f)
                lineTo(14.28f, 10.97f)
                curveTo(14.573f, 11.263f, 14.573f, 11.737f, 14.28f, 12.03f)
                lineTo(12.28f, 14.03f)
                curveTo(11.987f, 14.323f, 11.513f, 14.323f, 11.22f, 14.03f)
                curveTo(10.927f, 13.737f, 10.927f, 13.263f, 11.22f, 12.97f)
                lineTo(12.689f, 11.5f)
                lineTo(11.22f, 10.03f)
                curveTo(10.927f, 9.737f, 10.927f, 9.263f, 11.22f, 8.97f)
                close()
                moveTo(14.5f, 8.0f)
                verticalLineTo(1.75f)
                curveTo(14.5f, 1.612f, 14.388f, 1.5f, 14.25f, 1.5f)
                horizontalLineTo(1.75f)
                curveTo(1.612f, 1.5f, 1.5f, 1.612f, 1.5f, 1.75f)
                verticalLineTo(14.25f)
                curveTo(1.5f, 14.388f, 1.612f, 14.5f, 1.75f, 14.5f)
                horizontalLineTo(3.5f)
                curveTo(3.914f, 14.5f, 4.25f, 14.836f, 4.25f, 15.25f)
                curveTo(4.25f, 15.664f, 3.914f, 16.0f, 3.5f, 16.0f)
                horizontalLineTo(1.75f)
                curveTo(0.784f, 16.0f, 0.0f, 15.217f, 0.0f, 14.25f)
                verticalLineTo(1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                horizontalLineTo(14.25f)
                curveTo(15.217f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 8.414f, 15.664f, 8.75f, 15.25f, 8.75f)
                curveTo(14.836f, 8.75f, 14.5f, 8.414f, 14.5f, 8.0f)
                close()
            }
        }
        .build()
        return _sandbox16!!
    }

private var _sandbox16: ImageVector? = null
