package com.mx.MSGetAccounts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Anotación para indicar que esta clase es una entidad persistente
@Entity
//Especificación del nombre de la tabla en la base de datos
@Table(name = "transferencias")
//Lombok: genera getters para acceder a los atributos de la entidad
@Getter
//Lombok: genera un constructor sin argumentos
@NoArgsConstructor
//Lombok: genera un constructor con todos los argumentos
@AllArgsConstructor
public class TransferAccount {
	
	// Identificador de la transferencia (clave primaria)
	@Id
    @Column(name = "id_transferencia", columnDefinition = "NUMBER")
    private int idTransferencia;
	
	// Identificador del usuario al que pertenece la transferencia
	@Column(name = "id_usuario", columnDefinition = "NUMBER", nullable = false)
	int idUsuario;
    
	// Identificador de la cuenta de origen
    @Column(name = "id_cuenta_origen", columnDefinition = "NUMBER", nullable = false)
    private int idCuentaOrigen;
    
 // Identificador de la cuenta de destino
    @Column(name = "id_cuenta_destino", columnDefinition = "NUMBER", nullable = false)
    private int idCuentaDestino;
    
 // Concepto o descripción de la transferencia
    @Column(name = "concepto", columnDefinition = "VARCHAR2(50)", nullable = false)
    private String concepto;
    
 // Monto de la transferencia
    @Column(name = "monto", columnDefinition = "NUMBER", nullable = false)
    private Double monto;
    
 // Fecha de la transferencia
    @Column(name = "fecha", columnDefinition = "DATE", nullable = false)
    private String fecha;

}
