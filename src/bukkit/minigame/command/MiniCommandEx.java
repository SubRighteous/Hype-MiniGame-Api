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
package bukkit.minigame.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author SubRighteous
 */
public class MiniCommandEx implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args) {
        
        Player player = (Player) cs;
        
        
        if(player.isOp() == true){
           if(string.equalsIgnoreCase("Game")){
              if(args[0].equalsIgnoreCase("CreateArena")){
                  
              }
           }
        }
        return true;
    }
    
}
