package practice.designpartten.strategyPattern;

public class MuteQuack implements QuackBahavior {

	@Override
	public void quack() {
		System.out.println("Mute duck can't quack!");
	}

}
