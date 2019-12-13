package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {
	/**
	 * En la clase ControlRocket es donde creamos los metodos para decirle al boton o a lo que hayas puesto
	 * lo que hacer y como hacerlo.
	 */
	@FXML
	private AnchorPane root, rootHome;
	@FXML
	private ImageView fotoLogin;

	public void initialize() {

		transiccionFoto();

	}
	
	@FXML
	/**
	 * Nos permite cerrar el programa
	 */
	public void closeApp() {
		Stage thisStage = (Stage) rootHome.getScene().getWindow();
		thisStage.close();
	}
	
	@FXML
	/**
	 * En este metodo le daremos una funcionalidad al boton, para que cuando se le pulse el boton,
	 * se abra la nuevas pestaña, en este caso se abriría Urano.fxml
	 */
	public void openStage() {
		Stage thisStage = (Stage) root.getScene().getWindow();
		thisStage.close();
		
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Urano.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			Stage stage = new Stage();
			stage.setScene(scene);
			boolean fullscreen = stage.isFullScreen();
			stage.setFullScreen(fullscreen);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Nos permite que la imagen vaya apareciendo poco a poco cuando iniciamos el programa.
	 */
	private void transiccionFoto() {
		FadeTransition ft = new FadeTransition(Duration.seconds(5), fotoLogin);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}


}
