/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhototree7subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Phototree7subjectPK implements IPhototree7subjectPK {

    private ITree7subjectPK tree7subjectPK = new Tree7subjectPK();
    private IPhotoPK photoPK = new PhotoPK();
  
    public Phototree7subjectPK() {
    }

    public Phototree7subjectPK(java.lang.String film, int id, long subjectid) {
        this.tree7subjectPK = new Tree7subjectPK(subjectid);
        this.photoPK = new PhotoPK(film, id);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"phototree7subject.film", photoPK.getFilm()}, 
            {"phototree7subject.id", photoPK.getId()}, 
            {"phototree7subject.subjectid", tree7subjectPK.getSubjectid()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPhototree7subject.FILM, photoPK.getFilm()}, 
            {IPhototree7subject.ID, photoPK.getId()}, 
            {IPhototree7subject.SUBJECTID, tree7subjectPK.getSubjectid()}
        };
        return new Entityvalues(keyfields);
    }

    public ITree7subjectPK getTree7subjectPK() {
        return this.tree7subjectPK;
    }

    public void setTree7subjectPK(ITree7subjectPK tree7subjectPK) {
        this.tree7subjectPK = tree7subjectPK;
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

    public long getSubjectid() {
        return this.tree7subjectPK.getSubjectid();
    }

    public void setSubjectid(long subjectid) {
        this.tree7subjectPK.setSubjectid(subjectid);
    }

    public String getKeystring() {
        String key = "";
        if(getFilm()!=null) key += getFilm().length() + "_" + getFilm();
        key += "_";

        key += getId();
        key += "_";

        key += getSubjectid();
        return key;
    }

    public static Phototree7subjectPK getKey(String keystring) {
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

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long subjectid = Long.valueOf(keys.substring(0, keylength));
            return new Phototree7subjectPK(film, id, subjectid);
        }
    }

    public boolean equals(IPhototree7subjectPK phototree7subjectPK2) {
        boolean isequal = phototree7subjectPK2!=null;
        if(isequal) {
            isequal = isequal && this.tree7subjectPK.equals(phototree7subjectPK2.getTree7subjectPK());
            isequal = isequal && this.photoPK.equals(phototree7subjectPK2.getPhotoPK());
        }
        return isequal;
    }
}
