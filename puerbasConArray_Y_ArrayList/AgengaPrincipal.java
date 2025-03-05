/**
 * 
 */
package puerbasConArray_Y_ArrayList;


/**
 * 
 */
public class AgengaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tareas ta1 = new Tareas("Hacer la compra", false);
		Tareas ta2 = new Tareas("Hacer la comida", false);
		Tareas ta3 = new Tareas("Hacer limpieza", false);
		Tareas ta4 = new Tareas("Hacer ejercicios", false);
		Tareas[] ta = new Tareas[5];
		Agenda ag1 = new Agenda();
		
		ag1.getTareas().add(ta1);
		ag1.getTareas().add(ta2);
		ag1.getTareas().add(ta3);
		ag1.getTareas().add(ta4);
		
		System.out.println(ag1);
		
		ta1.setCompletada(true);
		
		System.out.println(ag1);
		
		for(int i = 0; i < ta.length; i++) {
			switch(i){
				case 0:
					ta[i] = new Tareas("Hacer la compra", false);
					break;
				case 1:
					ta[i] = new Tareas("Hacer la comida", false);
					break;
				case 2:
					ta[i] = new Tareas("Hacer limpieza" , false);
					break;
				case 3:
					ta[i] = new Tareas("Hacer ejercicio", false);
					break;
				case 4:
					ta[i] = new Tareas("Hacer el pino", false);
					break;
			}
		}
		
		for(int i = 0; i < ta.length; i++) {
			ag1.getTareas().add(ta[i]);
		}
		
		System.out.println(ag1);
		ag1.getTareas().remove(2);
		System.out.println(ag1);
		System.out.println(ag1.getTareas().size()); // Devuelve el tamaño del arrayList
		System.out.println(ag1.getTareas().isEmpty()); //Devuelve si el arrayList esta lleno (false) o vacio (true)
		System.out.println(ag1.getTareas().get(2));
		Tareas ta5 = new Tareas("No hacer nada", false);
		Tareas ta6 = new Tareas("Hacer menos", false);
		ag1.getTareas().set(1,ta5); //Sustituye el elemento de la posición indicada
		System.out.println(ag1);
		ag1.getTareas().add(0,ta6); // Primero la posición y luego el elemento
		System.out.println(ag1);
		
		System.out.println(ag1.getTareas().contains(ta1)); // Contains devuelve true si el elemento se encuentra en el arrayList
		
		System.out.println(ag1.getTareas().indexOf(ta4)); //Index of devuelve la posición de objeto en el arrayList
		
		for(int i = 0; i < ta.length; i++) {
			System.out.println(ag1.getTareas().indexOf(ta[i]));
		}
		ag1.agregarTarea(ta6);
	}
	
}
