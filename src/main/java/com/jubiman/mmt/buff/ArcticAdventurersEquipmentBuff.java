package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;

public class ArcticAdventurersEquipmentBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.DASH_STACKS, 2);
		activeBuff.setModifier(BuffModifiers.DASH_COOLDOWN, -.5f);
		activeBuff.setModifier(BuffModifiers.COMBAT_REGEN_FLAT, 2.5f);
		//CalmingMinersEquipmentBuff.buffs(activeBuff);
		ArcticExplorersEquipmentBuff.buffs(activeBuff);
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips.add(Localization.translate("itemtooltip", "arcticadventurersequipment1"));
		tooltips.add(Localization.translate("itemtooltip", "arcticadventurersequipment2"));
		tooltips.add(Localization.translate("itemtooltip", "arcticadventurersequipment3"));
		ArcticExplorersEquipmentBuff.tooltips(tooltips);
		//CalmingMinersEquipmentBuff.tooltips(tooltips);
		return tooltips;
	}
}
