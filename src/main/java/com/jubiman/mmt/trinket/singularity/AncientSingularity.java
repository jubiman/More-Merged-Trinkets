package com.jubiman.mmt.trinket.singularity;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class AncientSingularity extends TrinketItem {
	public AncientSingularity() {
		super(Rarity.UNIQUE, 55);
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{(TrinketBuff) BuffRegistry.getBuff("mmt_ancientsingularity")};
	}
}
