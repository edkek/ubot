package me.eddiep.ubot.module.impl.defaults;

import me.eddiep.ubot.module.ErrorNotifier;

public class DefaultErrorNotifier implements ErrorNotifier {
    @Override
    public void error(Throwable exception) {
        exception.printStackTrace();
    }

    @Override
    public void init() {

    }

    @Override
    public void dispose() {

    }
}
