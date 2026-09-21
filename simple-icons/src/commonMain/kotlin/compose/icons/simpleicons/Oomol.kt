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

public val SimpleIcons.Oomol: ImageVector
    get() {
        if (_oomol != null) {
            return _oomol!!
        }
        _oomol = Builder(name = "Oomol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.176f, 14.888f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.832f, 0.83f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.832f, 0.83f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.832f, -0.83f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.832f, -0.83f)
                moveTo(6.824f, 7.513f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.832f, 0.83f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.832f, 0.83f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.832f, -0.83f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.832f, -0.83f)
                moveTo(12.0f, 0.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                moveTo(6.824f, 6.222f)
                curveToRelative(-1.174f, 0.0f, -2.126f, 0.95f, -2.126f, 2.12f)
                reflectiveCurveToRelative(0.952f, 2.121f, 2.126f, 2.121f)
                arcTo(2.13f, 2.13f, 0.0f, false, false, 8.85f, 8.988f)
                horizontalLineToRelative(0.932f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, 1.571f, 1.567f)
                verticalLineToRelative(2.95f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, false, 2.865f, 2.858f)
                horizontalLineToRelative(0.932f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 2.026f, 1.475f)
                curveToRelative(1.174f, 0.0f, 2.126f, -0.949f, 2.126f, -2.12f)
                reflectiveCurveToRelative(-0.952f, -2.12f, -2.126f, -2.12f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.026f, 1.475f)
                horizontalLineToRelative(-0.932f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, -1.571f, -1.567f)
                verticalLineToRelative(-2.95f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, false, -2.865f, -2.859f)
                horizontalLineTo(8.85f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.026f, -1.475f)
            }
        }
        .build()
        return _oomol!!
    }

private var _oomol: ImageVector? = null
