/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author T-102
 */
public class usuario {
    private String login;
   private String passord;
  
   public usuario(String login, String passord) {
        this.login = login;
        this.passord = passord;
    }
    public usuario() {
    }
 
    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
