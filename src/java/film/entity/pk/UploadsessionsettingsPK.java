/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IUploadsessionsettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class UploadsessionsettingsPK implements IUploadsessionsettingsPK {

    private java.lang.String directory;
  
    public UploadsessionsettingsPK() {
    }

    public UploadsessionsettingsPK(java.lang.String directory) {
        this.directory = directory;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"uploadsessionsettings.directory", directory}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IUploadsessionsettings.DIRECTORY, directory}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getDirectory() {
        return this.directory;
    }

    public void setDirectory(java.lang.String directory) {
        this.directory = directory;
    }

    public String getKeystring() {
        String key = "";
        if(getDirectory()!=null) key += getDirectory().length() + "_" + getDirectory();
        return key;
    }

    public static UploadsessionsettingsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String directory = keys.substring(0, keylength);
            return new UploadsessionsettingsPK(directory);
        }
    }

    public boolean equals(IUploadsessionsettingsPK uploadsessionsettingsPK2) {
        boolean isequal = uploadsessionsettingsPK2!=null;
        if(isequal) {
            isequal = isequal && this.directory.equals(uploadsessionsettingsPK2.getDirectory());
        }
        return isequal;
    }
}
