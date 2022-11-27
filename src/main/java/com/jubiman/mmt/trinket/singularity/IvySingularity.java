package com.jubiman.mmt.trinket.singularity;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class IvySingularity extends TrinketItem {
	public IvySingularity() {
		super(Rarity.RARE, 25);
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{(TrinketBuff) BuffRegistry.getBuff("ivysingularity")};
	}
}
