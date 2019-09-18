package net.itinajero.api.entity;

import java.util.Date;

import javax.persistence.*;

//Clase que mapea uno a uno los campos de la tabla mysql "Albums". Sintaxis exactamente igual a una clase de modelo en JPA-MVC, sin ser una clase de modelo per se, ya que estamos ocupando @restcontroller y no @modelatribute en el controlador
@Entity
@Table(name="albums")
public class Album {
	
	@Id // Las anotaciones @Id y @GeneratedValue(strategy=GenerationType.IDENTITY) reconocen el primary key seteado en la @GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String titulo;
	private Date lanzado;
	private String genero;
	private Double precio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getLanzado() {
		return lanzado;
	}
	public void setLanzado(Date lanzado) {
		this.lanzado = lanzado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", titulo=" + titulo + ", lanzado=" + lanzado + ", genero=" + genero + ", precio="
				+ precio + "]";
	}
	
	
	

}
