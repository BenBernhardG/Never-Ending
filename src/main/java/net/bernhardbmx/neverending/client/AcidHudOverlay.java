package net.bernhardbmx.neverending.client;

import net.bernhardbmx.neverending.NeverEnding;
import net.minecraft.resources.ResourceLocation;

public class AcidHudOverlay {
    private static final ResourceLocation ACID_METER_0 = new ResourceLocation(NeverEnding.MOD_ID,
            "textures/gui/acid_meter/acid_meter_0.png");
    private static final ResourceLocation ACID_METER_1 = new ResourceLocation(NeverEnding.MOD_ID,
            "textures/gui/acid_meter/acid_meter_1.png");
    private static final ResourceLocation ACID_METER_2 = new ResourceLocation(NeverEnding.MOD_ID,
            "textures/gui/acid_meter/acid_meter_2.png");

    /*
    public static final IGuiOverlay HUD_SPEEDOMETER = ((gui, poseStack, partialTick, screenWidth, screenHeight) -> {
        int x = screenWidth / 2;
        int y = screenHeight;

        RenderSystem.setShader(GameRenderer::getPositionShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        RenderSystem.setShaderTexture(0, ACID_METER_0);
        for(int i = 0; i < 1; i++) {
            if(ClientAcidData.getPlayerSpeed() == 0) {
                GuiComponent.blit(poseStack,x - 94 + (i * 9),y - 54,0,0,17,17,
                        17,17);
            } else {
                break;
            }
        }

        RenderSystem.setShaderTexture(0, ACID_METER_1);
        for(int i = 0; i < 1; i++) {
            if(ClientAcidData.getPlayerSpeed() > 0) {
                GuiComponent.blit(poseStack,x - 94 + (i * 9),y - 54,0,0,17,17,
                        17,17);
            } else {
                break;
            }
        }
     */
}
