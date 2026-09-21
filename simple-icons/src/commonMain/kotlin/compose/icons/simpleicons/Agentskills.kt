package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Agentskills: ImageVector
    get() {
        if (_agentskills != null) {
            return _agentskills!!
        }
        _agentskills = Builder(name = "Agentskills", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                lineToRelative(10.392f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineTo(1.608f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _agentskills!!
    }

private var _agentskills: ImageVector? = null
