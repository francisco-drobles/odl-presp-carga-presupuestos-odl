package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class CampannasDomain {
    private CharSequence idCampanna;
    private CampannaComercialDomain campannaComercialDomain;
    private TipoCampannaDomain tipoCampannaDomain;
    private IncentivoCampannaDomain incentivoCampannaDomain;
    private CharSequence indCaracIncentivo;
    private Instant fecInicio;
    private Instant fecFinVigencia;
}
