package com.mpi;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

import java.util.logging.Logger;

public class CustomItems extends JavaPlugin
//public class Main extends JavaPlugin
{
    public static final Logger logger = Logger.getLogger("Minecraft");
    public GCoins GCoins;

    @Override
    public void onEnable()
    { 
        SpoutManager.getFileManager().addToPreLoginCache(this, "http://minecraft.xoom.it/mc/img/gcoin.png");
        
        GCoins = new GCoins(this, null, null);       
        addGGoldRecipe();
        
        CustomItems.logger.info("[CustomItems] GCoins has been enabled.");
        
        /* 
        PluginDescriptionFile pdfFile = this.getDescription();
        this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled.");
      
        ItemStack item = new SpoutItemStack(MyCustomItem, amount);
        player.getInventory().add(item);
        //or: world.getServer().getWorld(" ").dropItemNaturally(location, item);
       
        SpoutItemStack(itemStack).isCustomItem() - whether a block is custom or not
        ((SpoutBlock)block).getCustomBlock() - gets the custom block from this bukkit block location.
        */       
    }

    @Override
    public void onDisable()
    {
        CustomItems.logger.info("[CustomItems] GCoins has been disabled.");
    }
    
    public void addGGoldRecipe(){       
        SpoutItemStack item = new SpoutItemStack(GCoins);
        SpoutShapedRecipe GCrecipe = new SpoutShapedRecipe(item);
        GCrecipe.shape("X  ", "XXX", "  X");// top : middle : bottom
        GCrecipe.setIngredient('X', MaterialData.bedrock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(GCrecipe);
    } 
    
}