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

public class HexedFylgjaAmuletBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
		activeBuff.setModifier(BuffModifiers.COMBAT_MANA_REGEN, 66.66f);
		activeBuff.setModifier(BuffModifiers.MAX_MANA, 6.66f);
		activeBuff.setModifier(BuffModifiers.MAGIC_DAMAGE, 3.33f);
		activeBuff.setModifier(BuffModifiers.MANA_USAGE, 6.66f);
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips.add(Localization.translate("itemtooltip", "mmt_hexedfylgjaamulet1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_hexedfylgjaamulet2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_hexedfylgjaamulet3"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_hexedfylgjaamulet4"));
		return tooltips;
	}
}
