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

public val TablerIcons.DoorHanger: ImageVector
    get() {
        if (_doorHanger != null) {
            return _doorHanger!!
        }
        _doorHanger = Builder(name = "DoorHanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.48f, 2.64f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.31f, 1.49f)
                lineToRelative(1.76f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.22f, -0.13f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.82f, -0.88f)
                arcToRelative(3.09f, 3.09f, 0.0f, false, true, 2.37f, 3.01f)
                verticalLineToRelative(0.87f)
                lineToRelative(-9.2f, 1.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 1.0f)
                verticalLineToRelative(6.16f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-9.72f)
                arcToRelative(7.18f, 7.18f, 0.0f, false, false, -7.0f, -7.28f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                verticalLineToRelative(0.01f)
            }
        }
        .build()
        return _doorHanger!!
    }

private var _doorHanger: ImageVector? = null
