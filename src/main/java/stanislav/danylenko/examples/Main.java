package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.strategy.MyContext;
import stanislav.danylenko.examples.patterns.behavior.strategy.impl.AwsStrategyImpl;
import stanislav.danylenko.examples.patterns.behavior.strategy.impl.K8sStrategyImpl;
import stanislav.danylenko.examples.patterns.behavior.strategy.obj.MyAction;
import stanislav.danylenko.examples.patterns.behavior.strategy.obj.MyType;

@Slf4j
public class Main {

    public static void main(String[] args) {
        MyAction action = new MyAction("asdasd", MyType.K8S);

        MyContext context = new MyContext(new AwsStrategyImpl(), new K8sStrategyImpl());
        context.process(action);
    }

}
