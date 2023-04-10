/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/ActionSupport.java to edit this template
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;

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

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String execute() throws Exception {
        if(this.getPassword().equals("1234") && this.getNombre().equals("german")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
}
