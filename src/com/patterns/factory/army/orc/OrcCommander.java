package com.patterns.factory.army.orc;

import com.patterns.factory.abstr.army.Commander;

public class OrcCommander implements Commander {
    @Override
    public void makeAnOrder() {
        System.out.println("Orc commander growls offensive order");
    }
}
