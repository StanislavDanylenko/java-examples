package stanislav.danylenko.examples;

import java.util.Iterator;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.iterator.javaimpl.ReverseOrderList;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ReverseOrderList<String> list = new ReverseOrderList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            log.info("Val: {}", next);
            if ("1".equals(next)) {
                iterator.remove();
            }
        }

        log.info("Size: {}", list.size());
        log.info("List: {}", list);
    }

}
