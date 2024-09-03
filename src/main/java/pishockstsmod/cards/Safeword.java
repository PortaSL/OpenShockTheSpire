package pishockstsmod.cards;

import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.actions.common.DamageAction;
import com.megacrit.cardcrawl.actions.common.RemoveSpecificPowerAction;
import com.megacrit.cardcrawl.actions.unique.BlockPerNonAttackAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import pishockstsmod.powers.PiShockAlter;
import pishockstsmod.util.CardStats;

public class Safeword extends BaseCard {

    public static final String ID = makeID("Safeword"); //makeID adds the mod ID, so the final ID will be something like "modID:MyCard"

    private static final CardStats info = new CardStats(
            CardColor.COLORLESS, //The card color. If you're making your own character, it'll look something like this. Otherwise, it'll be CardColor.RED or similar for a basegame character color.
            CardType.SKILL, //The type. ATTACK/SKILL/POWER/CURSE/STATUS
            CardRarity.COMMON, //Rarity. BASIC is for starting cards, then there's COMMON/UNCOMMON/RARE, and then SPECIAL and CURSE. SPECIAL is for cards you only get from events. Curse is for curses, except for special curses like Curse of the Bell and Necronomicurse.
            CardTarget.SELF, //The target. Single target is ENEMY, all enemies is ALL_ENEMY. Look at cards similar to what you want to see what to use.
            0 //The card's base cost. -1 is X cost, -2 is no cost for unplayable cards like curses, or Reflex.
    );

    public Safeword() {
        super(ID, info); //Pass the required information to the BaseCard constructor.

        setSelfRetain(true);
        setMagic(0,2);
        setExhaust(true);
    }

    @Override
    public void use(AbstractPlayer abstractPlayer, AbstractMonster abstractMonster) {
        addToTop(new RemoveSpecificPowerAction(abstractPlayer, abstractPlayer, "pishockthespire:PiShockAlter"));
        addToBot(new ApplyPowerAction(abstractPlayer, abstractPlayer, new PiShockAlter(abstractPlayer, magicNumber)));
    }
}
