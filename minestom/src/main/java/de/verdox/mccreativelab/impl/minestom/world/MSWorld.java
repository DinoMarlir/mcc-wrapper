package de.verdox.mccreativelab.impl.minestom.world;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.entity.types.MCCItemEntity;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.TempData;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import net.kyori.adventure.key.Key;
import net.minestom.server.instance.Instance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class MSWorld extends MCCHandle<Instance> implements MCCWorld {

    public MSWorld(Instance handle) {
        super(handle);
    }

    @Override
    public String getName() {
        return getHandle().getDimensionName(); // TODO
    }

    @Override
    public void breakBlockNaturally(MCCBlock mccBlock, @Nullable MCCItemStack tool, boolean triggerEffect, boolean dropLoot, boolean dropExperience, boolean ignoreTool) {
        
    }

    @Override
    public MCCItemEntity dropItemNaturally(MCCLocation location, MCCItemStack item, @Nullable Consumer<MCCItemEntity> dropCallback) {
        return null;
    }

    @Override
    public MCCItemEntity dropItem(MCCLocation location, MCCItemStack item, @Nullable Consumer<MCCItemEntity> dropCallback) {
        return null;
    }

    @Override
    public List<MCCPlayer> getPlayers() {
        return getHandle().getPlayers().stream()
                .map(player ->
                        MCCPlatform.getInstance().getConversionService().wrap(
                                player, new TypeToken<MCCPlayer>() {}
                        ))
                .toList();
    }

    @Override
    public CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location, @NotNull MCCEntityType mccEntityType) {
        return null;
    }

    @Override
    public CompletableFuture<MCCChunk> getOrLoadChunk(int chunkX, int chunkZ) {
        return null;
    }

    @Override
    public CompletableFuture<MCCChunk> getOrLoadChunk(MCCLocation location) {
        return null;
    }

    @Override
    public @Nullable MCCChunk getChunkImmediately(int x, int z) {
        return null;
    }

    @Override
    public @Nullable MCCChunk getChunkImmediately(MCCLocation location) {
        return null;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public void triggerBlockUpdate(MCCLocation location) {

    }

    @Override
    public int getMaxBuildHeight() {
        return 0;
    }

    @Override
    public int getMinBuildHeight() {
        return 0;
    }

    @Override
    public Key getRegistryKey() {
        return null;
    }

    @Override
    public TempData getTempData() {
        return null;
    }

    @Override
    public @NotNull Key key() {
        return null;
    }
}
