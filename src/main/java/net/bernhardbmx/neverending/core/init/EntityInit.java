package net.bernhardbmx.neverending.core.init;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.entity.Gnome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, NeverEnding.MOD_ID);

    // public static final RegistryObject<EntityType<Gnome>> GOOD_GNOME = ENTITY_TYPES.register("good_gnome", () -> EntityType.Builder.of(Gnome::new, MobCategory.CREATURE).sized(0.8f, 0.6f).build(new ResourceLocation(NeverEnding.MODID, "good_gnome").toString()));
    public static final RegistryObject<EntityType<Gnome>> BAD_GNOME = ENTITY_TYPES.register("bad_gnome", () -> EntityType.Builder.of(Gnome::new, MobCategory.MONSTER).sized(0.8f, 0.6f).build(new ResourceLocation(NeverEnding.MOD_ID, "bad_gnome").toString()));

    public static void register(IEventBus eventBus) { ENTITY_TYPES.register(eventBus); }
}
