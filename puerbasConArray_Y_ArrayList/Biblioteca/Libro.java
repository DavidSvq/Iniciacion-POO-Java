package puerbasConArray_Y_ArrayList.Biblioteca;

import java.util.Scanner;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private boolean disponible;
	/**
	 * 
	 */
	public Libro() {
		Scanner tcld = new Scanner(System.in);
		System.out.println("Introduce el título:");
		titulo = tcld.nextLine();
		System.out.println("Introduce el autor: ");
		autor = tcld.nextLine();
		System.out.println("Introduce el isbn:");
		isbn = tcld.nextLine();	
	}
	/**
	 * @param titulo
	 * @param autor
	 * @param isbn
	 */
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + "]";
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
