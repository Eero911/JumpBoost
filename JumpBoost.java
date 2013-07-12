/////////////////////////////////////////////////////////////////////////////
//                                                                         //
//                                                                         //
//                                                                         //
//           Hey, can i ask you to delete your jumpboost                   //
//                             repository                                  //
//               and fork to my JumpBoost repository                       //
//             it would be easier for me to edit source                    //
//                                                                         //
//                                                                         //
//                                                                         //
/////////////////////////////////////////////////////////////////////////////
package me.eero911.jumpboost;
 

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
public final class JumpBoost extends JavaPlugin implements Listener {
 
    @Override
    public void onEnable(){
     getServer().getPluginManager().registerEvents(this, this);
     getLogger().info("JumpBoost has been enabled!");
    }
    @Override
    public void onDisable(){
     getLogger().info("JumpBoost has been disabled");
    }
    
    @EventHandler
    public void enable(PlayerToggleSneakEvent event){
        Player p = event.getPlayer();
        
        if(p.hasPermission("jumpboost.one")) {
          p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 0));
        }
        if(p.hasPermission("jumpboost.two")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
        }
        if(p.hasPermission("jumpboost.three")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 2));
        }
    }
    @EventHandler
    public void enable(PlayerMoveEvent event){
        Player p = event.getPlayer();
        
        if(p.hasPermission("jumpboost.one")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
        }
        if(p.hasPermission("jumpboost.two")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
        }
        if(p.hasPermission("jumpboost.three")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
        }
    }
}
