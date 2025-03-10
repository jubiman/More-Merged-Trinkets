package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class DemonicAegisBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
		activeBuff.setModifier(BuffModifiers.MAX_RESILIENCE_FLAT, 60);
		activeBuff.setModifier(BuffModifiers.RESILIENCE_GAIN, 0.5f);
		activeBuff.setModifier(BuffModifiers.RESILIENCE_DECAY, -0.75f);
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = new ListGameTooltips();
		tooltips.add(Localization.translate("itemtooltip", "mmt_demonicaegis1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_demonicaegis2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_demonicaegis3"));
		return tooltips;
	}
}
