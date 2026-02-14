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

public val SolidGroup._3: ImageVector
    get() {
        if (__3 != null) {
            return __3!!
        }
        __3 = Builder(name = "_3", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                curveToRelative(0.0f, 38.2f, -16.8f, 72.5f, -43.3f, 96.0f)
                curveToRelative(26.6f, 23.5f, 43.3f, 57.8f, 43.3f, 96.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(80.0f, 288.0f)
                close()
            }
        }
        .build()
        return __3!!
    }

private var __3: ImageVector? = null
