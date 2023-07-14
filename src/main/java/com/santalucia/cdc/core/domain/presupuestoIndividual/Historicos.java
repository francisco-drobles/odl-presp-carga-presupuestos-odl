package com.santalucia.amw.domain.presupuestoIndividual;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Historicos {
    private EstadoPresupuesto estadoPresupuesto;
    private Instant fecEstado;
    private CausaEstPresupuesto causaEstPresupuesto;
    private CharSequence numOrdenMovEstado;
    private CharSequence indBloqueoRevision;
}
