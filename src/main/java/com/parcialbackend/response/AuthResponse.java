package com.parcialbackend.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthResponse {

    private String username;
    private String rol;
    private String mensaje;


    public AuthResponse(String username, String rol, String mensaje) {
        this.username = username;
        this.rol = rol;
        this.mensaje = mensaje;
    }

}
