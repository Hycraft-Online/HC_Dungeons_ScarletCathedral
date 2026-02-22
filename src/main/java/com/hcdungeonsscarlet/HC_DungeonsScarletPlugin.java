package com.hcdungeonsscarlet;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import javax.annotation.Nonnull;

public class HC_DungeonsScarletPlugin extends JavaPlugin {

    public HC_DungeonsScarletPlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        getLogger().atInfo().log("[HC_Dungeons_ScarletCathedral] Plugin loaded!");
    }
}
