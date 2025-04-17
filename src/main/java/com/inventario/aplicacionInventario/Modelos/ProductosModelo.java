package com.inventario.aplicacionInventario.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "productos")
@ToString
public class ProductosModelo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;

  private String descripcion;

  private Double precio;

  private int stock;

  public ProductosModelo() {
  }

  public ProductosModelo(String nombre, String descripcion, Double precio, int stock) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
  }

  public ProductosModelo(Long id, String nombre, String descripcion, Double precio, int stock) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
  }

}
