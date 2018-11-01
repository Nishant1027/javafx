package assigment5_d;


import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class shape_maker {

	//make public variables
	private Shape s;
	private double size;
	
	//constructor sets size for this object if a integer is used
	shape_maker(int size){
		//converts to double and initialises the size variable
		this.size= size;
	}
	
	//constructor sets size for this object if a double is used
	shape_maker(double size){
		//initialises the size variable
		this.size= size;
	}
	
	//when this method is called it returns a Shape i.e. circle with a random colour
	public  Shape getShape(){
		s = createCircle();
		s.setFill(randomColour());
		return s;
	}
	//creates, initialises and then returns a circle
	private Circle createCircle() {
		Circle circle = new Circle(size);//takes the size from the global variables
		return circle;
    	}
	
	//returns a random paint i.e. colour value for fill
	public static Color randomColour() {
	     	Random random = new Random(); // makes a random object
	        int r = random.nextInt(255); //hold a random int value from 0 to 255 
	        int g = random.nextInt(255);
	        int b = random.nextInt(255);
	        return Color.rgb(r, g, b);
	}
}