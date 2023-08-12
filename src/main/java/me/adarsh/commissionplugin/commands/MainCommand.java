package me.adarsh.commissionplugin.commands;

import me.adarsh.commissionplugin.CommissionPlugin;
import me.adarsh.commissionplugin.config.CustomConfig;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;


public class MainCommand implements CommandExecutor {

    private final LuckPerms luckPerms;
    private final CommissionPlugin plugin;

    public MainCommand(CommissionPlugin plugin, LuckPerms luckPerms) {
        this.plugin = plugin;
        this.luckPerms = luckPerms;
    }
    FileConfiguration config = CustomConfig.get();

    String world1 = config.getString("world1.world");
    String world2 = config.getString("world2.world");
    String world3 = config.getString("world3.world");
    String world4 = config.getString("world4.world");
    String world5 = config.getString("world5.world");
    String world6 = config.getString("world6.world");
    String world7 = config.getString("world7.world");
    String world8 = config.getString("world8.world");
    String world9 = config.getString("world9.world");
    String world10 = config.getString("world10.world");
    String world11 = config.getString("world11.world");
    String world12 = config.getString("world12.world");
    String world13 = config.getString("world13.world");
    String world14 = config.getString("world14.world");
    String world15 = config.getString("world15.world");
    String world16 = config.getString("world16.world");
    String world17 = config.getString("world17.world");
    String world18 = config.getString("world18.world");
    String world19 = config.getString("world19.world");
    String world20 = config.getString("world20.world");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof ConsoleCommandSender) return true;
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        Player player = (Player) sender;
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        if (player.isOp()) return true;
        if (player.hasPermission("playertp.world1")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world1);
            return true;
        }
        if (player.hasPermission("playertp.world2")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world2);
            return true;
        }
        if (player.hasPermission("playertp.world3")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world3);
            return true;
        }
        if (player.hasPermission("playertp.world4")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world4);
            return true;
        }
        if (player.hasPermission("playertp.world5")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world5);
            return true;
        }
        if (player.hasPermission("playertp.world6")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world6);
            return true;
        }
        if (player.hasPermission("playertp.world7")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world7);
            return true;
        }
        if (player.hasPermission("playertp.world8")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world8);
            return true;
        }
        if (player.hasPermission("playertp.world9")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world9);
            return true;
        }
        if (player.hasPermission("playertp.world10")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world10);
            return true;
        }
        if (player.hasPermission("playertp.world11")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world11);
            return true;
        }
        if (player.hasPermission("playertp.world12")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world12);
            return true;
        }
        if (player.hasPermission("playertp.world13")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world13);
            return true;
        }
        if (player.hasPermission("playertp.world14")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world14);
            return true;
        }
        if (player.hasPermission("playertp.world15")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world15);
            return true;
        }
        if (player.hasPermission("playertp.world16")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world16);
            return true;
        }
        if (player.hasPermission("playertp.world17")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world17);
            return true;
        }
        if (player.hasPermission("playertp.world18")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world18);
            return true;
        }
        if (player.hasPermission("playertp.world19")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world19);
            return true;
        }
        if (player.hasPermission("playertp.world20")){
            Bukkit.dispatchCommand(console, "mv tp " + player.getName() + " " + world20);
            return true;
        }
       return true;
    }

}
