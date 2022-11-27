package com.jubiman.mmt;

import com.jubiman.mmt.buff.*;
import com.jubiman.mmt.buff.KomatsuPC210_10M0;
import com.jubiman.mmt.buff.singularity.*;
import com.jubiman.mmt.trinket.*;
import com.jubiman.mmt.trinket.singularity.*;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.Item;
import necesse.inventory.item.armorItem.BootsArmorItem;
import necesse.inventory.item.armorItem.ChestArmorItem;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

@ModEntry
public class MoreMergedTrinkets {

	public void init() {
		System.out.println("MMT init");

		BuffRegistry.registerBuff("necromancersbrooch", new NecromancersBroochBuff());
		BuffRegistry.registerBuff("calmingminershelmet", new CalmingMiningHelmetBuff());
		BuffRegistry.registerBuff("komatsupc210-10m0", new KomatsuPC210_10M0());
		BuffRegistry.registerBuff("arcticexplorersequipment", new ArcticExplorersEquipmentBuff());
		BuffRegistry.registerBuff("arcticadventurersequipment", new ArcticAdventurersEquipmentBuff());
		BuffRegistry.registerBuff("gamblersblessing", new GamblersBlessingBuff());

		// SingularityBuffs
		BuffRegistry.registerBuff("woodsingularity", new WoodSingularityBuff());
		BuffRegistry.registerBuff("coppersingularity", new CopperSingularityBuff());
		BuffRegistry.registerBuff("ironsingularity", new IronSingularityBuff());
		BuffRegistry.registerBuff("goldsingularity", new GoldSingularityBuff());
		BuffRegistry.registerBuff("frostsingularity", new FrostSingularityBuff());
		BuffRegistry.registerBuff("demonicsingularity", new DemonicSingularityBuff());
		BuffRegistry.registerBuff("quartzsingularity", new QuartzSingularityBuff());
		BuffRegistry.registerBuff("ivysingularity", new IvySingularityBuff());
		BuffRegistry.registerBuff("voidsingularity", new VoidSingularityBuff());
		BuffRegistry.registerBuff("tungstensingularity", new TungstenSingularityBuff());
		BuffRegistry.registerBuff("obsidiansingularity", new ObsidianSingularityBuff());
		BuffRegistry.registerBuff("shadowsingularity", new ShadowSingularityBuff());
		BuffRegistry.registerBuff("glacialsingularity", new GlacialSingularityBuff());
		BuffRegistry.registerBuff("myceliumsingularity", new MyceliumSingularityBuff());
		BuffRegistry.registerBuff("ancientsingularity", new AncientSingularityBuff());

		// Register our items
		ItemRegistry.registerItem("assassinsbackupplan", new AssassinsBackupPlan(), 777, true);
		ItemRegistry.registerItem("arcticexplorersequipment", new ArcticExplorersEquipment(), 777, true);
		ItemRegistry.registerItem("arcticadventurersequipment", new ArcticAdventurersEquipment(), 7777, true);
		ItemRegistry.registerItem("odinsbalancedfrostfiresoul", new OdinsBalancedFrostFireSoul(), 7777, true);
		ItemRegistry.registerItem("necromancersbrooch", new NecromancersBrooch(), 7777, true);
		ItemRegistry.registerItem("calmingminershelmet", new CalmingMinersHelmet(), 777, true);
		ItemRegistry.registerItem("komatsupc210-10m0", new com.jubiman.mmt.trinket.KomatsuPC210_10M0(), 7777, true);
		ItemRegistry.registerItem("gamblersblessing", new GamblersBlessing(), 7777, true);

		// Singularities
		ItemRegistry.registerItem("woodsingularity", new WoodSingularity(), 3, true);
		ItemRegistry.registerItem("coppersingularity", new CopperSingularity(), 5, true);
		ItemRegistry.registerItem("ironsingularity", new IronSingularity(), 7, true);
		ItemRegistry.registerItem("goldsingularity", new GoldSingularity(), 10, true);
		ItemRegistry.registerItem("frostsingularity", new FrostSingularity(), 33, true);
		ItemRegistry.registerItem("demonicsingularity", new DemonicSingularity(), 66.6f, true);
		ItemRegistry.registerItem("quartzsingularity", new QuartzSingularity(), 100, true);
		ItemRegistry.registerItem("ivysingularity", new IvySingularity(), 120, true);
		ItemRegistry.registerItem("voidsingularity", new VoidSingularity(), 150, true);
		ItemRegistry.registerItem("tungstensingularity", new TungstenSingularity(), 222, true);
		ItemRegistry.registerItem("obsidiansingularity", new ObsidianSingularity(), 333, true);
		ItemRegistry.registerItem("shadowsingularity", new ShadowSingularity(), 666, true);
		ItemRegistry.registerItem("glacialsingularity", new GlacialSingularity(), 777, true);
		ItemRegistry.registerItem("myceliumsingularity", new MyceliumSingularity(), 3333, true);
		ItemRegistry.registerItem("ancientsingularity", new AncientSingularity(), 7777, true);
	}

