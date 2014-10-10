
package bukkit.minigame.project;

import api.arena.Arena;
import bukkit.minigame.listener.MiniBlockBreak;
import bukkit.minigame.listener.MiniItemPickup;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author SubRighteous
 */
public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){

        System.out.print(getName() + " is Enabled");
        
        PluginManager pm = getServer().getPluginManager();
        
        pm.registerEvents(new MiniBlockBreak(), this);
        pm.registerEvents(new MiniItemPickup(), this);
        
    }
    
    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args) {
        
        Player player = (Player) cs;
        
        
        if(player.isOp() == true){
           if(string.equalsIgnoreCase("Game")){
              if(args[0].equalsIgnoreCase("CreateArena")){
                 
                  if(args[1].length() == 0){
                      player.sendMessage(ChatColor.RED + "TOO LITTLE ARGS: /Game CreateArena <ArenaName>");
                  }
                  
                  Arena arena = new Arena(args[1].toString() + ".yml" , 5 , this);
                  
              }
           }
        }
        return true;
    }
    
    
    
    
}
