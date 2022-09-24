/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhoto;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class PhotoPK implements IPhotoPK {

    private IFilmPK filmPK = new FilmPK();
    private int id;
  
    public PhotoPK() {
    }

    public PhotoPK(java.lang.String film, int id) {
        this.filmPK = new FilmPK(film);
        this.id = id;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"photo.film", filmPK.getId()}, 
            {"photo.id", id}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPhoto.FILM, filmPK.getId()}, 
            {IPhoto.ID, id}
        };
        return new Entityvalues(keyfields);
    }

    public IFilmPK getFilmPK() {
        return this.filmPK;
    }

    public void setFilmPK(IFilmPK filmPK) {
        this.filmPK = filmPK;
    }

    public java.lang.String getFilm() {
        return this.filmPK.getId();
    }

    public void setFilm(java.lang.String film) {
        this.filmPK.setId(film);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeystring() {
        String key = "";
        if(getFilm()!=null) key += getFilm().length() + "_" + getFilm();
        key += "_";

        key += getId();
        return key;
    }

    public static PhotoPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String film = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int id = Integer.valueOf(keys.substring(0, keylength));
            return new PhotoPK(film, id);
        }
    }

    public boolean equals(IPhotoPK photoPK2) {
        boolean isequal = photoPK2!=null;
        if(isequal) {
            isequal = isequal && this.filmPK.equals(photoPK2.getFilmPK());
            isequal = isequal && this.id == photoPK2.getId();
        }
        return isequal;
    }
}
