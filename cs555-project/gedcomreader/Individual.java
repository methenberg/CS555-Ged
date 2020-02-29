/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedcomreader;

import java.util.Date;
import java.util.HashSet;



public class Individual {
    String ID;
    String Name;
    char Gender;
    Date Birthday;
    boolean Alive;
    Date Death;
    HashSet<String> FAMC;
    HashSet<String> FAMS;

    public Individual() {
        this.FAMC = new HashSet();
        this.FAMS = new HashSet();
    }
    
    public void setID (String id) {
        ID = id;
    }
    
    public String getID() {
        return ID;
    }
    
    public void setName (String name) {
        Name = name;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setGender (char gender) {
        Gender = gender;
    }
    
    public char getGender() {
        return Gender;
    }
    
    public void setBirthday (Date birthday) {
        Birthday = birthday;
    }
    
    public Date getBirthday() {
        return Birthday;
    }
    
    public void setAlive (boolean alive) {
        Alive = alive;
    }
    
    public boolean getAlive() {
        return Alive;
    }
    
    public void setDeath (Date death) {
        Death = death;
    }
    
    public Date getDeath () {
        return Death;
    }
    
    public void addFAMC (String famc) {
        FAMC.add(famc);
    }
    
    public HashSet<String> getFAMC() {
        return FAMC;
    }
    
    public void addFAMS (String fams) {
        FAMS.add(fams);
    }
    
    public HashSet<String> getFAMS() {
        return FAMS;
    }
}
