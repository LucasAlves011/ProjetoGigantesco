package negocio;
import java.util.ArrayList;
import beans.Usuario;

public class ArmazenamentoUser {
		
	private ArrayList<Usuario> array ;
	
	public ArmazenamentoUser() {
		array = new ArrayList<Usuario>();
	}
		
	public ArrayList<Usuario> listar(){
		return array;
	}
	
	public boolean adicionar(Usuario e) {
		if(comparador(e.getUsuario())) {
			array.add(e);			
			return true;
		}
		else 
			//usuario ja existe
		return false;
	}
	
	public boolean comparador(String user) {
		for(Usuario v : array) {
			if(v.getUsuario().equals(user)) {
				return false;
			}
		}
		return true;		
			
	}
	
	public boolean login(String user,String senha) {
		for(Usuario v:array) {
			if(v.getUsuario().equals(user)) {
				if(array.get(array.indexOf(v)).getSenha().equals(senha)) {
					return true;
				}
				else 
					return false;
			}
		}
		return false;
	}
	
}
