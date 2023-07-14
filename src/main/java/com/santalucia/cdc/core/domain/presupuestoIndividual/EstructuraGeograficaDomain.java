package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EstructuraGeograficaDomain {
    private DomicilioPresupuesto domicilioPresupuesto;
    private Coordenada coordenada;
}
