package com.jubiman.mmt.buff.singularity;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;

public class ObsidianSingularityBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.ALL_DAMAGE, 0.35f);
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips.add(String.format(Localization.translate("itemtooltip", "mmt_singularity"), 35));
		return tooltips;
	}
}
