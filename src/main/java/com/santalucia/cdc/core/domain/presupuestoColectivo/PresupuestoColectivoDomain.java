package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.Metadata;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class PresupuestoColectivoDomain {
    private DatoIdentificativoDomain datoIdentificativoDomain;
    private ProductoDomain productoDomain;
    private FechaYEstadoDomain fechaYEstadoDomain;
    private DatoCobroDomain datoCobroDomain;
    private FiguraDomain figuraDomain;
    private EstructuraComercialDomain estructuraComercialDomain;
    private EstructuraGeograficaDomain estructuraGeograficaDomain;
    private List<CampannasDomain> campannas;
    private List<ObjetosAseguradosDomain> objetosAseguradoDomains;
    private Metadata metadata;
}
