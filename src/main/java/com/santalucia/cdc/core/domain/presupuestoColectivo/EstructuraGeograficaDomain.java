package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class EstructuraGeograficaDomain {
    private DomicilioPresupuestoDomain domicilioPresupuestoDomain;
    private CoordenadaDomain coordenadaDomain;
}
