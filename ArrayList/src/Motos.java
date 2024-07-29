
public class Motos {

	//Atributos moto
	String marca;
	String modelo;
	int km;
	
	
	
//	public Motos() {
//	}


	//Constructor moto
	public Motos(String marca, String modelo, int km) {
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}
	
	//Netodo toString
	@Override
	public String toString() {
		return "Motos [marca=" + marca + ", modelo=" + modelo + ", km=" + km + "]";
	}

	//Encapsulamiento

	




	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}
	
	
}
