package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ComposicionesGarantias {
    private Garantia garantia;
    private CharSequence indOrigenRecomendador;
    private List<ComposicionesSubgarant> composicionesSubgarant;
    private List<ComposicionesServicios> composicionesServicios;
    private List<ComposicionesCaract> composicionesCaract;
}
