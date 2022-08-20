public class ExitCommand extends Command {
    public static final String COMMAND_WORD = "bye";
    @Override
    public void execute(TaskList listOfTasks, FileStorage storage, Ui ui) {
        ui.printOutro();
        storage.writeToFile(listOfTasks.getList());
    }
}
