package com.jubiman.mmt.trinket;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class KomatsuPC210_10M0 extends TrinketItem {
	public KomatsuPC210_10M0() {
		super(Rarity.LEGENDARY, 1000);
		addDisables("mmt_calmingminershelmet");
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{(TrinketBuff) BuffRegistry.getBuff("mmt_komatsupc210-10m0")};
	}
}
