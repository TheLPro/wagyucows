
package net.mcreator.wagyucows.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.wagyucows.init.WagyucowsModTabs;

public class CheeseItem extends Item {
	public CheeseItem() {
		super(new Item.Properties().tab(WagyucowsModTabs.TAB_WAGYU_COWS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
