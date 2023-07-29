package net.bernhardbmx.neverending.objekts.event;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.entity.client.LuckyArmorRenderer;
import net.bernhardbmx.neverending.objekts.item.LuckyArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = NeverEnding.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void entityAttributesEvent(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(LuckyArmorItem.class, new LuckyArmorRenderer());
    }
}
