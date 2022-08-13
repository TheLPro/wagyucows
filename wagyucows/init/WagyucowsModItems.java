
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wagyucows.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.wagyucows.item.WellDoneWagyuItem;
import net.mcreator.wagyucows.item.WagyuPattyItem;
import net.mcreator.wagyucows.item.WagyuLeatherItem;
import net.mcreator.wagyucows.item.RareWagyuItem;
import net.mcreator.wagyucows.item.PlainWagyuMeatItem;
import net.mcreator.wagyucows.item.PattyFormerItem;
import net.mcreator.wagyucows.item.MedRareWagyuItem;
import net.mcreator.wagyucows.item.HamburgerItem;
import net.mcreator.wagyucows.item.CheesyPattyItem;
import net.mcreator.wagyucows.item.CheeseItem;
import net.mcreator.wagyucows.WagyucowsMod;

public class WagyucowsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WagyucowsMod.MODID);
	public static final RegistryObject<Item> PLAIN_WAGYU_COW = REGISTRY.register("plain_wagyu_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(WagyucowsModEntities.PLAIN_WAGYU_COW, -1, -1, new Item.Properties().tab(WagyucowsModTabs.TAB_WAGYU_COWS)));
	public static final RegistryObject<Item> PLAIN_WAGYU_MEAT = REGISTRY.register("plain_wagyu_meat", () -> new PlainWagyuMeatItem());
	public static final RegistryObject<Item> RARE_WAGYU = REGISTRY.register("rare_wagyu", () -> new RareWagyuItem());
	public static final RegistryObject<Item> MED_RARE_WAGYU = REGISTRY.register("med_rare_wagyu", () -> new MedRareWagyuItem());
	public static final RegistryObject<Item> WELL_DONE_WAGYU = REGISTRY.register("well_done_wagyu", () -> new WellDoneWagyuItem());
	public static final RegistryObject<Item> WAGYU_LEATHER = REGISTRY.register("wagyu_leather", () -> new WagyuLeatherItem());
	public static final RegistryObject<Item> WAGYU_PATTY = REGISTRY.register("wagyu_patty", () -> new WagyuPattyItem());
	public static final RegistryObject<Item> PATTY_FORMER = REGISTRY.register("patty_former", () -> new PattyFormerItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> CHEESY_PATTY = REGISTRY.register("cheesy_patty", () -> new CheesyPattyItem());
	public static final RegistryObject<Item> HAMBURGER = REGISTRY.register("hamburger", () -> new HamburgerItem());
}
