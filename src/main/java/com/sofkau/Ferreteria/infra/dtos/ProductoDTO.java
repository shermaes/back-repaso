package com.sofkau.Ferreteria.infra.dtos;

import com.sofkau.Ferreteria.domain.Proveedor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductoDTO {

    private final String id;
    private final String fechaCreacion;
    private final String nombre;
    private final String precio;
    private final int unidadesDisponibles;
    private final int maximoUnidades;
    private final int minimoUnidades;
    private final Proveedor proveedor;
}
