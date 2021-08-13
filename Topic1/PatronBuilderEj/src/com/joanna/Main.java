package com.joanna;

import com.joanna.PatronBuilder.Usuario;
import com.joanna.PatronBuilder.UsuarioBuilder;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new UsuarioBuilder().email("nombre.apellido@gmail.com").
                nombre("Nombre").apellido("Apellido").
                telefono("555123456").
                direccion("Rue el Percebe 13").build();

        System.out.println(usuario);
    }
}
