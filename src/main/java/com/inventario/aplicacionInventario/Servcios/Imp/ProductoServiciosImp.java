package com.inventario.aplicacionInventario.Servcios.Imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventario.aplicacionInventario.Modelos.ProductosModelo;
import com.inventario.aplicacionInventario.Repositorios.ProductosRepositorio;
import com.inventario.aplicacionInventario.Servcios.ProductosServicio;

@Service
public class ProductoServiciosImp implements ProductosServicio {

  private final ProductosRepositorio productosRepositorio;

  public ProductoServiciosImp(ProductosRepositorio productosRepositorio) {
    this.productosRepositorio = productosRepositorio;
  }

  @Override
  public void guardarProductos(ProductosModelo producto) {
    try {
      productosRepositorio.save(producto);
    } catch (Exception e) {

      System.out.println(e.getMessage());

    }
  }

  @Override
  public List<ProductosModelo> obtenerProductos() {
    return productosRepositorio.findAll();
  }

  @Override
  public void eliminarProductos(Long producto) {

    productosRepositorio.deleteById(producto);
  }

}
