package com.santalucia.cdc.core.domain.declaracion;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TipoDeclaracionDomain {
    private CharSequence codOrigen;
    private CharSequence codMDL;
    private CharSequence descOrigen;
}
