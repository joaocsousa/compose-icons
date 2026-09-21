package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ProjectCheck16: ImageVector
    get() {
        if (_projectCheck16 != null) {
            return _projectCheck16!!
        }
        _projectCheck16 = Builder(name = "ProjectCheck16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 0.0f)
                curveTo(15.216f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(6.498f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.002f)
                lineTo(14.5f, 6.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.001f, 1.5f)
                lineTo(1.75f, 16.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                lineTo(0.0f, 1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                close()
                moveTo(1.5f, 14.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                lineTo(5.0f, 14.5f)
                verticalLineToRelative(-8.0f)
                lineTo(1.5f, 6.5f)
                close()
                moveTo(1.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(1.5f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 1.5f)
                close()
                moveTo(6.5f, 1.5f)
                lineTo(6.5f, 5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.963f, 11.737f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.202f, 0.524f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(2.97f, -2.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.261f, 0.536f)
            }
        }
        .build()
        return _projectCheck16!!
    }

private var _projectCheck16: ImageVector? = null
