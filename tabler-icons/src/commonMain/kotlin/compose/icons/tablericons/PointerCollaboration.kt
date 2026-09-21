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

public val TablerIcons.PointerCollaboration: ImageVector
    get() {
        if (_pointerCollaboration != null) {
            return _pointerCollaboration!!
        }
        _pointerCollaboration = Builder(name = "PointerCollaboration", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.943f, 13.013f)
                lineToRelative(5.016f, -1.957f)
                curveToRelative(1.445f, -0.563f, 1.367f, -2.633f, -0.116f, -3.087f)
                lineToRelative(-12.727f, -3.895f)
                curveToRelative(-1.253f, -0.384f, -2.426f, 0.79f, -2.042f, 2.042f)
                lineToRelative(3.895f, 12.727f)
                curveToRelative(0.454f, 1.483f, 2.524f, 1.56f, 3.087f, 0.116f)
                lineToRelative(1.957f, -5.017f)
                curveToRelative(0.166f, -0.426f, 0.503f, -0.763f, 0.93f, -0.929f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                lineToRelative(-3.151f, 1.064f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.785f, 0.785f)
                lineToRelative(-1.064f, 3.151f)
            }
        }
        .build()
        return _pointerCollaboration!!
    }

private var _pointerCollaboration: ImageVector? = null
