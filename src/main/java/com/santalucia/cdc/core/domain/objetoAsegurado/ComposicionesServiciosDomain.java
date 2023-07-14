package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ComposicionesServiciosDomain {
    private CharSequence idServicio;
    private SubgarantiaDomain subgarantiaDomain;
    private Double impCosteServicio;
    private CharSequence codObligatoriedadSerOrigen;
    private CharSequence codObligatoriedadSerMDL;
    private CharSequence descObligatoriedadSerOrigen;
}
