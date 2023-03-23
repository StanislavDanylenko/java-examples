package stanislav.danylenko.examples.patterns.behavior.command.impl;

import stanislav.danylenko.examples.patterns.behavior.command.TextCommand;
import stanislav.danylenko.examples.patterns.behavior.command.TextObject;

public class ReplaceCommand implements TextCommand {

    private final TextObject text;
    private final String replaceFrom;
    private final String replaceTo;

    public ReplaceCommand(TextObject text, String replaceFrom, String replaceTo) {
        this.text = text;
        this.replaceFrom = replaceFrom;
        this.replaceTo = replaceTo;
    }

    @Override
    public String execute() {
        return text.replace(replaceFrom, replaceTo);
    }

}
