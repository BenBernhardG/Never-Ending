package net.bernhardbmx.neverending.objekts.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.entity.Gnome;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GnomeRenderer extends GeoEntityRenderer<Gnome> {

    public GnomeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GnomeModel());
        this.shadowRadius = 0.1f;
    }

    @Override
    public ResourceLocation getTextureLocation(Gnome instance) {
        return new ResourceLocation(NeverEnding.MOD_ID, "textures/entity/gnome/gnome.png");
    }

    @Override
    public RenderType getRenderType(Gnome animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
