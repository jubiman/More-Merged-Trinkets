package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.Mob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.Buff;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.OutOfCombatBuff;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.entity.particle.Particle;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.level.gameTile.GameTile;
import necesse.level.gameTile.LiquidTile;

import java.awt.*;
import java.awt.geom.Point2D;

public class ArcticAdventurersEquipmentBuff extends OutOfCombatBuff {

	public void tickEffect(ActiveBuff buff, Mob owner) {
		((ArcticExplorersEquipmentBuff) BuffRegistry.getBuff("mmt_arcticexplorersequipment")).tickEffect(buff, owner);
	}

	@Override
	protected void updateActive(ActiveBuff activeBuff, boolean b) {
		activeBuff.setModifier(BuffModifiers.DASH_STACKS, 2);
		activeBuff.setModifier(BuffModifiers.DASH_COOLDOWN, -.5f);
		activeBuff.setModifier(BuffModifiers.COMBAT_REGEN_FLAT, 2.5f);
		((ArcticExplorersEquipmentBuff) BuffRegistry.getBuff("mmt_arcticexplorersequipment")).updateActive(activeBuff, b);
		//ArcticExplorersEquipmentBuff.buffs(activeBuff, b);
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticadventurersequipment1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticadventurersequipment2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticadventurersequipment3"));
		ArcticExplorersEquipmentBuff.tooltips(tooltips);
		return tooltips;
	}
}
