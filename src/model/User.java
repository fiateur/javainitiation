/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tncr
 */
public class User {
    private long id ;
    private String firstname ;
    private String lastname ;
    private char sexe ;
    private String telephone ;
    private String email ;
    private String password ;
    private String confirPassword ;
    private boolean isAccountNonLocked ;
    
    //@ManyToOne // sera vu dans SpringBoot
    private Role role ;
    
    private User () {
        
    }

    public User(long id, String firstname, String lastname, char sexe, String telephone, String email, String password, String confirPassword, boolean isAccountNonLocked) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.sexe = sexe;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.confirPassword = confirPassword;
        this.isAccountNonLocked = isAccountNonLocked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirPassword() {
        return confirPassword;
    }

    public void setConfirPassword(String confirPassword) {
        this.confirPassword = confirPassword;
    }

    public boolean isIsAccountNonLocked() {
        return isAccountNonLocked;
    }

    public void setIsAccountNonLocked(boolean isAccountNonLocked) {
        this.isAccountNonLocked = isAccountNonLocked;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
