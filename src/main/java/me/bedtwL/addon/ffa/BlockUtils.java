package me.bedtwL.addon.ffa;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.material.Wool;

import java.util.Random;

public class BlockUtils {
    public static DyeColor getRandomDyeColor() {
        DyeColor[] colors = DyeColor.values();
        return colors[new Random().nextInt(colors.length)];
    }
    public static void setWoolColor(Block block, DyeColor color) {
        block.setType(Material.WOOL);
        BlockState state = block.getState();
        Wool wool = (Wool) state.getData();
        wool.setColor(color);
        state.setData(wool);
        state.update();
    }
    public static void setGlassColor(Block block, DyeColor color) {
        block.setType(Material.STAINED_GLASS);
        block.setData(color.getWoolData());
    }
}
