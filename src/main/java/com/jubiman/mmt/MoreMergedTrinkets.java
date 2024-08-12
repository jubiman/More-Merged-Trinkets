package com.jubiman.mmt;

import com.jubiman.mmt.buff.KomatsuPC210_10M0;
import com.jubiman.mmt.buff.*;
import com.jubiman.mmt.buff.singularity.*;
import com.jubiman.mmt.trinket.*;
import com.jubiman.mmt.trinket.singularity.*;
import necesse.engine.input.Control;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.registries.ItemRegistry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

@ModEntry
public class MoreMergedTrinkets {
	public static Control TOGGLE_MMT_BUFFS = new Control(76, "mmt_toggle_buffs");

	public void init() {
		System.out.println("MMT init");

		// Buffs
		BuffRegistry.registerBuff("mmt_necromancersbrooch", new NecromancersBroochBuff());
		BuffRegistry.registerBuff("mmt_calmingminershelmet", new CalmingMiningHelmetBuff());
		BuffRegistry.registerBuff("mmt_komatsupc210-10m0", new KomatsuPC210_10M0());
		BuffRegistry.registerBuff("mmt_arcticexplorersequipment", new ArcticExplorersEquipmentBuff());
		BuffRegistry.registerBuff("mmt_arcticadventurersequipment", new ArcticAdventurersEquipmentBuff());
		BuffRegistry.registerBuff("mmt_gamblersblessing", new GamblersBlessingBuff());
		BuffRegistry.registerBuff("mmt_fylgjaamulet", new FylgjaAmuletBuff());
		BuffRegistry.registerBuff("mmt_hexedfylgjaamulet", new HexedFylgjaAmuletBuff());

		// SingularityBuffs
		BuffRegistry.registerBuff("mmt_woodsingularity", new WoodSingularityBuff());
		BuffRegistry.registerBuff("mmt_coppersingularity", new CopperSingularityBuff());
		BuffRegistry.registerBuff("mmt_ironsingularity", new IronSingularityBuff());
		BuffRegistry.registerBuff("mmt_goldsingularity", new GoldSingularityBuff());
		BuffRegistry.registerBuff("mmt_frostsingularity", new FrostSingularityBuff());
		BuffRegistry.registerBuff("mmt_demonicsingularity", new DemonicSingularityBuff());
		BuffRegistry.registerBuff("mmt_quartzsingularity", new QuartzSingularityBuff());
		BuffRegistry.registerBuff("mmt_ivysingularity", new IvySingularityBuff());
		BuffRegistry.registerBuff("mmt_voidsingularity", new VoidSingularityBuff());
		BuffRegistry.registerBuff("mmt_tungstensingularity", new TungstenSingularityBuff());
		BuffRegistry.registerBuff("mmt_obsidiansingularity", new ObsidianSingularityBuff());
		BuffRegistry.registerBuff("mmt_shadowsingularity", new ShadowSingularityBuff());
		BuffRegistry.registerBuff("mmt_glacialsingularity", new GlacialSingularityBuff());
		BuffRegistry.registerBuff("mmt_myceliumsingularity", new MyceliumSingularityBuff());
		BuffRegistry.registerBuff("mmt_ancientsingularity", new AncientSingularityBuff());

		// Register our items
		ItemRegistry.registerItem("mmt_assassinsbackupplan", new AssassinsBackupPlan(), 777, true);
		ItemRegistry.registerItem("mmt_arcticexplorersequipment", new ArcticExplorersEquipment(), 777, true);
		ItemRegistry.registerItem("mmt_arcticadventurersequipment", new ArcticAdventurersEquipment(), 7777, true);
		ItemRegistry.registerItem("mmt_odinsbalancedfrostfiresoul", new OdinsBalancedFrostFireSoul(), 7777, true);
		ItemRegistry.registerItem("mmt_necromancersbrooch", new NecromancersBrooch(), 7777, true);
		ItemRegistry.registerItem("mmt_calmingminershelmet", new CalmingMinersHelmet(), 777, true);
		ItemRegistry.registerItem("mmt_komatsupc210-10m0", new com.jubiman.mmt.trinket.KomatsuPC210_10M0(), 7777, true);
		ItemRegistry.registerItem("mmt_gamblersblessing", new GamblersBlessing(), 7777, true);
		ItemRegistry.registerItem("mmt_fylgjaamulet", new FylgjaAmulet(), 3333, true);
		ItemRegistry.registerItem("mmt_hexedfylgjaamulet", new HexedFylgjaAmulet(), 6666, true);

		// Singularities
		ItemRegistry.registerItem("mmt_woodsingularity", new WoodSingularity(), 3, true);
		ItemRegistry.registerItem("mmt_coppersingularity", new CopperSingularity(), 5, true);
		ItemRegistry.registerItem("mmt_ironsingularity", new IronSingularity(), 7, true);
		ItemRegistry.registerItem("mmt_goldsingularity", new GoldSingularity(), 10, true);
		ItemRegistry.registerItem("mmt_frostsingularity", new FrostSingularity(), 33, true);
		ItemRegistry.registerItem("mmt_demonicsingularity", new DemonicSingularity(), 66.6f, true);
		ItemRegistry.registerItem("mmt_quartzsingularity", new QuartzSingularity(), 100, true);
		ItemRegistry.registerItem("mmt_ivysingularity", new IvySingularity(), 120, true);
		ItemRegistry.registerItem("mmt_voidsingularity", new VoidSingularity(), 150, true);
		ItemRegistry.registerItem("mmt_tungstensingularity", new TungstenSingularity(), 222, true);
		ItemRegistry.registerItem("mmt_obsidiansingularity", new ObsidianSingularity(), 333, true);
		ItemRegistry.registerItem("mmt_shadowsingularity", new ShadowSingularity(), 666, true);
		ItemRegistry.registerItem("mmt_glacialsingularity", new GlacialSingularity(), 777, true);
		ItemRegistry.registerItem("mmt_myceliumsingularity", new MyceliumSingularity(), 3333, true);
		ItemRegistry.registerItem("mmt_ancientsingularity", new AncientSingularity(), 7777, true);

		// Add controls
		Control.addModControl(TOGGLE_MMT_BUFFS);
	}

