package net.bernhardbmx.neverending;

import com.mojang.logging.LogUtils;
import net.bernhardbmx.neverending.core.init.*;
import net.bernhardbmx.neverending.objekts.entity.client.GnomeRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(NeverEnding.MOD_ID)
public class NeverEnding {
    public static final String MOD_ID = "neverending";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NeverEnding() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        FluidInit.register(modEventBus);
        EffectInit.register(modEventBus);
        EntityInit.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        EntityRenderers.register(EntityInit.BAD_GNOME.get(), GnomeRenderer::new);
        // EntityRenderers.register(EntityInit.GOOD_GNOME.get(), GnomeRenderer::new);

        ItemBlockRenderTypes.setRenderLayer(BlockInit.DEAD_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.DEAD_SAPLING.get(), RenderType.cutout());
    }
}

/* Good Seed: 2985453448999789964 , -5565808046114399641 */
