package com.jubiman.mmt.buff;

import necesse.engine.localization.Localization;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.MobBeforeHitEvent;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.lootItem.LootItem;

import java.util.Objects;

public class GamblersBlessingBuff extends TrinketBuff {
	@Override
	public void init(ActiveBuff activeBuff) {
		activeBuff.setModifier(BuffModifiers.CRIT_CHANCE, 0.50f);
	}

	@Override
	public void onBeforeAttacked(ActiveBuff buff, MobBeforeHitEvent hitEvent) {
		super.onBeforeAttacked(buff, hitEvent);
		if (!hitEvent.isPrevented()) {
			if (GameRandom.globalRandom.nextFloat() < 0.01f)
				hitEvent.damage = hitEvent.damage.modFinalMultiplier(7);
			LootItemInterface lastItem = hitEvent.target.getLootTable().items.size() > 0 ? hitEvent.target.getLootTable().items.get(hitEvent.target.getLootTable().items.size() - 1) : null;
			if (lastItem == null) return;
			if (!(lastItem instanceof LootItem) || !Objects.equals(((LootItem) lastItem).itemStringID, "coin"))
				hitEvent.target.getLootTable().items.add(new LootItem("coin", GameRandom.globalRandom.nextInt(7)));
		}
	}

	@Override
	public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
		ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
		tooltips.add(Localization.translate("itemtooltip", "mmt_gamblersblessing1"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_gamblersblessing2"));
		tooltips.add(Localization.translate("itemtooltip", "mmt_gamblersblessing3"));
		return tooltips;
	}
}
