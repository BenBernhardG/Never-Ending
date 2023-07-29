package net.bernhardbmx.neverending.world.item;

import net.bernhardbmx.neverending.core.init.BlockInit;
import net.bernhardbmx.neverending.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab NEVERENDING_TAB = new CreativeModeTab("never-ending") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.TEST_ITEM.get());
        };
    };

    public static final CreativeModeTab NEVERENDING_TAB_COMBAT = new CreativeModeTab("never-ending_combat") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ItemInit.STEEL_CHESTPLATE.get()); };
    };

    public static final CreativeModeTab NEVERENDING_TAB_SPAWN_EGGS = new CreativeModeTab("never-ending_spawn_eggs") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ItemInit.BAD_GNOME_SPAWN_EGG.get()); };
    };

    public static final CreativeModeTab NEVERENDING_TAB_ILLEGAL = new CreativeModeTab("never-ending_Illegal") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(BlockInit.ACID_BLOCK.get()); };
    };
}
