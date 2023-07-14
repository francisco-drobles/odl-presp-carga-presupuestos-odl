package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class Campannas {
    private CharSequence codAplicacion;
    private CharSequence idCampanna;
    private CampannaComercial campannaComercial;
    private TipoCampanna tipoCampanna;
    private Incentivo incentivo;
    private CharSequence indCaracIncentivo;
    private Instant fecInicio;
    private Instant fecFinVigencia;
}
