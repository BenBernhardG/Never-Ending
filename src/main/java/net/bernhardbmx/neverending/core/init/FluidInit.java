package net.bernhardbmx.neverending.core.init;

import net.bernhardbmx.neverending.NeverEnding;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class FluidInit {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, NeverEnding.MOD_ID);

    public static final RegistryObject<FlowingFluid> ACID_FLUID = FLUIDS.register("acid_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.ACID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ACID_FLOWING = FLUIDS.register("acid_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.ACID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ACID_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> ACID_FLUID.get(),
            () -> ACID_FLOWING.get(),
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).density(15).luminosity(2).viscosity(5).sound(SoundEvents.BREWING_STAND_BREW).overlay(WATER_OVERLAY_RL).color(0xbffcba03)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> BlockInit.ACID_BLOCK.get())
            .bucket(() -> ItemInit.ACID_BUCKET.get());

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
