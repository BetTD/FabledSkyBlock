package com.songoda.skyblock.api.event.player;

import com.songoda.skyblock.api.island.Island;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerIslandExitEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public PlayerIslandExitEvent(Player player, Island island) {
        super(player, island);
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
}
