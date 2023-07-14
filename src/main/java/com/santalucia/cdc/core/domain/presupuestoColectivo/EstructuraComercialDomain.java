package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class EstructuraComercialDomain {
    private CanalMediacionDomain canalMediacionDomain;
    private MedioDistribucionDomain medioDistribucionDomain;
    private AgenciaDomain agenciaDomain;
    private ZonaDomain zonaDomain;
    private DistritoDomain distritoDomain;
    private OficinaDomain oficinaDomain;
    private CharSequence codMediador;
    private TipoMediadorDomain tipoMediadorDomain;
    private TipoColaboradorDomain tipoColaboradorDomain;
    private CharSequence codColaborador;
    private TipoColaboradorIniDomain tipoColaboradorIniDomain;
    private CharSequence codColabInicial;
    private CharSequence codMonitor;
    private CharSequence codMonitorInicial;
    private RedVentaDomain redVentaDomain;
    private CharSequence indTipoMedioCom;
}
