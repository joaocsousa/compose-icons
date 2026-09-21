package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.RepoForkedLocked16: ImageVector
    get() {
        if (_repoForkedLocked16 != null) {
            return _repoForkedLocked16!!
        }
        _repoForkedLocked16 = Builder(name = "RepoForkedLocked16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.167f)
                verticalLineTo(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                verticalLineToRelative(1.168f)
                curveToRelative(0.591f, 0.281f, 1.0f, 0.884f, 1.0f, 1.582f)
                verticalLineToRelative(2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 8.0f, 14.249f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.698f, 0.409f, -1.3f, 1.0f, -1.582f)
                moveTo(3.25f, 1.0f)
                arcTo(2.251f, 2.251f, 0.0f, false, true, 4.0f, 5.371f)
                verticalLineToRelative(0.878f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.096f)
                curveToRelative(-0.051f, 0.429f, 0.008f, 0.987f, 0.067f, 1.5f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(1.749f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.5f, 1.501f)
                verticalLineToRelative(0.295f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.409f)
                verticalLineToRelative(0.796f)
                quadToRelative(0.002f, 0.376f, 0.107f, 0.72f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -1.106f, -4.343f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.25f, -2.25f)
                verticalLineToRelative(-0.878f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 3.25f, 1.0f)
                moveToRelative(7.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 1.94f, 3.388f)
                curveToRelative(-0.222f, 0.379f, -0.55f, 0.68f, -0.94f, 0.874f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, -1.82f, 0.079f)
                lineToRelative(-0.003f, -0.001f)
                arcTo(2.248f, 2.248f, 0.0f, false, true, 10.75f, 1.0f)
                moveToRelative(2.75f, 9.0f)
                verticalLineTo(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(3.25f, 2.499f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                moveToRelative(7.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.63f, 7.749f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
            }
        }
        .build()
        return _repoForkedLocked16!!
    }

private var _repoForkedLocked16: ImageVector? = null
