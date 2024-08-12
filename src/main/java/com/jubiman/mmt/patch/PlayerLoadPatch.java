package com.jubiman.mmt.patch;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.save.LoadData;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import net.bytebuddy.asm.Advice;

@ModMethodPatch(target = PlayerMob.class, name = "applyLoadData", arguments = {LoadData.class})
public class PlayerLoadPatch {
    @Advice.OnMethodExit
    static void onApplyLoadData(@Advice.This PlayerMob playerMob, @Advice.Argument(0) LoadData loadData) {
        ActiveBuff buff = playerMob.buffManager.getBuff("mmt_komatsupc210-10m0");
        if (buff == null) {
            buff = playerMob.buffManager.getBuff("mmt_calmingminershelmet");
        }
        if (buff != null) {
            if (buff.getGndData().getBoolean("active")) {
                PlayerControlPatch.isToggled = true;
            }
        }
    }
}
