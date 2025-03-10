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

public class AssassinsBackupPlanBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
		activeBuff.setModifier(BuffModifiers.BULLET_USAGE, -0.75F);
		activeBuff.setModifier(BuffModifiers.ARROW_USAGE, -0.75F);
		activeBuff.setModifier(BuffModifiers.PROJECTILE_VELOCITY, 0.5f);
		activeBuff.setModifier(BuffModifiers.CRIT_CHANCE, 0.25f);
		activeBuff.setModifier(BuffModifiers.ARMOR_PEN_FLAT, 25);
		activeBuff.setModifier(BuffModifiers.ALL_DAMAGE, 0.25f);

	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips.add(Localization.translate("itemtooltip", "mmt_assassinsbackupplan1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_assassinsbackupplan2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_assassinsbackupplan3"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_assassinsbackupplan4"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_assassinsbackupplan5"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_assassinsbackupplan6"));
		return tooltips;
	}
}
