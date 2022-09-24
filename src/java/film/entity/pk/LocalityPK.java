/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ILocality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class LocalityPK implements ILocalityPK {

    private IPostalcodePK postalcodePK = new PostalcodePK();
    private java.lang.String locality;
  
    public LocalityPK() {
    }

    public LocalityPK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality) {
        this.postalcodePK = new PostalcodePK(countrycode, postalcode);
        this.locality = locality;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"locality.countrycode", postalcodePK.getCountrycode()}, 
            {"locality.postalcode", postalcodePK.getPostalcode()}, 
            {"locality.locality", locality}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ILocality.COUNTRYCODE, postalcodePK.getCountrycode()}, 
            {ILocality.POSTALCODE, postalcodePK.getPostalcode()}, 
            {ILocality.LOCALITY, locality}
        };
        return new Entityvalues(keyfields);
    }

    public IPostalcodePK getPostalcodePK() {
        return this.postalcodePK;
    }

    public void setPostalcodePK(IPostalcodePK postalcodePK) {
        this.postalcodePK = postalcodePK;
    }

    public java.lang.String getCountrycode() {
        return this.postalcodePK.getCountrycode();
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.postalcodePK.setCountrycode(countrycode);
    }

    public java.lang.String getPostalcode() {
        return this.postalcodePK.getPostalcode();
    }

    public void setPostalcode(java.lang.String postalcode) {
        this.postalcodePK.setPostalcode(postalcode);
    }

    public java.lang.String getLocality() {
        return this.locality;
    }

    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }

    public String getKeystring() {
        String key = "";
        if(getCountrycode()!=null) key += getCountrycode().length() + "_" + getCountrycode();
        key += "_";

        if(getPostalcode()!=null) key += getPostalcode().length() + "_" + getPostalcode();
        key += "_";

        if(getLocality()!=null) key += getLocality().length() + "_" + getLocality();
        return key;
    }

    public static LocalityPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String locality = keys.substring(0, keylength);
            return new LocalityPK(countrycode, postalcode, locality);
        }
    }

    public boolean equals(ILocalityPK localityPK2) {
        boolean isequal = localityPK2!=null;
        if(isequal) {
            isequal = isequal && this.postalcodePK.equals(localityPK2.getPostalcodePK());
            isequal = isequal && this.locality.equals(localityPK2.getLocality());
        }
        return isequal;
    }
}
