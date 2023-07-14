package com.santalucia.amw.domain.presupuestoIndividual;

import jdk.incubator.vector.VectorOperators;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FechaDomain {
    private Instant fecAlta;
    private Instant fecEfectoPoliza;
    private Instant fecFinValidez;
    private Instant fecTarificacion;
    private Instant fecVencPoliza;
    private static final VectorOperators.Conversion<?>[] conversions;
}
