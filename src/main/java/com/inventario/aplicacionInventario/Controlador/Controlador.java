package com.inventario.aplicacionInventario.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

  @GetMapping("/")
  public String index() {

    System.out.println("Entro por index");
    return "index";
  }

  @GetMapping("/productos")
  public String productos() {

    System.out.println("Entro por productos");
    return "productos";
  }

  @GetMapping("/usuarios")
  public String usuarios() {

    System.out.println("Entro por usuarios");
    return "usuarios";
  }

}
