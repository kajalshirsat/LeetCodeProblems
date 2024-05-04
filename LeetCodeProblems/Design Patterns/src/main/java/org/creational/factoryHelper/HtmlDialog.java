package org.creational.factoryHelper;

import org.creational.FactoryDialog;

public class HtmlDialog extends FactoryDialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
