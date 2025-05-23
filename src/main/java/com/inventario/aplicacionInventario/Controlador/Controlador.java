package com.inventario.aplicacionInventario.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.inventario.aplicacionInventario.Modelos.ClienteModelo;
import com.inventario.aplicacionInventario.Modelos.ProductosModelo;
import com.inventario.aplicacionInventario.Servcios.ClienteServicio;
import com.inventario.aplicacionInventario.Servcios.ProductosServicio;

@Controller
public class Controlador {

  @Autowired
  private ProductosServicio productosServicio;

  @Autowired
  private ClienteServicio clienteServicio;

  @GetMapping("/")
  public String index() {
    System.out.println("Entro por index");
    return "index";
  }

  @GetMapping("/productos")
  public String productos(Model model) {

    ProductosModelo producto = new ProductosModelo();

    List<ProductosModelo> lista = this.productosServicio.obtenerProductos();

    model.addAttribute("lista", lista);
    model.addAttribute("producto", producto);
    return "productos";
  }

  @PostMapping("/productos")
  public String guardarProductos(@ModelAttribute ProductosModelo producto) {

    this.productosServicio.guardarProductos(producto);

    return "redirect:/productos";
  }

  @GetMapping("/productos/{id}")
  public String eliminarProductos(@PathVariable("id") Long producto) {

    this.productosServicio.eliminarProductos(producto);

    return "redirect:/productos";
  }

  @GetMapping("/usuarios")
  public String usuarios(Model model) {

    ClienteModelo cliente = new ClienteModelo();
    List<ClienteModelo> lista = this.clienteServicio.obtenerClientes();

    model.addAttribute("lista", lista);
    model.addAttribute("cliente", cliente);

    return "usuarios";
  }

  @PostMapping("/usuarios")
  public String guardarUsuarios(@ModelAttribute ClienteModelo cliente) {

    this.clienteServicio.guardarClientes(cliente);

    return "redirect:/usuarios";
  }

  @GetMapping("/usuarios/{id}")
  public String eliminarUsuarios(@PathVariable("id") Long cliente) {

    this.clienteServicio.eliminarClientes(cliente);

    return "redirect:/usuarios";
  }

}
