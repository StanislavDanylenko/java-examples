package stanislav.danylenko.examples.patterns.behavior.strategy.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.strategy.MyStrategy;
import stanislav.danylenko.examples.patterns.behavior.strategy.obj.MyAction;

@Slf4j
public class K8sStrategyImpl implements MyStrategy {

    @Override
    public void process(MyAction myAction) {
        log.info("Do something: {}", myAction.action());
    }

}
