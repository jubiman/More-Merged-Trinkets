package com.jubiman.mmt.trinket;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class ArcticExplorersEquipment extends TrinketItem {
	public ArcticExplorersEquipment() {
		super(Rarity.EPIC, 1000);
		addDisabledBy("mmt_arcticadventurersequipment");
		addDisables("spikedbatboots");
		addDisables("explorersatchel");
		addDisables("explorercloak");
		addDisables("demonclaw");
		addDisables("polarclaw");
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{
				(TrinketBuff) BuffRegistry.getBuff("mmt_arcticexplorersequipment"),
				(TrinketBuff) BuffRegistry.getBuff("shinebelttrinket"),
		};
	}
}
