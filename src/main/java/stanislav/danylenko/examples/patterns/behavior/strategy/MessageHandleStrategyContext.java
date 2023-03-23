package stanislav.danylenko.examples.patterns.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

import stanislav.danylenko.examples.patterns.behavior.strategy.obj.ActionMessage;
import stanislav.danylenko.examples.patterns.behavior.strategy.obj.MessageType;

public class MessageHandleStrategyContext {

    private final Map<MessageType, MessageHandleStrategy> strategies = new HashMap<>();

    public MessageHandleStrategyContext(MessageHandleStrategy awsStrategy, MessageHandleStrategy k8sStrategy) {
        strategies.put(MessageType.AWS, awsStrategy);
        strategies.put(MessageType.K8S, k8sStrategy);
    }

    public void process(ActionMessage actionMessage) { // action received for example from SQS
        MessageHandleStrategy messageHandleStrategy = strategies.get(actionMessage.messageType());
        messageHandleStrategy.process(actionMessage);
    }
}
