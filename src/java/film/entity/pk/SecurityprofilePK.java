/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISecurityprofile;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SecurityprofilePK implements ISecurityprofilePK {

    private java.lang.String userprofile;
  
    public SecurityprofilePK() {
    }

    public SecurityprofilePK(java.lang.String userprofile) {
        this.userprofile = userprofile;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"securityprofile.userprofile", userprofile}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISecurityprofile.USERPROFILE, userprofile}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getUserprofile() {
        return this.userprofile;
    }

    public void setUserprofile(java.lang.String userprofile) {
        this.userprofile = userprofile;
    }

    public String getKeystring() {
        String key = "";
        if(getUserprofile()!=null) key += getUserprofile().length() + "_" + getUserprofile();
        return key;
    }

    public static SecurityprofilePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String userprofile = keys.substring(0, keylength);
            return new SecurityprofilePK(userprofile);
        }
    }

    public boolean equals(ISecurityprofilePK securityprofilePK2) {
        boolean isequal = securityprofilePK2!=null;
        if(isequal) {
            isequal = isequal && this.userprofile.equals(securityprofilePK2.getUserprofile());
        }
        return isequal;
    }
}
