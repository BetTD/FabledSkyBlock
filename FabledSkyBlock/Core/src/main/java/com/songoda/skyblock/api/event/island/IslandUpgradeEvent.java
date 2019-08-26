package com.songoda.skyblock.api.event.island;

import com.songoda.skyblock.api.island.Island;
import com.songoda.skyblock.api.island.IslandUpgrade;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class IslandUpgradeEvent extends IslandEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private IslandUpgrade upgrade;

    public IslandUpgradeEvent(Island island, Player player, IslandUpgrade upgrade) {
        super(island);
        this.player = player;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return player;
    }

    public IslandUpgrade getUpgrade() {
        return upgrade;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
}
