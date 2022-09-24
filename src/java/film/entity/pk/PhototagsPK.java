/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhototags;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class PhototagsPK implements IPhototagsPK {

    private IPhotoPK photoPK = new PhotoPK();
    private java.lang.String tag;
  
    public PhototagsPK() {
    }

    public PhototagsPK(java.lang.String film, int id, java.lang.String tag) {
        this.photoPK = new PhotoPK(film, id);
        this.tag = tag;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"phototags.film", photoPK.getFilm()}, 
            {"phototags.id", photoPK.getId()}, 
            {"phototags.tag", tag}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPhototags.FILM, photoPK.getFilm()}, 
            {IPhototags.ID, photoPK.getId()}, 
            {IPhototags.TAG, tag}
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

    public int getId() {
        return this.photoPK.getId();
    }

    public void setId(int id) {
        this.photoPK.setId(id);
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }

    public String getKeystring() {
        String key = "";
        if(getFilm()!=null) key += getFilm().length() + "_" + getFilm();
        key += "_";

        key += getId();
        key += "_";

        if(getTag()!=null) key += getTag().length() + "_" + getTag();
        return key;
    }

    public static PhototagsPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String tag = keys.substring(0, keylength);
            return new PhototagsPK(film, id, tag);
        }
    }

    public boolean equals(IPhototagsPK phototagsPK2) {
        boolean isequal = phototagsPK2!=null;
        if(isequal) {
            isequal = isequal && this.photoPK.equals(phototagsPK2.getPhotoPK());
            isequal = isequal && this.tag.equals(phototagsPK2.getTag());
        }
        return isequal;
    }
}
