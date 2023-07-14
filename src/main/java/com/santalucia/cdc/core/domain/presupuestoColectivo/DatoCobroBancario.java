package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatoCobroBancario {
    private TipoDomBancario tipoDomBancario;
    private EntidadBancaria entidadBancaria;
    private CharSequence numDigContrNumCuent;
    private CharSequence numDigContrEntidOfic;
    private CharSequence numCuentBanc;
    private CharSequence titulCuentBanc;
    private CharSequence codIban;
    private CharSequence codBic;
}
