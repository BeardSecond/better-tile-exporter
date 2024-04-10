package com.bettertileexporter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(BetterTileConfig.BETTER_TILE_CONFIG_GROUP)
public interface BetterTileConfig extends Config
{
	String BETTER_TILE_CONFIG_GROUP = "better-tile-exporter";
	@ConfigItem(
			keyName = "show_export_visible_menu",
			name = "Export visible tiles menu",
			description = "Add menu option to world map menu to export visible tile markers",
			position = 0
	)
	default boolean show_export_visible_menu()
	{
		return true;
	}

	@ConfigItem(
			keyName = "show_export_close_menu",
			name = "Export close tiles menu",
			description = "Add menu option to world map menu to export close tile markers",
			position = 1
	)
	default boolean show_export_close_menu()
	{
		return true;
	}

	@ConfigItem(
			keyName = "close_distance_threshold",
			name = "Close distance threshold",
			description = "How close should a marker be to true tile to be exported",
			position = 2
	)
	default int close_distance_threshold()
	{
		return 20;
	}


}
