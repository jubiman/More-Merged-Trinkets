package com.jubiman.mmt.buff;

import necesse.engine.GameLog;
import necesse.engine.localization.Localization;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.MobHitEvent;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;

public class GamblersBlessingBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.CRIT_CHANCE, 0.50f);
	}

	public void onAttacked(ActiveBuff buff, MobHitEvent hitEvent) {
		super.onAttacked(buff, hitEvent);
		if (!hitEvent.isPrevented())
			if (GameRandom.globalRandom.nextFloat() < 0.01f)
				hitEvent.modifiedDamage *= 7;
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips.add(Localization.translate("itemtooltip", "gamblersblessing1"));
		tooltips.add(Localization.translate("itemtooltip", "gamblersblessing2"));
		return tooltips;
	}
}
