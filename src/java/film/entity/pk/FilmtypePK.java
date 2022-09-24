/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IFilmtype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class FilmtypePK implements IFilmtypePK {

    private java.lang.String type;
  
    public FilmtypePK() {
    }

    public FilmtypePK(java.lang.String type) {
        this.type = type;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"filmtype.type", type}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IFilmtype.TYPE, type}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public String getKeystring() {
        String key = "";
        if(getType()!=null) key += getType().length() + "_" + getType();
        return key;
    }

    public static FilmtypePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String type = keys.substring(0, keylength);
            return new FilmtypePK(type);
        }
    }

    public boolean equals(IFilmtypePK filmtypePK2) {
        boolean isequal = filmtypePK2!=null;
        if(isequal) {
            isequal = isequal && this.type.equals(filmtypePK2.getType());
        }
        return isequal;
    }
}
