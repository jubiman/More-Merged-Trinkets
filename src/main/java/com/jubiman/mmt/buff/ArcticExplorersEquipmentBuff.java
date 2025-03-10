package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.Mob;
import necesse.entity.mobs.MobBeforeHitEvent;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.OutOfCombatBuff;
import necesse.entity.particle.Particle;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;
import necesse.level.gameTile.GameTile;
import necesse.level.gameTile.LiquidTile;

import java.awt.Color;
import java.awt.geom.Point2D;

public class ArcticExplorersEquipmentBuff extends OutOfCombatBuff {
	public static void tooltips(ListGameTooltips tooltips) {
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticexplorersequipment1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticexplorersequipment2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticexplorersequipment3"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticexplorersequipment4"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticexplorersequipment5"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticexplorersequipment6"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticexplorersequipment7"));
	}

	@Override
	public void tickEffect(ActiveBuff buff, Mob owner) {
		if (isActive(buff) && (owner.dx != 0.0F || owner.dy != 0.0F)) {
			Color color;
			Point2D.Float pos;
			if (owner.inLiquid()) {
				GameTile tile = owner.getLevel().getTile(owner.getX() / 32, owner.getY() / 32);
				if (tile.isLiquid) {
					color = ((LiquidTile) tile).getLiquidColor(owner.getLevel(), owner.getX() / 32, owner.getY() / 32).brighter();
				} else {
					color = new Color(89, 139, 224);
				}
			} else {
				color = new Color(65, 30, 109);
			}
			boolean next = buff.getGndData().getBoolean("pAlt");
			buff.getGndData().setBoolean("pAlt", !next);
			if (owner.getDir() == 0 || owner.getDir() == 2) {
				pos = new Point2D.Float(owner.x + (next ? -4 : 4), owner.y);
			} else {
				pos = new Point2D.Float(owner.x, owner.y + (next ? -4 : 4));
			}
			(owner.getLevel()).entityManager
					.addParticle(pos.x + (float) (GameRandom.globalRandom.nextGaussian() * 2.0D), pos.y + (float) (GameRandom.globalRandom.nextGaussian() * 2.0D), Particle.GType.IMPORTANT_COSMETIC)
					.color(color)
					.sizeFades(10, 12)
					.movesConstant(owner.dx / 10.0F, owner.dy / 10.0F)
					.lifeTime(300)
					.height(0.0F);
		}
	}

	@Override
	protected void updateActive(ActiveBuff activeBuff, boolean active) {
		activeBuff.setModifier(BuffModifiers.SPEED, 0.35f);
		activeBuff.setModifier(BuffModifiers.ATTACK_SPEED, 0.10f);
		activeBuff.setModifier(BuffModifiers.KNOCKBACK_INCOMING_MOD, 0f);
		activeBuff.setMinModifier(BuffModifiers.FRICTION, 1.0f);
		activeBuff.setModifier(BuffModifiers.TRAVEL_DISTANCE, 1);
		activeBuff.setModifier(BuffModifiers.BIOME_VIEW_DISTANCE, 1);
		if (active) {
			activeBuff.setModifier(BuffModifiers.SPEED_FLAT, 5.0F);
			activeBuff.setModifier(BuffModifiers.SWIM_SPEED, 1.0F);
		}
	}

	@Override
	public void onBeforeAttacked(ActiveBuff buff, MobBeforeHitEvent event) {
		super.onBeforeAttacked(buff, event);
		if (!event.isPrevented())
			event.target.buffManager.addBuff(new ActiveBuff(BuffRegistry.Debuffs.CHILLED, event.target, 2.0F, event.attacker), event.target.getLevel().isServer());

	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips(tooltips);
		return tooltips;
	}
}
