package chapter6_Command.remote;

import chapter6_Command.simpleremote.Command;

public class NoCommand implements Command {

  @Override
  public void execute() {
    System.out.println("Execute : Nothing to do");
  }

  @Override
  public void undo() {
    System.out.println("Undo : Nothing to do");
  }
}
