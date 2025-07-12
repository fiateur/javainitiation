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
public class HabilitationRole {
    //ManyToOne
    private Habilitation habilitation ;
    //ManyToOne
    private Role role ;
    private boolean activeted ;

    public HabilitationRole(Habilitation habilitation, Role role, boolean activeted) {
        this.habilitation = habilitation;
        this.role = role;
        this.activeted = activeted;
    }

    public Habilitation getHabilitation() {
        return habilitation;
    }

    public void setHabilitation(Habilitation habilitation) {
        this.habilitation = habilitation;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isActiveted() {
        return activeted;
    }

    public void setActiveted(boolean activeted) {
        this.activeted = activeted;
    }
    
    
}
