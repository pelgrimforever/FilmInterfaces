/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IUploadsession;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class UploadsessionPK implements IUploadsessionPK {

    private java.lang.String filename;
  
    public UploadsessionPK() {
    }

    public UploadsessionPK(java.lang.String filename) {
        this.filename = filename;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"uploadsession.filename", filename}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IUploadsession.FILENAME, filename}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getFilename() {
        return this.filename;
    }

    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    public String getKeystring() {
        String key = "";
        if(getFilename()!=null) key += getFilename().length() + "_" + getFilename();
        return key;
    }

    public static UploadsessionPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String filename = keys.substring(0, keylength);
            return new UploadsessionPK(filename);
        }
    }

    public boolean equals(IUploadsessionPK uploadsessionPK2) {
        boolean isequal = uploadsessionPK2!=null;
        if(isequal) {
            isequal = isequal && this.filename.equals(uploadsessionPK2.getFilename());
        }
        return isequal;
    }
}
