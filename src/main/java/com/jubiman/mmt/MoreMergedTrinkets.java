package com.jubiman.mmt;

import com.jubiman.mmt.buff.*;
import com.jubiman.mmt.buff.KomatsuPC210_10M0;
import com.jubiman.mmt.trinket.*;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
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

        // Register our items
        ItemRegistry.registerItem("assassinsbackupplan", new AssassinsBackupPlan(), 777, true);
        ItemRegistry.registerItem("arcticexplorersequipment", new ArcticExplorersEquipment(), 777, true);
        ItemRegistry.registerItem("arcticadventurersequipment", new ArcticAdventurersEquipment(), 7777, true);
        ItemRegistry.registerItem("odinsbalancedfrostfiresoul", new OdinsBalancedFrostFireSoul(), 7777, true);
        ItemRegistry.registerItem("necromancersbrooch", new NecromancersBrooch(), 7777, true);
        ItemRegistry.registerItem("calmingminershelmet", new CalmingMinersHelmet(), 777, true);
        ItemRegistry.registerItem("komatsupc210-10m0", new com.jubiman.mmt.trinket.KomatsuPC210_10M0(), 7777, true);
        ItemRegistry.registerItem("gamblersblessing", new GamblersBlessing(), 7777, true);

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
    }

}
