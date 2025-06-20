package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.BlockEffect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class ColoredGlass implements BlockEffect {
    @Override
    public void onBlockPlace(Block block) {
        BlockUtils.setGlassColor(block,BlockUtils.getRandomDyeColor());
    }

    @Override
    public ItemStack getBlock() {
        return new ItemStack(Material.STAINED_GLASS,64);
    }

    @Override
    public String getBlockKey() {
        return "colored-glass";
    }
    @Override
    public Boolean useLang() {
        return true;
    }
    @Override
    public String getItemNameKey() {
        return "colored-glass";
    }
}
