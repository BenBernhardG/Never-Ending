package net.bernhardbmx.neverending.objekts.event;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.core.init.EntityInit;
import net.bernhardbmx.neverending.objekts.entity.Gnome;
import net.bernhardbmx.neverending.objekts.entity.client.LuckyArmorRenderer;
import net.bernhardbmx.neverending.objekts.item.LuckyArmorItem;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = NeverEnding.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {


    @SubscribeEvent
    public static void entityAttributesEvent(EntityAttributeCreationEvent event) {
        event.put(EntityInit.BAD_GNOME.get(), Gnome.setAttributes());
        // event.put(EntityInit.GOOD_GNOME.get(), Gnome.setAttributes());
    }

    @SubscribeEvent
    public static void entityAttributesEvent(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(LuckyArmorItem.class, new LuckyArmorRenderer());
    }
}
