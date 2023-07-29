package net.bernhardbmx.neverending.core.init;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.effect.Cauterization;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectInit {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NeverEnding.MOD_ID);

    public static final RegistryObject<MobEffect> CAUTERIZATION = MOB_EFFECTS.register("cauterization", () -> new Cauterization(MobEffectCategory.HARMFUL, 3124687));

    public static void register(IEventBus eventBus) { MOB_EFFECTS.register(eventBus); }
}
