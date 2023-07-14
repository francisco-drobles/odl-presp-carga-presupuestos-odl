package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ComposicionesServicios {
    private CharSequence idServicio;
    private Subgarantia subgarantia;
    private Double impCosteServicio;
    private CharSequence codObligatoriedadSerOrigen;
    private CharSequence codObligatoriedadSerMDL;
    private CharSequence descObligatoriedadSerOrigen;
}
