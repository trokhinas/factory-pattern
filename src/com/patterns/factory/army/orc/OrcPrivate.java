package com.patterns.factory.army.orc;

import com.patterns.factory.abstr.army.Private;

public class OrcPrivate implements Private {
    @Override
    public void executeAnOrder() {
        System.out.println("Orc private drags into the attack, driven by a general");
    }
}
