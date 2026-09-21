package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Serverless: ImageVector
    get() {
        if (_serverless != null) {
            return _serverless!!
        }
        _serverless = Builder(name = "Serverless", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 19.0f)
                lineToRelative(3.03f, 1.748f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.94f, 0.0f)
                lineToRelative(6.0f, -3.843f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.03f, -1.753f)
                verticalLineToRelative(-6.152f)
                lineToRelative(-8.0f, 3.0f)
                lineToRelative(-8.0f, 3.0f)
                verticalLineToRelative(-6.405f)
                curveToRelative(0.0f, -0.728f, 0.394f, -1.399f, 1.03f, -1.752f)
                lineToRelative(6.0f, -3.582f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(2.97f, 1.739f)
            }
        }
        .build()
        return _serverless!!
    }

private var _serverless: ImageVector? = null
