package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ImporteDomain {
    private Moneda moneda;
    private double impTotalRecibo;
}