	public void postInit() {
		// Add recipes
		Recipes.registerModRecipe(new Recipe(
				"mmt_assassinsbackupplan",
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
				"mmt_arcticexplorersequipment",
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
				"mmt_calmingminershelmet",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("calmingminersbouquet", 1),
						new Ingredient("miningcharm", 1),
				}
		).showAfter("toolbox"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_komatsupc210-10m0",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("mmt_calmingminershelmet", 1),
						new Ingredient("toolbox", 1),
				}
		).showAfter("mmt_calmingminershelmet"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_arcticadventurersequipment",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("mmt_arcticexplorersequipment", 1),
						new Ingredient("ancientrelics", 1),
						new Ingredient("lifependant", 1)
				}
		).showAfter("mmt_arcticexplorersequipment"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_odinsbalancedfrostfiresoul",
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
				"mmt_necromancersbrooch",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("hysteriatablet", 1),
						new Ingredient("scryingmirror", 1),
				}
		).showAfter("hysteriatablet"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_gamblersblessing",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("luckycape", 1),
						new Ingredient("fuzzydice", 1),
				}
		).showAfter("balancedfrostfirefoci"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_fylgjaamulet",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("scryingcards", 1),
						new Ingredient("nightmaretalisman", 1),
						new Ingredient("spellstone", 3),
				}
		).showAfter("scryingcards"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_hexedfylgjaamulet",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("mmt_fylgjaamulet", 1),
						new Ingredient("forbiddenspellbook", 6)
				}
		).showAfter("mmt_fylgjaamulet"));

		// Singularities
		Recipes.registerModRecipe(new Recipe(
				"mmt_woodsingularity",
				1,
				RecipeTechRegistry.NONE,
				new Ingredient[]{
						new Ingredient("anylog", 111),
				}
		).showAfter("woodboat"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_coppersingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("copperbar", 111),
						new Ingredient("mmt_woodsingularity", 1),
				}
		).showAfter("copperbow"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_ironsingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("ironbar", 111),
						new Ingredient("mmt_coppersingularity", 1),
				}
		).showAfter("ironbow"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_goldsingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("goldbar", 111),
						new Ingredient("mmt_ironsingularity", 1),
				}
		).showAfter("goldbow"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_frostsingularity",
				1,
				RecipeTechRegistry.IRON_ANVIL,
				new Ingredient[]{
						new Ingredient("frostshard", 111),
						new Ingredient("mmt_goldsingularity", 1),
				}
		).showAfter("froststaff"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_demonicsingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("demonicbar", 111),
						new Ingredient("mmt_frostsingularity", 1),
				}
		).showAfter("demonicbow"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_voidsingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("voidshard", 111),
						new Ingredient("mmt_demonicsingularity", 1),
				}
		).showAfter("demonicboots"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_quartzsingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("quartz", 111),
						new Ingredient("mmt_voidsingularity", 1),
				}
		).showAfter("quartzstaff"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_ivysingularity",
				1,
				RecipeTechRegistry.DEMONIC,
				new Ingredient[]{
						new Ingredient("ivybar", 111),
						new Ingredient("mmt_quartzsingularity", 1),
				}
		).showAfter("boulderstaff"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_tungstensingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("tungstenbar", 111),
						new Ingredient("mmt_ivysingularity", 1),
				}
		).showAfter("tungstenbow"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_obsidiansingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("obsidian", 111),
						new Ingredient("mmt_tungstensingularity", 1),
				}
		).showAfter("cookingstation"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_shadowsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("ectoplasm", 111),
						new Ingredient("bone", 111),
						new Ingredient("mmt_obsidiansingularity", 1),
				}
		).showAfter("tungstenboots"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_glacialsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("glacialbar", 111),
						new Ingredient("mmt_shadowsingularity", 1),
				}
		).showAfter("glacialbow"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_myceliumsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("myceliumbar", 111),
						new Ingredient("mmt_glacialsingularity", 1),
				}
		).showAfter("myceliumshovel"));

		Recipes.registerModRecipe(new Recipe(
				"mmt_ancientsingularity",
				1,
				RecipeTechRegistry.ADVANCED_WORKSTATION,
				new Ingredient[]{
						new Ingredient("ancientfossilbar", 111),
						new Ingredient("mmt_myceliumsingularity", 1),
				}
		).showAfter("ancientdredgingstaff"));
	}
}
