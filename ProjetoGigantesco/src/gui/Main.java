package gui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {

	public static void main(String[] args) {
					
		launch();
		
	}
	@Override
	public void start(Stage principal) throws Exception {
			
		Pane a = FXMLLoader.load(getClass().getResource("dxml.fxml"));
		Scene b = new Scene(a);
		principal.setScene(b);
		principal.setTitle("Projeto meu - Em desenvolvimento");
		principal.show();
			
	}	

}
