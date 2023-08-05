package me.adarsh.commissionplugin;

import me.adarsh.commissionplugin.commands.MainCommand;
import me.adarsh.commissionplugin.config.CustomConfig;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CommissionPlugin extends JavaPlugin implements Listener {
    PluginManager pm = getServer().getPluginManager();
    private LuckPerms luckPerms;

    @Override
    public void onEnable() {
        this.luckPerms = getServer().getServicesManager().load(LuckPerms.class);
        saveDefaultConfig();
        saveConfig();
        if (getConfig().getBoolean("use-world-config")){
            loadConfig();
        }
        pm.registerEvents(this, this);
        Objects.requireNonNull(getCommand("join")).setExecutor(new MainCommand(this, this.luckPerms));
    }

    public void loadConfig(){
        CustomConfig.setup();
        //1
        CustomConfig.get().addDefault("world1.world", "world");
        CustomConfig.get().addDefault("world1.x", 0);
        CustomConfig.get().addDefault("world1.y", 120);
        CustomConfig.get().addDefault("world1.z", 0);
        CustomConfig.get().addDefault("world1.yaw", 0);
        CustomConfig.get().addDefault("world1.pitch", 0);
        //2
        CustomConfig.get().addDefault("world2.world", "world");
        CustomConfig.get().addDefault("world2.x", 0);
        CustomConfig.get().addDefault("world2.y", 120);
        CustomConfig.get().addDefault("world2.z", 0);
        CustomConfig.get().addDefault("world2.yaw", 0);
        CustomConfig.get().addDefault("world2.pitch", 0);
        //3
        CustomConfig.get().addDefault("world3.world", "world");
        CustomConfig.get().addDefault("world3.x", 0);
        CustomConfig.get().addDefault("world3.y", 120);
        CustomConfig.get().addDefault("world3.z", 0);
        CustomConfig.get().addDefault("world3.yaw", 0);
        CustomConfig.get().addDefault("world3.pitch", 0);
        //4
        CustomConfig.get().addDefault("world4.world", "world");
        CustomConfig.get().addDefault("world4.x", 0);
        CustomConfig.get().addDefault("world4.y", 120);
        CustomConfig.get().addDefault("world4.z", 0);
        CustomConfig.get().addDefault("world4.yaw", 0);
        CustomConfig.get().addDefault("world4.pitch", 0);
        //5
        CustomConfig.get().addDefault("world5.world", "world");
        CustomConfig.get().addDefault("world5.x", 0);
        CustomConfig.get().addDefault("world5.y", 120);
        CustomConfig.get().addDefault("world5.z", 0);
        CustomConfig.get().addDefault("world5.yaw", 0);
        CustomConfig.get().addDefault("world5.pitch", 0);
        //6
        CustomConfig.get().addDefault("world6.world", "world");
        CustomConfig.get().addDefault("world6.x", 0);
        CustomConfig.get().addDefault("world6.y", 120);
        CustomConfig.get().addDefault("world6.z", 0);
        CustomConfig.get().addDefault("world6.yaw", 0);
        CustomConfig.get().addDefault("world6.pitch", 0);
        //7
        CustomConfig.get().addDefault("world7.world", "world");
        CustomConfig.get().addDefault("world7.x", 0);
        CustomConfig.get().addDefault("world7.y", 120);
        CustomConfig.get().addDefault("world7.z", 0);
        CustomConfig.get().addDefault("world7.yaw", 0);
        CustomConfig.get().addDefault("world7.pitch", 0);
        //8
        CustomConfig.get().addDefault("world8.world", "world");
        CustomConfig.get().addDefault("world8.x", 0);
        CustomConfig.get().addDefault("world8.y", 120);
        CustomConfig.get().addDefault("world8.z", 0);
        CustomConfig.get().addDefault("world8.yaw", 0);
        CustomConfig.get().addDefault("world8.pitch", 0);
        //9
        CustomConfig.get().addDefault("world9.world", "world");
        CustomConfig.get().addDefault("world9.x", 0);
        CustomConfig.get().addDefault("world9.y", 120);
        CustomConfig.get().addDefault("world9.z", 0);
        CustomConfig.get().addDefault("world9.yaw", 0);
        CustomConfig.get().addDefault("world9.pitch", 0);
        //10
        CustomConfig.get().addDefault("world10.world", "world");
        CustomConfig.get().addDefault("world10.x", 0);
        CustomConfig.get().addDefault("world10.y", 120);
        CustomConfig.get().addDefault("world10.z", 0);
        CustomConfig.get().addDefault("world10.yaw", 0);
        CustomConfig.get().addDefault("world10.pitch", 0);
        //11
        CustomConfig.get().addDefault("world11.world", "world");
        CustomConfig.get().addDefault("world11.x", 0);
        CustomConfig.get().addDefault("world11.y", 120);
        CustomConfig.get().addDefault("world11.z", 0);
        CustomConfig.get().addDefault("world11.yaw", 0);
        CustomConfig.get().addDefault("world11.pitch", 0);
        //12
        CustomConfig.get().addDefault("world12.world", "world");
        CustomConfig.get().addDefault("world12.x", 0);
        CustomConfig.get().addDefault("world12.y", 120);
        CustomConfig.get().addDefault("world12.z", 0);
        CustomConfig.get().addDefault("world12.yaw", 0);
        CustomConfig.get().addDefault("world12.pitch", 0);
        //13
        CustomConfig.get().addDefault("world13.world", "world");
        CustomConfig.get().addDefault("world13.x", 0);
        CustomConfig.get().addDefault("world13.y", 120);
        CustomConfig.get().addDefault("world13.z", 0);
        CustomConfig.get().addDefault("world13.yaw", 0);
        CustomConfig.get().addDefault("world13.pitch", 0);
        //14
        CustomConfig.get().addDefault("world14.world", "world");
        CustomConfig.get().addDefault("world14.x", 0);
        CustomConfig.get().addDefault("world14.y", 120);
        CustomConfig.get().addDefault("world14.z", 0);
        CustomConfig.get().addDefault("world14.yaw", 0);
        CustomConfig.get().addDefault("world14.pitch", 0);
        //15
        CustomConfig.get().addDefault("world15.world", "world");
        CustomConfig.get().addDefault("world15.x", 0);
        CustomConfig.get().addDefault("world15.y", 120);
        CustomConfig.get().addDefault("world15.z", 0);
        CustomConfig.get().addDefault("world15.yaw", 0);
        CustomConfig.get().addDefault("world15.pitch", 0);
        //16
        CustomConfig.get().addDefault("world16.world", "world");
        CustomConfig.get().addDefault("world16.x", 0);
        CustomConfig.get().addDefault("world16.y", 120);
        CustomConfig.get().addDefault("world16.z", 0);
        CustomConfig.get().addDefault("world16.yaw", 0);
        CustomConfig.get().addDefault("world16.pitch", 0);
        //17
        CustomConfig.get().addDefault("world17.world", "world");
        CustomConfig.get().addDefault("world17.x", 0);
        CustomConfig.get().addDefault("world17.y", 120);
        CustomConfig.get().addDefault("world17.z", 0);
        CustomConfig.get().addDefault("world17.yaw", 0);
        CustomConfig.get().addDefault("world17.pitch", 0);
        //18
        CustomConfig.get().addDefault("world18.world", "world");
        CustomConfig.get().addDefault("world18.x", 0);
        CustomConfig.get().addDefault("world18.y", 120);
        CustomConfig.get().addDefault("world18.z", 0);
        CustomConfig.get().addDefault("world18.yaw", 0);
        CustomConfig.get().addDefault("world18.pitch", 0);
        //19
        CustomConfig.get().addDefault("world19.world", "world");
        CustomConfig.get().addDefault("world19.x", 0);
        CustomConfig.get().addDefault("world19.y", 120);
        CustomConfig.get().addDefault("world19.z", 0);
        CustomConfig.get().addDefault("world19.yaw", 0);
        CustomConfig.get().addDefault("world19.pitch", 0);
        //20
        CustomConfig.get().addDefault("world20.world", "world");
        CustomConfig.get().addDefault("world20.x", 0);
        CustomConfig.get().addDefault("world20.y", 120);
        CustomConfig.get().addDefault("world20.z", 0);
        CustomConfig.get().addDefault("world20.yaw", 0);
        CustomConfig.get().addDefault("world20.pitch", 0);
        CustomConfig.get().options().copyDefaults(true);
        CustomConfig.save();
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        addPermission(user, "playertp.world1");
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player player = e.getEntity().getPlayer();
        if (player != null) {
            User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
            if (player.isOp()) return;
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world1.world"))) {
                removePermission(user, "playertp.world1");
                addPermission(user, "playertp.world2");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world2.world"))) {
                removePermission(user, "playertp.world2");
                addPermission(user, "playertp.world3");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world3.world"))) {
                removePermission(user, "playertp.world3");
                addPermission(user, "playertp.world4");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world4.world"))) {
                removePermission(user, "playertp.world4");
                addPermission(user, "playertp.world5");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world5.world"))) {
                removePermission(user, "playertp.world5");
                addPermission(user, "playertp.world6");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world6.world"))) {
                removePermission(user, "playertp.world6");
                addPermission(user, "playertp.world7");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world7.world"))) {
                removePermission(user, "playertp.world7");
                addPermission(user, "playertp.world8");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world8.world"))) {
                removePermission(user, "playertp.world8");
                addPermission(user, "playertp.world9");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world9.world"))) {
                removePermission(user, "playertp.world9");
                addPermission(user, "playertp.world10");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world10.world"))) {
                removePermission(user, "playertp.world10");
                addPermission(user, "playertp.world11");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world11.world"))) {
                removePermission(user, "playertp.world11");
                addPermission(user, "playertp.world12");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world12.world"))) {
                removePermission(user, "playertp.world12");
                addPermission(user, "playertp.world13");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world13.world"))) {
                removePermission(user, "playertp.world13");
                addPermission(user, "playertp.world14");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world14.world"))) {
                removePermission(user, "playertp.world14");
                addPermission(user, "playertp.world15");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world15.world"))) {
                removePermission(user, "playertp.world15");
                addPermission(user, "playertp.world16");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world16.world"))) {
                removePermission(user, "playertp.world16");
                addPermission(user, "playertp.world17");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world18.world"))) {
                removePermission(user, "playertp.world18");
                addPermission(user, "playertp.world19");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world19.world"))) {
                removePermission(user, "playertp.world19");
                addPermission(user, "playertp.world20");
            }
            if (player.getWorld().getName().equals(CustomConfig.get().getString("world20.world"))) {
                removePermission(user, "playertp.world20");
                addPermission(user, "playertp.theend");
            }
        }
    }

    public void addPermission(User user, String permission) {
        // Add the permission
        user.data().add(Node.builder(permission).build());

        // Now we need to save changes.
        luckPerms.getUserManager().saveUser(user);
    }
    public void removePermission(User user, String permission) {
        // Add the permission
        user.data().remove(Node.builder(permission).build());

        // Now we need to save changes.
        luckPerms.getUserManager().saveUser(user);
    }
}
