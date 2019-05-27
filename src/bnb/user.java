/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnb;

/**
 *
 * @author ahbe1
 */
public class user {
    protected String id ;
    protected String pass;
    protected String username;
    protected String fname;
    protected String lname;
    protected enum gender {male , female , other};
    
   user(String a, String b, String c ,String d , String e )
    {
        id = a;
        pass = b;
        username = c;
        fname = d;
        lname = e;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
   
}
