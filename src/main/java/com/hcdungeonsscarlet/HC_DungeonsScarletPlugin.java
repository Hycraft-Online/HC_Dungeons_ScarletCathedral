package com.hcdungeonsscarlet;

import com.hcdungeonsscarlet.systems.DungeonBlockBreakSystem;
import com.hcdungeonsscarlet.systems.DungeonBlockPlaceSystem;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import javax.annotation.Nonnull;

public class HC_DungeonsScarletPlugin extends JavaPlugin {

    public HC_DungeonsScarletPlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        getEntityStoreRegistry().registerSystem(new DungeonBlockBreakSystem());
        getEntityStoreRegistry().registerSystem(new DungeonBlockPlaceSystem());
        getLogger().atInfo().log("[HC_Dungeons_ScarletCathedral] Plugin loaded!");
    }
}
