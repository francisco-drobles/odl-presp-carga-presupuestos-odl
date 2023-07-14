package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoDomain {
    private RamoComercial ramoComercial;
    private ModalidadComercial modalidadComercial;
    private ProductoTecnico productoTecnico;
    private ProductoComercial productoComercial;
    private CharSequence desModalidadInterna;
}
