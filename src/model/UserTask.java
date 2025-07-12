/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author tncr
 */
public class UserTask {
    private long id;
    //@ManyToOne
    private User user;
    //@ManyToOne
    private Task task;
    private Date datecreation ;
    
    private UserTask(){
        
    }

    public UserTask(long id, User user, Task task, Date datecreation) {
        this.id = id;
        this.user = user;
        this.task = task;
        this.datecreation = datecreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
    
}
