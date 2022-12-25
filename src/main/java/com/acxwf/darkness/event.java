package com.acxwf.darkness;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class event implements Listener {

    PotionEffect dark =  new PotionEffect(PotionEffectType.DARKNESS, 1000000, 255);


    public int joinC = 0;
    @EventHandler
    public void onJoin(PlayerJoinEvent e){


        Player pl = e.getPlayer();

        joinC++;

        if(joinC == 1){
            pl.sendMessage(ChatColor.GRAY + "[ DARKNESS SURVIVAL ]\n");
            pl.sendMessage(ChatColor.GREEN + "=====================");
            pl.sendMessage(ChatColor.GREEN + "어둠 효과와 스테이크와 함께");
            pl.sendMessage(ChatColor.GREEN + "     하는 어둠 야생");
            pl.sendMessage(ChatColor.GREEN + "=====================");
        }



        pl.sendTitle(ChatColor.AQUA + "어둠 서바이벌", "", 30 , 30, 30);


        pl.addPotionEffect(dark, true);


        ItemStack item = new ItemStack(Material.COOKED_BEEF, 64);
        pl.getInventory().addItem(item);
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Player pl = e.getPlayer();


        pl.addPotionEffect(dark, true);

    }

    @EventHandler
    public void drink(PlayerItemConsumeEvent e){
        Player pl = e.getPlayer();

        if(pl.getItemInHand().getType().equals(Material.MILK_BUCKET)){
            pl.addPotionEffect(dark, true);
        }
    }

}
