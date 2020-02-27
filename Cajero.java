package Cajero;

import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import Cajero.Usuario;




public class Cajero {
	//objeto
		private  ObjectContainer db = null;
	   //abrir el archivodb
		private void abrirRegistro() {
			db = Db4oEmbedded.openFile("registroUsuario");
		}
		//cerrar la conexion
		private void cerrarRegistro() {
			db.close();
		}
		//almacenar
		public void insertarRegistro(Usuario u) {
			abrirRegistro();
			db.store(u);
			cerrarRegistro();
		}
		public List<Usuario> seleccionarUsuarios(){
			abrirRegistro();
			ObjectSet ListaUsuarios = db.queryByExample(Usuario.class);
			List<Usuario> lu = new ArrayList<>();
			
			for(Object listaUsuarios1 : ListaUsuarios) {
				lu.add((Usuario) listaUsuarios1);
				
			}
			cerrarRegistro();
			return lu;
			
			}
		
		
		//insertas el id y nos muestra los datos de ese usuario
		
		
		public Usuario seleccionarUsuario( Usuario u) {
		abrirRegistro();
		
		ObjectSet resultado = db.queryByExample(u);
		Usuario usuario = (Usuario) resultado.next();
		cerrarRegistro();
		return usuario;
		
		}
		
		public void actualizarRegistro(int Ntar,String nom, String ApeP, String ApeM,int nip, int fondo)
		
		{
		abrirRegistro();
		Usuario u= new Usuario();
		u.setNtarjeta(Ntar);
		ObjectSet resultado = db.queryByExample(u);
		Usuario preresultado = (Usuario) resultado.next();
		preresultado.setNombreUsuario(nom);
		preresultado.setApellidoPUsuario(ApeP);
		preresultado.setApellidoMUsuario(ApeM);
		preresultado.setFondos(fondo);
		preresultado.setNip(nip);
		db.store(preresultado);
		cerrarRegistro();
		
		}
		
		//metodo para eliminar
		public void eliminarRegistro(int Ntar) {
			Usuario u = new Usuario();
			u.setNtarjeta(Ntar);
			ObjectSet resultado = db.queryByExample(u);
			Usuario preresultado = (Usuario) resultado.next();
			db.delete(preresultado);
			cerrarRegistro();
		}
		

}
