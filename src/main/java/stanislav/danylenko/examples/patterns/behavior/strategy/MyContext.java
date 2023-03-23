package stanislav.danylenko.examples.patterns.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

import stanislav.danylenko.examples.patterns.behavior.strategy.obj.MyAction;
import stanislav.danylenko.examples.patterns.behavior.strategy.obj.MyType;

public class MyContext {

    private final Map<MyType, MyStrategy> strategies = new HashMap<>();

    public MyContext(MyStrategy awsStrategy, MyStrategy k8sStrategy) {
        strategies.put(MyType.AWS, awsStrategy);
        strategies.put(MyType.K8S, k8sStrategy);
    }

    public void process(MyAction myAction) { // action received for example from SQS
        MyStrategy myStrategy = strategies.get(myAction.myType());
        myStrategy.process(myAction);
    }
}
