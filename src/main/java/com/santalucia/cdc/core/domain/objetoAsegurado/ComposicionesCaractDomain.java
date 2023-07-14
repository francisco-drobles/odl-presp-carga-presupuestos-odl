package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ComposicionesCaractDomain {
    private CaracGarantiaDomain caracGarantiaDomain;
    private CharSequence descRespuestaCarac;
}
