package Cajero;

public class Usuario {

	
	private String NombreUsuario;
	private String ApellidoPUsuario;
	private String ApellidoMUsuario;
	private int fondos;
	private int Ntarjeta;
	private int Nip;
	
	
	public String getNombreUsuario() {
		return NombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}
	public String getApellidoPUsuario() {
		return ApellidoPUsuario;
	}
	public void setApellidoPUsuario(String apellidoPUsuario) {
		ApellidoPUsuario = apellidoPUsuario;
	}
	public String getApellidoMUsuario() {
		return ApellidoMUsuario;
	}
	public void setApellidoMUsuario(String apellidoMUsuario) {
		ApellidoMUsuario = apellidoMUsuario;
	}
	public int getNip() {
		return Nip;
	}
	public void setNip(int nip) {
		Nip = nip;
	}
	public int getFondos() {
		return fondos;
	}
	public void setFondos(int fondos) {
		this.fondos = fondos;
	}
	@Override
	public String toString() {
		return "Usuario [  NombreUsuario=" + NombreUsuario + ", ApellidoPUsuario="
				+ ApellidoPUsuario + ", ApellidoMUsuario=" + ApellidoMUsuario + ", Nip=" + Nip + "]";
	}
	public int getNtarjeta() {
		return Ntarjeta;
	}
	public void setNtarjeta(int ntarjeta) {
		this.Ntarjeta = ntarjeta;
	}
	
	
}
