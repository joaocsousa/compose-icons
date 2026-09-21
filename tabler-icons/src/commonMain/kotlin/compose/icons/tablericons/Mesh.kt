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

public val TablerIcons.Mesh: ImageVector
    get() {
        if (_mesh != null) {
            return _mesh!!
        }
        _mesh = Builder(name = "Mesh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveToRelative(0.485f, 0.445f, 3.5f, 3.312f, 3.5f, 8.0f)
                curveToRelative(0.0f, 0.663f, -0.07f, 4.848f, -3.5f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, 2.004f, 8.0f)
                curveToRelative(0.0f, 1.51f, -0.201f, 4.628f, -2.004f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.778f, 20.0f)
                horizontalLineToRelative(-13.556f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, -2.222f, -2.222f)
                verticalLineToRelative(-11.556f)
                curveToRelative(0.0f, -1.227f, 0.995f, -2.222f, 2.222f, -2.222f)
                horizontalLineToRelative(13.556f)
                curveToRelative(1.227f, 0.0f, 2.222f, 0.995f, 2.222f, 2.222f)
                verticalLineToRelative(11.556f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, -2.222f, 2.222f)
            }
        }
        .build()
        return _mesh!!
    }

private var _mesh: ImageVector? = null
