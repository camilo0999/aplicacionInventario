package com.inventario.aplicacionInventario.Servcios;

import java.util.List;

import com.inventario.aplicacionInventario.Modelos.ProductosModelo;

public interface ProductosServicio {

  public void guardarProductos(ProductosModelo producto);

  public List<ProductosModelo> obtenerProductos();

  public void eliminarProductos(Long producto);

}
