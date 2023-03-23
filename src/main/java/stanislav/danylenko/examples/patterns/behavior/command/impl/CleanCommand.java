package stanislav.danylenko.examples.patterns.behavior.command.impl;

import stanislav.danylenko.examples.patterns.behavior.command.TextCommand;
import stanislav.danylenko.examples.patterns.behavior.command.TextObject;

public class CleanCommand implements TextCommand {

    private final TextObject text;
    private final String replace;

    public CleanCommand(TextObject text, String replace) {
        this.text = text;
        this.replace = replace;
    }

    @Override
    public String execute() {
        return text.clean(replace);
    }
}
