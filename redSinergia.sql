-- Crear tabla de usuarios
CREATE TABLE usuarios (
    id_usuario NUMBER PRIMARY KEY,
    nombre VARCHAR2(50),
    correo VARCHAR2(100),
    contraseña VARCHAR2(100)
);

-- Crear tabla de cuentas
CREATE TABLE cuentas (
    id_cuenta NUMBER PRIMARY KEY,
    id_usuario NUMBER,
    tipo_cuenta VARCHAR2(50),
    saldo NUMBER,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Crear tabla de transferencias
CREATE TABLE transferencias (
    id_transferencia NUMBER PRIMARY KEY,
    id_usuario NUMBER,
    id_cuenta_origen NUMBER,
    id_cuenta_destino NUMBER,
    concepto VARCHAR2(50),
    monto NUMBER,
    fecha VARCHAR2(50), -- Cambiada a VARCHAR2
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_cuenta_origen) REFERENCES cuentas(id_cuenta),
    FOREIGN KEY (id_cuenta_destino) REFERENCES cuentas(id_cuenta)
);


CREATE SEQUENCE transferencias_seq
  START WITH 1
  INCREMENT BY 1;

CREATE TABLE transferencias (
    id_transferencia NUMBER PRIMARY KEY,
    id_usuario NUMBER,
    id_cuenta_origen NUMBER,
    id_cuenta_destino NUMBER,
    concepto VARCHAR2(50),
    monto NUMBER,
    fecha VARCHAR2(50),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_cuenta_origen) REFERENCES cuentas(id_cuenta),
    FOREIGN KEY (id_cuenta_destino) REFERENCES cuentas(id_cuenta)
);



-- Inserciones de prueba para la tabla usuarios
INSERT INTO usuarios (id_usuario, nombre, correo, contraseña) VALUES (1, 'Juan Pérez', 'jUan%asz', 'cOntraseña23');
INSERT INTO usuarios (id_usuario, nombre, correo, contraseña) VALUES (2, 'María González', 'marsa13m', 'qw$eRty456');
INSERT INTO usuarios (id_usuario, nombre, correo, contraseña) VALUES (3, 'Pedro Martínez', 'pesjh12"f', 'cLave89');
INSERT INTO usuarios (id_usuario, nombre, correo, contraseña) VALUES (4, 'Ana López', 'saqdsfsda', 'Gsta31s8!');
INSERT INTO usuarios (id_usuario, nombre, correo, contraseña) VALUES (5, 'Carlos Rodríguez', 'carlos23%!', 'sqdS32sa%');
INSERT INTO usuarios (id_usuario, nombre, correo, contraseña) VALUES (6, 'Laura Sánchez', 'lauraExp$"', 'LsuhTb78!');

-- Inserciones de prueba para la tabla cuentas
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000001, 1, 'Cuenta de ahorros', 5000);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000002, 1, 'Cuenta corriente', 10000);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000003, 2, 'Cuenta de ahorros', 7500);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000004, 3, 'Cuenta de ahorros', 3000);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000005, 4, 'Cuenta de ahorros', 1500.00);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000006, 4, 'Cuenta corriente', 500.00);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000007, 5, 'Cuenta de ahorros', 2000.00);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000008, 5, 'Cuenta corriente', 1000.00);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000009, 6, 'Cuenta de ahorros', 3000.00);
INSERT INTO cuentas (id_cuenta, id_usuario, tipo_cuenta, saldo) VALUES (10000010, 6, 'Cuenta corriente', 200.00);

-- Inserciones de prueba para la tabla transferencias
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (1, 1, 10000001, 10000002, 'Pago de factura', 500, '28/abril/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (2, 1, 10000002, 10000001, 'Transferencia ahorros', 200, '29/abril/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (3, 2, 10000003, 10000001, 'Pago de deuda', 1000, '30/abril/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (4, 3, 10000004, 10000001, 'Compra en línea', 500, '01/mayo/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (5, 4, 10000005, 10000006, 'Pago de factura', 200.00, '02/mayo/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (6, 4, 10000006, 10000005, 'Transferencia a otra cuenta', 300.00, '03/mayo/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (7, 5, 10000007, 10000008, 'Compra en línea', 150.00, '04/mayo/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (8, 5, 10000008, 10000007, 'Transferencia a amigo', 50.00, '05/mayo/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (9, 6, 10000009, 10000010, 'Pago de alquiler', 800.00, '06/mayo/2024');
INSERT INTO transferencias (id_transferencia, id_usuario, id_cuenta_origen, id_cuenta_destino, concepto, monto, fecha) VALUES (10, 6, 10000010, 10000009, 'Transferencia a cuenta de ahorros', 200.00, '07/mayo/2024');


COMMIT;



