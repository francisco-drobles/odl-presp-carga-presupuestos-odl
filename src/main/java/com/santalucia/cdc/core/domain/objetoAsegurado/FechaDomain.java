package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class FechaDomain {
    private Instant fecEfectoComplemento;
    private Instant fecTarificacion;
    private Instant fecEfectoAgrGarantia;
    private Instant fecExtincion;
}
