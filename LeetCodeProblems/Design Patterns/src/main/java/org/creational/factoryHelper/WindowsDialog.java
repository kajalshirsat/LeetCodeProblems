package org.creational.factoryHelper;

import org.creational.FactoryDialog;

public class WindowsDialog extends FactoryDialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

