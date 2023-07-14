package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class CoordenadaDomain {
    private TipoCoordenadaDomain tipoCoordeanda;
    private CharSequence numCoordX;
    private CharSequence numCoordY;
    private CharSequence indSistema;
}
