
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// se agrega esto en la clase principal

		Autos auto1 = new Autos(6942651l, "Nissan", "versa", 6354651.241f);
		Autos auto2 = new Autos(6354651l, "Nissan", "Jetta", 541241.5654f);
		Autos auto3 = new Autos(6451651l, "Volksvaguen", "Bora", 65416451f);
		
		//instanciar la clase
		//al hacer la intancia de clase tenemos acceso a todo loq ue contiene la clase
		LogicaMetodos imp = new LogicaMetodos();
		
	
		//guardar
		imp.guardar(auto1);
		imp.guardar(auto2);
		imp.guardar(auto3);
		
		//MOSTAR
		
		System.out.println(imp.mostrar());
		
		//buscar
		Autos autoEn = imp.buscar(1);
		System.out.println("Se encontro "+autoEn);
		
		//editar
		
		
		
		
	}

}
