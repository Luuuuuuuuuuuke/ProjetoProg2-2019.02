package gui.conta;

import java.io.IOException;

import beans.Administrador;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Principal extends Application {
	
	private static Stage stage;
	private static Scene telaLogin;
	private static Scene telaFunc;
	private static Scene telaAdm;
	private static Scene telacadastro;
	private static Scene telaviagem;
	private static Scene telaVender;
	private static Scene telaBilhete;
	private static Scene telaRegistro;


	public static Stage getStage() {
		return stage;
	}

	@Override
    public void start(Stage primaryStage) throws IOException {
		
//		Image image =  new Image("file:LOGO.png");
//		ImageView iv =  new ImageView();
//		iv.setImage(image);
//		iv.setFitHeight(180);
//		iv.setFitWidth(160);
//		iv.setPreserveRatio(false);
		
    	stage = primaryStage;
        Pane fxmlLogin =  FXMLLoader.load(getClass().getResource("FXMLTela.fxml"));
        telaLogin = new Scene(fxmlLogin);
        
        Pane fxmlFunc=  FXMLLoader.load(getClass().getResource("TelaFUNC.fxml"));
        telaFunc = new Scene(fxmlFunc);
        
        Pane fxmlAdm =  FXMLLoader.load(getClass().getResource("TelaADM.fxml"));
        telaAdm = new Scene(fxmlAdm);

		Pane fxmlcadastro = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/TelaDeCadastro.fxml"));
		telacadastro = new Scene(fxmlcadastro);

		Pane fxmlViagem = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/Tela de viagem.fxml"));
		telaviagem = new Scene(fxmlViagem);

		Pane fxmlVender = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/VenderBilhete.fxml"));
		telaVender = new Scene(fxmlVender);
		
		Pane fxmlBilhete = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/BilheteFinal.fxml"));
		telaBilhete = new Scene(fxmlBilhete);
		//fxmlBilhete.getChildren().add(iv);

		Pane fxmlRegistro = FXMLLoader.load(getClass().getClassLoader().getResource("gui/conta/Registro.fxml"));
		telaRegistro = new Scene(fxmlRegistro);
		
		primaryStage.setScene(telaLogin);
        primaryStage.show();
    }
    
    public static void changeScreen(String str)
    {
    	switch (str) {

			case "login":
				stage.setScene(telaLogin);
				break;
			case "func":
				stage.setScene(telaFunc);
				break;
			case "adm":
				stage.setScene(telaAdm);
				break;
			case "cadastro":
				stage.setScene(telacadastro);
				break;
			case "viagem":
				stage.setScene(telaviagem);
				break;
			case "vender":
				stage.setScene(telaVender);
				break;
			case "bilhete":
				stage.setScene(telaBilhete);
				break;
			case "registro":
				stage.setScene(telaRegistro);
				default:
			break;
		}
    }
    public static void main(String[] args) {
        launch(args);
    }
}
