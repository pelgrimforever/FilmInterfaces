/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISubjectcat;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SubjectcatPK implements ISubjectcatPK {

    private java.lang.String cat;
  
    public SubjectcatPK() {
    }

    public SubjectcatPK(java.lang.String cat) {
        this.cat = cat;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"subjectcat.cat", cat}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISubjectcat.CAT, cat}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getCat() {
        return this.cat;
    }

    public void setCat(java.lang.String cat) {
        this.cat = cat;
    }

    public String getKeystring() {
        String key = "";
        if(getCat()!=null) key += getCat().length() + "_" + getCat();
        return key;
    }

    public static SubjectcatPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String cat = keys.substring(0, keylength);
            return new SubjectcatPK(cat);
        }
    }

    public boolean equals(ISubjectcatPK subjectcatPK2) {
        boolean isequal = subjectcatPK2!=null;
        if(isequal) {
            isequal = isequal && this.cat.equals(subjectcatPK2.getCat());
        }
        return isequal;
    }
}
