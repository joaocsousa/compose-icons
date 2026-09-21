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

public val Octicons.ProjectCheck24: ImageVector
    get() {
        if (_projectCheck24 != null) {
            return _projectCheck24!!
        }
        _projectCheck24 = Builder(name = "ProjectCheck24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.783f, 2.783f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                lineTo(22.0f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(20.5f, 8.75f)
                lineTo(8.75f, 8.75f)
                lineTo(8.75f, 20.5f)
                lineTo(10.0f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(3.75f, 22.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 20.25f)
                close()
                moveTo(8.75f, 3.5f)
                verticalLineToRelative(3.75f)
                lineTo(20.5f, 7.25f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(7.25f, 20.5f)
                lineTo(7.25f, 8.75f)
                lineTo(3.5f, 8.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
                moveTo(3.5f, 7.25f)
                horizontalLineToRelative(3.75f)
                lineTo(7.25f, 3.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.78f, 16.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-4.97f, 4.97f)
                lineToRelative(-1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _projectCheck24!!
    }

private var _projectCheck24: ImageVector? = null
