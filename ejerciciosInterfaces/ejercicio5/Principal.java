package ejerciciosInterfaces.ejercicio5;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FechaErrorException, SocioNoValidoException {
		Scanner tcld = new Scanner(System.in);
		ArrayList<Socio> listaSocios = new ArrayList<>();
		boolean constructorOk = false;
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("David");
		nombres.add("Maria");
		nombres.add("Alvaro");
		nombres.add("Carmen");
		nombres.add("José");
		int opcion = 0;
			while(!constructorOk) {
				constructorOk = true;
				try {
					while(opcion != 9) {
						do {
							System.out.println("Pulsa 1 para añadir socio aleatorio");
							System.out.println("Pulsa 2 para añadir socio manualmente");
							System.out.println("Pulsa 3 para mostrar la lista de socios");
							System.out.println("Pulsa 4 para ordenar la lista de socios");
							System.out.println("Pulsa 5 para ordenar la lista de socios por la cuenta");
							System.out.println("Pulsa 6 para ordenar la lista de socios por cuenta y luego nombre");
							System.out.println("Pulsa 7 para ordenar la lista de socios por fecha nacimiento y luego nombre");
							System.out.println("Pulsa 8 para ordenar la lista de socios");
							System.out.println("Pulsa 9 para salir");
							opcion = tcld.nextInt();
							if(opcion < 1 || opcion > 9) {
								System.out.println("Pulse entre las opciones válidas.");
							}
						}while(opcion < 1 || opcion > 9);
						
						Socio socioAux = new Socio();
						switch (opcion) {
							case 1:
								socioAux = Principal.obtenerSocioAleatorio(nombres);
								listaSocios.add(socioAux);
								break;
							case 2:
								socioAux = Principal.ingresarSocio();
								listaSocios.add(socioAux);
								break;
							case 3:
								for(Socio s : listaSocios) {
									System.out.println(s);
								}
								break;
							case 4:
								Collections.sort(listaSocios);
								for(Socio s : listaSocios) {
									System.out.println(s);
								}
								break;
							case 5:
								Collections.sort(listaSocios, new OrdenarSocioCuenta());
								break;
							case 6: 
								Collections.sort(listaSocios, new OrdenarSocioCuentaYAlfabe());
								break;
							case 7:
								Collections.sort(listaSocios, new OrdenarFechaYNombre());
								break;
							case 8:
								Principal.mostrarSocioPorAntiguedad(listaSocios);
							default:
								break;
						}
					}	
				}
				catch(InputMismatchException e) {
					System.out.println(e + " Error, se ha introducido una letra");
					constructorOk = false;
					tcld.nextLine();
				}
				catch(FechaErrorException e1) {
					System.out.println(e1);
					constructorOk = false;
				}
				catch(SocioNoValidoException e2) {
					System.out.println(e2);
					constructorOk = false;
				}
				finally {
					tcld.close();
				}
			}
	}
	
	private static Socio obtenerSocioAleatorio(ArrayList<String> nombres) {
		int anioActual = Year.now().getValue();
		int idAleatorio = (int) (Math.random() * 10000);
		int indiceNombres = (int) (Math.random() * 5);
		int diaAleatorio = (int) (Math.random() * 30) + 1;
		int mesAleatorio = (int) (Math.random() * 12) + 1;
		int anioAleatorio = (int) (Math.random() * (anioActual - 1925 + 1)) + 1925;
		double cuentaAleatoria = Math.random() * 10000000;
		
		return new Socio(idAleatorio, nombres.get(indiceNombres), diaAleatorio, mesAleatorio, anioAleatorio, cuentaAleatoria);
	}
	private static Socio ingresarSocio () throws FechaErrorException, SocioNoValidoException {
		Scanner tcld = new Scanner(System.in);
		
		System.out.println("Introduce ID:");
		int idAleatorio = tcld.nextInt();
		tcld.nextLine();
		System.out.println("Introduce nombre:");
		String nombre = tcld.nextLine();
		
		System.out.println("Introduce dia nacimiento:");
		int diaAleatorio = tcld.nextInt();
		
		System.out.println("Introduce mes nacimiento:");
		int mesAleatorio = tcld.nextInt();
		
		System.out.println("Introduce año nacimiento:");
		int anioAleatorio = tcld.nextInt();
		
		System.out.println("Introduce la cuenta:");
		double cuentaAleatoria = tcld.nextDouble();
		tcld.nextLine();
		tcld.close();
		return new Socio(idAleatorio, nombre, diaAleatorio, mesAleatorio, anioAleatorio, cuentaAleatoria);
	}
	
	private static void mostrarSocioPorAntiguedad(ArrayList<Socio> listSoci) {
		for(Socio s : listSoci) {
			int antiguedad = Year.now().getValue() - s.getFechaNacimiento().getAnio();
			if(antiguedad > 25) {
				System.out.println(s);
			}
		}
	}
	
	
		/*try {
			Socio p1 = new Socio(1, "Da", 8, 4 ,2000 , 130.5);
			Socio p2 = new Socio(1, "Da", 18, 3, 2000, 115);
			Socio p3 = new Socio(1, "D", 3, 4, 2000, 230.5);
			Socio p4 = new Socio(1, "Da", 11 ,1, 2000, 530.5);
			Socio p5 = new Socio(1, "Da", 11 ,1, 2027, 530.5);
			ArrayList<Socio> feriantes = new ArrayList<>();
			feriantes.add(p1);
			feriantes.add(p2);
			feriantes.add(p3);
			feriantes.add(p4);
			
			for(Socio p : feriantes) {
				System.out.println(p);
			}
			
			Collections.sort(feriantes);
			System.out.println("-------------------");
			
			for(Socio p : feriantes) {
				System.out.println(p);
			}
		}
		catch(FechaErrorException e){
			System.out.println(e);
		}
		catch(SocioNoValidoException e1) {
			System.out.println(e1);
		}	
	}*/
	
}
