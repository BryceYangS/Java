package chapter10_State;

public class HasQuarterState implements State{

	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {

	}

	@Override
	public void ejectQuarter() {

	}

	@Override
	public void turnCrank() {

	}

	@Override
	public void dispense() {

	}
}
