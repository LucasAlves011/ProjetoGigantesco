package negocio;

import java.net.URL;
import java.util.ResourceBundle;

import beans.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ControlerTela1 implements Initializable{

	ArmazenamentoUser sinal = new ArmazenamentoUser();	

	@FXML
	private PasswordField loginSenha;

	@FXML
	private PasswordField cadastroSenha;

	@FXML
	private TextField loginUser;

	@FXML
	private TextField cadastroNome;

	@FXML
	private TextField cadastroUser;    

	@FXML
	private Text mensagemTrue;
	
	@FXML
	private Text msgUserExiste;
	
	@FXML
	private Text msgUserSenhaIncorreto;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sinal.adicionar(new Usuario("Lucas", "Luuke", "sk13"));
		System.out.println(sinal.listar());
	}

	public void tentarCadastro() {

		if(sinal.adicionar(new Usuario(cadastroNome.getText(),cadastroUser.getText(),
				cadastroSenha.getText()))) {
			mensagemTrue.setVisible(true);

			cadastroNome.setText(null);
			cadastroUser.setText(null);
			cadastroSenha.setText(null);
		}
		else 
			msgUserExiste.setVisible(true);
	}

	public void setarMensagemOff() {
		if(mensagemTrue.isVisible()) {
			mensagemTrue.setVisible(false);
		}
		if(msgUserSenhaIncorreto.isVisible()) {
			msgUserSenhaIncorreto.setVisible(false);
		}
	}
	
	public void setarMsgFalse() {
		if(msgUserExiste.isVisible()) {
			System.out.println("Ta entrando aqui");
			msgUserExiste.setVisible(false);
		}
	}

	public void tentarLogar() {
		if(sinal.login(loginUser.getText(), loginSenha.getText())) {
			System.out.println("Logou com sucesso.Trocou de tela");
		}
		else
			msgUserSenhaIncorreto.setVisible(true);

	}

}
