/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISpatial_ref_sys;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Spatial_ref_sysPK implements ISpatial_ref_sysPK {

    private int srid;
  
    public Spatial_ref_sysPK() {
    }

    public Spatial_ref_sysPK(int srid) {
        this.srid = srid;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"spatial_ref_sys.srid", srid}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISpatial_ref_sys.SRID, srid}
        };
        return new Entityvalues(keyfields);
    }

    public int getSrid() {
        return this.srid;
    }

    public void setSrid(int srid) {
        this.srid = srid;
    }

    public String getKeystring() {
        String key = "";
        key += getSrid();
        return key;
    }

    public static Spatial_ref_sysPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int srid = Integer.valueOf(keys.substring(0, keylength));
            return new Spatial_ref_sysPK(srid);
        }
    }

    public boolean equals(ISpatial_ref_sysPK spatial_ref_sysPK2) {
        boolean isequal = spatial_ref_sysPK2!=null;
        if(isequal) {
            isequal = isequal && this.srid == spatial_ref_sysPK2.getSrid();
        }
        return isequal;
    }
}
