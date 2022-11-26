package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.Mob;
import necesse.entity.mobs.MobHitEvent;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.OutOfCombatBuff;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.entity.particle.Particle;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.level.gameTile.GameTile;
import necesse.level.gameTile.LiquidTile;

import java.awt.*;
import java.awt.geom.Point2D;

public class ArcticExplorersEquipmentBuff extends OutOfCombatBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		buffs(activeBuff);
	}
	
	public static void buffs(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.SPEED, 0.35f);
		activeBuff.setModifier(BuffModifiers.ATTACK_SPEED, 0.10f);
		activeBuff.setModifier(BuffModifiers.KNOCKBACK_INCOMING, 0f);
		activeBuff.setModifier(BuffModifiers.EMITS_LIGHT, true);
		activeBuff.setModifier(BuffModifiers.FRICTION, 0f);
		activeBuff.setModifier(BuffModifiers.TRAVEL_DISTANCE, 1);
		activeBuff.setModifier(BuffModifiers.BIOME_VIEW_DISTANCE, 1);
	}
	
	public static void tooltips(ListGameTooltips tooltips) {
		tooltips.add(Localization.translate("itemtooltip", "arcticexplorersequipment1"));
		tooltips.add(Localization.translate("itemtooltip", "arcticexplorersequipment2"));
		tooltips.add(Localization.translate("itemtooltip", "arcticexplorersequipment3"));
		tooltips.add(Localization.translate("itemtooltip", "arcticexplorersequipment4"));
		tooltips.add(Localization.translate("itemtooltip", "arcticexplorersequipment5"));
		tooltips.add(Localization.translate("itemtooltip", "arcticexplorersequipment6"));
		tooltips.add(Localization.translate("itemtooltip", "arcticexplorersequipment7"));
	}

	public void tickEffect(ActiveBuff buff, Mob owner) {
		if (isActive(buff) && (owner.dx != 0.0F || owner.dy != 0.0F)) {
			Color color;
			Point2D.Float pos;
			if (owner.inLiquid()) {
				GameTile tile = owner.getLevel().getTile(owner.getX() / 32, owner.getY() / 32);
				if (tile.isLiquid) {
					color = ((LiquidTile)tile).getLiquidColor(owner.getLevel(), owner.getX() / 32, owner.getY() / 32).brighter();
				} else {
					color = new Color(89, 139, 224);
				}
			} else {
				color = new Color(65, 30, 109);
			}
			boolean next = buff.getGndData().getBoolean("pAlt");
			buff.getGndData().setBoolean("pAlt", !next);
			if (owner.dir == 0 || owner.dir == 2) {
				pos = new Point2D.Float(owner.x + (next ? -4 : 4), owner.y);
			} else {
				pos = new Point2D.Float(owner.x, owner.y + (next ? -4 : 4));
			}
			(owner.getLevel()).entityManager
					.addParticle(pos.x + (float)(GameRandom.globalRandom.nextGaussian() * 2.0D), pos.y + (float)(GameRandom.globalRandom.nextGaussian() * 2.0D), Particle.GType.IMPORTANT_COSMETIC)
					.color(color)
					.sizeFades(10, 12)
					.movesConstant(owner.dx / 10.0F, owner.dy / 10.0F)
					.lifeTime(300)
					.height(0.0F);
		}
	}

	protected void updateActive(ActiveBuff buff, boolean active) {
		buff.setModifier(BuffModifiers.TRAVEL_DISTANCE, 1);
		buff.setModifier(BuffModifiers.BIOME_VIEW_DISTANCE, 1);
		if (active) {
			buff.setModifier(BuffModifiers.SPEED_FLAT, 5.0F);
			buff.setModifier(BuffModifiers.SPEED, 0.15F);
			buff.setModifier(BuffModifiers.SWIM_SPEED, 1.0F);
		}
	}

	public void onAttacked(ActiveBuff buff, MobHitEvent hitEvent) {
		super.onAttacked(buff, hitEvent);
		if (!hitEvent.isPrevented())
			hitEvent.mob.buffManager.addBuff(new ActiveBuff(BuffRegistry.Debuffs.CHILLED, hitEvent.mob, 2.0F, hitEvent.attacker), hitEvent.mob.getLevel().isServerLevel());
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips(tooltips);
		return tooltips;
	}
}
