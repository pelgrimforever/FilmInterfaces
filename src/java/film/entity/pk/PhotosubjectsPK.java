/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhotosubjects;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class PhotosubjectsPK implements IPhotosubjectsPK {

    private IPhotoPK photoPK = new PhotoPK();
    private ISubjectPK subjectPK = new SubjectPK();
  
    public PhotosubjectsPK() {
    }

    public PhotosubjectsPK(java.lang.String film, int id, java.lang.String cat1, java.lang.String cat2, int subject) {
        this.photoPK = new PhotoPK(film, id);
        this.subjectPK = new SubjectPK(cat1, cat2, subject);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"photosubjects.film", photoPK.getFilm()}, 
            {"photosubjects.id", photoPK.getId()}, 
            {"photosubjects.cat1", subjectPK.getCat1()}, 
            {"photosubjects.cat2", subjectPK.getCat2()}, 
            {"photosubjects.subject", subjectPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPhotosubjects.FILM, photoPK.getFilm()}, 
            {IPhotosubjects.ID, photoPK.getId()}, 
            {IPhotosubjects.CAT1, subjectPK.getCat1()}, 
            {IPhotosubjects.CAT2, subjectPK.getCat2()}, 
            {IPhotosubjects.SUBJECT, subjectPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public IPhotoPK getPhotoPK() {
        return this.photoPK;
    }

    public void setPhotoPK(IPhotoPK photoPK) {
        this.photoPK = photoPK;
    }

    public ISubjectPK getSubjectPK() {
        return this.subjectPK;
    }

    public void setSubjectPK(ISubjectPK subjectPK) {
        this.subjectPK = subjectPK;
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

    public java.lang.String getCat1() {
        return this.subjectPK.getCat1();
    }

    public void setCat1(java.lang.String cat1) {
        this.subjectPK.setCat1(cat1);
    }

    public java.lang.String getCat2() {
        return this.subjectPK.getCat2();
    }

    public void setCat2(java.lang.String cat2) {
        this.subjectPK.setCat2(cat2);
    }

    public int getSubject() {
        return this.subjectPK.getId();
    }

    public void setSubject(int subject) {
        this.subjectPK.setId(subject);
    }

    public String getKeystring() {
        String key = "";
        if(getFilm()!=null) key += getFilm().length() + "_" + getFilm();
        key += "_";

        key += getId();
        key += "_";

        if(getCat1()!=null) key += getCat1().length() + "_" + getCat1();
        key += "_";

        if(getCat2()!=null) key += getCat2().length() + "_" + getCat2();
        key += "_";

        key += getSubject();
        return key;
    }

    public static PhotosubjectsPK getKey(String keystring) {
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
            String cat1 = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String cat2 = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int subject = Integer.valueOf(keys.substring(0, keylength));
            return new PhotosubjectsPK(film, id, cat1, cat2, subject);
        }
    }

    public boolean equals(IPhotosubjectsPK photosubjectsPK2) {
        boolean isequal = photosubjectsPK2!=null;
        if(isequal) {
            isequal = isequal && this.photoPK.equals(photosubjectsPK2.getPhotoPK());
            isequal = isequal && this.subjectPK.equals(photosubjectsPK2.getSubjectPK());
        }
        return isequal;
    }
}
