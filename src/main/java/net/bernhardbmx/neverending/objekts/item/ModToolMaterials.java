package net.bernhardbmx.neverending.objekts.item;

import net.bernhardbmx.neverending.core.init.ItemInit;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements Tier {

    // Steel
    STEEL_TOOL(6, 4000, 4f, 2f, 15, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    STEEL_SWORD(6, 4000, 4f, 2f, 15, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    STEEL_AXE(6, 4000, 4f, 2f, 15, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    STEEL_HAMMER(6, 4000, 4f, 1f, 15, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),

    // Lucky Gold
    LUCKY_TOOL(6, 4000, 4f, 2f, 15, () -> Ingredient.of(ItemInit.SULFUR_DUST.get())),
    LUCKY_SWORD(6, 4000, 4f, 2f, 15, () -> Ingredient.of(ItemInit.SULFUR_DUST.get())),
    LUCKY_AXE(6, 4000, 4f, 2f, 15, () -> Ingredient.of(ItemInit.SULFUR_DUST.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ModToolMaterials(int harvestLevel, int maxUses, float efficiency, float atteckDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = atteckDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }
}
