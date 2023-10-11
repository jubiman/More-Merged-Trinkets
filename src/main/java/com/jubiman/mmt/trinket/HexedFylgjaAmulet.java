package com.jubiman.mmt.trinket;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class HexedFylgjaAmulet extends TrinketItem {
	public HexedFylgjaAmulet() {
		super(Rarity.UNIQUE, 6666);
		addDisables("mmt_fylgjaamulet", "forbiddenspellbook");
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{(TrinketBuff) BuffRegistry.getBuff("mmt_hexedfylgjaamulet")};
	}
}
