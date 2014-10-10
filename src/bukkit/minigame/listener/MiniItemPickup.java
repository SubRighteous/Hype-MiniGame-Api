/*
 * Copyright (c) 2014 SubRighteous.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SubRighteous - initial API and implementation and/or initial documentation
 */
package bukkit.minigame.listener;

import api.arena.Arena;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

/**
 *
 * @author SubRighteous
 */
public class MiniItemPickup implements  Listener{
    
    
    @EventHandler
    public void onItemPickUp(PlayerPickupItemEvent e){
        Player player = e.getPlayer();
        
        if(Arena.team1.contains(player)){
            e.setCancelled(true);
        }
        
        if(Arena.team2.contains(player)){
            e.setCancelled(true);
        }
        
        if(Arena.Spectators.contains(player)){
            e.setCancelled(true);
        }
        
        
    }
    
}
