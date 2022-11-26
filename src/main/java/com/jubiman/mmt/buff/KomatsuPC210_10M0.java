package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;

public class KomatsuPC210_10M0 extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		buffs(activeBuff);
	}

	public static void buffs(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.TOOL_DAMAGE, 1f);
		activeBuff.setModifier(BuffModifiers.MINING_SPEED, .75f);
		activeBuff.setModifier(BuffModifiers.MINING_RANGE, 2f);
		activeBuff.setModifier(BuffModifiers.BUILD_RANGE, 2f);
		activeBuff.setModifier(BuffModifiers.BUILDING_SPEED, .75f);
		activeBuff.setModifier(BuffModifiers.ITEM_PICKUP_RANGE, 7f);
		activeBuff.setModifier(BuffModifiers.MOB_SPAWN_RATE, .4f);
	}

	public static void tooltips(ListGameTooltips tooltips) {
		tooltips.add(Localization.translate("itemtooltip", "calmingminersequipment1"));
		tooltips.add(Localization.translate("itemtooltip", "calmingminersequipment2"));
		tooltips.add(Localization.translate("itemtooltip", "calmingminersequipment3"));
		tooltips.add(Localization.translate("itemtooltip", "calmingminersequipment4"));
		tooltips.add(Localization.translate("itemtooltip", "calmingminersequipment5"));
		tooltips.add(Localization.translate("itemtooltip", "calmingminersequipment6"));
		tooltips.add(Localization.translate("itemtooltip", "calmingminersequipment7"));
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips(tooltips);
		return tooltips;
	}
}
