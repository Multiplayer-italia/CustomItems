/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpi;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class GCoins extends GenericCustomItem{
    public GCoins(CustomItems plugin, String name, String texture)
    {
        super (plugin, "Golden Coin", "http://minecraft.xoom.it/mc/img/gcoin.png");
    }

}
