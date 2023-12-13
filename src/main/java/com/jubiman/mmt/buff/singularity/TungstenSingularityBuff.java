package com.jubiman.mmt.buff.singularity;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class TungstenSingularityBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
		activeBuff.setModifier(BuffModifiers.ALL_DAMAGE, 0.30f);
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips.add(String.format(Localization.translate("itemtooltip", "mmt_singularity"), 30));
		return tooltips;
	}
}
