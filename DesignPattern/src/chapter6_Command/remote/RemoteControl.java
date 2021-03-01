package chapter6_Command.remote;

import chapter6_Command.simpleremote.Command;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

  private final int COMMAND_MAX_NUM;
  List<Command> onCommands;
  List<Command> offCommands;

  public RemoteControl(int commandMaxNum) {
    COMMAND_MAX_NUM = commandMaxNum;
    onCommands = new ArrayList<>();
    offCommands = new ArrayList<>();

    for (int i = 0; i < COMMAND_MAX_NUM; i++) {
      onCommands.add(new NoCommand());
      offCommands.add(new NoCommand());
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands.set(slot, onCommand);
    offCommands.set(slot, offCommand);
  }

  public void pushOnButton(int slot) {
    onCommands.get(slot).execute();
  }

  public void pushOffButton(int slot) {
    offCommands.get(slot).execute();
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

    return stringBuffer.toString();
  }
}
