
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.wagyucows.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WagyucowsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.BUTCHER) {
			trades.get(1).add(new BasicItemListing(new ItemStack(WagyucowsModItems.PLAIN_WAGYU_MEAT.get(), 6), new ItemStack(Items.CHARCOAL, 2),
					new ItemStack(Items.EMERALD, 7), 10, 5, 0.05f));
			trades.get(2).add(new BasicItemListing(new ItemStack(WagyucowsModItems.RARE_WAGYU.get(), 3),

					new ItemStack(Items.EMERALD, 10), 10, 5, 0.05f));
			trades.get(4).add(new BasicItemListing(new ItemStack(WagyucowsModItems.MED_RARE_WAGYU.get(), 2),

					new ItemStack(Items.EMERALD, 23), 10, 5, 0.05f));
			trades.get(5).add(new BasicItemListing(new ItemStack(WagyucowsModItems.MED_RARE_WAGYU.get()),

					new ItemStack(Items.DIAMOND), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			trades.get(2).add(new BasicItemListing(new ItemStack(WagyucowsModItems.WAGYU_LEATHER.get(), 9),

					new ItemStack(Items.EMERALD, 6), 10, 5, 0.05f));
		}
	}
}
