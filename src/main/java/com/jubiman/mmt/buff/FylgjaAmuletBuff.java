package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class FylgjaAmuletBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
		activeBuff.setModifier(BuffModifiers.COMBAT_MANA_REGEN, 6f);
		activeBuff.setModifier(BuffModifiers.MAX_MANA, 3f);
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips.add(Localization.translate("itemtooltip", "mmt_fylgjaamulet1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_fylgjaamulet2"));
		return tooltips;
	}
}
