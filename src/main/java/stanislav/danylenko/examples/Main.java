package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.command.TextCommand;
import stanislav.danylenko.examples.patterns.behavior.command.TextCommandExecutor;
import stanislav.danylenko.examples.patterns.behavior.command.TextObject;
import stanislav.danylenko.examples.patterns.behavior.command.impl.CleanCommand;
import stanislav.danylenko.examples.patterns.behavior.command.impl.ReplaceCommand;
import stanislav.danylenko.examples.patterns.behavior.command.impl.TextObjectImpl;

@Slf4j
public class Main {

    public static void main(String[] args) {
        TextObject textObject = new TextObjectImpl("blablabla");

        TextCommand textCommand1 = new CleanCommand(textObject, "a");
        TextCommand textCommand2 = new ReplaceCommand(textObject, "b", "c");

        TextCommandExecutor executor = new TextCommandExecutor();
        String res1 = executor.executeTextCommand(textCommand1);
        String res2 = executor.executeTextCommand(textCommand2);
        // anonymus
        String res3 = executor.executeTextCommand(() -> textObject.getClass() + "");
    }

}
