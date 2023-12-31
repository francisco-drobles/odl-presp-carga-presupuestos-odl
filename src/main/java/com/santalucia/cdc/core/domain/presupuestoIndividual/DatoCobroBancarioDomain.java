package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatoCobroBancarioDomain {
    private TipoDomBancario tipoDomBancario;
    private EntidadBancaria entidadBancaria;
    private CharSequence numDigContrNumCuent;
    private CharSequence numDigContrEntidOfic;
    private CharSequence numCuentBanc;
    private CharSequence titulCuentBanc;
    private CharSequence codIban;
    private CharSequence codBic;
}
