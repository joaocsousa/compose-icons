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

public val TablerIcons.EmailStamp: ImageVector
    get() {
        if (_emailStamp != null) {
            return _emailStamp!!
        }
        _emailStamp = Builder(name = "EmailStamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.586f, 4.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, -0.586f)
                horizontalLineToRelative(-0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.586f, 1.414f)
                verticalLineToRelative(0.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                curveToRelative(0.4f, 0.4f, 0.595f, 0.928f, 0.585f, 1.452f)
                curveToRelative(-0.01f, 0.5f, -0.204f, 0.995f, -0.585f, 1.376f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.586f, 1.414f)
                verticalLineToRelative(0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, -0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, 0.586f)
                horizontalLineToRelative(0.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, -0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, 0.586f)
                horizontalLineToRelative(0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.586f, -1.414f)
                arcToRelative(1.996f, 1.996f, 0.0f, false, true, 0.0f, -2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, -1.414f)
                verticalLineToRelative(-0.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.586f, -1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, -1.414f)
                verticalLineToRelative(-0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, 0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, -0.586f)
                horizontalLineToRelative(-0.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, 0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                curveToRelative(0.0f, -1.105f, 0.672f, -2.0f, 1.5f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.895f, 1.5f, 2.0f)
            }
        }
        .build()
        return _emailStamp!!
    }

private var _emailStamp: ImageVector? = null
