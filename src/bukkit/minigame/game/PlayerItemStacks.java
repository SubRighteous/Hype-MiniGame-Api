/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukkit.minigame.game;


import java.awt.List;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author SubRighteous
 */
public class PlayerItemStacks {
    
    
    public static ItemStack playerSword = new ItemStack(Material.IRON_SWORD);
    public static ItemMeta playerSwordMeta = playerSword.getItemMeta();
    
    
    public static ItemStack playerBow = new ItemStack(Material.BOW);
    public static ItemMeta playerBowMeta = playerBow.getItemMeta();
    
    
    public static void addPlayerSword(Player p){
        
        playerSwordMeta.setDisplayName(ChatColor.YELLOW + "Iron Sword");
        playerSword.setItemMeta(playerSwordMeta);
        
        p.getInventory().addItem(playerSword);
        
    
    }
    public static void addPlayerBow(Player p){
        
        playerBowMeta.setDisplayName(ChatColor.YELLOW + "  Bow  ");
        playerBowMeta.addEnchant(Enchantment.ARROW_INFINITE, 3, true);
        playerBow.setItemMeta(playerBowMeta);
        
        p.getInventory().addItem(playerBow);
        p.getInventory().addItem(new ItemStack(Material.ARROW , 1));
        
        
    }
    
    public static void addPlayerArmor(Player p){
        
    }
}
