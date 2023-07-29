package net.bernhardbmx.neverending.core.init;

import net.bernhardbmx.neverending.NeverEnding;
import net.bernhardbmx.neverending.objekts.material.ModMaterialColor;
import net.bernhardbmx.neverending.world.feature.tree.DeadTreeGrower;
import net.bernhardbmx.neverending.world.item.ModCreativeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NeverEnding.MOD_ID);



    public static final RegistryObject<LiquidBlock> ACID_BLOCK = registerBlock("acid", () -> new LiquidBlock(FluidInit.ACID_FLUID, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()), ModCreativeTab.NEVERENDING_TAB_ILLEGAL);
    public static final RegistryObject<Block> DEAD_SAPLING = registerBlock("dead_sapling", () -> new SaplingBlock(new DeadTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeTab.NEVERENDING_TAB);
    public static final RegistryObject<Block> DEAD_LOG = registerBlock("dead_log", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).destroyTime(1.0f)), ModCreativeTab.NEVERENDING_TAB);
    public static final RegistryObject<Block> DEAD_PLANKS = registerBlock("dead_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeTab.NEVERENDING_TAB);
    public static final RegistryObject<Block> DEAD_STAIRS = registerBlock("dead_stairs", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeTab.NEVERENDING_TAB);

    public static final RegistryObject<Block> DEAD_LEAVES = registerBlock("dead_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
        @Override
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }

        @Override
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }

    }, ModCreativeTab.NEVERENDING_TAB);

    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1f, 3.0f).sound(SoundType.METAL)), ModCreativeTab.NEVERENDING_TAB);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1f, 3.0f).sound(SoundType.METAL)), ModCreativeTab.NEVERENDING_TAB);
    public static final RegistryObject<Block> STEEL_ORE_BLOCK = registerBlock("steel_ore_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1f, 3.0f).sound(SoundType.METAL)), ModCreativeTab.NEVERENDING_TAB);
    public static final RegistryObject<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block", ()  -> new Block(BlockBehaviour.Properties.of(Material.STONE, (Function<BlockState, MaterialColor>) ModMaterialColor.RAW_STEEL).strength(5.0F, 6.0F)), ModCreativeTab.NEVERENDING_TAB);
    public static final RegistryObject<Block> STEEL_SCRAP = registerBlock("steel_scrap", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1f, 3.0f).sound(SoundType.METAL)), ModCreativeTab.NEVERENDING_TAB);

    public static final RegistryObject<Block> LUCKY_GOLD_POT= registerBlock("lucky_gold_pot", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1f, 3.0f).sound(SoundType.METAL)), ModCreativeTab.NEVERENDING_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
