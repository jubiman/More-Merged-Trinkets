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

public class CalmingMiningHelmetBuff extends ToggleActiveBuff {
    private void buffs(ActiveBuff activeBuff, boolean b) {
        activeBuff.setModifier(BuffModifiers.TOOL_DAMAGE, 1f);
        activeBuff.setModifier(BuffModifiers.MINING_SPEED, .75f);
        activeBuff.setModifier(BuffModifiers.MINING_RANGE, -2f);
        activeBuff.setModifier(BuffModifiers.MOB_SPAWN_RATE, b ? -0.4f : 0f);
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
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingmininghelmet1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingmininghelmet2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingmininghelmet3"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_calmingmininghelmet4"));
        tooltips.add(Localization.translate("ui", "hotkeytip", "hotkey", "[input=" + MoreMergedTrinkets.TOGGLE_MMT_BUFFS.id + "]"));
        return tooltips;
	}
}
