package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatoIdentificativoDomain {
    private CharSequence idObjAsegODL;
    private CharSequence idPresupuestoODL;
    private CharSequence numOrden;
    private CharSequence numVersionPresOrigen;
    private CharSequence numVersionPresODL;
    private CharSequence idMensaje;
    private TipoObjAsegDomain tipoObjAsegDomain;
    private CharSequence desLocalidadTarif;
    private CharSequence desProvinciaTarif;
    private CharSequence indCategoria;
    private CharSequence codModServicio;
    private CharSequence codTipoServicio;
    private CharSequence codSubtipoServicio;
}
