
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wagyucows.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WagyucowsModTabs {
	public static CreativeModeTab TAB_WAGYU_COWS;

	public static void load() {
		TAB_WAGYU_COWS = new CreativeModeTab("tabwagyu_cows") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WagyucowsModItems.PLAIN_WAGYU_MEAT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
