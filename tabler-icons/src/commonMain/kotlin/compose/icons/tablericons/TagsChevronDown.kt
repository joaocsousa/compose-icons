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

public val TablerIcons.TagsChevronDown: ImageVector
    get() {
        if (_tagsChevronDown != null) {
            return _tagsChevronDown!!
        }
        _tagsChevronDown = Builder(name = "TagsChevronDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                verticalLineToRelative(13.446f)
                curveToRelative(0.0f, 0.345f, 0.155f, 0.665f, 0.411f, 0.848f)
                lineToRelative(6.125f, 4.375f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.928f, 0.0f)
                lineToRelative(6.125f, -4.375f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 0.411f, -0.848f)
                verticalLineToRelative(-13.446f)
                lineToRelative(-7.0f, 5.0f)
                lineToRelative(-7.0f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                lineToRelative(6.536f, 4.669f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.928f, 0.0f)
                lineToRelative(6.536f, -4.669f)
            }
        }
        .build()
        return _tagsChevronDown!!
    }

private var _tagsChevronDown: ImageVector? = null
