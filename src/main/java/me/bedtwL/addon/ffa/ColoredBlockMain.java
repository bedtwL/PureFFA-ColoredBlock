package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

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
    public void onEnable() {
        new ColoredWool().registerBlockEffect();
        new ColoredGlass().registerBlockEffect();
    }

    @Override
    public void onDisable() {
        new ColoredWool().unregisterBlockEffect();
        new ColoredGlass().unregisterBlockEffect();
    }
}
