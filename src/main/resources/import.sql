-- Insertar roles
INSERT INTO roles (id, nombre) VALUES
                                   (1, 'ADMINISTRADOR'),
                                   (2, 'ACOMODADOR'),
                                   (3, 'CLIENTE');

-- Insertar usuarios (contraseñas: admin123, como123, cliente123)
INSERT INTO usuarios (id, username, password, enabled) VALUES
                                                           (1, 'admin', '{noop}admin123', true),
                                                           (2, 'acomo', '{noop}acomo123', true),
                                                           (3, 'cliente', '{noop}cliente123', true);

-- Asignar roles
INSERT INTO usuario_roles (usuario_id, rol_id) VALUES
                                                   (1, 1), -- admin → ADMINISTRADOR
                                                   (2, 2), -- como → ACOMODADOR
                                                   (3, 3); -- cliente → CLIENTE

-- Resetear secuencias
ALTER SEQUENCE IF EXISTS roles_id_seq RESTART WITH 4;
ALTER SEQUENCE IF EXISTS usuarios_id_seq RESTART WITH 4;