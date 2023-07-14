package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class FechaYEstadoDomain {
    private FechaDomain fechaDomain;
    private EstadoDomain estadoDomain;
}
