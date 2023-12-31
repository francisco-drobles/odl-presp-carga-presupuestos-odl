package com.santalucia.amw.domain.presupuestoIndividual;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FiguraDomain {
    private CharSequence numAsegurados;
    private List<DatosPersonales> datosPersonales;
}
