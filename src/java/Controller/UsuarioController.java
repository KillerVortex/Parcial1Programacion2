package Controller;

import Model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author informatica
 */
public class UsuarioController implements Serializable {

    private Usuario user1;
    private Usuario user2;
    private Usuario user3;
    private Usuario user4;
    private List<Usuario> userList;
    private String userName;
    private String userPass;

    /**
     * Creates a new instance of UsuarioController
     */
    public UsuarioController() {

        userList = new ArrayList();
        userName = "";
        userPass = "";
        user1 = new Usuario("1", "1", "admin");

        user2 = new Usuario("2", "2", "admin");

        user3 = new Usuario("3", "3", "admin");

        user4 = new Usuario("4", "4", "admin");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        

    }

    public String login() {

        
        Usuario user = new Usuario();
      
        boolean encontrado = false;

        for (Usuario u: userList) {
            
            if (u.getUserName().equals(userName) && u.getUserPassword().equals(userPass)) {
                encontrado = true;
                user = u;
                break;
            }
        }

        if (encontrado) {
            
            int x = Integer.parseInt(user.getUserName());
            return "example"+x+"?faces-redirect=true";
            
              
           
        }
        
        else {
            userName = "";
            userPass = "";
            return "index?faces-redirect=true";
        }

    
}


    

    public String vaciarLista() {
        userList.clear();
        return "list?faces-redirect=true";
    }

    public boolean isListEmpty() {
        return userList != null && userList.size() > 0;
    }

    public List<Usuario> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<Usuario> userList) {
        this.userList = userList;
    }

    public Usuario getUser1() {
        return user1;
    }

    public Usuario getUser2() {
        return user2;
    }

    public Usuario getUser3() {
        return user3;
    }

    public Usuario getUser4() {
        return user4;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUser1(Usuario user1) {
        this.user1 = user1;
    }

    public void setUser2(Usuario user2) {
        this.user2 = user2;
    }

    public void setUser3(Usuario user3) {
        this.user3 = user3;
    }

    public void setUser4(Usuario user4) {
        this.user4 = user4;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

}
