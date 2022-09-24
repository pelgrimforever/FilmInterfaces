/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IFilm;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class FilmPK implements IFilmPK {

    private java.lang.String id;
  
    public FilmPK() {
    }

    public FilmPK(java.lang.String id) {
        this.id = id;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"film.id", id}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IFilm.ID, id}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public String getKeystring() {
        String key = "";
        if(getId()!=null) key += getId().length() + "_" + getId();
        return key;
    }

    public static FilmPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String id = keys.substring(0, keylength);
            return new FilmPK(id);
        }
    }

    public boolean equals(IFilmPK filmPK2) {
        boolean isequal = filmPK2!=null;
        if(isequal) {
            isequal = isequal && this.id.equals(filmPK2.getId());
        }
        return isequal;
    }
}
