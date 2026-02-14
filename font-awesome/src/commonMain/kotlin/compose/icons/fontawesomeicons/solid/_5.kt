package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup._5: ImageVector
    get() {
        if (__5 != null) {
            return __5!!
        }
        __5 = Builder(name = "_5", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(120.0f, 0.0f)
                curveToRelative(75.1f, 0.0f, 136.0f, 60.9f, 136.0f, 136.0f)
                reflectiveCurveTo(259.1f, 480.0f, 184.0f, 480.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(152.0f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                reflectiveCurveToRelative(-32.2f, -72.0f, -72.0f, -72.0f)
                lineTo(32.0f, 272.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 64.0f)
                close()
            }
        }
        .build()
        return __5!!
    }

private var __5: ImageVector? = null
