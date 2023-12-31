package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CoordenadaDomain {
    private TipoCoordenada tipoCoordenada;
    private CharSequence numCoordX;
    private CharSequence numCoordY;
    private CharSequence indSistema;
}
