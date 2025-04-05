package com.inventario.aplicacionInventario.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventario.aplicacionInventario.Modelos.ProductosModelo;

@Repository
public interface ProductosRepositorio extends JpaRepository<ProductosModelo, Long> {

}
