package net.bernhardbmx.neverending.objekts.entity.client;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.entity.Gnome;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GnomeModel extends AnimatedGeoModel<Gnome> {

    @Override
    public ResourceLocation getModelLocation(Gnome object) {
        return new ResourceLocation(NeverEnding.MOD_ID, "geo/gnome.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Gnome object) {
        return new ResourceLocation(NeverEnding.MOD_ID, "textures/entity/gnome/gnome.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Gnome animatable) {
        return new ResourceLocation(NeverEnding.MOD_ID, "animation/gnome.animation.json");
    }
}
