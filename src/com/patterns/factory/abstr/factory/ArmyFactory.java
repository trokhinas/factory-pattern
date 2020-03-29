package com.patterns.factory.abstr.factory;

import com.patterns.factory.abstr.army.Commander;
import com.patterns.factory.abstr.army.General;
import com.patterns.factory.abstr.army.Private;

/**
 * Интерфейс абстрактной фабрики
 */
public interface ArmyFactory {

    Commander makeCommander();

    General makeGeneral();

    Private makePrivate();
}
