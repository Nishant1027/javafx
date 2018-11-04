package assigment5_d;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class confirmation {

    //Create variable
    static boolean answer;
     static String[] abc=new String[2];
 

    public static boolean display(String title, String message) {
		// TODO Auto-generated method stub
		
				 Stage window = new Stage();
			        window.initModality(Modality.APPLICATION_MODAL);
			        window.setTitle(title);
			        window.setMinWidth(250);
			        Label label = new Label();
			        label.setText(message);

			        //Create two buttons
			        Button yesButton = new Button("Yes");
			        Button noButton = new Button("No");

			        //Clicking will set answer and close window
			        yesButton.setOnAction(e -> {
			            answer = true;
			            window.close();
			        });
			        noButton.setOnAction(e -> {
			            answer = false;
			            window.close();
			        });

			        VBox layout = new VBox(10);

			        //Add buttons
			        layout.getChildren().addAll(label, yesButton, noButton);
			        layout.setAlignment(Pos.CENTER);
			        Scene scene = new Scene(layout);
			        window.setScene(scene);
			        window.showAndWait();

			        //Make sure to return answer
			        return answer;
			}
    
    
    public static String[] display1(String title, String message) {
		// TODO Auto-generated method stub
		
    	if(title.equals("circle")) {
    	 Stage window = new Stage();
	        window.initModality(Modality.APPLICATION_MODAL);
	        window.setTitle(title);
	        window.setMinWidth(400);
	        Label label = new Label();
	        label.setText(message);
	        
	        GridPane rootNode = new GridPane();
	        rootNode.setPadding(new Insets(15));
	        rootNode.setHgap(5);
	        rootNode.setVgap(5);
	        rootNode.setAlignment(Pos.CENTER);

	        Scene myScene = new Scene(rootNode, 300, 200);

	        rootNode.add(new Label("Radius:"), 0, 0);
	        TextField firstValue = new TextField();
	        rootNode.add(firstValue, 1, 0);
	       // rootNode.add(new Label("Second Value:"), 0, 1);
	       // TextField secondValue = new TextField();
	       // rootNode.add(secondValue, 1, 1);
	       // rootNode.add(new Label("Sum is:"), 0, 2);
	        Button aButton = new Button("Enter");
	        rootNode.add(aButton, 1, 2);


	       // window.close();
	        aButton.setOnAction(e -> {
	            abc[0] =  firstValue.getText();
	            abc[1] = "0";
	            window.close();
	        });

	      

	        VBox layout = new VBox(10);

	        //Add buttons
	        layout.getChildren().addAll(label, rootNode);
	        layout.setAlignment(Pos.CENTER);
	        Scene scene = new Scene(layout);
	        window.setScene(scene);
	        window.showAndWait();

	        //Make sure to return answer
	        return abc ;
	}
    	
    	else if(title.equals("rectangle"))
    	{
    		 Stage window = new Stage();
 	        window.initModality(Modality.APPLICATION_MODAL);
 	        window.setTitle(title);
 	        window.setMinWidth(400);
 	        Label label = new Label();
 	        label.setText(message);
 	        
 	        GridPane rootNode = new GridPane();
 	        rootNode.setPadding(new Insets(15));
 	        rootNode.setHgap(5);
 	        rootNode.setVgap(5);
 	        rootNode.setAlignment(Pos.CENTER);

 	        Scene myScene = new Scene(rootNode, 300, 200);

 	        rootNode.add(new Label("Width:"), 0, 0);
 	        TextField firstValue = new TextField();
 	        rootNode.add(firstValue, 1, 0);
 	        rootNode.add(new Label("Height"), 0, 1);
 	        TextField secondValue = new TextField();
 	        rootNode.add(secondValue, 1, 1);
 	      //  rootNode.add(new Label("Sum is:"), 0, 2);
 	        Button aButton = new Button("Enter");
 	        rootNode.add(aButton, 1, 2);

 	       //window.close();

 	        aButton.setOnAction(e -> {
 	            abc[0] =  firstValue.getText();
 	            abc[1] = secondValue.getText();
 	           window.close();
 	        });

 	      

 	        VBox layout = new VBox(10);

 	        //Add buttons
 	        layout.getChildren().addAll(label, rootNode);
 	        layout.setAlignment(Pos.CENTER);
 	        Scene scene = new Scene(layout);
 	        window.setScene(scene);
 	        window.showAndWait();

 	        //Make sure to return answer
 	        return abc ;
		}
    	else if(title.equals("ellipse")) {   	
    		 Stage window = new Stage();
 	        window.initModality(Modality.APPLICATION_MODAL);
 	        window.setTitle(title);
 	        window.setMinWidth(400);
 	        Label label = new Label();
 	        label.setText(message);
 	        
 	        GridPane rootNode = new GridPane();
 	        rootNode.setPadding(new Insets(15));
 	        rootNode.setHgap(5);
 	        rootNode.setVgap(5);
 	        rootNode.setAlignment(Pos.CENTER);

 	        Scene myScene = new Scene(rootNode, 300, 200);

 	        rootNode.add(new Label("RadiusX:"), 0, 0);
 	        TextField firstValue = new TextField();
 	        rootNode.add(firstValue, 1, 0);
 	        rootNode.add(new Label("RadiusY:"), 0, 1);
 	        TextField secondValue = new TextField();
 	        rootNode.add(secondValue, 1, 1);
 	       // rootNode.add(new Label("Sum is:"), 0, 2);
 	        Button aButton = new Button("Enter");
 	        rootNode.add(aButton, 1, 2);


 	       window.close();
 	        aButton.setOnAction(e -> {
 	            abc[0] =  firstValue.getText();
 	            abc[1] = secondValue.getText();
 	           window.close();
 	        });

 	      

 	        VBox layout = new VBox(10);

 	        //Add buttons
 	        layout.getChildren().addAll(label, rootNode);
 	        layout.setAlignment(Pos.CENTER);
 	        Scene scene = new Scene(layout);
 	        window.setScene(scene);
 	        window.showAndWait();

 	        //Make sure to return answer
 	        return abc ;
	}
    	else if(title.equals("line")) {	
    		 Stage window = new Stage();
 	        window.initModality(Modality.APPLICATION_MODAL);
 	        window.setTitle(title);
 	        window.setMinWidth(400);
 	        Label label = new Label();
 	        label.setText(message);
 	        
 	        GridPane rootNode = new GridPane();
 	        rootNode.setPadding(new Insets(15));
 	        rootNode.setHgap(5);
 	        rootNode.setVgap(5);
 	        rootNode.setAlignment(Pos.CENTER);

 	        Scene myScene = new Scene(rootNode, 300, 200);

 	        rootNode.add(new Label("Stroke Width:"), 0, 0);
 	        TextField firstValue = new TextField();
 	        rootNode.add(firstValue, 1, 0);
 	        rootNode.add(new Label("Length:"), 0, 1);
 	        TextField secondValue = new TextField();
 	        rootNode.add(secondValue, 1, 1);
 	       // rootNode.add(new Label("Sum is:"), 0, 2);
 	        Button aButton = new Button("Enter");
 	        rootNode.add(aButton, 1, 2);

 	      

 	        aButton.setOnAction(e -> {
 	            abc[0] =  firstValue.getText();
 	            abc[1] = secondValue.getText();
 	           window.close();
 	        });

 	      

 	        VBox layout = new VBox(10);

 	        //Add buttons
 	        layout.getChildren().addAll(label, rootNode);
 	        layout.setAlignment(Pos.CENTER);
 	        Scene scene = new Scene(layout);
 	        window.setScene(scene);
 	        window.showAndWait();

 	        //Make sure to return answer
 	        return abc ;
	}
    	
    	else {
    		abc[0]="0";
    	abc[1]="0";
    		return abc;
    	}
    	
    	}
}
    