package com.jubiman.mmt.patch;

import com.jubiman.mmt.MoreMergedTrinkets;
import necesse.engine.localization.Localization;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.sound.SoundEffect;
import necesse.engine.sound.SoundManager;
import necesse.engine.state.MainGame;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.GameResources;
import necesse.gfx.camera.GameCamera;
import necesse.gfx.gameFont.FontOptions;
import necesse.level.maps.hudManager.floatText.UniqueFloatText;
import net.bytebuddy.asm.Advice;

import java.awt.Color;

@ModMethodPatch(target = PlayerMob.class, name = "tickControls", arguments = {MainGame.class, boolean.class, GameCamera.class})
public class PlayerControlPatch {
    public static boolean isToggled = false; // apparently this is inverted but i cba to fix it everywhere so i just change where we reassign it

    @Advice.OnMethodExit
    static void onTickControls(@Advice.This PlayerMob playerMob, @Advice.Argument(0) MainGame mainGame, @Advice.Argument(1) boolean isGameTick, @Advice.Argument(2) GameCamera gameCamera) {
        if (MoreMergedTrinkets.TOGGLE_MMT_BUFFS.isPressed()) {
            Color color = isToggled ? new Color(100, 200, 100) : new Color(200, 100, 100);
            ToggleFloatText text = new ToggleFloatText(playerMob.getX(), playerMob.getY() - 20, Localization.translate("misc", isToggled ? "mmt_buffson" : "mmt_buffsoff"), (new FontOptions(16)).outline().color(color), "mmt_toggle_buffs");
            text.riseTime = 500;
            text.fadeTime = 500;
            text.expandTime = 50;
            playerMob.getLevel().hudManager.addElement(text);
            SoundManager.playSound(GameResources.tick, SoundEffect.ui());
            isToggled = !isToggled;
        }
    }

    /**
     * This class is needed because we cannot create local classes/lambdas in ByteBuddy advice methods
     */
    public static class ToggleFloatText extends UniqueFloatText {
        private final int x; // needed cuz they are private and getX calls getAnchorX
        private final int y; // needed cuz they are private and getY calls getAnchorY
        // this all results in a stack overflow
        
        public ToggleFloatText(int x, int y, String text, FontOptions fontOptions, String id) {
            super(x, y, text, fontOptions, id);
            this.x = x;
            this.y = y;
        }

        public int getAnchorX() {
            return x;
        }

        public int getAnchorY() {
            return y;
        }
    }
}
