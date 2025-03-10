package com.jubiman.mmt.trinket;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

/**
 * Meant as a tank item
 * */
public class DemonicAegis extends TrinketItem {

	public DemonicAegis() {
		super(Rarity.EPIC, 1000);
		addDisables("manica", "claygauntlet", "challengerspauldron", "clockworkheart");
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem inventoryItem) {
		return new TrinketBuff[]{
				(TrinketBuff) BuffRegistry.getBuff("mmt_demonicaegis"),
				(TrinketBuff) BuffRegistry.getBuff("challengerspauldrontrinket"),
				(TrinketBuff) BuffRegistry.getBuff("clockworkhearttrinket"),
		};
	}
}
