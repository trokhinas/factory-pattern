package com.patterns.factory.factory;

import com.patterns.factory.abstr.army.Commander;
import com.patterns.factory.abstr.army.General;
import com.patterns.factory.abstr.army.Private;
import com.patterns.factory.abstr.factory.ArmyFactory;
import com.patterns.factory.army.elf.ElfCommander;
import com.patterns.factory.army.elf.ElfGeneral;
import com.patterns.factory.army.elf.ElfPrivate;

/**
 * Конкретная реализация эльфской фабрики
 */
public class ElfArmyFactory implements ArmyFactory {
    @Override
    public Commander makeCommander() {
        return new ElfCommander();
    }

    @Override
    public General makeGeneral() {
        return new ElfGeneral();
    }

    @Override
    public Private makePrivate() {
        return new ElfPrivate();
    }
}
