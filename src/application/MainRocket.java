
package application;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Esta clase te permite abrir una ventana de login con un boton, el cual si pulsas se cierra la ventana login
 * y se abre la nueva.
 * 
 * @author Nicolas
 * @see ControlRocket
 * @version 1.0
 * 
 */

public class MainRocket extends Application {
	
	@Override
	/**
	 * Metodo que permite iniciar el programa, es decir, abrir la pestaña mars.
	 */
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Mars.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
