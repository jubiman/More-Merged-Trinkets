package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;

public class CalmingMiningHelmetBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.TOOL_DAMAGE, 1f);
		activeBuff.setModifier(BuffModifiers.MINING_SPEED, .75f);
		activeBuff.setModifier(BuffModifiers.MINING_RANGE, -2f);
		activeBuff.setModifier(BuffModifiers.MOB_SPAWN_RATE, 0.4f);
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips.add(Localization.translate("itemtooltip", "calmingmininghelmet1"));
		tooltips.add(Localization.translate("itemtooltip", "calmingmininghelmet2"));
		tooltips.add(Localization.translate("itemtooltip", "calmingmininghelmet3"));
		tooltips.add(Localization.translate("itemtooltip", "calmingmininghelmet4"));
		return tooltips;
	}
}
