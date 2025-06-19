package me.example;

import me.bedtwL.ffa.api.EffectAddon;

public class Main implements EffectAddon {
    @Override
    public String getName() {
        return "Example";
    }

    @Override
    public String getAuthor() {
        return "your name";
    }

    @Override
    public void onEnable() {
        //Register Effect (see https://github.com/bedtwL/PureFFA-BloodEffect) for example
    }

    @Override
    public void onDisable() {
        //Unregister Effect (see https://github.com/bedtwL/PureFFA-BloodEffect) for example
    }
}
