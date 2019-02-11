package seedu.addressbook.commands;

public class PrevCommand extends Command{

    public static final String COMMAND_WORD = "previous";
    public static final String MESSAGE_NO_PREV_COMMAND = "No previous command is present";

    @Override
    public CommandResult execute() {
         if (Command.secondPreviousCommand == null) {
             return new CommandResult(MESSAGE_NO_PREV_COMMAND);
         }
         return Command.secondPreviousCommand;
    }
}
