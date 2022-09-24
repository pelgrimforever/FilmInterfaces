/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPostalcode;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class PostalcodePK implements IPostalcodePK {

    private java.lang.String countrycode;
    private java.lang.String postalcode;
  
    public PostalcodePK() {
    }

    public PostalcodePK(java.lang.String countrycode, java.lang.String postalcode) {
        this.countrycode = countrycode;
        this.postalcode = postalcode;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"postalcode.countrycode", countrycode}, 
            {"postalcode.postalcode", postalcode}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPostalcode.COUNTRYCODE, countrycode}, 
            {IPostalcode.POSTALCODE, postalcode}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getCountrycode() {
        return this.countrycode;
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.countrycode = countrycode;
    }

    public java.lang.String getPostalcode() {
        return this.postalcode;
    }

    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }

    public String getKeystring() {
        String key = "";
        if(getCountrycode()!=null) key += getCountrycode().length() + "_" + getCountrycode();
        key += "_";

        if(getPostalcode()!=null) key += getPostalcode().length() + "_" + getPostalcode();
        return key;
    }

    public static PostalcodePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String countrycode = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String postalcode = keys.substring(0, keylength);
            return new PostalcodePK(countrycode, postalcode);
        }
    }

    public boolean equals(IPostalcodePK postalcodePK2) {
        boolean isequal = postalcodePK2!=null;
        if(isequal) {
            isequal = isequal && this.countrycode.equals(postalcodePK2.getCountrycode());
            isequal = isequal && this.postalcode.equals(postalcodePK2.getPostalcode());
        }
        return isequal;
    }
}
