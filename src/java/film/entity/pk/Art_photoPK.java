/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_photo;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Art_photoPK implements IArt_photoPK {

    private IPhotoPK photoPK = new PhotoPK();
  
    public Art_photoPK() {
    }

    public Art_photoPK(java.lang.String film, int photo) {
        this.photoPK = new PhotoPK(film, photo);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"art_photo.film", photoPK.getFilm()}, 
            {"art_photo.photo", photoPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArt_photo.FILM, photoPK.getFilm()}, 
            {IArt_photo.PHOTO, photoPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IPhotoPK getPhotoPK() {
        return this.photoPK;
    }

    public void setPhotoPK(IPhotoPK photoPK) {
        this.photoPK = photoPK;
    }

    public java.lang.String getFilm() {
        return this.photoPK.getFilm();
    }

    public void setFilm(java.lang.String film) {
        this.photoPK.setFilm(film);
    }

    public int getPhoto() {
        return this.photoPK.getId();
    }

    public void setPhoto(int photo) {
        this.photoPK.setId(photo);
    }

    public String getKeystring() {
        String key = "";
        if(getFilm()!=null) key += getFilm().length() + "_" + getFilm();
        key += "_";

        key += getPhoto();
        return key;
    }

    public static Art_photoPK getKey(String keystring) {
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
            int photo = Integer.valueOf(keys.substring(0, keylength));
            return new Art_photoPK(film, photo);
        }
    }

    public boolean equals(IArt_photoPK art_photoPK2) {
        boolean isequal = art_photoPK2!=null;
        if(isequal) {
            isequal = isequal && this.photoPK.equals(art_photoPK2.getPhotoPK());
        }
        return isequal;
    }
}
