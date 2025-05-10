package com.inventario.aplicacionInventario.Servcios;

import java.util.List;

import com.inventario.aplicacionInventario.Modelos.ClienteModelo;

public interface ClienteServicio {

  public void guardarClientes(ClienteModelo cliente);

  public List<ClienteModelo> obtenerClientes();

  public ClienteModelo BuscarClientes(Long id);

  public void actualizarClientes(ClienteModelo cliente, Long id);

  public void eliminarClientes(Long cliente);

}
