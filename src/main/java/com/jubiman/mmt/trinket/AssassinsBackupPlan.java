package com.jubiman.mmt.trinket;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;
import necesse.inventory.lootTable.presets.TrinketsLootTable;

public class AssassinsBackupPlan extends TrinketItem {
	public AssassinsBackupPlan() {
		super(Rarity.LEGENDARY, 1000, TrinketsLootTable.trinkets);
		addDisables("ammobox", "magicalquiver", "assassinscowl", "bonehilt", "ninjasmark", "foolsgambit");
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{(TrinketBuff) BuffRegistry.getBuff("mmt_assassinsbackupplan"),};
	}
}
