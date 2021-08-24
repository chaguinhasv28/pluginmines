package com.chaguinhasv28.aniversario;

import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class QuebraBlocos implements Listener {

    @EventHandler
    public static void onBlockPlace(BlockPlaceEvent event) {
        event.setCancelled(true);
        Block blockAgainst = event.getBlockAgainst();
        if (blockAgainst.breakNaturally()) {
                event.getBlockPlaced().
            new BlockBreakEvent(blockAgainst, event.getPlayer());
        }
    }

    @EventHandler
    public static void onBlockBreak(BlockBreakEvent event) {
        event.setCancelled(true);
        Player player = event.getPlayer();
        Inventory inventory = player.getInventory();
        ItemStack item = inventory.getItem(45);
        if (item != null && item.getType().isBlock()) {
            event.getBlock().setType(item.getType());
        }
    }
}
