package bean;

public class Usuario {

	private String nombres;
	private String apellidos;
	private String tipoID;
	private String id;
	private String lugarResidencia;
	private String numeroCel;
	private String nacionalidad;
	private String correoElectronico;
	private String contraseña;
	
	public Usuario(String nombres, String apellidos, String tipoID, String id, String lugarResidencia, String numeroCel,
			String nacionalidad, String correoElectronico, String contraseña) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoID = tipoID;
		this.id = id;
		this.lugarResidencia = lugarResidencia;
		this.numeroCel = numeroCel;
		this.nacionalidad = nacionalidad;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
	}
	
	public Usuario() {
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoID() {
		return tipoID;
	}

	public void setTipoID(String tipoID) {
		this.tipoID = tipoID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLugarResidencia() {
		return lugarResidencia;
	}

	public void setLugarResidencia(String lugarResidencia) {
		this.lugarResidencia = lugarResidencia;
	}

	public String getNumeroCel() {
		return numeroCel;
	}

	public void setNumeroCel(String numeroCel) {
		this.numeroCel = numeroCel;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}//CIERRE DE LA CLASE
