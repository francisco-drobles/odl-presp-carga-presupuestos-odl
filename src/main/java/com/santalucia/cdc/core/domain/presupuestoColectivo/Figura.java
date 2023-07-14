package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class Figura {
    private CharSequence numAsegurados;
    private List<DatosPersonales> datosPersonales;
}
