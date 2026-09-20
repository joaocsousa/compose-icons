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

public val SimpleIcons.Dify: ImageVector
    get() {
        if (_dify != null) {
            return _dify!!
        }
        _dify = Builder(name = "Dify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.417f, 9.334f)
                lineToRelative(-1.333f, 4.333f)
                lineToRelative(-1.334f, -4.333f)
                horizontalLineToRelative(-1.583f)
                lineTo(20.1f, 14.94f)
                curveToRelative(0.2f, 0.583f, -0.14f, 1.06f, -0.756f, 1.06f)
                horizontalLineToRelative(-0.678f)
                verticalLineToRelative(1.334f)
                horizontalLineToRelative(0.996f)
                curveToRelative(0.869f, 0.0f, 1.65f, -0.55f, 1.945f, -1.367f)
                lineTo(24.0f, 9.334f)
                close()
                moveTo(2.833f, 6.667f)
                lineTo(0.0f, 6.667f)
                verticalLineToRelative(8.666f)
                horizontalLineToRelative(2.833f)
                curveToRelative(3.5f, 0.0f, 4.5f, -2.0f, 4.5f, -4.333f)
                reflectiveCurveToRelative(-1.0f, -4.334f, -4.5f, -4.334f)
                close()
                moveTo(2.866f, 14.0f)
                lineTo(1.6f, 14.0f)
                lineTo(1.6f, 8.0f)
                horizontalLineToRelative(1.266f)
                curveToRelative(2.013f, 0.0f, 2.867f, 0.988f, 2.867f, 3.0f)
                reflectiveCurveToRelative(-0.854f, 3.0f, -2.867f, 3.0f)
                moveToRelative(11.0f, -5.267f)
                verticalLineToRelative(0.6f)
                horizontalLineToRelative(-1.532f)
                verticalLineToRelative(1.334f)
                horizontalLineToRelative(1.533f)
                lineTo(13.867f, 14.0f)
                horizontalLineToRelative(-2.534f)
                lineTo(11.333f, 9.334f)
                lineTo(8.0f, 9.334f)
                verticalLineToRelative(1.334f)
                horizontalLineToRelative(1.867f)
                lineTo(9.867f, 14.0f)
                horizontalLineToRelative(-2.2f)
                verticalLineToRelative(1.334f)
                horizontalLineToRelative(10.0f)
                lineTo(17.667f, 14.0f)
                horizontalLineToRelative(-2.332f)
                verticalLineToRelative(-3.333f)
                horizontalLineToRelative(2.333f)
                lineTo(17.668f, 9.334f)
                horizontalLineToRelative(-2.333f)
                lineTo(15.335f, 8.0f)
                horizontalLineToRelative(2.333f)
                lineTo(17.668f, 6.667f)
                horizontalLineToRelative(-1.733f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, -2.067f, 2.067f)
                close()
                moveTo(10.6f, 8.533f)
                curveToRelative(0.681f, 0.0f, 0.933f, -0.417f, 0.933f, -0.933f)
                curveToRelative(0.0f, -0.515f, -0.252f, -0.933f, -0.933f, -0.933f)
                curveToRelative(-0.68f, 0.0f, -0.934f, 0.418f, -0.934f, 0.933f)
                reflectiveCurveToRelative(0.253f, 0.934f, 0.934f, 0.934f)
            }
        }
        .build()
        return _dify!!
    }

private var _dify: ImageVector? = null
