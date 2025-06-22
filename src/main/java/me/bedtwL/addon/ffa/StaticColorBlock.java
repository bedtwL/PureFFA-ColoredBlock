package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.effect.PureBlock;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class StaticColorBlock extends PureBlock {
    public final byte data;
    public final Material material;

    public StaticColorBlock(byte data, Material material) {
        this.data = data;
        this.material = material;
    }

    @Override
    public void onBlockPlace(Block block) {
    }

    @Override
    public ItemStack getBlock() {
        return new ItemStack(material,64,data);
    }

    @Override
    public String getBlockKey() {
        return "static-colored-block-"+material.toString().toLowerCase()+"-"+data;
    }
}
