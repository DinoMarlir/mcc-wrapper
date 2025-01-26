package de.verdox.mccreativelab.impl.minestom.platform;

import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockHardnessSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockSoundSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCFurnaceSettings;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.platform.MCCLifecycleTrigger;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCResourcePack;
import de.verdox.mccreativelab.wrapper.platform.MCCTaskManager;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import de.verdox.mccreativelab.wrapper.platform.properties.MCCServerProperties;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistryStorage;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import net.minestom.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class MSPlatform implements MCCPlatform {
    protected final MSLifecycleTrigger lifecycleTrigger;

    public MSPlatform() {
        this.lifecycleTrigger = new MSLifecycleTrigger();
    }

    @Override
    public @NotNull MCCContainerFactory getContainerFactory() {
        return null;
    }

    @Override
    public @NotNull MCCTaskManager getTaskManager() {
        return null;
    }

    @Override
    public @NotNull TypedKeyFactory getTypedKeyFactory() {
        return null;
    }

    @Override
    public @NotNull ConversionService getConversionService() {
        return null;
    }

    @Override
    public @NotNull List<MCCWorld> getWorlds() {
        return List.of();
    }

    @Override
    public @Nullable MCCPlayer getOnlinePlayer(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public @NotNull List<MCCPlayer> getOnlinePlayers() {
        return List.of();
    }

    @Override
    public void setServerResourcePack(@NotNull MCCResourcePack resourcePack) {
    }

    @Override
    public void init() {

    }

    @Override
    public @NotNull MCCBlockHardnessSettings getBlockHardnessSettings() {
        return null;
    }

    @Override
    public @NotNull MCCBlockSoundSettings getBlockSoundSettings() {
        return null;
    }

    @Override
    public @NotNull MCCFurnaceSettings getFurnaceSettings() {
        return null;
    }

    @Override
    public int getPublicTick() {
        return 0;
    }

    @Override
    public MCCServerProperties getServerProperties() {
        return null;
    }

    @Override
    public void shutdown() {
        MinecraftServer.stopCleanly();
    }

    @Override
    public MCCRegistryStorage getRegistryStorage() {
        return null;
    }

    @Override
    public MCCLifecycleTrigger getLifecycleTrigger() {
        return lifecycleTrigger;
    }
}
