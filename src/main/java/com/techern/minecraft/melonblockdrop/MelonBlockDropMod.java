package com.techern.minecraft.melonblockdrop;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

/**
 * A {@link net.minecraftforge.fml.common.Mod} that makes {@link net.minecraft.block.BlockMelon}s drop melons
 *
 * @since 1.0.0
 */
@Mod(modid = "MelonBlockDrop", version = MelonBlockDropMod.VERSION)
public class MelonBlockDropMod {

    /**
     * The current version of {@link MelonBlockDropMod}
     *
     * @since 1.0.0
     */
    public static final String VERSION = "1.2.0";

    /**
     * The {@link Logger} for {@link MelonBlockDropMod}
     *
     * @since 1.0.0
     */
    public static Logger LOGGER;

    /**
     * Handles the {@link FMLPreInitializationEvent}
     *
     * @param event The {@link FMLPreInitializationEvent}
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void handlePreInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();

        LOGGER.trace("Set up MelonBlockDrop's logging");
    }

    /**
     * Handles the {@link FMLInitializationEvent}
     *
     * @param event The {@link FMLInitializationEvent}
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void handleInit(FMLInitializationEvent event) {

        registerMelonBlockCraftingRecipes();

        LOGGER.debug("Set melon block crafting recipes");

        MinecraftForge.EVENT_BUS.register(new MelonBlockHarvestEventHandler());

        LOGGER.debug("Registered melon block harvest event");

        LOGGER.info("Finished setting up MelonBlockDrop. Have fun!");
    }

    /**
     * Registers the melon block crafting recipes
     *
     * @since 0.0.1
     */
    public void registerMelonBlockCraftingRecipes() {

        ItemStack block = new ItemStack(Blocks.melon_block, 1);

        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 2), block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 6), block, block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 9), block, block, block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 16), block, block, block, block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 25), block, block, block, block, block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 36), block, block, block, block, block, block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 42), block, block, block, block, block, block, block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 48), block, block, block, block, block, block, block, block);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.melon, 63), block, block, block, block, block, block, block, block, block);
    }

}
