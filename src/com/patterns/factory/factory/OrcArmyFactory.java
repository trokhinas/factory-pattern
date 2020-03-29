package com.patterns.factory.factory;

import com.patterns.factory.abstr.army.Commander;
import com.patterns.factory.abstr.army.General;
import com.patterns.factory.abstr.army.Private;
import com.patterns.factory.abstr.factory.ArmyFactory;
import com.patterns.factory.army.orc.OrcCommander;
import com.patterns.factory.army.orc.OrcGeneral;
import com.patterns.factory.army.orc.OrcPrivate;

/**
 * Конкретная реализация орочьей фабрики
 */
public class OrcArmyFactory implements ArmyFactory {
    @Override
    public Commander makeCommander() {
        return new OrcCommander();
    }

    @Override
    public General makeGeneral() {
        return new OrcGeneral();
    }

    @Override
    public Private makePrivate() {
        return new OrcPrivate();
    }
}
