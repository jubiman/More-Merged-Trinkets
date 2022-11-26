package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;

public class NecromancersBroochBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.MAX_SUMMONS, 3);
		activeBuff.setModifier(BuffModifiers.SUMMONS_SPEED, 0.77f);
		activeBuff.setModifier(BuffModifiers.SUMMON_DAMAGE, 0.77f);
		activeBuff.setModifier(BuffModifiers.SUMMONS_TARGET_RANGE, 0.77f);
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips.add(Localization.translate("itemtooltip", "necromancershield1"));
		tooltips.add(Localization.translate("itemtooltip", "necromancershield2"));
		tooltips.add(Localization.translate("itemtooltip", "necromancershield3"));
		tooltips.add(Localization.translate("itemtooltip", "necromancershield4"));
		return tooltips;
	}
}
