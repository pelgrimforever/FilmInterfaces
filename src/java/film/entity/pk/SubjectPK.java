/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISubject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SubjectPK implements ISubjectPK {

    private ISubjectcatPK subjectcatCat1PK = new SubjectcatPK();
    private ISubjectcatPK subjectcatCat2PK = new SubjectcatPK();
    private int id;
  
    public SubjectPK() {
    }

    public SubjectPK(java.lang.String cat1, java.lang.String cat2, int id) {
        this.subjectcatCat1PK = new SubjectcatPK(cat1);
        this.subjectcatCat2PK = new SubjectcatPK(cat2);
        this.id = id;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"subject.cat1", subjectcatCat1PK.getCat()}, 
            {"subject.cat2", subjectcatCat2PK.getCat()}, 
            {"subject.id", id}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISubject.CAT1, subjectcatCat1PK.getCat()}, 
            {ISubject.CAT2, subjectcatCat2PK.getCat()}, 
            {ISubject.ID, id}
        };
        return new Entityvalues(keyfields);
    }

    public ISubjectcatPK getSubjectcatcat1PK() {
        return this.subjectcatCat1PK;
    }

    public void setSubjectcatcat1PK(ISubjectcatPK subjectcatPK) {
        this.subjectcatCat1PK = subjectcatPK;
    }

    public ISubjectcatPK getSubjectcatcat2PK() {
        return this.subjectcatCat2PK;
    }

    public void setSubjectcatcat2PK(ISubjectcatPK subjectcatPK) {
        this.subjectcatCat2PK = subjectcatPK;
    }

    public java.lang.String getCat1() {
        return this.subjectcatCat1PK.getCat();
    }

    public void setCat1(java.lang.String cat1) {
        this.subjectcatCat1PK.setCat(cat1);
    }

    public java.lang.String getCat2() {
        return this.subjectcatCat2PK.getCat();
    }

    public void setCat2(java.lang.String cat2) {
        this.subjectcatCat2PK.setCat(cat2);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeystring() {
        String key = "";
        if(getCat1()!=null) key += getCat1().length() + "_" + getCat1();
        key += "_";

        if(getCat2()!=null) key += getCat2().length() + "_" + getCat2();
        key += "_";

        key += getId();
        return key;
    }

    public static SubjectPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
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
            int id = Integer.valueOf(keys.substring(0, keylength));
            return new SubjectPK(cat1, cat2, id);
        }
    }

    public boolean equals(ISubjectPK subjectPK2) {
        boolean isequal = subjectPK2!=null;
        if(isequal) {
            isequal = isequal && this.subjectcatCat1PK.equals(subjectPK2.getSubjectcatcat1PK());
            isequal = isequal && this.subjectcatCat2PK.equals(subjectPK2.getSubjectcatcat2PK());
            isequal = isequal && this.id == subjectPK2.getId();
        }
        return isequal;
    }
}
