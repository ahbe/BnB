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
public class client extends user implements authentication 
{
    protected long creditCardNum;
    protected int ccv;
    protected int mobile;
    protected String email;
    
    public client(String a, String b, String c, String d, String e , long f ,int g,int h ,String i) {
        super(a, b, c, d, e);
        creditCardNum = f;
        ccv = g;
        mobile =h;
        email = i;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public void createAcc () {
        // database add
    }
    public void deleteAcc() {
        // database deletion
    }
    public void buyTicket(){
        // add ticket to database
    }
    public void viewTickets () {
        // access database
    }
    public void cancelPurchase (String id) {
        // use the id to delete from database
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
