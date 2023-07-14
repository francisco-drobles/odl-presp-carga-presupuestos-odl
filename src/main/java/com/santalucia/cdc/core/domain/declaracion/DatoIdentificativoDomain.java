package com.santalucia.cdc.core.domain.declaracion;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.TipoDeclaracion;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatoIdentificativoDomain {
    private CharSequence idDeclaracionesODL;
    private CharSequence idObjAsegODL;
    private CharSequence idPresupuestoODL;
    private CharSequence numVersionPresOrigen;
    private CharSequence numVersionPresODL;
    private CharSequence numIdDeclPre;
    private CharSequence idMensaje;
    private TipoDeclaracionDomain tipoDeclaracionDomain;
}
