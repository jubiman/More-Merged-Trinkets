package com.jubiman.mmt.buff;

import necesse.engine.GameLog;
import necesse.engine.localization.Localization;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.MobHitEvent;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.entity.pickup.ItemPickupEntity;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.lootItem.LootItem;

import java.util.Arrays;
import java.util.Objects;

public class GamblersBlessingBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.CRIT_CHANCE, 0.50f);
	}

	public void onAttacked(ActiveBuff buff, MobHitEvent hitEvent) {
		super.onAttacked(buff, hitEvent);
		if (!hitEvent.isPrevented()) {
			if (GameRandom.globalRandom.nextFloat() < 0.01f)
				hitEvent.modifiedDamage *= 7;
			LootItemInterface lastItem = hitEvent.mob.getLootTable().items.size() > 0 ? hitEvent.mob.getLootTable().items.get(hitEvent.mob.getLootTable().items.size() - 1) : null;
			if (lastItem == null) return;
			if (!(lastItem instanceof LootItem) || !Objects.equals(((LootItem) lastItem).itemStringID, "coin"))
				hitEvent.mob.getLootTable().items.add(new LootItem("coin", GameRandom.globalRandom.nextInt(7)));
		}
	}

	public ListGameTooltips getTrinketTooltip() {
		ListGameTooltips tooltips = super.getTrinketTooltip();
		tooltips.add(Localization.translate("itemtooltip", "gamblersblessing1"));
		tooltips.add(Localization.translate("itemtooltip", "gamblersblessing2"));
		tooltips.add(Localization.translate("itemtooltip", "gamblersblessing3"));
		return tooltips;
	}
}
