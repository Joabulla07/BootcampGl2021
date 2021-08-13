package com.joanna.PatronBuilder;

public class UsuarioBuilder implements  IBuilder{
    private String email;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    public UsuarioBuilder(){};

    public UsuarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public UsuarioBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public UsuarioBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    @Override
    public Usuario build() {
        Usuario usuario = new Usuario();
        usuario.setEmail(this.email);
        usuario.setNombre(this.nombre);
        usuario.setApellido(this.apellido);
        usuario.setTelefono(this.telefono);
        usuario.setDireccion(this.direccion);
       return usuario;
    }


}
