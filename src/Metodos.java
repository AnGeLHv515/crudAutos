import java.util.List;

public interface Metodos {
 
	//metodos del crud
	public void guardar (Autos auto);//metodo abstracto por que no tiene funcionalidad
	public List<Autos> mostrar();		//funcion
	public Autos buscar(int indice);	//funcion
	public void editar(int indice,Autos auto);//metodo
	public void eliminar(int indice);
}
