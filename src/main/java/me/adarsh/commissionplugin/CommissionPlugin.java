package me.adarsh.commissionplugin;

import me.adarsh.commissionplugin.commands.MainCommand;
import me.adarsh.commissionplugin.config.CustomConfig;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.WorldCreator;
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
        //1
        CustomConfig.get().addDefault("world1.world", "world1");

        //2
        CustomConfig.get().addDefault("world2.world", "world2");

        //3
        CustomConfig.get().addDefault("world3.world", "world3");

        //4
        CustomConfig.get().addDefault("world4.world", "world4");

        //5
        CustomConfig.get().addDefault("world5.world", "world5");

        //6
        CustomConfig.get().addDefault("world6.world", "world6");

        //7
        CustomConfig.get().addDefault("world7.world", "world7");

        //8
        CustomConfig.get().addDefault("world8.world", "world8");

        //9
        CustomConfig.get().addDefault("world9.world", "world9");

        //10
        CustomConfig.get().addDefault("world10.world", "world10");

        //11
        CustomConfig.get().addDefault("world11.world", "world11");

        //12
        CustomConfig.get().addDefault("world12.world", "world12");

        //13
        CustomConfig.get().addDefault("world13.world", "world13");

        //14
        CustomConfig.get().addDefault("world14.world", "world14");

        //15
        CustomConfig.get().addDefault("world15.world", "world15");

        //16
        CustomConfig.get().addDefault("world16.world", "world16");

        //17
        CustomConfig.get().addDefault("world17.world", "world17");

        //18
        CustomConfig.get().addDefault("world18.world", "world18");

        //19
        CustomConfig.get().addDefault("world19.world", "world19");

        //20
        CustomConfig.get().addDefault("world20.world", "world20");

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
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player player = e.getEntity().getPlayer();
        if (player != null) {
            User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
            if (player.isOp()) return;
            if (player.hasPermission("playertp.world1") && player.getWorld().getName().equals(CustomConfig.get().getString("world1.world"))) {
                removePermission(user, "playertp.world1");
                addPermission(user, "playertp.world2");
            }
            if (player.hasPermission("playertp.world2") && player.getWorld().getName().equals(CustomConfig.get().getString("world2.world"))) {
                removePermission(user, "playertp.world2");
                addPermission(user, "playertp.world3");
            }
            if (player.hasPermission("playertp.world3") && player.getWorld().getName().equals(CustomConfig.get().getString("world3.world"))) {
                removePermission(user, "playertp.world3");
                addPermission(user, "playertp.world4");
            }
            if (player.hasPermission("playertp.world4") && player.getWorld().getName().equals(CustomConfig.get().getString("world4.world"))) {
                removePermission(user, "playertp.world4");
                addPermission(user, "playertp.world5");
            }
            if (player.hasPermission("playertp.world5") && player.getWorld().getName().equals(CustomConfig.get().getString("world5.world"))) {
                removePermission(user, "playertp.world5");
                addPermission(user, "playertp.world6");
            }
            if (player.hasPermission("playertp.world6")&& player.getWorld().getName().equals(CustomConfig.get().getString("world6.world"))) {
                removePermission(user, "playertp.world6");
                addPermission(user, "playertp.world7");
            }
            if (player.hasPermission("playertp.world7")&& player.getWorld().getName().equals(CustomConfig.get().getString("world7.world"))) {
                removePermission(user, "playertp.world7");
                addPermission(user, "playertp.world8");
            }
            if (player.hasPermission("playertp.world8")&& player.getWorld().getName().equals(CustomConfig.get().getString("world8.world"))) {
                removePermission(user, "playertp.world8");
                addPermission(user, "playertp.world9");
            }
            if (player.hasPermission("playertp.world9")&& player.getWorld().getName().equals(CustomConfig.get().getString("world9.world"))) {
                removePermission(user, "playertp.world9");
                addPermission(user, "playertp.world10");
            }
            if (player.hasPermission("playertp.world10")&& player.getWorld().getName().equals(CustomConfig.get().getString("world10.world"))) {
                removePermission(user, "playertp.world10");
                addPermission(user, "playertp.world11");
            }
            if (player.hasPermission("playertp.world11")&& player.getWorld().getName().equals(CustomConfig.get().getString("world11.world"))) {
                removePermission(user, "playertp.world11");
                addPermission(user, "playertp.world12");
            }
            if (player.hasPermission("playertp.world12")&& player.getWorld().getName().equals(CustomConfig.get().getString("world12.world"))) {
                removePermission(user, "playertp.world12");
                addPermission(user, "playertp.world13");
            }
            if (player.hasPermission("playertp.world13")&& player.getWorld().getName().equals(CustomConfig.get().getString("world13.world"))) {
                removePermission(user, "playertp.world13");
                addPermission(user, "playertp.world14");
            }
            if (player.hasPermission("playertp.world14")&& player.getWorld().getName().equals(CustomConfig.get().getString("world14.world"))) {
                removePermission(user, "playertp.world14");
                addPermission(user, "playertp.world15");
            }
            if (player.hasPermission("playertp.world15")&& player.getWorld().getName().equals(CustomConfig.get().getString("world15.world"))) {
                removePermission(user, "playertp.world15");
                addPermission(user, "playertp.world16");
            }
            if (player.hasPermission("playertp.world16")&& player.getWorld().getName().equals(CustomConfig.get().getString("world16.world"))) {
                removePermission(user, "playertp.world16");
                addPermission(user, "playertp.world17");
            }
            if (player.hasPermission("playertp.world17")&& player.getWorld().getName().equals(CustomConfig.get().getString("world17.world"))) {
                removePermission(user, "playertp.world17");
                addPermission(user, "playertp.world18");
            }
            if (player.hasPermission("playertp.world18")&& player.getWorld().getName().equals(CustomConfig.get().getString("world18.world"))) {
                removePermission(user, "playertp.world18");
                addPermission(user, "playertp.world19");
            }
            if (player.hasPermission("playertp.world19")&& player.getWorld().getName().equals(CustomConfig.get().getString("world19.world"))) {
                removePermission(user, "playertp.world19");
                addPermission(user, "playertp.world20");
            }
            if (player.hasPermission("playertp.world20")&& player.getWorld().getName().equals(CustomConfig.get().getString("world20.world"))) {
                removePermission(user, "playertp.world20");
                addPermission(user, "playertp.theend");
            }
            if (player.hasPermission("playertp.theend")){
                player.ban("You died 20 times.", (Date) null, "You died.", true);
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
