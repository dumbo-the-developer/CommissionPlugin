package me.adarsh.commissionplugin.config;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class CustomConfig {

    private static File file;
    private static FileConfiguration worlds;

    public static void setup(){
        file = new File(Objects.requireNonNull(Bukkit.getServer().getPluginManager().getPlugin("CommissionPlugin")).getDataFolder(), "worlds.yml");
        if (!file.exists()){
            try{
            file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        worlds = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get(){
        return worlds;
    }

    public static void save(){
        try {
            worlds.save(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void reload(){
        worlds = YamlConfiguration.loadConfiguration(file);
    }

}
