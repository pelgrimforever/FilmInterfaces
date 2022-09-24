/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_subgroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Art_subgroupPK implements IArt_subgroupPK {

    private int subgroupid;
  
    public Art_subgroupPK() {
    }

    public Art_subgroupPK(int subgroupid) {
        this.subgroupid = subgroupid;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"art_subgroup.subgroupid", subgroupid}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArt_subgroup.SUBGROUPID, subgroupid}
        };
        return new Entityvalues(keyfields);
    }

    public int getSubgroupid() {
        return this.subgroupid;
    }

    public void setSubgroupid(int subgroupid) {
        this.subgroupid = subgroupid;
    }

    public String getKeystring() {
        String key = "";
        key += getSubgroupid();
        return key;
    }

    public static Art_subgroupPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int subgroupid = Integer.valueOf(keys.substring(0, keylength));
            return new Art_subgroupPK(subgroupid);
        }
    }

    public boolean equals(IArt_subgroupPK art_subgroupPK2) {
        boolean isequal = art_subgroupPK2!=null;
        if(isequal) {
            isequal = isequal && this.subgroupid == art_subgroupPK2.getSubgroupid();
        }
        return isequal;
    }
}
