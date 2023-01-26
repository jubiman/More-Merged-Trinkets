package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.Mob;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.OutOfCombatBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

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
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticadventurersequipment1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticadventurersequipment2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_arcticadventurersequipment3"));
		ArcticExplorersEquipmentBuff.tooltips(tooltips);
		return tooltips;
	}
}
