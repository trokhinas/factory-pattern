package com.patterns.factory.army.orc;

import com.patterns.factory.abstr.army.General;

public class OrcGeneral implements General {
    @Override
    public void command() {
        System.out.println("Orc general hearing the commander’s roar drives the privates to attack");
    }
}
