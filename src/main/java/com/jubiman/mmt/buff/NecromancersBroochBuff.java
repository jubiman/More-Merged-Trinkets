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

public class NecromancersBroochBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
		activeBuff.setModifier(BuffModifiers.MAX_SUMMONS, 3);
		activeBuff.setModifier(BuffModifiers.SUMMONS_SPEED, 0.77f);
		activeBuff.setModifier(BuffModifiers.SUMMON_DAMAGE, 0.77f);
		activeBuff.setModifier(BuffModifiers.SUMMONS_TARGET_RANGE, 0.77f);
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips.add(Localization.translate("itemtooltip", "mmt_necromancershield1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_necromancershield2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_necromancershield3"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_necromancershield4"));
		return tooltips;
	}
}
