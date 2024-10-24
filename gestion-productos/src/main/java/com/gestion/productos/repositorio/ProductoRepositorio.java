package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Producto;




public interface ProductoRepositorio extends JpaRepository<Producto, Long>{

	@Query("Select p From Producto p WHERE "
			+ " CONCAT (p.id, p.nombre, p.marca, p.hecho_en, p.precio)"
			+ "LIKE %?1%")
	public List<Producto> findAll(String palabraClave);
}
