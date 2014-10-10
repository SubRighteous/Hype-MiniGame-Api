/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukkit.minigame.game;

import api.arena.Arena;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author SubRighteous
 */
public class MiniGame {
    
    
    public static Player playerSpectator = (Player) Arena.Spectators;
    
    public static void Start(){
        for (Player p : Arena.team1){
                       
            p.setGameMode(GameMode.SURVIVAL);
            
            p.hidePlayer(playerSpectator);
            
            
            PlayerItemStacks.addPlayerBow(p);
            PlayerItemStacks.addPlayerSword(p);
            
            
            PlayerItemStacks.addPlayerArmor(p);
            
            
        }
        for (Player p : Arena.team2){
            p.setGameMode(GameMode.SURVIVAL);
            
            p.hidePlayer(playerSpectator);
            
            PlayerItemStacks.addPlayerBow(p);
            PlayerItemStacks.addPlayerSword(p);
            
            PlayerItemStacks.addPlayerArmor(p);
            
        }
        for (Player p : Arena.Spectators){
            if(p.isOp() == true)
                
            p.setGameMode(GameMode.CREATIVE);
                    
            p.canSee(playerSpectator);
            
            p.setFlying(true);
            
          //  p.getInventory().setItemInHand(new ItemStack(Material.COMPASS));
            
        }
    
    }
    
}
