package stanislav.danylenko.examples.patterns.behavior.strategy;

import stanislav.danylenko.examples.patterns.behavior.strategy.obj.ActionMessage;

public interface MessageHandleStrategy {

    void process(ActionMessage actionMessage);

}
