
public class Autos {
	private long numSerie;
	private String marca;
	private String modelo;
	private Float precio;
	
	public Autos() {
	}

	public Autos(long numSerie, String marca, String modelo, Float precio) {
		this.numSerie = numSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Autos [numSerie=" + numSerie + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]\n";
	}

	public long getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(long numSerie) {
		this.numSerie = numSerie;
	}

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

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
	

}
