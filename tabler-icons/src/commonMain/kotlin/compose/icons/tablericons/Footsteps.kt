package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Footsteps: ImageVector
    get() {
        if (_footsteps != null) {
            return _footsteps!!
        }
        _footsteps = Builder(name = "Footsteps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.52f, 12.0f)
                horizontalLineToRelative(-4.04f)
                curveToRelative(-0.348f, 0.0f, -0.678f, -0.179f, -0.823f, -0.496f)
                curveToRelative(-1.326f, -2.904f, -0.774f, -8.504f, 2.843f, -8.504f)
                reflectiveCurveToRelative(4.17f, 5.6f, 2.843f, 8.504f)
                curveToRelative(-0.145f, 0.317f, -0.475f, 0.496f, -0.824f, 0.496f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.52f, 14.0f)
                horizontalLineToRelative(-4.04f)
                curveToRelative(-0.348f, 0.0f, -0.678f, -0.179f, -0.823f, -0.496f)
                curveToRelative(-1.326f, -2.904f, -0.774f, -8.504f, 2.843f, -8.504f)
                reflectiveCurveToRelative(4.17f, 5.6f, 2.843f, 8.504f)
                curveToRelative(-0.145f, 0.317f, -0.475f, 0.496f, -0.824f, 0.496f)
            }
        }
        .build()
        return _footsteps!!
    }

private var _footsteps: ImageVector? = null
