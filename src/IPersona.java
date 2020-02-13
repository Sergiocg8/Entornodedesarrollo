
public interface IPersona {

	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsApellidos() {
		return sApellidos;
	}
	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}
	public String getsDNI() {
		return sDNI;
	}
	public void setsDNI(String sDNI) {
		this.sDNI = sDNI;
	}
	public int getiEdad() {
		return iEdad;
	}
	public void setiEdad(int iEdad) {
		this.iEdad = iEdad;
	}
	
}