	public void postInit() {
		// Add recipes
		Recipes.registerModRecipe(new Recipe(
				"assassinsbackupplan",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("ammobox", 1),
						new Ingredient("assassinscowl", 1),
						new Ingredient("bonehilt", 1),
						new Ingredient("magicalquiver", 1),
						new Ingredient("ninjasmark", 1),
				}
		).showAfter("assassinscowl"));

		Recipes.registerModRecipe(new Recipe(
				"arcticexplorersequipment",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("spikedbatboots", 1),
						new Ingredient("explorersatchel", 1),
						new Ingredient("explorercloak", 1),
						new Ingredient("demonclaw", 1),
						new Ingredient("polarclaw", 1),
				}
		).showAfter("spikedbatboots"));

		Recipes.registerModRecipe(new Recipe(
				"calmingminershelmet",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("calmingminersbouquet", 1),
						new Ingredient("miningcharm", 1),
				}
		).showAfter("toolbox"));

		Recipes.registerModRecipe(new Recipe(
				"komatsupc210-10m0",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("calmingminershelmet", 1),
						new Ingredient("toolbox", 1),
				}
		).showAfter("calmingminershelmet"));

		Recipes.registerModRecipe(new Recipe(
				"arcticadventurersequipment",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("arcticexplorersequipment", 1),
						new Ingredient("ancientrelics", 1),
						new Ingredient("lifependant", 1),
						//new Ingredient("calmingminersequipment", 1),
				}
		).showAfter("arcticexplorersequipment"));

		Recipes.registerModRecipe(new Recipe(
				"odinsbalancedfrostfiresoul",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("frenzyorb", 1),
						new Ingredient("balancedfrostfirefoci", 1),
						new Ingredient("frozensoul", 1),
						new Ingredient("frozenwave", 1),
						new Ingredient("lifependant", 1),
						new Ingredient("shellofretribution", 1),
				}
		).showAfter("balancedfrostfirefoci"));

		Recipes.registerModRecipe(new Recipe(
				"necromancersbrooch",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("hysteriatablet", 1),
						new Ingredient("scryingmirror", 1),
				}
		).showAfter("hysteriatablet"));

		Recipes.registerModRecipe(new Recipe(
				"gamblersblessing",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("luckycape", 1),
						new Ingredient("fuzzydice", 1),
				}
		).showAfter("balancedfrostfirefoci"));

		// Singularities
		Recipes.registerModRecipe(new Recipe(
				"woodsingularity",
				1,
				RecipeTechRegistry.NONE,
				new Ingredient[]{
						new Ingredient("anylog", 333),
				}
		).showAfter("woodboat"));

		Recipes.registerModRecipe(new Recipe(
				"coppersingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("copperbar", 333),
						new Ingredient("woodsingularity", 1),
				}
		).showAfter("copperbow"));

		Recipes.registerModRecipe(new Recipe(
				"ironsingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("ironbar", 333),
						new Ingredient("coppersingularity", 1),
				}
		).showAfter("ironbow"));

		Recipes.registerModRecipe(new Recipe(
				"goldsingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("goldbar", 333),
						new Ingredient("ironsingularity", 1),
				}
		).showAfter("goldbow"));

		Recipes.registerModRecipe(new Recipe(
				"frostsingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("frostshard", 333),
						new Ingredient("goldsingularity", 1),
				}
		).showAfter("froststaff"));

		Recipes.registerModRecipe(new Recipe(
				"demonicsingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("demonicbar", 333),
						new Ingredient("frostsingularity", 1),
				}
		).showAfter("demonicbow"));

		Recipes.registerModRecipe(new Recipe(
				"voidsingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("voidshard", 333),
						new Ingredient("demonicsingularity", 1),
				}
		).showAfter("demonicboots"));

		Recipes.registerModRecipe(new Recipe(
				"quartzsingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("quartz", 333),
						new Ingredient("voidsingularity", 1),
				}
		).showAfter("quartzstaff"));

		Recipes.registerModRecipe(new Recipe(
				"ivysingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("ivybar", 333),
						new Ingredient("quartzsingularity", 1),
				}
		).showAfter("boulderstaff"));

		Recipes.registerModRecipe(new Recipe(
				"tungstensingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("tungstenbar", 333),
						new Ingredient("ivysingularity", 1),
				}
		).showAfter("tungstenbow"));

		Recipes.registerModRecipe(new Recipe(
				"obsidiansingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("obsidian", 333),
						new Ingredient("tungstensingularity", 1),
				}
		).showAfter("cookingstation"));

		Recipes.registerModRecipe(new Recipe(
				"shadowsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("ectoplasm", 333),
						new Ingredient("bone", 333),
						new Ingredient("obsidiansingularity", 1),
				}
		).showAfter("tungstenboots"));

		Recipes.registerModRecipe(new Recipe(
				"glacialsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("glacialbar", 333),
						new Ingredient("shadowsingularity", 1),
				}
		).showAfter("glacialbow"));

		Recipes.registerModRecipe(new Recipe(
				"myceliumsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("myceliumbar", 333),
						new Ingredient("glacialsingularity", 1),
				}
		).showAfter("myceliumshovel"));

		Recipes.registerModRecipe(new Recipe(
				"ancientsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("ancientfossilbar", 333),
						new Ingredient("myceliumsingularity", 1),
				}
		).showAfter("ancientdredgingstaff"));
	}
}
