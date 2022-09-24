/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ITree7subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Tree7subjectPK implements ITree7subjectPK {

    private long subjectid;
  
    public Tree7subjectPK() {
    }

    public Tree7subjectPK(long subjectid) {
        this.subjectid = subjectid;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"tree7subject.subjectid", subjectid}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ITree7subject.SUBJECTID, subjectid}
        };
        return new Entityvalues(keyfields);
    }

    public long getSubjectid() {
        return this.subjectid;
    }

    public void setSubjectid(long subjectid) {
        this.subjectid = subjectid;
    }

    public String getKeystring() {
        String key = "";
        key += getSubjectid();
        return key;
    }

    public static Tree7subjectPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long subjectid = Long.valueOf(keys.substring(0, keylength));
            return new Tree7subjectPK(subjectid);
        }
    }

    public boolean equals(ITree7subjectPK tree7subjectPK2) {
        boolean isequal = tree7subjectPK2!=null;
        if(isequal) {
            isequal = isequal && this.subjectid == tree7subjectPK2.getSubjectid();
        }
        return isequal;
    }
}
