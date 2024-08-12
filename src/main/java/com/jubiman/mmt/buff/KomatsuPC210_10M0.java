package com.jubiman.mmt.buff;

import com.jubiman.mmt.MoreMergedTrinkets;
import com.jubiman.mmt.patch.PlayerControlPatch;
import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.ToggleActiveBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class KomatsuPC210_10M0 extends ToggleActiveBuff {
	public static void buffs(ActiveBuff activeBuff, boolean active) {
		activeBuff.setModifier(BuffModifiers.TOOL_DAMAGE, 1f);
		activeBuff.setModifier(BuffModifiers.MINING_SPEED, .75f);
		activeBuff.setModifier(BuffModifiers.MINING_RANGE, 2f);
		activeBuff.setModifier(BuffModifiers.BUILD_RANGE, 2f);
		activeBuff.setModifier(BuffModifiers.BUILDING_SPEED, .75f);
		activeBuff.setModifier(BuffModifiers.ITEM_PICKUP_RANGE, 7f);
		activeBuff.setModifier(BuffModifiers.MOB_SPAWN_RATE, active ? -.4f : 0f);
	}

	public static void tooltips(ListGameTooltips tooltips) {
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingminersequipment1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingminersequipment2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingminersequipment3"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingminersequipment4"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingminersequipment5"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingminersequipment6"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingminersequipment7"));
        tooltips.add(Localization.translate("ui", "hotkeytip", "hotkey", "[input=" + MoreMergedTrinkets.TOGGLE_MMT_BUFFS.id + "]"));
	}

	@Override
	protected void updateActive(ActiveBuff activeBuff, boolean b) {
		buffs(activeBuff, b);
	}

	@Override
	protected boolean isNextActive(ActiveBuff activeBuff) { // this method should probably be called shouldToggleActive
        return PlayerControlPatch.isToggled;
    }

	@Override
	public void init(ActiveBuff activeBuff, BuffEventSubscriber buffEventSubscriber) {
        buffs(activeBuff, !PlayerControlPatch.isToggled);
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips(tooltips);
		return tooltips;
	}
}
