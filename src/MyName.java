import org.jointheleague.graphical.robot.Robot;

public class MyName {
public static void main(String[] args) {
	Robot me= new Robot();
	me.setSpeed(8);
	me.turn(-90);
	me.penDown();
	me.move(170);
	me.turn(-90);
	me.move(270);
	me.turn(-90);
	me.move(170);
	me.penUp();
	me.moveTo(1100, 400);
	me.turn(144);
	
	
	
	
	
	
}
}
