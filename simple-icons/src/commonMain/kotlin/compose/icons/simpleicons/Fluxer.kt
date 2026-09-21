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

public val SimpleIcons.Fluxer: ImageVector
    get() {
        if (_fluxer != null) {
            return _fluxer!!
        }
        _fluxer = Builder(name = "Fluxer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                moveTo(8.79f, 12.471f)
                quadToRelative(-1.092f, 0.0f, -2.078f, 0.493f)
                quadToRelative(-0.975f, 0.493f, -1.586f, 1.575f)
                quadToRelative(-0.395f, 0.712f, -0.52f, 1.726f)
                curveToRelative(-0.078f, 0.626f, 0.448f, 1.135f, 1.079f, 1.135f)
                curveToRelative(0.645f, 0.0f, 1.128f, -0.543f, 1.284f, -1.17f)
                quadToRelative(0.133f, -0.531f, 0.429f, -0.844f)
                quadToRelative(0.568f, -0.6f, 1.435f, -0.6f)
                quadToRelative(0.58f, 0.0f, 1.061f, 0.289f)
                quadToRelative(0.482f, 0.279f, 1.254f, 0.954f)
                quadToRelative(1.178f, 1.038f, 2.078f, 1.51f)
                quadToRelative(0.9f, 0.46f, 1.993f, 0.461f)
                quadToRelative(1.093f, 0.0f, 2.079f, -0.493f)
                quadToRelative(0.985f, -0.492f, 1.596f, -1.575f)
                quadToRelative(0.404f, -0.714f, 0.522f, -1.734f)
                curveToRelative(0.072f, -0.623f, -0.455f, -1.127f, -1.083f, -1.127f)
                curveToRelative(-0.65f, 0.0f, -1.134f, 0.549f, -1.307f, 1.176f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.382f, 0.774f)
                quadToRelative(-0.535f, 0.665f, -1.468f, 0.665f)
                quadToRelative(-0.579f, 0.0f, -1.05f, -0.279f)
                quadToRelative(-0.46f, -0.29f, -1.264f, -0.964f)
                quadToRelative(-1.19f, -0.996f, -2.09f, -1.479f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.982f, -0.493f)
                moveTo(8.79f, 6.0f)
                quadToRelative(-1.092f, 0.0f, -2.078f, 0.493f)
                quadToRelative(-0.975f, 0.492f, -1.586f, 1.575f)
                quadToRelative(-0.395f, 0.712f, -0.52f, 1.726f)
                curveToRelative(-0.078f, 0.625f, 0.448f, 1.135f, 1.079f, 1.135f)
                curveToRelative(0.645f, 0.0f, 1.128f, -0.543f, 1.284f, -1.17f)
                quadToRelative(0.133f, -0.533f, 0.429f, -0.845f)
                quadToRelative(0.568f, -0.6f, 1.435f, -0.6f)
                quadToRelative(0.58f, 0.0f, 1.061f, 0.29f)
                quadToRelative(0.482f, 0.278f, 1.254f, 0.953f)
                quadToRelative(1.178f, 1.04f, 2.078f, 1.51f)
                quadToRelative(0.9f, 0.462f, 1.993f, 0.462f)
                reflectiveQuadToRelative(2.079f, -0.493f)
                quadToRelative(0.985f, -0.493f, 1.596f, -1.575f)
                quadToRelative(0.404f, -0.716f, 0.522f, -1.734f)
                curveToRelative(0.072f, -0.624f, -0.455f, -1.127f, -1.083f, -1.127f)
                curveToRelative(-0.65f, 0.0f, -1.134f, 0.549f, -1.307f, 1.175f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.382f, 0.775f)
                quadToRelative(-0.535f, 0.664f, -1.468f, 0.664f)
                quadToRelative(-0.579f, 0.0f, -1.05f, -0.278f)
                quadToRelative(-0.46f, -0.29f, -1.264f, -0.965f)
                quadToRelative(-1.19f, -0.996f, -2.09f, -1.478f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.79f, 6.0f)
            }
        }
        .build()
        return _fluxer!!
    }

private var _fluxer: ImageVector? = null
