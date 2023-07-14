package com.santalucia.amw.domain.presupuestoIndividual;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

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
