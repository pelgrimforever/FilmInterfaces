/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IFilmsubjects;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class FilmsubjectsPK implements IFilmsubjectsPK {

    private ISubjectPK subjectPK = new SubjectPK();
    private IFilmPK filmPK = new FilmPK();
  
    public FilmsubjectsPK() {
    }

    public FilmsubjectsPK(java.lang.String film, java.lang.String cat1, java.lang.String cat2, int subject) {
        this.subjectPK = new SubjectPK(cat1, cat2, subject);
        this.filmPK = new FilmPK(film);
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"filmsubjects.film", filmPK.getId()}, 
            {"filmsubjects.cat1", subjectPK.getCat1()}, 
            {"filmsubjects.cat2", subjectPK.getCat2()}, 
            {"filmsubjects.subject", subjectPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IFilmsubjects.FILM, filmPK.getId()}, 
            {IFilmsubjects.CAT1, subjectPK.getCat1()}, 
            {IFilmsubjects.CAT2, subjectPK.getCat2()}, 
            {IFilmsubjects.SUBJECT, subjectPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    public ISubjectPK getSubjectPK() {
        return this.subjectPK;
    }

    public void setSubjectPK(ISubjectPK subjectPK) {
        this.subjectPK = subjectPK;
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

        if(getCat1()!=null) key += getCat1().length() + "_" + getCat1();
        key += "_";

        if(getCat2()!=null) key += getCat2().length() + "_" + getCat2();
        key += "_";

        key += getSubject();
        return key;
    }

    public static FilmsubjectsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String film = keys.substring(0, keylength);
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
            return new FilmsubjectsPK(film, cat1, cat2, subject);
        }
    }

    public boolean equals(IFilmsubjectsPK filmsubjectsPK2) {
        boolean isequal = filmsubjectsPK2!=null;
        if(isequal) {
            isequal = isequal && this.subjectPK.equals(filmsubjectsPK2.getSubjectPK());
            isequal = isequal && this.filmPK.equals(filmsubjectsPK2.getFilmPK());
        }
        return isequal;
    }
}
