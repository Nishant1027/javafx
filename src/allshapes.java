package assigment5_d;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.RotateEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.ZoomEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class allshapes {
	
	static double orgSceneX1;
	static double orgSceneY1;
	static double orgTranslateX, orgTranslateY;
 	//static boolean t2=false;
	
	

	  public static Circle createCircle(double x, double y, double r, Color color) {
	    Circle circle = new Circle(x, y, r, color);

	    circle.setCursor(Cursor.HAND);
	    
	    
		EventHandler<MouseEvent> MousePressed1 = new EventHandler<MouseEvent>()
	    {
	        @Override
	        public void handle(MouseEvent mouseEvent)
	        {
	            //Initialise the original coordinates 
	            orgSceneX1= mouseEvent.getSceneX();
	            orgSceneY1= mouseEvent.getSceneY();
	            
	            //gets the coordinates for the movement made
	            orgTranslateX = (((javafx.scene.shape.Circle) mouseEvent.getSource())).getTranslateX();
	            orgTranslateY = (((javafx.scene.shape.Circle) mouseEvent.getSource())).getTranslateY();
	        }
	    };
	    
	//event handler for mouse dragged
	 EventHandler<MouseEvent> MouseDragged1 = new EventHandler<MouseEvent>()
	    {
	        @Override
	        public void handle(MouseEvent mouseEvent)
	        {
	            //gets the total of the coordinates difference 
	            double offsetX = mouseEvent.getSceneX() - orgSceneX1;
	            double offsetY = mouseEvent.getSceneY() - orgSceneY1;
	            
	            //gets the current location coordinates according to previous original location 
	            double newTranslateX = orgTranslateX + offsetX;
	            double newTranslateY = orgTranslateY + offsetY;
	            
	            //Dynamically moves the shape from previous location by coordinates of the movement 
	            ((javafx.scene.shape.Circle) (mouseEvent.getSource())).setTranslateX(newTranslateX);
	            ((javafx.scene.shape.Circle) (mouseEvent.getSource())).setTranslateY(newTranslateY);
	        }
	    };
	   
	/*    EventHandler<ScrollEvent> ScrollEventHandler = new EventHandler<ScrollEvent>()
	    {
	        @Override
	        public void handle(ScrollEvent mouseEvent)
	        {
	           Circle c=(Circle) mouseEvent.getSource();
	          // c.setScaleX(c.getScaleX() * 1.1);
	           //c.setScaleY(c.getScaleY() * 1.1);
	          // c.setScaleX(c.getScaleX() * mouseEvent.getZoomFactor());
	         //  c.setScaleY(c.getScaleY() * mouseEvent.getZoomFactor());
	    
	        }
	    };	    
	*/
	   // circle.setOnMouseClicked(null);
	    circle.setOnMousePressed(MousePressed1);
		circle.setOnMouseDragged(MouseDragged1);
		
	    
	    
	    EventHandler<MouseEvent> eventHandler1 = new EventHandler<MouseEvent>() { 
	        @Override 
	        public void handle(MouseEvent e) {
	        	
	        	if (e.getClickCount() == 2) {
	        		
	       boolean result = confirmation.display("confirm", "Are you sure to delete this shape");
	       if(result==true)
	    	   circle.setVisible(false);
	        	} 	
	        	
	 
	     }};
		
		 EventHandler<ScrollEvent> eventHandler12 = new EventHandler<ScrollEvent>() { 
		        @Override 
		        public void handle(ScrollEvent e) {
		        	
		        	//if (e.getClickCount() == 2) {
		        		String[] result=confirmation.display1("circle","input the radius of circle ");
			        	   Circle b=(Circle) e.getSource();
			        	   int a1=Integer.parseInt(result[0]);
			        	  // int a2=Integer.parseInt(result[1]);
			        	   b.setRadius(a1);
		        	
		 
		     }};
	     
		  
	     
	    circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
	    circle.addEventFilter(ScrollEvent.ANY, eventHandler12);   
	   
	    return circle;
	  
}



	  public static Ellipse createEllipse(double x, double y, double r, double z,Color color) {
		    Ellipse ellipse = new Ellipse(x, y, r,z);
	        ellipse.setFill(color);
		    ellipse.setCursor(Cursor.HAND);
		 
			EventHandler<MouseEvent> MousePressed2 = new EventHandler<MouseEvent>()
		    {
		        @Override
		        public void handle(MouseEvent mouseEvent)
		        {
		            //Initialise the original coordinates 
		            orgSceneX1= mouseEvent.getSceneX();
		            orgSceneY1= mouseEvent.getSceneY();
		            
		            //gets the coordinates for the movement made
		            orgTranslateX = (((javafx.scene.shape.Ellipse) mouseEvent.getSource())).getTranslateX();
		            orgTranslateY = (((javafx.scene.shape.Ellipse) mouseEvent.getSource())).getTranslateY();
		        }
		    };
		    
		//event handler for mouse dragged
		EventHandler<MouseEvent> MouseDragged2 = new EventHandler<MouseEvent>()
		    {
		        @Override
		        public void handle(MouseEvent mouseEvent)
		        {
		            //gets the total of the coordinates difference 
		            double offsetX = mouseEvent.getSceneX() - orgSceneX1;
		            double offsetY = mouseEvent.getSceneY() - orgSceneY1;
		            
		            //gets the current location coordinates according to previous original location 
		            double newTranslateX = orgTranslateX + offsetX;
		            double newTranslateY = orgTranslateY + offsetY;
		            
		            //Dynamically moves the shape from previous location by coordinates of the movement 
		            ((javafx.scene.shape.Ellipse) (mouseEvent.getSource())).setTranslateX(newTranslateX);
		            ((javafx.scene.shape.Ellipse) (mouseEvent.getSource())).setTranslateY(newTranslateY);
		        }
		    };
		   
		    
		    
		    
		    
		    ellipse.setOnMousePressed(MousePressed2);
			ellipse.setOnMouseDragged(MouseDragged2);
		   
		    EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() { 
		        @Override 
		        public void handle(MouseEvent e) { 
		        	if (e.getClickCount() == 2) {
		       boolean result = confirmation.display("confirm", "Are you sure to delete this shape");
		       if(result==true)
		    	   ellipse.setVisible(false);
		        	}
		    
		     }};  
		     
		     
			
			EventHandler<ScrollEvent> eventHandler12 = new EventHandler<ScrollEvent>() { 
		        @Override 
		        public void handle(ScrollEvent e) { 
		        
		        		String[] result=confirmation.display1("ellipse","input the radiusx of radiusy ");
			        	   Ellipse b=(Ellipse) e.getSource();
			        	   int a1=Integer.parseInt(result[0]);
			        	  int a2=Integer.parseInt(result[1]);
			        	   b.setRadiusX(a1);
			        	   b.setRadiusY(a2);
		       
		    
		     }};  
		    	
		    ellipse.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler2);
		    ellipse.addEventFilter(ScrollEvent.ANY, eventHandler12);  
		   
		    return ellipse;
		  }

	  
	  
	  
	  public static Line createLine(double x, double y, double r,double z, Color color) {
		    Line line = new Line(x, y, r, z);
		    line.setStroke(color);
		  //  line.setStyle("-fx-stroke: color;");
	        line.setStrokeWidth(10);
		    line.setCursor(Cursor.HAND);



		    
			EventHandler<MouseEvent> MousePressed3 = new EventHandler<MouseEvent>()
		    {
		        @Override
		        public void handle(MouseEvent mouseEvent)
		        {
		            //Initialise the original coordinates 
		            orgSceneX1= mouseEvent.getSceneX();
		            orgSceneY1= mouseEvent.getSceneY();
		            
		            //gets the coordinates for the movement made
		            orgTranslateX = (((javafx.scene.shape.Line) mouseEvent.getSource())).getTranslateX();
		            orgTranslateY = (((javafx.scene.shape.Line) mouseEvent.getSource())).getTranslateY();
		        }
		    };
		    
		//event handler for mouse dragged
		EventHandler<MouseEvent> MouseDragged3=new EventHandler<MouseEvent>()
		    {
		        @Override
		        public void handle(MouseEvent mouseEvent)
		        {
		            //gets the total of the coordinates difference 
		            double offsetX = mouseEvent.getSceneX() - orgSceneX1;
		            double offsetY = mouseEvent.getSceneY() - orgSceneY1;
		            
		            Line c = (Line) (mouseEvent.getSource());
		            c.setStartX(c.getStartX() + offsetX);
				      c.setStartY(c.getStartY() + offsetY);
				      c.setEndX(c.getEndX() + offsetX);
				      c.setEndY(c.getEndY() + offsetY);
				      orgSceneX1 = mouseEvent.getSceneX();
				      orgSceneY1 = mouseEvent.getSceneY();
		        }
		    };
		   
		    
		    
		    
		    
		    line.setOnMousePressed(MousePressed3);
			line.setOnMouseDragged(MouseDragged3);
		 
		    EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() { 
		        @Override 
		        public void handle(MouseEvent e) { 
		        	if (e.getClickCount() == 2) {
		       boolean result = confirmation.display("confirm", "Are you sure to delete this shape");
		       if(result==true)
		    	   line.setVisible(false);
		        	}
		        
		     }};  
		     
		     
			 EventHandler<ScrollEvent> eventHandler12 = new EventHandler<ScrollEvent>() { 
			        @Override 
			        public void handle(ScrollEvent e) { 
			       
			        		String[] result=confirmation.display1("line","input the Strokewidth and length of line ");
				        	   Line b=(Line) e.getSource();
				        	   int a1=Integer.parseInt(result[0]);
				        	  int a2=Integer.parseInt(result[1]);
				        	   b.setStrokeWidth(a1);
				        	   if(b.getEndX()==b.getStartX())
				        		   b.setEndY(b.getEndY()+a2/2);
				        	   else
				        		   b.setEndX(b.getEndX()+a2/2);
				        	   
			       			        
			     }};  
			    
			        	
		    line.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler3);
		   line.addEventFilter(ScrollEvent.ANY, eventHandler12);  
		   
		    return line;
		  }

	  
	 // @SuppressWarnings("unchecked")
	public static Rectangle createRectangle(double x, double y, double r,double z, Color color) {
		    Rectangle rectangle = new Rectangle(x, y, r, z);
		    rectangle.setFill(color);

		    
	
		    
		    EventHandler<MouseEvent> MousePressed4 = new EventHandler<MouseEvent>()
		    {
		        @Override
		        public void handle(MouseEvent mouseEvent)
		        {
		            //Initialise the original coordinates 
		            orgSceneX1= mouseEvent.getSceneX();
		            orgSceneY1= mouseEvent.getSceneY();
		            
		            //gets the coordinates for the movement made
		            orgTranslateX = (((javafx.scene.shape.Rectangle) mouseEvent.getSource())).getTranslateX();
		            orgTranslateY = (((javafx.scene.shape.Rectangle) mouseEvent.getSource())).getTranslateY();
		        }
		    };
		    
		//event handler for mouse dragged
		EventHandler<MouseEvent> MouseDragged4 = new EventHandler<MouseEvent>()
		    {
		        @Override
		        public void handle(MouseEvent mouseEvent)
		        {
		            //gets the total of the coordinates difference 
		            double offsetX = mouseEvent.getSceneX() - orgSceneX1;
		            double offsetY = mouseEvent.getSceneY() - orgSceneY1;
		            
		            Rectangle c = (Rectangle) (mouseEvent.getSource());
		            c.setX(c.getX() + offsetX);
				      c.setY(c.getY() + offsetY);
				   
				      orgSceneX1 = mouseEvent.getSceneX();
				      orgSceneY1 = mouseEvent.getSceneY();
		           }
		    };
		   
		    
		    
		    
		    
		    rectangle.setOnMousePressed(MousePressed4);
			rectangle.setOnMouseDragged(MouseDragged4);
		 
		    EventHandler<MouseEvent> eventHandler4 = new EventHandler<MouseEvent>() { 
		        @Override 
		        public void handle(MouseEvent e) { 
		        	if (e.getClickCount() == 2) {
		       boolean result = confirmation.display("confirm", "Are you sure to delete this shape");
		       if(result==true)
		    	   rectangle.setVisible(false);
		        	}
		      
		     }};  
		    
			
			 EventHandler<ScrollEvent> eventHandler12 = new EventHandler<ScrollEvent>() { 
			        @Override 
			        public void handle(ScrollEvent e) { 
			        	
			        		String[] result=confirmation.display1("rectangle","input the width and height of line ");
				        	   Rectangle b=(Rectangle) e.getSource();
				        	   int a1=Integer.parseInt(result[0]);
				        	  int a2=Integer.parseInt(result[1]);
				        	  b.setWidth(a1);
				        	   b.setHeight(a2);
				        	   
				              			     
			        	
			      
			     }};  
			    
				    rectangle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler4);
				    rectangle.addEventFilter(ScrollEvent.ANY, eventHandler12);  
		    return rectangle;
		  }

	  
}
