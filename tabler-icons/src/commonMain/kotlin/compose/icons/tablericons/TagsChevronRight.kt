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

public val TablerIcons.TagsChevronRight: ImageVector
    get() {
        if (_tagsChevronRight != null) {
            return _tagsChevronRight!!
        }
        _tagsChevronRight = Builder(name = "TagsChevronRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(13.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.814f, -0.419f)
                lineToRelative(4.286f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.162f)
                lineToRelative(-4.286f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.814f, -0.419f)
                horizontalLineToRelative(-13.485f)
                lineToRelative(5.0f, 7.0f)
                lineToRelative(-5.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                lineToRelative(4.585f, -6.419f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.162f)
                lineToRelative(-4.585f, -6.419f)
            }
        }
        .build()
        return _tagsChevronRight!!
    }

private var _tagsChevronRight: ImageVector? = null
