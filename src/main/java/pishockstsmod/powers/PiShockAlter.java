package pishockstsmod.powers;

import com.megacrit.cardcrawl.actions.common.RemoveSpecificPowerAction;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.powers.AbstractPower;

import static pishockstsmod.PiShockMod.makeID;

public class PiShockAlter extends BasePower{

    public static final String POWER_ID = makeID("PiShockAlter");
    private static final AbstractPower.PowerType TYPE = PowerType.BUFF;
    private static final boolean TURN_BASED = false;

    public PiShockAlter(AbstractCreature owner, int amount) {
        super(POWER_ID, TYPE, TURN_BASED, owner, amount);
    }

    @Override
    public void updateDescription() {

        // Or description 1 based on magicnumber
        this.description = DESCRIPTIONS[0] + amount + DESCRIPTIONS[1];
    }

    @Override
    public void atStartOfTurn() {
        // Remove power.
        addToTop(new RemoveSpecificPowerAction(owner, owner, "pishockthespire:PiShockAlter"));
    }



}
