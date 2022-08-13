
package net.mcreator.wagyucows.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.wagyucows.init.WagyucowsModTabs;

public class WagyuPattyItem extends Item {
	public WagyuPattyItem() {
		super(new Item.Properties().tab(WagyucowsModTabs.TAB_WAGYU_COWS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(7f)

						.meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
