/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.arena;

import bukkit.minigame.game.MiniGame;
import config.MyConfig;
import config.MyConfigManager;
import java.util.ArrayList;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



/**
 *
 * @author SubRighteous
 */
public class Arena {
    
    private  String ArenaName;
    private  int ArenaSize;
    public static  boolean ArenaStarted;
    
    public int Team1X = arenaConfig.getInt("Team 1 X");
    public int Team1Y = arenaConfig.getInt("Team 1 Y");  
    public int Team1Z = arenaConfig.getInt("Team 1 Z");
   
    public int Team2X = arenaConfig.getInt("Team 1 X");
    public int Team2Y = arenaConfig.getInt("Team 1 Y");  
    public int Team2Z = arenaConfig.getInt("Team 1 Z");
   
    public int SpectatorX = arenaConfig.getInt("Spectator X");
    public int SpectatorY = arenaConfig.getInt("Spectator Y");  
    public int SpectatorZ = arenaConfig.getInt("Spectator Z");
   
    private static MyConfig arenaConfig;
    private static MyConfigManager configManager;
    
    public  static ArrayList<Player> team1 = new ArrayList<Player>();
    public  static ArrayList<Player> team2 = new ArrayList<Player>();
    public  static ArrayList<Player> Spectators = new ArrayList<Player>();
 
    
    public Arena(String arenaName, int PlayerCount, JavaPlugin plugin){
        this.ArenaName = arenaName;
        this.ArenaSize = PlayerCount;
        
        
        //Create Arena YML File
        configManager = new MyConfigManager(plugin);
        
        arenaConfig = configManager.getNewConfig(arenaName + ".yml");
        
        
       
        arenaConfig.set("Name", arenaName);
        arenaConfig.set("PlayerCount", PlayerCount);
        
        arenaConfig.saveConfig();
    }
    
    
    public void addPlayerToTeam1(Player p){
        team1.add(p);
    }
    public void addPlayerToTeam2(Player p){
        team2.add(p);
    }
   
     
    public  void addPlayerToSpectator(Player p){
        Spectators.add(p);
    }
    
    public void setTeam1SpawnLocation(Location location){
        arenaConfig.set("Team 1 X", location.getX());
        arenaConfig.set("Team 1 Y", location.getY());
        arenaConfig.set("Team 1 Z", location.getZ());
        
        arenaConfig.saveConfig();
    }
    
    public void setTeam2SpawnLocation(Location location){
        arenaConfig.set("Team 2 X", location.getX());
        arenaConfig.set("Team 2 Y", location.getY());
        arenaConfig.set("Team 2 Z", location.getZ());
        
        arenaConfig.saveConfig();
    }
    public void setSpectatorSpawnLocation(Location location){
        arenaConfig.set("Spectator X", location.getX());
        arenaConfig.set("Spectator Y", location.getY());
        arenaConfig.set("Spectator Z", location.getZ());
        
        arenaConfig.saveConfig();
    }
    
    public String nameToString(){
        return ArenaName;
    }
    
    public void start(){
        ArenaStarted = true;
        
        MiniGame.Start();
        
        for(Player p : team1){
            Location location = new Location(p.getWorld(),Team1X, Team1Y, Team1Z);
            
            p.teleport(location);
        }
        for(Player p : team2){
            
            Location location = new Location(p.getWorld(),Team2X, Team2Y, Team2Z);
            
            p.teleport(location);
            
        }
        for(Player p : Spectators){
            
            Location location = new Location(p.getWorld(),SpectatorX, SpectatorY, SpectatorZ);
            
            p.teleport(location);
            
        }
        
    }

    public void stop(){
        ArenaStarted = false;
        
        
        
        for(Player p : team1){
            
        }
        for(Player p : team2){
            
        }
        for(Player p : Spectators){
            
        }
        
    }
    
    
    
}
