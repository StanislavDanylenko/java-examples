package stanislav.danylenko.examples;

import java.util.Iterator;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.command.TextCommand;
import stanislav.danylenko.examples.patterns.behavior.command.TextCommandExecutor;
import stanislav.danylenko.examples.patterns.behavior.command.TextObject;
import stanislav.danylenko.examples.patterns.behavior.command.impl.CleanCommand;
import stanislav.danylenko.examples.patterns.behavior.command.impl.ReplaceCommand;
import stanislav.danylenko.examples.patterns.behavior.command.impl.TextObjectImpl;
import stanislav.danylenko.examples.patterns.behavior.iterator.javaimpl.ReverseOrderList;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ReverseOrderList list = new ReverseOrderList();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator iterator = list.iterator();
        iterator.next();
        iterator.remove();
        iterator.remove();

        while (iterator.hasNext()) {
            log.info("Item: {}", iterator.next());
        }

    }
}
