package de.verdox.mccreativelab.impl.vanilla.types;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.types.MCCJukeboxSong;
import net.kyori.adventure.sound.Sound;
import net.kyori.adventure.text.Component;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;

public class NMSJukeboxSong extends MCCHandle<JukeboxSong> implements MCCJukeboxSong  {

	public static final MCCConverter<JukeboxSong, NMSJukeboxSong> CONVERTER  = converter(NMSJukeboxSong.class, JukeboxSong.class, NMSJukeboxSong::new, MCCHandle::getHandle);

	public NMSJukeboxSong(JukeboxSong handle){
		super(handle);
	}

	public MCCReference<Sound> getSoundEvent(){
		var nms = getSoundEventFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<Sound>>() {});
	}

	private Holder<SoundEvent> getSoundEventFromImpl(){
		return handle == null ? null : handle.soundEvent();
	}

	public Component getDescription(){
		var nms = getDescriptionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Component>() {});
	}

	private net.minecraft.network.chat.Component getDescriptionFromImpl(){
		return handle == null ? null : handle.description();
	}

	public float getLengthInSeconds(){
		var nms = getLengthInSecondsFromImpl();
		return nms;
	}

	private float getLengthInSecondsFromImpl(){
		return handle == null ? 0 : handle.lengthInSeconds();
	}

	public int getComparatorOutput(){
		var nms = getComparatorOutputFromImpl();
		return nms;
	}

	private int getComparatorOutputFromImpl(){
		return handle == null ? 0 : handle.comparatorOutput();
	}

}
