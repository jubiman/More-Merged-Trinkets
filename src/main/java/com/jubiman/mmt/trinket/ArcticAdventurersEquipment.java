package com.jubiman.mmt.trinket;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class ArcticAdventurersEquipment extends TrinketItem {
	public ArcticAdventurersEquipment() {
		super(Rarity.LEGENDARY, 1000);
		addDisables("mmt_arcticexplorersequipment");
		addDisables("spikedbatboots");
		addDisables("explorersatchel");
		addDisables("explorercloak");
		addDisables("demonclaw");
		addDisables("polarclaw");
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{
				(TrinketBuff) BuffRegistry.getBuff("mmt_arcticadventurersequipment"),
				(TrinketBuff) BuffRegistry.getBuff("shinebelttrinket"),
		};
	}
}
