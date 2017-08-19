package chapter2;
//Inheritance of methods
public class TestShapes {
	public void main(String[] args) {
		PlayerPeice shape = new PlayerPeice();
		shape.displayshape();
		shape.movepeice();
	}
}
class GameShape{
	public void displayshape() {
		System.out.println("Inside display shape method");
	}
}
class PlayerPeice extends GameShape{
	public void movepeice() {
		System.out.println("Moving Game peice");
	}
}