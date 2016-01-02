package com.techern.minecraft.melonblockdrop;

import net.minecraft.block.BlockMelon;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
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
    public static final String VERSION = "1.0.0-SNAPSHOT";

    /**
     * The {@link Logger} for {@link MelonBlockDropMod}
     *
     * @since 1.0.0
     */
    public static Logger LOGGER = LogManager.getLogger(MelonBlockDropMod.class); //Temporarily set in case we use it before preInit one day

    /**
     * Handles the {@link FMLPreInitializationEvent}
     *
     * @param event The {@link FMLPreInitializationEvent}
     * @since 1.0.0
     */
    @Mod.EventHandler
    public void handlePreInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();

        LOGGER.info("Set up MelonBlockDrop's logging");
    }

}
