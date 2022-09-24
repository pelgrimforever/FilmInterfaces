/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_academy;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Art_academyPK implements IArt_academyPK {

    private long academyid;
  
    public Art_academyPK() {
    }

    public Art_academyPK(long academyid) {
        this.academyid = academyid;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"art_academy.academyid", academyid}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArt_academy.ACADEMYID, academyid}
        };
        return new Entityvalues(keyfields);
    }

    public long getAcademyid() {
        return this.academyid;
    }

    public void setAcademyid(long academyid) {
        this.academyid = academyid;
    }

    public String getKeystring() {
        String key = "";
        key += getAcademyid();
        return key;
    }

    public static Art_academyPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long academyid = Long.valueOf(keys.substring(0, keylength));
            return new Art_academyPK(academyid);
        }
    }

    public boolean equals(IArt_academyPK art_academyPK2) {
        boolean isequal = art_academyPK2!=null;
        if(isequal) {
            isequal = isequal && this.academyid == art_academyPK2.getAcademyid();
        }
        return isequal;
    }
}
