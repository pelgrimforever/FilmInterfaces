/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISublocality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class SublocalityPK implements ISublocalityPK {

    private ILocalityPK localityPK = new LocalityPK();
    private java.lang.String sublocality;
  
    public SublocalityPK() {
    }

    public SublocalityPK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality) {
        this.localityPK = new LocalityPK(countrycode, postalcode, locality);
        this.sublocality = sublocality;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"sublocality.countrycode", localityPK.getCountrycode()}, 
            {"sublocality.postalcode", localityPK.getPostalcode()}, 
            {"sublocality.locality", localityPK.getLocality()}, 
            {"sublocality.sublocality", sublocality}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISublocality.COUNTRYCODE, localityPK.getCountrycode()}, 
            {ISublocality.POSTALCODE, localityPK.getPostalcode()}, 
            {ISublocality.LOCALITY, localityPK.getLocality()}, 
            {ISublocality.SUBLOCALITY, sublocality}
        };
        return new Entityvalues(keyfields);
    }

    public ILocalityPK getLocalityPK() {
        return this.localityPK;
    }

    public void setLocalityPK(ILocalityPK localityPK) {
        this.localityPK = localityPK;
    }

    public java.lang.String getCountrycode() {
        return this.localityPK.getCountrycode();
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.localityPK.setCountrycode(countrycode);
    }

    public java.lang.String getPostalcode() {
        return this.localityPK.getPostalcode();
    }

    public void setPostalcode(java.lang.String postalcode) {
        this.localityPK.setPostalcode(postalcode);
    }

    public java.lang.String getLocality() {
        return this.localityPK.getLocality();
    }

    public void setLocality(java.lang.String locality) {
        this.localityPK.setLocality(locality);
    }

    public java.lang.String getSublocality() {
        return this.sublocality;
    }

    public void setSublocality(java.lang.String sublocality) {
        this.sublocality = sublocality;
    }

    public String getKeystring() {
        String key = "";
        if(getCountrycode()!=null) key += getCountrycode().length() + "_" + getCountrycode();
        key += "_";

        if(getPostalcode()!=null) key += getPostalcode().length() + "_" + getPostalcode();
        key += "_";

        if(getLocality()!=null) key += getLocality().length() + "_" + getLocality();
        key += "_";

        if(getSublocality()!=null) key += getSublocality().length() + "_" + getSublocality();
        return key;
    }

    public static SublocalityPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String sublocality = keys.substring(0, keylength);
            return new SublocalityPK(countrycode, postalcode, locality, sublocality);
        }
    }

    public boolean equals(ISublocalityPK sublocalityPK2) {
        boolean isequal = sublocalityPK2!=null;
        if(isequal) {
            isequal = isequal && this.localityPK.equals(sublocalityPK2.getLocalityPK());
            isequal = isequal && this.sublocality.equals(sublocalityPK2.getSublocality());
        }
        return isequal;
    }
}
