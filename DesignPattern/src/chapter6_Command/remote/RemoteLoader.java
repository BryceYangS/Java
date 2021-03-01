package chapter6_Command.remote;

import chapter6_Command.simpleremote.Command;
import chapter6_Command.simpleremote.Light;
import chapter6_Command.simpleremote.LightOffCommand;
import chapter6_Command.simpleremote.LightOnCommand;
import chapter6_Command.simpleremote.MacroCommand;
import chapter6_Command.simpleremote.Stereo;
import chapter6_Command.simpleremote.StereoOffCommand;
import chapter6_Command.simpleremote.StereoOnWithCDCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo(7);

    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    Stereo stereo = new Stereo();

    Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
    Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
    Command kitchenLightOn = new LightOnCommand(kitchenLight);
    Command kitchenLightOff = new LightOffCommand(kitchenLight);

    Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
    Command stereoOff = new StereoOffCommand(stereo);

//    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//    remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
//
//    System.out.println(remoteControl);
//
//    remoteControl.pushOnButton(0);
//    remoteControl.pushOffButton(0);
//    System.out.println(remoteControl);
//    remoteControl.pushUndoButton();
//
//    remoteControl.pushOnButton(1);
//    remoteControl.pushOffButton(1);
//    remoteControl.pushUndoButton();
//
//    remoteControl.pushOnButton(2);
//    remoteControl.pushOffButton(2);
//    remoteControl.pushUndoButton();

    Light light = new Light("living room");
    Stereo stereo1 = new Stereo("living room");

    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

    List<Command> partyOn = new ArrayList<>(
        Arrays.asList(lightOnCommand, stereoOnWithCDCommand));
    List<Command> partyOff = new ArrayList<>(
        Arrays.asList(lightOffCommand, stereoOffCommand));

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    remoteControl = new RemoteControlWithUndo(7);
    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
    remoteControl.pushOnButton(0);
    System.out.println(remoteControl);
    System.out.println("---------off Btn-------");
    remoteControl.pushOffButton(0);
    System.out.println(remoteControl);
    remoteControl.pushUndoButton();
    System.out.println(remoteControl);
  }
}
