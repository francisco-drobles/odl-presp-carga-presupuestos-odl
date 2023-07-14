package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class EstructuraGeografica {
    private DomicilioPresupuesto domicilioPresupuesto;
    private Coordenada coordenada;
}
