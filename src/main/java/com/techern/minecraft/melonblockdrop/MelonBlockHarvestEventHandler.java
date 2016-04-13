package com.techern.minecraft.melonblockdrop;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * An event handler for when breaking {@link net.minecraft.block.BlockMelon}s
 *
 * @since 1.0.0
 */
public class MelonBlockHarvestEventHandler {

    /**
     * Called when harvesting any block
     *
     * @param event The {@link net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent}
     *
     * @since 1.0.0
     */
    @SubscribeEvent
    public void harvest(BlockEvent.HarvestDropsEvent event) {

        if (event.getState().getBlock().equals(Blocks.melon_block)) {
            //We're doing a melon block

            //First reset the drop list
            event.getDrops().clear();

            //Then add the new drop
            event.getDrops().add(new ItemStack(Blocks.melon_block, 1));

        } //Do nothing if not

    }

}
