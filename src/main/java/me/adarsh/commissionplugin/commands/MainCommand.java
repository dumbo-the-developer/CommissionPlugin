package me.adarsh.commissionplugin.commands;

import me.adarsh.commissionplugin.CommissionPlugin;
import me.adarsh.commissionplugin.config.CustomConfig;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.Objects;

public class MainCommand implements CommandExecutor {

    private final LuckPerms luckPerms;
    private final CommissionPlugin plugin;

    public MainCommand(CommissionPlugin plugin, LuckPerms luckPerms) {
        this.plugin = plugin;
        this.luckPerms = luckPerms;
    }
    FileConfiguration config = CustomConfig.get();

    World world = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world1.world")));
    World world2 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world2.world")));
    World world3 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world3.world")));
    World world4 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world4.world")));
    World world5 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world5.world")));
    World world6 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world6.world")));
    World world7 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world7.world")));
    World world8 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world8.world")));
    World world9 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world9.world")));
    World world10 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world10.world")));
    World world11 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world11.world")));
    World world12 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world12.world")));
    World world13 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world13.world")));
    World world14 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world14.world")));
    World world15 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world15.world")));
    World world16 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world16.world")));
    World world17 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world17.world")));
    World world18 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world19.world")));
    World world19 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world19.world")));
    World world20 = Bukkit.getWorld(Objects.requireNonNull(CustomConfig.get().getString("world20.world")));

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof ConsoleCommandSender) return true;
        Player player = (Player) sender;
        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        if (player.isOp()) return true;
        if (player.hasPermission("playertp.world1")){
            int x = config.getInt("world1.x");
            int y = config.getInt("world1.y");
            int z = config.getInt("world1.z");
            int yaw = config.getInt("world1.yaw");
            int pitch = config.getInt("world1.pitch");
            player.teleport(new Location(world, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world2")){
            int x = config.getInt("world2.x");
            int y = config.getInt("world2.y");
            int z = config.getInt("world2.z");
            int yaw = config.getInt("world2.yaw");
            int pitch = config.getInt("world2.pitch");
            player.teleport(new Location(world2, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world3")){
            int x = config.getInt("world3.x");
            int y = config.getInt("world3.y");
            int z = config.getInt("world3.z");
            int yaw = config.getInt("world3.yaw");
            int pitch = config.getInt("world3.pitch");
            player.teleport(new Location(world3, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world4")){
            int x = config.getInt("world4.x");
            int y = config.getInt("world4.y");
            int z = config.getInt("world4.z");
            int yaw = config.getInt("world4.yaw");
            int pitch = config.getInt("world4.pitch");
            player.teleport(new Location(world4, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world5")){
            int x = config.getInt("world5.x");
            int y = config.getInt("world5.y");
            int z = config.getInt("world5.z");
            int yaw = config.getInt("world5.yaw");
            int pitch = config.getInt("world5.pitch");
            player.teleport(new Location(world5, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world6")){
            int x = config.getInt("world6.x");
            int y = config.getInt("world6.y");
            int z = config.getInt("world6.z");
            int yaw = config.getInt("world6.yaw");
            int pitch = config.getInt("world6.pitch");
            player.teleport(new Location(world6, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world7")){
            int x = config.getInt("world7.x");
            int y = config.getInt("world7.y");
            int z = config.getInt("world7.z");
            int yaw = config.getInt("world7.yaw");
            int pitch = config.getInt("world7.pitch");
            player.teleport(new Location(world7, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world8")){
            int x = config.getInt("world8.x");
            int y = config.getInt("world8.y");
            int z = config.getInt("world8.z");
            int yaw = config.getInt("world8.yaw");
            int pitch = config.getInt("world8.pitch");
            player.teleport(new Location(world8, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world9")){
            int x = config.getInt("world9.x");
            int y = config.getInt("world9.y");
            int z = config.getInt("world9.z");
            int yaw = config.getInt("world9.yaw");
            int pitch = config.getInt("world9.pitch");
            player.teleport(new Location(world9, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world10")){
            int x = config.getInt("world10.x");
            int y = config.getInt("world10.y");
            int z = config.getInt("world10.z");
            int yaw = config.getInt("world10.yaw");
            int pitch = config.getInt("world10.pitch");
            player.teleport(new Location(world10, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world11")){
            int x = config.getInt("world11.x");
            int y = config.getInt("world11.y");
            int z = config.getInt("world11.z");
            int yaw = config.getInt("world11.yaw");
            int pitch = config.getInt("world11.pitch");
            player.teleport(new Location(world11, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world12")){
            int x = config.getInt("world12.x");
            int y = config.getInt("world12.y");
            int z = config.getInt("world12.z");
            int yaw = config.getInt("world12.yaw");
            int pitch = config.getInt("world12.pitch");
            player.teleport(new Location(world12, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world13")){
            int x = config.getInt("world13.x");
            int y = config.getInt("world13.y");
            int z = config.getInt("world13.z");
            int yaw = config.getInt("world13.yaw");
            int pitch = config.getInt("world13.pitch");
            player.teleport(new Location(world13, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world14")){
            int x = config.getInt("world14.x");
            int y = config.getInt("world14.y");
            int z = config.getInt("world14.z");
            int yaw = config.getInt("world14.yaw");
            int pitch = config.getInt("world14.pitch");
            player.teleport(new Location(world14, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world15")){
            int x = config.getInt("world15.x");
            int y = config.getInt("world15.y");
            int z = config.getInt("world15.z");
            int yaw = config.getInt("world15.yaw");
            int pitch = config.getInt("world15.pitch");
            player.teleport(new Location(world15, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world16")){
            int x = config.getInt("world16.x");
            int y = config.getInt("world16.y");
            int z = config.getInt("world16.z");
            int yaw = config.getInt("world16.yaw");
            int pitch = config.getInt("world16.pitch");
            player.teleport(new Location(world16, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world17")){
            int x = config.getInt("world17.x");
            int y = config.getInt("world17.y");
            int z = config.getInt("world17.z");
            int yaw = config.getInt("world17.yaw");
            int pitch = config.getInt("world17.pitch");
            player.teleport(new Location(world17, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world18")){
            int x = config.getInt("world18.x");
            int y = config.getInt("world18.y");
            int z = config.getInt("world18.z");
            int yaw = config.getInt("world18.yaw");
            int pitch = config.getInt("world18.pitch");
            player.teleport(new Location(world18, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world19")){
            int x = config.getInt("world19.x");
            int y = config.getInt("world19.y");
            int z = config.getInt("world19.z");
            int yaw = config.getInt("world19.yaw");
            int pitch = config.getInt("world19.pitch");
            player.teleport(new Location(world19, x, y, z, yaw, pitch));
        }
        if (player.hasPermission("playertp.world20")){
            int x = config.getInt("world20.x");
            int y = config.getInt("world20.y");
            int z = config.getInt("world20.z");
            int yaw = config.getInt("world20.yaw");
            int pitch = config.getInt("world20.pitch");
            player.teleport(new Location(world20, x, y, z, yaw, pitch));
        }
       return true;
    }

}
