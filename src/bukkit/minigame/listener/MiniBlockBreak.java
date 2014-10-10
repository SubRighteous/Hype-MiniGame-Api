
package bukkit.minigame.listener;

import api.arena.Arena;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 *
 * @author SubRighteous
 */
public class MiniBlockBreak implements Listener{
    
    
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        
        if(Arena.team1.contains(p)){
            e.setCancelled(true);
        }
        
        if(Arena.team2.contains(p)){
            e.setCancelled(true);
        }
        
        if(Arena.Spectators.contains(p)){
            e.setCancelled(true);
        }
        
    }
}
