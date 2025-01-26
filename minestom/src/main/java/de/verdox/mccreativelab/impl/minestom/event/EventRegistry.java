package de.verdox.mccreativelab.impl.minestom.event;

import de.verdox.mccreativelab.wrapper.registry.*;
import net.kyori.adventure.key.Key;
import net.minestom.server.event.EventListener;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class EventRegistry implements MCCRegistry<EventListener> {
    @Override
    public @Nullable Key getKey(EventListener value) {
        return null;
    }

    @Override
    public Optional<MCCTypedKey<EventListener>> getTypedKey(EventListener value) {
        return Optional.empty();
    }

    @Override
    public @Nullable EventListener get(@Nullable MCCTypedKey<EventListener> key) {
        return null;
    }

    @Override
    public @Nullable EventListener get(@Nullable Key key) {
        return null;
    }

    @Override
    public Optional<MCCReference<EventListener>> getAny() {
        return Optional.empty();
    }

    @Override
    public EventListener getOrThrow(MCCTypedKey<EventListener> key) {
        return null;
    }

    @Override
    public Set<Key> keySet() {
        return Set.of();
    }

    @Override
    public Set<MCCTypedKey<EventListener>> registryKeySet() {
        return Set.of();
    }

    @Override
    public boolean containsKey(Key key) {
        return false;
    }

    @Override
    public boolean containsKey(MCCTypedKey<EventListener> key) {
        return false;
    }

    @Override
    public Optional<MCCReference<EventListener>> getReference(Key key) {
        return Optional.empty();
    }

    @Override
    public Optional<MCCReference<EventListener>> getReference(MCCTypedKey<EventListener> key) {
        return Optional.empty();
    }

    @Override
    public MCCReference<EventListener> wrapAsReference(EventListener value) {
        return null;
    }

    @Override
    public Optional<MCCReferenceSet<EventListener>> getTag(MCCTag<EventListener> tag) {
        return Optional.empty();
    }

    @Override
    public MCCReferenceSet<EventListener> getOrCreateTag(MCCTag<EventListener> tag) {
        return null;
    }

    @Override
    public Stream<MCCTag<EventListener>> getTagNames() {
        return Stream.empty();
    }

    @Override
    public MCCReference<EventListener> register(MCCTypedKey<EventListener> key, EventListener value) {
        return null;
    }
}
