package com.santalucia.cdc.core.domain.objetoAsegurado;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PrimaDomain {
    private double impPrimaTarifa;
    private Double impPrimaBruta;
    private Double impPrimaNoConsumida;
    private Double impPrimaNatural;
    private Double impPrimaNivelada;
}
