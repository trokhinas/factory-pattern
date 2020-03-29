package com.patterns.factory.army.elf;

import com.patterns.factory.abstr.army.Private;

public class ElfPrivate implements Private {
    @Override
    public void executeAnOrder() {
        System.out.print("Elf private execute order of his general");
    }
}
