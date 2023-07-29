package net.bernhardbmx.neverending.objekts.entity.client;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.item.LuckyArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LuckyArmorModel extends AnimatedGeoModel<LuckyArmorItem> {

    @Override
    public ResourceLocation getModelLocation(LuckyArmorItem object) {
        return new ResourceLocation(NeverEnding.MOD_ID, "geo/lucky_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LuckyArmorItem object) {
        return new ResourceLocation(NeverEnding.MOD_ID, "textures/models/armor/lucky_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LuckyArmorItem animatable) {
        return new ResourceLocation(NeverEnding.MOD_ID, "animation/lucky_armor.animation.json");
    }
}
