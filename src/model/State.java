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

// @Setter
//@Getter
//@AllAddContructor
//@NoArgConstructor
public class State {
    private long id ;
    private String code ; 
    private String description ;
    
    public State() {
        
    };

    public State(long id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
