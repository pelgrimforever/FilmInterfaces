/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ICreator;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class CreatorPK implements ICreatorPK {

    private java.lang.String creatorid;
  
    public CreatorPK() {
    }

    public CreatorPK(java.lang.String creatorid) {
        this.creatorid = creatorid;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"creator.creatorid", creatorid}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ICreator.CREATORID, creatorid}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getCreatorid() {
        return this.creatorid;
    }

    public void setCreatorid(java.lang.String creatorid) {
        this.creatorid = creatorid;
    }

    public String getKeystring() {
        String key = "";
        if(getCreatorid()!=null) key += getCreatorid().length() + "_" + getCreatorid();
        return key;
    }

    public static CreatorPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String creatorid = keys.substring(0, keylength);
            return new CreatorPK(creatorid);
        }
    }

    public boolean equals(ICreatorPK creatorPK2) {
        boolean isequal = creatorPK2!=null;
        if(isequal) {
            isequal = isequal && this.creatorid.equals(creatorPK2.getCreatorid());
        }
        return isequal;
    }
}
