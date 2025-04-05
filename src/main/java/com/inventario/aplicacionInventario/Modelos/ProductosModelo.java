package com.inventario.aplicacionInventario.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "productos")
public class ProductosModelo {

  @Id
  private Long id;

  private String nombre;

  private String descripcion;

  private Double precio;

  private int stock;

}
