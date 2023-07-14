package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class MediosDeContactosDomain {
    private MedioContactoDomain medioContactoDomain;
    private PaisOrigenDomain paisOrigenDomain;
    private CharSequence numTelefono;
    private CharSequence nomCorreoElectronico;
}
