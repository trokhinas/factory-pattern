package com.patterns.factory.army.elf;

import com.patterns.factory.abstr.army.Commander;

public class ElfCommander implements Commander {
    @Override
    public void makeAnOrder() {
        System.out.println("Elf commander make an order to attack!");
    }
}
