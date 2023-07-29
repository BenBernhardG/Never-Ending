package net.bernhardbmx.neverending.core.init;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.item.*;
import net.bernhardbmx.neverending.world.item.ModCreativeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NeverEnding.MOD_ID);



    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB_ILLEGAL)));
    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust", () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeTab.NEVERENDING_TAB)));

    public static final RegistryObject<BundleItem> FANNY_PACK = ITEMS.register("fanny_pack", () -> new BundleItem(new BundleItem.Properties().stacksTo(1).tab(ModCreativeTab.NEVERENDING_TAB)));

    public static final RegistryObject<BucketItem> ACID_BUCKET = ITEMS.register("acid_bucket", () -> new BucketItem(FluidInit.ACID_FLUID, new Item.Properties().stacksTo(1).tab(ModCreativeTab.NEVERENDING_TAB)));
    public static final RegistryObject<BottleItem> ACID_BOTTLE = ITEMS.register("acid_bottle", () -> new BottleItem(new Item.Properties().stacksTo(1).tab(ModCreativeTab.NEVERENDING_TAB)));


    public static final RegistryObject<ArmorItem> BREATHING_MASK = ITEMS.register("breathing_mask", () -> new ArmorItem(ModArmorMaterials.DEAD_EQUIP_MASK, EquipmentSlot.HEAD, (new Item.Properties().setNoRepair().durability(120)).tab(ModCreativeTab.NEVERENDING_TAB)));
    public static final RegistryObject<ArmorItem> CHESTPLATE = ITEMS.register("chestplate", () -> new ArmorItem(ModArmorMaterials.DEAD_EQUIP, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LEGGINGS = ITEMS.register("leggings", () -> new ArmorItem(ModArmorMaterials.DEAD_EQUIP, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> BOOTS = ITEMS.register("boots", () -> new ArmorItem(ModArmorMaterials.DEAD_EQUIP, EquipmentSlot.FEET, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> CHAIN_LEATHER_HELMET = ITEMS.register("chain_leather_helmet", () -> new ArmorItem(ModArmorMaterials.CHAIN_LEATHER_EQUIP, EquipmentSlot.HEAD, (new Item.Properties().setNoRepair().durability(120)).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> CHAIN_LEATHER_CHESTPLATE = ITEMS.register("chain_leather_chestplate", () -> new ArmorItem(ModArmorMaterials.CHAIN_LEATHER_EQUIP, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> CHAIN_LEATHER_LEGGINGS = ITEMS.register("chain_leather_leggings", () -> new ArmorItem(ModArmorMaterials.CHAIN_LEATHER_EQUIP, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> CHAIN_LEATHER_BOOTS = ITEMS.register("chain_leather_boots", () -> new ArmorItem(ModArmorMaterials.CHAIN_LEATHER_EQUIP, EquipmentSlot.FEET, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));



    // Steel
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB)));

    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(ModArmorMaterials.STEEL_EQUIP, EquipmentSlot.HEAD, (new Item.Properties().setNoRepair().durability(120)).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ModArmorItem(ModArmorMaterials.STEEL_EQUIP, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggigngs", () -> new ArmorItem(ModArmorMaterials.STEEL_EQUIP, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(ModArmorMaterials.STEEL_EQUIP, EquipmentSlot.FEET, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));

    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModToolMaterials.STEEL_SWORD, 5, -1f, new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModToolMaterials.STEEL_AXE, 5, -1f, new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB)));



    // Lucky Gold
    public static final RegistryObject<Item> LUCKY_GOLD_INGOT = ITEMS.register("lucky_gold_ingot", () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeTab.NEVERENDING_TAB)));
    public static final RegistryObject<Item> LUCKY_GOLD_NUGGET = ITEMS.register("lucky_gold_nugget", () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeTab.NEVERENDING_TAB)));

    public static final RegistryObject<ArmorItem> LUCK_HELMET = ITEMS.register("lucky_helmet", () -> new LuckyArmorItem(ModArmorMaterials.LUCK_EQUIP, EquipmentSlot.HEAD, (new Item.Properties().setNoRepair().durability(120)).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LUCK_CHESTPLATE = ITEMS.register("lucky_chestplate", () -> new LuckyArmorItem(ModArmorMaterials.LUCK_EQUIP, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LUCK_LEGGINGS = ITEMS.register("lucky_leggings", () -> new LuckyArmorItem(ModArmorMaterials.LUCK_EQUIP, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LUCK_BOOTS = ITEMS.register("lucky_boots", () -> new LuckyArmorItem(ModArmorMaterials.LUCK_EQUIP, EquipmentSlot.FEET, (new Item.Properties()).tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));

    public static final RegistryObject<SwordItem> LUCKY_SWORD = ITEMS.register("lucky_sword", () -> new SwordItem(ModToolMaterials.LUCKY_SWORD, 5, -1f, new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB_COMBAT)));
    public static final RegistryObject<AxeItem> LUCKY_AXE = ITEMS.register("lucky_axe", () -> new AxeItem(ModToolMaterials.LUCKY_AXE, 5, -1f, new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB)));
    public static final RegistryObject<HammerItem> STEEL_FORGING_HAMMER = ITEMS.register("steel_forging_hammer", () -> new HammerItem(ModToolMaterials.STEEL_HAMMER, 5, -1f, new Item.Properties().stacksTo(16).tab(ModCreativeTab.NEVERENDING_TAB)));



    // Spawn Eggs
    public static final RegistryObject<Item> BAD_GNOME_SPAWN_EGG = ITEMS.register("bad_gnome_spawn_egg", () -> new ForgeSpawnEggItem(EntityInit.BAD_GNOME, 0x948e8d, 0x3b3635, new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB_SPAWN_EGGS)));
    // public static final RegistryObject<Item> GOOD_GNOME_SPAWN_EGG = ITEMS.register("good_gnome_spawn_egg", () -> new ForgeSpawnEggItem(EntityInit.GOOD_GNOME, 0x948e8d, 0x3b3635, new Item.Properties().tab(ModCreativeTab.NEVERENDING_TAB_SPAWN_EGGS)));



    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
