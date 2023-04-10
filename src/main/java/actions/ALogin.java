/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/ActionSupport.java to edit this template
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

/**
 *
 * @author ADMIN
 */
public class ALogin extends ActionSupport {

    private String nombre;

    private String password;

    public ALogin() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    @RequiredStringValidator(message="Contraseña necesaria")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        return (this.getPassword().equals("1234") && this.getNombre().equals("german")) ? SUCCESS : ERROR;
    }

    @Override
    public void validate() {
    if (this.getNombre() == null || this.getPassword() == null) {
        addFieldError("nombre", getText("nombre.error"));
        addFieldError("password", getText("password.error"));
    } else if (this.getNombre().length() < 5) {
        addFieldError("nombre", "La longitud del nombre es erronea");
    }
    }

}
