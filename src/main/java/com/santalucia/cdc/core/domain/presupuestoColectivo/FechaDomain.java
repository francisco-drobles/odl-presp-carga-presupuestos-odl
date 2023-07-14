package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class FechaDomain {
    private Instant fecAlta;
    private Instant fecEfectoPoliza;
    private Instant fecFinValidez;
    private Instant fecTarificacion;
    private Instant fecVencPoliza;
    private static final Conversion<?>[] conversions;
}
