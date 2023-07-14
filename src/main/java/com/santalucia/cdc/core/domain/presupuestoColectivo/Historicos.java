package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class Historicos {
    private EstadoPresupuesto estadoPresupuesto;
    private Instant fecEstado;
    private CausaEstPresupuesto causaEstPresupuesto;
    private CharSequence numOrdenMovEstado;
    private CharSequence indBloqueoRevision;
    private static final Conversion<?>[] conversions;
}
