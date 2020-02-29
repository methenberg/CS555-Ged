/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedcomreader;

import java.util.Date;
import java.util.HashSet;


public class Family {
    String ID;
    Date Married;
    Date Divorced;
    String HusbandID;
    String HusbandName;
    String WifeID;
    String WifeName;
    HashSet<String> Children;

    public Family() {
        this.ID = null;
        this.Married = null;
        this.Divorced = null;
        this.HusbandID = null;
        this.HusbandName = null;
        this.WifeID = null;
        this.WifeName = null;
        this.Children = new HashSet();
    }
    
    public void setID (String id) {
        ID = id;
    }
    
    public String getID () {
        return ID;
    }
    
    public void setMarried (Date married) {
        Married = married;
    }
    
    public Date getMarried () {
        return Married;
    }
    
    public void setDivorced (Date divorced) {
        Divorced = divorced;
    }
    
    public Date getDivorced () {
        return Divorced;
    }
    
    public void setHusbandID (String hunsbandID) {
        HusbandID = hunsbandID;
    }
    public String getHusbandID () {
        return HusbandID;
    }
    
    public void setHusbandName (String husbandName) {
        HusbandName = husbandName;
    }
    
    public String getHusbandName () {
        return HusbandName;
    }
    
    public void setWifeID (String wifeID) {
        WifeID = wifeID;
    }
    
    public String getWifeID () {
        return WifeID;
    }
    
    public void setWifeName (String wifeName) {
        WifeName = wifeName;
    }
    
    public String getWifeName () {
        return WifeName;
    }
    
    public void setChildren (HashSet<String> children) {
        Children = children;
    }
            
    public HashSet<String> getChildren () {
        return Children;
    }
    
    public void addChildren (String CHIL) {
        Children.add(CHIL);
    }
}
