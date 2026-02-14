package compose.icons.sample.data

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.AllIcons
import compose.icons.CssGgIcons
import compose.icons.EvaIcons
import compose.icons.FeatherIcons
import compose.icons.FontAwesomeIcons
import compose.icons.LineAwesomeIcons
import compose.icons.LineaIcons
import compose.icons.Octicons
import compose.icons.SimpleIcons
import compose.icons.TablerIcons
import compose.icons.WeatherIcons

// TODO: generate this file

val iconPacks = listOf(
    IconPackModel(
        packName = "css.gg",
        allIcons = CssGgIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Weather Icons by Erik Flowers",
        allIcons = WeatherIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Eva Icons",
        allIcons = EvaIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Feather",
        allIcons = FeatherIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Font Awesome 2",
        allIcons = FontAwesomeIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Line Awesome",
        allIcons = LineAwesomeIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Linea",
        allIcons = LineaIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Octicons",
        allIcons = Octicons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Simple Icons",
        allIcons = SimpleIcons.AllIcons.toMap(),
    ),
    IconPackModel(
        packName = "Tabler Icons",
        allIcons = TablerIcons.AllIcons.toMap(),
    ),
)

private fun List<ImageVector>.toMap() = this.associateBy { it.name.lowercase() }