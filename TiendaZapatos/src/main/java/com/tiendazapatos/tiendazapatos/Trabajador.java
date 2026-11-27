package com.tiendazapatos.tiendazapatos;

public class Trabajador {

    public Trabajador(String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento, String direccion, Long telefono, String correo, Sexo sexo, NivelFormacion formacion, Cargo cargo, Turno turno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.sexo = sexo;
        this.formacion = formacion;
        this.cargo = cargo;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public NivelFormacion getFormacion() {
        return formacion;
    }

    public void setFormacion(NivelFormacion formacion) {
        this.formacion = formacion;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;
    private String direccion;
    private Long telefono;
    private String correo;
    private Sexo sexo;
    private NivelFormacion formacion;
    private Cargo cargo;
    private Turno turno;
}

