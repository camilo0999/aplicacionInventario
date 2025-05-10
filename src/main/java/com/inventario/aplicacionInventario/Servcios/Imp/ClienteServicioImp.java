package com.inventario.aplicacionInventario.Servcios.Imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventario.aplicacionInventario.Modelos.ClienteModelo;
import com.inventario.aplicacionInventario.Repositorios.ClienteRepositorio;
import com.inventario.aplicacionInventario.Servcios.ClienteServicio;

@Service
public class ClienteServicioImp implements ClienteServicio {

  private final ClienteRepositorio clienteRepositorio;

  public ClienteServicioImp(ClienteRepositorio clienteRepositorio) {
    this.clienteRepositorio = clienteRepositorio;
  }

  @Override
  public void guardarClientes(ClienteModelo cliente) {
    try {
      clienteRepositorio.save(cliente);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public List<ClienteModelo> obtenerClientes() {

    return clienteRepositorio.findAll();
  }

  @Override
  public ClienteModelo BuscarClientes(Long id) {

    try {
      return clienteRepositorio.findById(id).get();
    } catch (Exception e) {

      System.out.println(e.getMessage());
      return null;
    }
  }

  @Override
  public void actualizarClientes(ClienteModelo cliente, Long id) {

    try {

      ClienteModelo clienteActualizado = BuscarClientes(id);
      clienteActualizado.setNombre(cliente.getNombre());
      clienteActualizado.setCedula(cliente.getCedula());
      clienteActualizado.setTelefono(cliente.getTelefono());
      clienteActualizado.setCorreo(cliente.getCorreo());
      clienteRepositorio.save(clienteActualizado);
    } catch (Exception e) {

      System.out.println(e.getMessage());

    }

  }

  @Override
  public void eliminarClientes(Long cliente) {

    try {
      clienteRepositorio.deleteById(cliente);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
