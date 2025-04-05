package com.inventario.aplicacionInventario.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventario.aplicacionInventario.Modelos.ClienteModelo;

@Repository
public interface ClienteRepositorio extends JpaRepository<ClienteModelo, Long> {

}
