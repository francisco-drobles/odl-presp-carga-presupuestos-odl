package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class FiguraDomain {
    private CharSequence numAsegurados;
    private List<DatosPersonalesDomain> datosPersonaleDomains;
}
