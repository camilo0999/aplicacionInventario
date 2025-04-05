package com.inventario.aplicacionInventario.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "clientes")
public class ClienteModelo {

  @Id
  private Long id;

  private String nombre;

  private String cedula;

  private String telefono;

  private String correo;

}
