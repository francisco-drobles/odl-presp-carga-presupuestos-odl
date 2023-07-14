package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class CampannasDomain {
    private CharSequence codAplicacion;
    private CharSequence idCampanna;
    private CampannaComercialDomain campannaComercialDomain;
    private TipoCampannaDomain tipoCampannaDomain;
    private IncentivoDomain incentivoDomain;
    private CharSequence indCaracIncentivo;
    private Instant fecInicio;
    private Instant fecFinVigencia;
}
