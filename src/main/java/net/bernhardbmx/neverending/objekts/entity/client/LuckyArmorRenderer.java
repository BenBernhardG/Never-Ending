package net.bernhardbmx.neverending.objekts.entity.client;

import net.bernhardbmx.neverending.objekts.item.LuckyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LuckyArmorRenderer extends GeoArmorRenderer<LuckyArmorItem> {
    public LuckyArmorRenderer() {
        super(new LuckyArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
