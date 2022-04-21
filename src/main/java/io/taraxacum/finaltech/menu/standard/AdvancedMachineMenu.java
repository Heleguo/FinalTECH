package io.taraxacum.finaltech.menu.standard;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.taraxacum.finaltech.machine.AbstractMachine;
import io.taraxacum.finaltech.util.menu.Icon;

import javax.annotation.Nonnull;

/**
 * @author Final_ROOT
 */
public class AdvancedMachineMenu extends AbstractStandardMachineMenu {
    private static final int[] BORDER = new int[] {3, 4, 5, 12, 14, 21, 23, 30, 32, 39, 40, 41, 48, 49, 50};
    private static final int[] INPUT_BORDER = new int[] {2, 11, 20, 29, 38, 47};
    private static final int[] OUTPUT_BORDER = new int[] {6, 15, 24, 33, 42, 51};
    private static final int[] INPUT_SLOT = new int[] {0, 1, 9, 10, 18, 19, 27, 28, 36, 37, 45, 46};
    private static final int[] OUTPUT_SLOT = new int[] {7, 8, 16, 17, 25, 26, 34, 35, 43, 44, 52, 53};

    public static final int STATUS_SLOT = 22;
    public static final int MODULE_SLOT = 31;

    public AdvancedMachineMenu(@Nonnull AbstractMachine abstractMachine) {
        super(abstractMachine);
    }

    @Override
    protected int[] getBorder() {
        return BORDER;
    }

    @Override
    protected int[] getInputBorder() {
        return INPUT_BORDER;
    }

    @Override
    protected int[] getOutputBorder() {
        return OUTPUT_BORDER;
    }

    @Override
    public int[] getInputSlot() {
        return INPUT_SLOT;
    }

    @Override
    public int[] getOutputSlot() {
        return OUTPUT_SLOT;
    }

    @Override
    public void init() {
        super.init();
        this.addItem(STATUS_SLOT, Icon.QUANTITY_MODULE_ICON);
        this.addMenuClickHandler(STATUS_SLOT, ChestMenuUtils.getEmptyClickHandler());
    }
}
