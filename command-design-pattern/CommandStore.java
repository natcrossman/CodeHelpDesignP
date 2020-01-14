import java.util.*;

public class CommandStore {
	
	private static ArrayList<Command> _commandList;
	private static CommandStore _theStore = new CommandStore();
	private static int _lastCommandExecuted;
	private static int _commandListEnd;
	
	private CommandStore() {
		_commandList = new ArrayList<Command>();
		_lastCommandExecuted = -1;
		_commandListEnd = -1;
	}
	
	public static CommandStore getInstance() {
		return _theStore;
	}
	
	public void runCommand(Command c) {
		c.execute();
		_commandList.add(c);
		_lastCommandExecuted++;
		_commandListEnd = _lastCommandExecuted;
	}
	
	public void undo() {
		_commandList.get(_lastCommandExecuted--).unexecute();
	}
	
	public boolean redo() {
		if(_lastCommandExecuted < _commandListEnd) {
			_commandList.get(++_lastCommandExecuted).execute();
			return true;
		}
		else return false;
	}

}
