package com.santalucia.amw.domain.presupuestoIndividual;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NivelesPresupuestosDomain {
    private TipoPrima tipoPrima;
    private Double indModServEconomio;
    private Prima prima;
    private List<Sobreprimas> sobreprimas;
    private List<BonificacionesDesc> bonificacionesDesc;
    private List<Impuestos> impuestos;
}
