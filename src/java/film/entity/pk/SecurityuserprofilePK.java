/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISecurityuserprofile;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SecurityuserprofilePK implements ISecurityuserprofilePK {

    private ISecurityprofilePK securityprofilePK = new SecurityprofilePK();
    private java.lang.String siteusername;
  
    public SecurityuserprofilePK() {
    }

    public SecurityuserprofilePK(java.lang.String siteusername, java.lang.String userprofile) {
        this.securityprofilePK = new SecurityprofilePK(userprofile);
        this.siteusername = siteusername;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"securityuserprofile.userprofile", securityprofilePK.getUserprofile()}, 
            {"securityuserprofile.siteusername", siteusername}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISecurityuserprofile.USERPROFILE, securityprofilePK.getUserprofile()}, 
            {ISecurityuserprofile.SITEUSERNAME, siteusername}
        };
        return new Entityvalues(keyfields);
    }

    public ISecurityprofilePK getSecurityprofilePK() {
        return this.securityprofilePK;
    }

    public void setSecurityprofilePK(ISecurityprofilePK securityprofilePK) {
        this.securityprofilePK = securityprofilePK;
    }

    public java.lang.String getUserprofile() {
        return this.securityprofilePK.getUserprofile();
    }

    public void setUserprofile(java.lang.String userprofile) {
        this.securityprofilePK.setUserprofile(userprofile);
    }

    public java.lang.String getSiteusername() {
        return this.siteusername;
    }

    public void setSiteusername(java.lang.String siteusername) {
        this.siteusername = siteusername;
    }

    public String getKeystring() {
        String key = "";
        if(getSiteusername()!=null) key += getSiteusername().length() + "_" + getSiteusername();
        key += "_";

        if(getUserprofile()!=null) key += getUserprofile().length() + "_" + getUserprofile();
        return key;
    }

    public static SecurityuserprofilePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String siteusername = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String userprofile = keys.substring(0, keylength);
            return new SecurityuserprofilePK(siteusername, userprofile);
        }
    }

    public boolean equals(ISecurityuserprofilePK securityuserprofilePK2) {
        boolean isequal = securityuserprofilePK2!=null;
        if(isequal) {
            isequal = isequal && this.securityprofilePK.equals(securityuserprofilePK2.getSecurityprofilePK());
            isequal = isequal && this.siteusername.equals(securityuserprofilePK2.getSiteusername());
        }
        return isequal;
    }
}
