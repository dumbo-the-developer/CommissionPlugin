package me.adarsh.commissionplugin;

import me.adarsh.commissionplugin.commands.MainCommand;
import me.adarsh.commissionplugin.config.CustomConfig;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Date;
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
        //Hub
        CustomConfig.get().addDefault("hub.world", "world");
        CustomConfig.get().addDefault("hub.x", "0");
        CustomConfig.get().addDefault("hub.y", "120");
        CustomConfig.get().addDefault("hub.z", "0");
        CustomConfig.get().addDefault("hub.yaw", "0");
        CustomConfig.get().addDefault("hub.pitch", "0");

        //1
        CustomConfig.get().addDefault("world1.world", "world1");
        CustomConfig.get().addDefault("world1.nether", "world1_nether");
        CustomConfig.get().addDefault("world1.end", "world1_end");

        //2
        CustomConfig.get().addDefault("world2.world", "world2");
        CustomConfig.get().addDefault("world2.nether", "world2_nether");
        CustomConfig.get().addDefault("world2.end", "world2_end");

        //3
        CustomConfig.get().addDefault("world3.world", "world3");
        CustomConfig.get().addDefault("world3.nether", "world3_nether");
        CustomConfig.get().addDefault("world3.end", "world3_end");

        //4
        CustomConfig.get().addDefault("world4.world", "world4");
        CustomConfig.get().addDefault("world4.nether", "world4_nether");
        CustomConfig.get().addDefault("world4.end", "world4_end");

        //5
        CustomConfig.get().addDefault("world5.world", "world5");
        CustomConfig.get().addDefault("world5.nether", "world5_nether");
        CustomConfig.get().addDefault("world5.end", "world5_end");

        //6
        CustomConfig.get().addDefault("world6.world", "world6");
        CustomConfig.get().addDefault("world6.nether", "world6_nether");
        CustomConfig.get().addDefault("world6.end", "world6_end");

        //7
        CustomConfig.get().addDefault("world7.world", "world7");
        CustomConfig.get().addDefault("world7.nether", "world7_nether");
        CustomConfig.get().addDefault("world7.end", "world7_end");

        //8
        CustomConfig.get().addDefault("world8.world", "world8");
        CustomConfig.get().addDefault("world8.nether", "world8_nether");
        CustomConfig.get().addDefault("world8.end", "world8_end");

        //9
        CustomConfig.get().addDefault("world9.world", "world9");
        CustomConfig.get().addDefault("world9.nether", "world9_nether");
        CustomConfig.get().addDefault("world9.end", "world9_end");

        //10
        CustomConfig.get().addDefault("world10.world", "world10");
        CustomConfig.get().addDefault("world10.nether", "world10_nether");
        CustomConfig.get().addDefault("world10.end", "world10_end");

        //11
        CustomConfig.get().addDefault("world11.world", "world11");
        CustomConfig.get().addDefault("world11.nether", "world11_nether");
        CustomConfig.get().addDefault("world11.end", "world11_end");

        //12
        CustomConfig.get().addDefault("world12.world", "world12");
        CustomConfig.get().addDefault("world12.nether", "world12_nether");
        CustomConfig.get().addDefault("world12.end", "world12_end");

        //13
        CustomConfig.get().addDefault("world13.world", "world13");
        CustomConfig.get().addDefault("world13.nether", "world13_nether");
        CustomConfig.get().addDefault("world13.end", "world13_end");

        //14
        CustomConfig.get().addDefault("world14.world", "world14");
        CustomConfig.get().addDefault("world14.nether", "world14_nether");
        CustomConfig.get().addDefault("world14.end", "world14_end");

        //15
        CustomConfig.get().addDefault("world15.world", "world15");
        CustomConfig.get().addDefault("world15.nether", "world15_nether");
        CustomConfig.get().addDefault("world15.end", "world15_end");

        //16
        CustomConfig.get().addDefault("world16.world", "world16");
        CustomConfig.get().addDefault("world16.nether", "world16_nether");
        CustomConfig.get().addDefault("world16.end", "world16_end");

        //17
        CustomConfig.get().addDefault("world17.world", "world17");
        CustomConfig.get().addDefault("world17.nether", "world17_nether");
        CustomConfig.get().addDefault("world17.end", "world17_end");

        //18
        CustomConfig.get().addDefault("world18.world", "world18");
        CustomConfig.get().addDefault("world18.nether", "world18_nether");
        CustomConfig.get().addDefault("world18.end", "world18_end");

        //19
        CustomConfig.get().addDefault("world19.world", "world19");
        CustomConfig.get().addDefault("world19.nether", "world19_nether");
        CustomConfig.get().addDefault("world19.end", "world19_end");

        //20
        CustomConfig.get().addDefault("world20.world", "world20");
        CustomConfig.get().addDefault("world20.nether", "world20_nether");
        CustomConfig.get().addDefault("world20.end", "world20_end");

        CustomConfig.get().options().copyDefaults(true);
        CustomConfig.save();
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        if (!(player.hasPermission("playertp.world1")
                || player.hasPermission("playertp.world1")
                || player.hasPermission("playertp.world2")
                || player.hasPermission("playertp.world3")
                || player.hasPermission("playertp.world4")
                || player.hasPermission("playertp.world5")
                || player.hasPermission("playertp.world6")
                || player.hasPermission("playertp.world7")
                || player.hasPermission("playertp.world8")
                || player.hasPermission("playertp.world9")
                || player.hasPermission("playertp.world10")
                || player.hasPermission("playertp.world11")
                || player.hasPermission("playertp.world12")
                || player.hasPermission("playertp.world13")
                || player.hasPermission("playertp.world14")
                || player.hasPermission("playertp.world15")
                || player.hasPermission("playertp.world16")
                || player.hasPermission("playertp.world17")
                || player.hasPermission("playertp.world18")
                || player.hasPermission("playertp.world19")
                || player.hasPermission("playertp.world20"))){
            addPermission(user, "playertp.world1");
            player.sendMessage(ChatColor.GREEN+"Added default permission to " + player.getName());
        }
        if (getConfig().getBoolean("use-spawn")) {
            Bukkit.dispatchCommand(player, "spawn");
        }
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player player = e.getEntity().getPlayer();
        if (player != null) {
            User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
            if (player.isOp()) return;
            if (player.hasPermission("playertp.world1") && (player.getWorld().getName().equals(CustomConfig.get().getString("world1.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world1.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world1.end")))) {
                removePermission(user, "playertp.world1");
                addPermission(user, "playertp.world2");
            }
            if (player.hasPermission("playertp.world2") && (player.getWorld().getName().equals(CustomConfig.get().getString("world2.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world2.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world2.end")))) {
                removePermission(user, "playertp.world2");
                addPermission(user, "playertp.world3");
            }
            if (player.hasPermission("playertp.world3") && (player.getWorld().getName().equals(CustomConfig.get().getString("world3.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world3.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world3.end")))) {
                removePermission(user, "playertp.world3");
                addPermission(user, "playertp.world4");
            }
            if (player.hasPermission("playertp.world4") && (player.getWorld().getName().equals(CustomConfig.get().getString("world4.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world4.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world4.end")))) {
                removePermission(user, "playertp.world4");
                addPermission(user, "playertp.world5");
            }
            if (player.hasPermission("playertp.world5") && (player.getWorld().getName().equals(CustomConfig.get().getString("world5.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world5.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world5.end")))) {
                removePermission(user, "playertp.world5");
                addPermission(user, "playertp.world6");
            }
            if (player.hasPermission("playertp.world6") && (player.getWorld().getName().equals(CustomConfig.get().getString("world6.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world6.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world6.end")))) {
                removePermission(user, "playertp.world6");
                addPermission(user, "playertp.world7");
            }
            if (player.hasPermission("playertp.world7") && (player.getWorld().getName().equals(CustomConfig.get().getString("world7.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world7.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world7.end")))) {
                removePermission(user, "playertp.world7");
                addPermission(user, "playertp.world8");
            }
            if (player.hasPermission("playertp.world8") && (player.getWorld().getName().equals(CustomConfig.get().getString("world8.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world8.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world8.end")))) {
                removePermission(user, "playertp.world8");
                addPermission(user, "playertp.world9");
            }
            if (player.hasPermission("playertp.world9") && (player.getWorld().getName().equals(CustomConfig.get().getString("world9.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world9.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world9.end")))) {
                removePermission(user, "playertp.world9");
                addPermission(user, "playertp.world10");
            }
            if (player.hasPermission("playertp.world10") && (player.getWorld().getName().equals(CustomConfig.get().getString("world10.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world10.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world10.end")))) {
                removePermission(user, "playertp.world10");
                addPermission(user, "playertp.world11");
            }
            if (player.hasPermission("playertp.world11") && (player.getWorld().getName().equals(CustomConfig.get().getString("world11.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world11.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world11.end")))) {
                removePermission(user, "playertp.world11");
                addPermission(user, "playertp.world12");
            }
            if (player.hasPermission("playertp.world12")&& (player.getWorld().getName().equals(CustomConfig.get().getString("world12.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world12.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world12.end")))) {
                removePermission(user, "playertp.world12");
                addPermission(user, "playertp.world13");
            }
            if (player.hasPermission("playertp.world13") && (player.getWorld().getName().equals(CustomConfig.get().getString("world13.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world13.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world13.end")))) {
                removePermission(user, "playertp.world13");
                addPermission(user, "playertp.world14");
            }
            if (player.hasPermission("playertp.world14") && (player.getWorld().getName().equals(CustomConfig.get().getString("world14.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world14.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world14.end")))) {
                removePermission(user, "playertp.world14");
                addPermission(user, "playertp.world15");
            }
            if (player.hasPermission("playertp.world15") && (player.getWorld().getName().equals(CustomConfig.get().getString("world15.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world15.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world15.end")))) {
                removePermission(user, "playertp.world15");
                addPermission(user, "playertp.world16");
            }
            if (player.hasPermission("playertp.world16") && (player.getWorld().getName().equals(CustomConfig.get().getString("world16.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world16.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world16.end")))) {
                removePermission(user, "playertp.world16");
                addPermission(user, "playertp.world17");
            }
            if (player.hasPermission("playertp.world17") && (player.getWorld().getName().equals(CustomConfig.get().getString("world17.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world17.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world17.end")))) {
                removePermission(user, "playertp.world17");
                addPermission(user, "playertp.world18");
            }
            if (player.hasPermission("playertp.world18") && (player.getWorld().getName().equals(CustomConfig.get().getString("world18.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world18.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world18.end")))) {
                removePermission(user, "playertp.world18");
                addPermission(user, "playertp.world19");
            }
            if (player.hasPermission("playertp.world19") && (player.getWorld().getName().equals(CustomConfig.get().getString("world19.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world19.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world19.end")))) {
                removePermission(user, "playertp.world19");
                addPermission(user, "playertp.world20");
            }
            if (player.hasPermission("playertp.world20") && (player.getWorld().getName().equals(CustomConfig.get().getString("world20.world")) || player.getWorld().getName().equals(CustomConfig.get().getString("world20.nether")) || player.getWorld().getName().equals(CustomConfig.get().getString("world20.end")))) {
                removePermission(user, "playertp.world20");
                addPermission(user, "playertp.theend");
            }
            if (player.hasPermission("playertp.theend")){
                player.ban("You died 20 times.", (Date) null, "You died.", true);
            }
            Bukkit.dispatchCommand(player, "spawn");
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
