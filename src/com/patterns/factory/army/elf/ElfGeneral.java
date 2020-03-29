package com.patterns.factory.army.elf;

import com.patterns.factory.abstr.army.General;

public class ElfGeneral implements General {
    @Override
    public void command() {
        System.out.println("Elf general listens to his commander and passes an order to his squad privates");
    }
}
