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

public val TablerIcons.SparkleHighlight: ImageVector
    get() {
        if (_sparkleHighlight != null) {
            return _sparkleHighlight!!
        }
        _sparkleHighlight = Builder(name = "SparkleHighlight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.504f, 8.522f)
                lineToRelative(-1.758f, -4.032f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, -1.492f, 0.0f)
                lineToRelative(-1.759f, 4.032f)
                curveToRelative(-0.19f, 0.436f, -0.537f, 0.784f, -0.973f, 0.973f)
                lineToRelative(-4.032f, 1.759f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, 0.0f, 1.492f)
                lineToRelative(4.033f, 1.758f)
                curveToRelative(0.436f, 0.19f, 0.784f, 0.538f, 0.973f, 0.974f)
                lineToRelative(1.759f, 4.033f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, 1.492f, 0.0f)
                lineToRelative(1.758f, -4.033f)
                curveToRelative(0.19f, -0.436f, 0.538f, -0.784f, 0.974f, -0.974f)
                lineToRelative(4.033f, -1.758f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, false, 0.0f, -1.492f)
                lineToRelative(-4.033f, -1.759f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.974f, -0.973f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineToRelative(-2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                lineToRelative(2.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                lineToRelative(-2.0f, -2.0f)
            }
        }
        .build()
        return _sparkleHighlight!!
    }

private var _sparkleHighlight: ImageVector? = null
