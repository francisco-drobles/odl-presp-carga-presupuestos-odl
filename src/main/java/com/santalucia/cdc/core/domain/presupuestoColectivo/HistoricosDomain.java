package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class HistoricosDomain {
    private EstadoPresupuestoDomain estadoPresupuestoDomain;
    private Instant fecEstado;
    private CausaEstPresupuestoDomain causaEstPresupuestoDomain;
    private CharSequence numOrdenMovEstado;
    private CharSequence indBloqueoRevision;
    private static final Conversion<?>[] conversions;
}
