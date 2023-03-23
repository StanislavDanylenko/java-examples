package stanislav.danylenko.examples.patterns.behavior.strategy.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.strategy.MessageHandleStrategy;
import stanislav.danylenko.examples.patterns.behavior.strategy.obj.ActionMessage;

@Slf4j
public class K8sMessageHandleStrategy implements MessageHandleStrategy {

    @Override
    public void process(ActionMessage actionMessage) {
        log.info("Do something: {}", actionMessage.action());
    }

}
