/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_group;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Art_groupPK implements IArt_groupPK {

    private long groupid;
  
    public Art_groupPK() {
    }

    public Art_groupPK(long groupid) {
        this.groupid = groupid;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"art_group.groupid", groupid}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArt_group.GROUPID, groupid}
        };
        return new Entityvalues(keyfields);
    }

    public long getGroupid() {
        return this.groupid;
    }

    public void setGroupid(long groupid) {
        this.groupid = groupid;
    }

    public String getKeystring() {
        String key = "";
        key += getGroupid();
        return key;
    }

    public static Art_groupPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long groupid = Long.valueOf(keys.substring(0, keylength));
            return new Art_groupPK(groupid);
        }
    }

    public boolean equals(IArt_groupPK art_groupPK2) {
        boolean isequal = art_groupPK2!=null;
        if(isequal) {
            isequal = isequal && this.groupid == art_groupPK2.getGroupid();
        }
        return isequal;
    }
}
