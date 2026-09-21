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

public val TablerIcons.TagsChevronLeft: ImageVector
    get() {
        if (_tagsChevronLeft != null) {
            return _tagsChevronLeft!!
        }
        _tagsChevronLeft = Builder(name = "TagsChevronLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.59f, 19.0f)
                horizontalLineToRelative(-12.86f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, -0.81f, -0.411f)
                lineToRelative(-4.185f, -6.125f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, 0.0f, -0.928f)
                lineToRelative(4.184f, -6.125f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, 0.811f, -0.411f)
                horizontalLineToRelative(12.86f)
                lineToRelative(-4.782f, 7.0f)
                lineToRelative(4.782f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.895f, 19.0f)
                lineToRelative(-4.465f, -6.536f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, 0.0f, -0.928f)
                lineToRelative(4.465f, -6.536f)
            }
        }
        .build()
        return _tagsChevronLeft!!
    }

private var _tagsChevronLeft: ImageVector? = null
