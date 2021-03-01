package chapter6_Command.remote;

import chapter6_Command.simpleremote.Command;
import java.util.ArrayList;
import java.util.List;

public class RemoteControlWithUndo {

  private final int COMMAND_MAX_NUM;
  List<Command> onCommands;
  List<Command> offCommands;
  Command undoCommand;

  public RemoteControlWithUndo(int commandMaxNum) {
    COMMAND_MAX_NUM = commandMaxNum;
    onCommands = new ArrayList<>();
    offCommands = new ArrayList<>();

    for (int i = 0; i < COMMAND_MAX_NUM; i++) {
      onCommands.add(new NoCommand());
      offCommands.add(new NoCommand());
    }
    undoCommand = new NoCommand();
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands.set(slot, onCommand);
    offCommands.set(slot, offCommand);
  }

  public void pushOnButton(int slot) {
    onCommands.get(slot).execute();
    undoCommand = onCommands.get(slot);
  }

  public void pushOffButton(int slot) {
    offCommands.get(slot).execute();
    undoCommand = offCommands.get(slot);
  }

  public void pushUndoButton() {
    undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("\n-------- Remote Control --------\n");
    for (int i = 0; i < COMMAND_MAX_NUM; i++) {
      stringBuffer.append("[slot " + i + "] ")
          .append(onCommands.get(i).getClass().getName() + "    ")
          .append(offCommands.get(i).getClass().getName()).append("\n");
    }
    stringBuffer.append("[undo]" + undoCommand.getClass().getName());

    return stringBuffer.toString();
  }
}
