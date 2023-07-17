package com.santalucia.cdc.core.service;

import com.santalucia.cdc.core.domain.CargaODLDomain;
import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.PresupuestoColectivo;

public interface PresupuestosSaverService {
    public void SavePresupuesto (CargaODLDomain cargaODLDomain);
}
