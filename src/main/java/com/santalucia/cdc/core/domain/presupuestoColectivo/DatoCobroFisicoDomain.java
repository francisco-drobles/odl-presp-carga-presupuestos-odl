package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatoCobroFisicoDomain {
    private TipoDomCobroDomainDomain tipoDomCobroDomainDomain;
    private PaisDomain paisDomain;
    private ProvinciaDomain provinciaDomain;
    private LocalidadDomain localidadDomain;
    private CharSequence codMunicipio;
    private CharSequence codPostal;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucleoPobla;
    private DenomPoblaPersDomain denomPoblaPersDomain;
    private TipoViaDomain tipoViaDomain;
    private CharSequence descDomicilio;
    private CharSequence numDomicilio;
    private CharSequence compNumDomic;
    private CharSequence numBloqueDomic;
    private CharSequence numPortalDomic;
    private CharSequence numEscalDomic;
    private CharSequence numPisoDomic;
    private CharSequence numPuertaDomic;
    private CharSequence otrosDatosDomic;
}
