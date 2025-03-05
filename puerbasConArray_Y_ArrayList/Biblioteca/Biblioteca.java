package puerbasConArray_Y_ArrayList.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Socio> agendaSocios;
	private ArrayList<Libro> catalogoLibros;
	/**
	 * @param agendaSocios
	 * @param catalogoLibros
	 */
	public Biblioteca(ArrayList<Socio> agendaSocios, ArrayList<Libro> catalogoLibros) {
		this.agendaSocios = agendaSocios;
		this.catalogoLibros = catalogoLibros;
	}
	/**
	 * 
	 */
	public Biblioteca() {
		agendaSocios = new ArrayList<>();
		catalogoLibros = new ArrayList<>();
	}
	/**
	 * @return the agendaSocios
	 */
	public ArrayList<Socio> getAgendaSocios() {
		return agendaSocios;
	}
	/**
	 * @param agendaSocios the agendaSocios to set
	 */
	public void setAgendaSocios(ArrayList<Socio> agendaSocios) {
		this.agendaSocios = agendaSocios;
	}
	/**
	 * @return the catalogoLibros
	 */
	public ArrayList<Libro> getCatalogoLibros() {
		return catalogoLibros;
	}
	/**
	 * @param catalogoLibros the catalogoLibros to set
	 */
	public void setCatalogoLibros(ArrayList<Libro> catalogoLibros) {
		this.catalogoLibros = catalogoLibros;
	}
	@Override
	public String toString() {
		return "Biblioteca [agendaSocios=" + agendaSocios + ", catalogoLibros=" + catalogoLibros + "]";
	}
	
	public void agregarLibro(Libro libro) {
		catalogoLibros.add(libro);
	}
	
	public void agregarSocio(Socio socio) {
		agendaSocios.add(socio);
	}
	
	public void prestarLibro(String isbn, int numeroSocio) {
		Libro libroEncontrado;
		Socio socioAceptado;
		socioAceptado = buscarSocioIdParaPrestar(numeroSocio);
		libroEncontrado = buscarLibroIsbnParaPrestar(isbn);
		if(libroEncontrado != null && socioAceptado != null) {
			System.out.println(socioAceptado.toString() + libroEncontrado.toString()); 
		}
		else {
			System.out.println("Error libro o socio no encontrado");
		}
	}
	
	public Libro buscarLibroIsbnParaPrestar(String isbn) {
		Libro libroEncontrado = null;
		for(Libro libro : catalogoLibros) {
			if(libro.getIsbn().equals(isbn)) {
				if(libro.isDisponible()) {
					libroEncontrado = libro;
					libro.setDisponible(false);
				}
			}
		}
		return libroEncontrado;
	}
	public Socio buscarSocioIdParaPrestar(int numeroSocio) {
		Socio socioEncontrado = null;
		for(Socio socio : agendaSocios) {
			if((socio.getNumeroSocio()) == numeroSocio) {
				socioEncontrado = socio;
			}
		}
		return socioEncontrado;
	}
	
}
