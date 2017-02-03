import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class movementWithSpaceship extends Application{

	
	public void start(Stage primaryStage) throws Exception {
		

		int pixelWidthHeight = 5;
		
		Rectangle window1 = new Rectangle();
		window1.setWidth(pixelWidthHeight);
		window1.setHeight(pixelWidthHeight);
		window1.setFill(Color.SILVER);
		
		Rectangle window2 = new Rectangle();
		window2.setWidth(pixelWidthHeight);
		window2.setHeight(pixelWidthHeight);
		window2.setFill(Color.SILVER);
		
		Rectangle window3 = new Rectangle();
		window3.setWidth(pixelWidthHeight);
		window3.setHeight(pixelWidthHeight);
		window3.setFill(Color.SILVER);
		
		Rectangle body21 = new Rectangle();
		body21.setWidth(pixelWidthHeight);
		body21.setHeight(pixelWidthHeight);
		body21.setFill(Color.BEIGE);
		
		Rectangle body41 = new Rectangle();
		body41.setWidth(pixelWidthHeight);
		body41.setHeight(pixelWidthHeight);
		body41.setFill(Color.BEIGE);
		
		Rectangle body22 = new Rectangle();
		body22.setWidth(pixelWidthHeight);
		body22.setHeight(pixelWidthHeight);
		body22.setFill(Color.BEIGE);
		
		Rectangle body42 = new Rectangle();
		body42.setWidth(pixelWidthHeight);
		body42.setHeight(pixelWidthHeight);
		body42.setFill(Color.BEIGE);
		
		Rectangle body03 = new Rectangle();
		body03.setWidth(pixelWidthHeight);
		body03.setHeight(pixelWidthHeight);
		body03.setFill(Color.BEIGE);
		
		Rectangle body63 = new Rectangle();
		body63.setWidth(pixelWidthHeight);
		body63.setHeight(pixelWidthHeight);
		body63.setFill(Color.BEIGE);
		
		Rectangle body04 = new Rectangle();
		body04.setWidth(pixelWidthHeight);
		body04.setHeight(pixelWidthHeight);
		body04.setFill(Color.BEIGE);
		
		Rectangle body64 = new Rectangle();
		body64.setWidth(pixelWidthHeight);
		body64.setHeight(pixelWidthHeight);
		body64.setFill(Color.BEIGE);
		
		Rectangle body23 = new Rectangle();
		body23.setWidth(pixelWidthHeight);
		body23.setHeight(pixelWidthHeight);
		body23.setFill(Color.BEIGE);
		
		Rectangle body43 = new Rectangle();
		body43.setWidth(pixelWidthHeight);
		body43.setHeight(pixelWidthHeight);
		body43.setFill(Color.BEIGE);
		
		Rectangle redPaint11 = new Rectangle();
		redPaint11.setWidth(pixelWidthHeight);
		redPaint11.setHeight(pixelWidthHeight);
		redPaint11.setFill(Color.CRIMSON);
		
		Rectangle redPaint31 = new Rectangle();
		redPaint31.setWidth(pixelWidthHeight);
		redPaint31.setHeight(pixelWidthHeight);
		redPaint31.setFill(Color.CRIMSON);
		
		Rectangle redPaint51 = new Rectangle();
		redPaint51.setWidth(pixelWidthHeight);
		redPaint51.setHeight(pixelWidthHeight);
		redPaint51.setFill(Color.CRIMSON);
		
		Rectangle redPaint12 = new Rectangle();
		redPaint12.setWidth(pixelWidthHeight);
		redPaint12.setHeight(pixelWidthHeight);
		redPaint12.setFill(Color.CRIMSON);
		
		Rectangle redPaint32 = new Rectangle();
		redPaint32.setWidth(pixelWidthHeight);
		redPaint32.setHeight(pixelWidthHeight);
		redPaint32.setFill(Color.CRIMSON);
		
		Rectangle redPaint52 = new Rectangle();
		redPaint52.setWidth(pixelWidthHeight);
		redPaint52.setHeight(pixelWidthHeight);
		redPaint52.setFill(Color.CRIMSON);
		
		Rectangle redPaint13 = new Rectangle();
		redPaint13.setWidth(pixelWidthHeight);
		redPaint13.setHeight(pixelWidthHeight);
		redPaint13.setFill(Color.CRIMSON);
		
		Rectangle redPaint33 = new Rectangle();
		redPaint33.setWidth(pixelWidthHeight);
		redPaint33.setHeight(pixelWidthHeight);
		redPaint33.setFill(Color.CRIMSON);
		
		Rectangle redPaint53 = new Rectangle();
		redPaint53.setWidth(pixelWidthHeight);
		redPaint53.setHeight(pixelWidthHeight);
		redPaint53.setFill(Color.CRIMSON);
		
		Rectangle redPaint14 = new Rectangle();
		redPaint14.setWidth(pixelWidthHeight);
		redPaint14.setHeight(pixelWidthHeight);
		redPaint14.setFill(Color.CRIMSON);
		
		Rectangle redPaint34 = new Rectangle();
		redPaint34.setWidth(pixelWidthHeight);
		redPaint34.setHeight(pixelWidthHeight);
		redPaint34.setFill(Color.CRIMSON);
		
		Rectangle redPaint54 = new Rectangle();
		redPaint54.setWidth(pixelWidthHeight);
		redPaint54.setHeight(pixelWidthHeight);
		redPaint54.setFill(Color.CRIMSON);
		
		Rectangle exhaustOrange24 = new Rectangle();
		exhaustOrange24.setWidth(pixelWidthHeight);
		exhaustOrange24.setHeight(pixelWidthHeight);
		exhaustOrange24.setFill(Color.ORANGE);
		
		Rectangle exhaustOrange44 = new Rectangle();
		exhaustOrange44.setWidth(pixelWidthHeight);
		exhaustOrange44.setHeight(pixelWidthHeight);
		exhaustOrange44.setFill(Color.ORANGE);
		
		Rectangle exhaustYellow25 = new Rectangle();
		exhaustYellow25.setWidth(pixelWidthHeight);
		exhaustYellow25.setHeight(pixelWidthHeight);
		exhaustYellow25.setFill(Color.YELLOW);
		
		Rectangle exhaustYellow45 = new Rectangle();
		exhaustYellow45.setWidth(pixelWidthHeight);
		exhaustYellow45.setHeight(pixelWidthHeight);
		exhaustYellow45.setFill(Color.YELLOW);
		
		GridPane spaceship = new GridPane();
		spaceship.setAlignment(Pos.CENTER);
		spaceship.setPadding(new Insets(0,0,0,0));
		spaceship.setHgap(0);
		spaceship.setVgap(0);
		
		spaceship.add(window1,2,0);
		spaceship.add(window2,3,0);
		spaceship.add(window3,4,0);
		spaceship.add(redPaint11, 1, 1);
		spaceship.add(redPaint31, 3, 1);
		spaceship.add(redPaint51, 5, 1);
		spaceship.add(redPaint12, 1, 2);
		spaceship.add(redPaint32, 3, 2);
		spaceship.add(redPaint52, 5, 2);
		spaceship.add(redPaint13, 1, 3);
		spaceship.add(redPaint33, 3, 3);
		spaceship.add(redPaint53, 5, 3);
		spaceship.add(redPaint14, 1, 4);
		spaceship.add(redPaint34, 3, 4);
		spaceship.add(redPaint54, 5, 4);
		spaceship.add(body21, 2, 1);
		spaceship.add(body41, 4, 1);
		spaceship.add(body22, 2, 2);
		spaceship.add(body42, 4, 2);
		spaceship.add(body03, 0, 3);
		spaceship.add(body63, 6, 3);
		spaceship.add(body04, 0, 4);
		spaceship.add(body64, 6, 4);
		spaceship.add(body23, 2, 3);
		spaceship.add(body43, 4, 3);
		spaceship.add(exhaustOrange24, 2, 4);
		spaceship.add(exhaustOrange44, 4, 4);
		spaceship.add(exhaustYellow25, 2, 5);
		spaceship.add(exhaustYellow45, 4, 5);
		
		
		// Create a pane that is size 1280*720
		Pane outerSpace = new Pane();
		outerSpace.setPrefSize(1280, 720);
		outerSpace.setStyle("-fx-background-color:#000000;");
		
		// Make sure the spaceship is traversable
		spaceship.setFocusTraversable(true);
		
		// Place the spaceship in a reasonable spot
		spaceship.setTranslateX(600-pixelWidthHeight);
		spaceship.setTranslateY(600);
		
		// Add it to the pane
		outerSpace.getChildren().add(spaceship);
		
		// The controls
		spaceship.setOnKeyPressed(e-> {
			switch (e.getCode()){
			
			case SHIFT: break;
		
			// Each of these keys will move it by ten "pixels" (really 10 pixels) and display the coordinates
			case DOWN: spaceship.setTranslateY(spaceship.getTranslateY()+pixelWidthHeight); System.out.println(spaceship.getTranslateX()+","+spaceship.getTranslateY()); break;
			case UP: spaceship.setTranslateY(spaceship.getTranslateY()-pixelWidthHeight); System.out.println(spaceship.getTranslateX()+","+spaceship.getTranslateY()); break;
			case LEFT: spaceship.setTranslateX(spaceship.getTranslateX()-pixelWidthHeight); System.out.println(spaceship.getTranslateX()+","+spaceship.getTranslateY()); break;
			case RIGHT: spaceship.setTranslateX(spaceship.getTranslateX()+pixelWidthHeight); System.out.println(spaceship.getTranslateX()+","+spaceship.getTranslateY()); break;
			
			// FUTURE FEATURE
			case SPACE: System.out.println("pew"); break;
			
			}
				
		});
		
		Scene scene = new Scene (outerSpace);
		primaryStage.setTitle("movement with spaceship");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
