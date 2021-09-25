package examem.finals;

public class Autos {
	private String modelo;
	private String marca;
	private String placa;
	private String kilometraje;
	private String anioFabricacion;
	private String codigoNacional;
	private String codigoDeImportacion;
	private String valorDeImportacion;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getKilometraje(String kilometrajeNuevo) {
		return kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getCodigoNacional() {
		return codigoNacional;
	}

	public void setCodigoNacional(String codigoNacional) {
		this.codigoNacional = codigoNacional;
	}

	public String getCodigoDeImportacion() {
		return codigoDeImportacion;
	}

	public void setCodigoDeImportacion(String codigoDeImportacion) {
		this.codigoDeImportacion = codigoDeImportacion;
	}

	public String getValorDeImportacion() {
		return valorDeImportacion;
	}

	public void setValorDeImportacion(String valorDeImportacion) {
		this.valorDeImportacion = valorDeImportacion;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", kilometraje=" + kilometraje
				+ "]";
	}

}
