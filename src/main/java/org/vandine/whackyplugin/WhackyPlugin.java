package org.vandine.whackyplugin;

        import net.kyori.adventure.text.Component;
        import org.bukkit.Bukkit;
        import org.bukkit.Material;
        import org.bukkit.block.Block;
        import org.bukkit.event.EventHandler;
        import org.bukkit.event.Listener;
        import org.bukkit.event.player.PlayerJoinEvent;
        import org.bukkit.event.block.BlockPlaceEvent;
        import org.bukkit.plugin.java.JavaPlugin;

public class WhackyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + ", welcome to Ken's development server!"));
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block b = event.getBlock();
        b.setType(Material.DIAMOND_BLOCK);
    }
}
