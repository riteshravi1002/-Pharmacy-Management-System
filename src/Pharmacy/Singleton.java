/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacy;

/**
 *
 * @author A-jay
 */
public class Singleton {
    private Singleton() {
}
    String user;
    String pass;
private static Singleton uniqInstance;
public static Singleton getInstance() {
    if (uniqInstance == null) 
         uniqInstance = new Singleton();
    return uniqInstance;
}
public void setArrayList(String user,String pass)
 {
      this.user = user;

     }
 public String getUser()
 {
      return this.user;

     }
 public void setUser(String user)
 {
     this.user = user;

     }
  public void setPass(String pass)
 {
     this.pass = pass;

     }
 public String getPass()
 {
      return this.pass;

     }

}
