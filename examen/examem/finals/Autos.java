package examem.finals;

public class Autos {
	private String modelo;
	private String marca;
	private String placa;
	private String kilometraje;
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
	public String getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}
	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", kilometraje=" + kilometraje + "]";
	}
	
	

}
