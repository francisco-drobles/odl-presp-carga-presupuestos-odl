package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class Campannas {
    private CharSequence idCampanna;
    private CampannaComercial campannaComercial;
    private TipoCampanna tipoCampanna;
    private IncentivoCampanna incentivoCampanna;
    private CharSequence indCaracIncentivo;
    private Instant fecInicio;
    private Instant fecFinVigencia;
}
