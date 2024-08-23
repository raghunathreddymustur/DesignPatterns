package com.company.mediator;

abstract class Component {
    protected DialogMediator mediator;

    public void setMediator(DialogMediator mediator) {
        this.mediator = mediator;
    }

    public void changed(String event) {
        if (mediator != null) {
            mediator.notify(this, event);
        }
    }
}
