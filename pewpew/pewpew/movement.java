import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class movement extends Application{

	
	public void start(Stage space) throws Exception {
		
		// This is just a test for movement.
		
		Pane outerSpace = new Pane();
		outerSpace.setPrefSize(1280, 720);
		
		Rectangle dummy = new Rectangle(20,20);
		
		
		dummy.setX(600);
		dummy.setY(600);
		
		
		dummy.setFill(Color.CRIMSON);
		dummy.setFocusTraversable(true);
		
		outerSpace.getChildren().add(dummy);
		
		
		dummy.setOnKeyPressed(e -> {
			switch (e.getCode()){
			
			case SHIFT: break;
			
			case DOWN: dummy.setY(dummy.getY()+10); System.out.println(dummy.getX()+","+dummy.getY()); break;
			case UP: dummy.setY(dummy.getY()-10); System.out.println(dummy.getX()+","+dummy.getY()); break;
			case LEFT: dummy.setX(dummy.getX()-10); System.out.println(dummy.getX()+","+dummy.getY()); break;
			case RIGHT: dummy.setX(dummy.getX()+10); System.out.println(dummy.getX()+","+dummy.getY()); break;
			case SPACE: System.out.println("FIRE!"); break;
			
			
			}
			
		});
		
		
		
		
		Scene scene = new Scene(outerSpace);
		space.setTitle("movement test");
		space.setScene(scene);
		space.show();
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		launch(args);
		

	}

	

}
