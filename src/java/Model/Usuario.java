package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Usuario  {
    
    private String userName;
    private String userPassword;
    private String userProgram;
    private String userType;
    private boolean esBecado;
    private String estado;
    private String nombreCompleto;  

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public boolean isEsBecado() {
        return esBecado;
    }

    public void setEsBecado(boolean esBecado) {
        this.esBecado = esBecado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public Usuario()
    {
    }
    
    
    public Usuario(String pUserName, String pUserPasString, String pUserProgam)
    {
        userName=pUserName;
        userPassword= pUserPasString;
        userProgram =pUserProgam;
              
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserProgram() {
        return userProgram;
    }

    public void setUserProgram(String userProgram) {
        this.userProgram = userProgram;
    }


        
        
        
        
    }
    
    


