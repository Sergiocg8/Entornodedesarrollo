 public class Persona{
	 private String sNombre;
	 private String sApellidos;
	 private String sDNI;
	 private int iEdad;
	 private int iAntiguedad;
	 private String sUniversidad;
	 private boolean bFuncionario;
	 private int iNumeroAlumno;
	 
	 public Persona(String sNombre, String sApellidos, String sDNI, int iEdad,int iAntiguedad){
		 setsNombre(sNombre);
		 setsApellidos(sApellidos);
		 setsDNI(sDNI);
		 setiEdad(iEdad);
		 setiAntiguedad(iAntiguedad);
	 }
	 
	public String getsUniversidad() {
		return sUniversidad;
	}

	public void setsUniversidad(String sUniversidad) {
		this.sUniversidad = sUniversidad;
	}

	public boolean isbFuncionario() {
		return bFuncionario;
	}

	public void setbFuncionario(boolean bFuncionario) {
		this.bFuncionario = bFuncionario;
	}

	public int getiNumeroAlumno() {
		return iNumeroAlumno;
	}

	public void setiNumeroAlumno(int iNumeroAlumno) {
		this.iNumeroAlumno = iNumeroAlumno;
	}

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
	public int getiAntiguedad() {
		return iAntiguedad;
	}
	public void setiAntiguedad(int iAntiguedad) {
		this.iAntiguedad = iAntiguedad;
	}
 }
