package com.gestion.productos.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 60)
	private String nombre;
	@Column(nullable = false, length = 60)
	private String marca;
	@Column(nullable = false, length = 60)
	private String hecho_en;
	@Column(nullable = false, length = 60)
	private float precio;

	public Producto() {
		super();
	}

	public Producto(Long id, String nombre, String marca, String hechoEn, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.hecho_en = hechoEn;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getHecho_en() {
		return hecho_en;
	}

	public void setHecho_en(String hechoEn) {
		this.hecho_en = hechoEn;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
