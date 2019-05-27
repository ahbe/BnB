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
public class admin extends user implements authentication
{
    
    public admin(String a, String b, String c, String d, String e) {
        super(a, b, c, d, e);
    }
    public Boolean banUser(String a){
        Boolean c = false;
        // we will use the database to ban a user
        return c;
    }
    public void addTrip(){
        // we will use the trip constructor for adding one
    }
    public void deleteTrip(){
        // we will use the database to delete a trip
    }

    @Override
    public Boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
