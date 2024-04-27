package com.mx.MSGetAccounts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transferencias")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TransferAccount {
	
	@Id
    @Column(name = "id_transferencia", columnDefinition = "NUMBER" , nullable = false)
    private int idTransferencia;
    
    @Column(name = "id_cuenta_origen", columnDefinition = "NUMBER", nullable = false)
    private int idCuentaOrigen;
    
    @Column(name = "id_cuenta_destino", columnDefinition = "NUMBER", nullable = false)
    private int idCuentaDestino;
    
    @Column(name = "concepto", columnDefinition = "VARCHAR2(50)", nullable = false)
    private String concepto;
    
    @Column(name = "monto", columnDefinition = "NUMBER", nullable = false)
    private Double monto;
    
    @Column(name = "fecha", columnDefinition = "DATE", nullable = false)
    private String fecha;

}
