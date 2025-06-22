package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.effect.PureBlock;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class ColoredWool extends PureBlock {
    @Override
    public void onBlockPlace(Block block) {
        BlockUtils.setWoolColor(block,BlockUtils.getRandomDyeColor());
    }

    @Override
    public ItemStack getBlock() {
        return new ItemStack(Material.WOOL,64);
    }

    @Override
    public String getBlockKey() {
        return "colored-wool";
    }
    @Override
    public boolean useLang() {
        return true;
    }
    @Override
    public String getItemNameKey() {
        return "colored-wool";
    }
}
