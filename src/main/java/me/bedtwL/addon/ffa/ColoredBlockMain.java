package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;
import org.bukkit.Material;

import java.util.UUID;

public class ColoredBlockMain implements EffectAddon {
    @Override
    public String getName() {
        return "ColoredBlock";
    }

    @Override
    public String getAuthor() {
        return "bedtwL";
    }
    @Override
    public UUID authorUUID() {
        return UUID.fromString("f6edfcd8-f6b8-4e57-9367-8648953eaae2");
    }

    @Override
    public void onEnable() {
        new ColoredWool().registerBlockEffect();
        new ColoredGlass().registerBlockEffect();
        for (byte data = 0; data < 16; data++) {
            if (data!=0)
                new StaticColorBlock(data, Material.WOOL).registerBlockEffect();
            new StaticColorBlock(data,Material.STAINED_GLASS).registerBlockEffect();
        }
    }

    @Override
    public void onDisable() {
        new ColoredWool().unregisterBlockEffect();
        new ColoredGlass().unregisterBlockEffect();
        for (byte data = 0; data < 16; data++) {
            new StaticColorBlock(data, Material.WOOL).unregisterBlockEffect();
            new StaticColorBlock(data,Material.STAINED_GLASS).unregisterBlockEffect();
        }
    }
}
