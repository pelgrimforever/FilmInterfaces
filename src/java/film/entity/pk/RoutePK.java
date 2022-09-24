/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IRoute;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class RoutePK implements IRoutePK {

    private ISublocalityPK sublocalityPK = new SublocalityPK();
    private java.lang.String routecode;
  
    public RoutePK() {
    }

    public RoutePK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality, java.lang.String routecode) {
        this.sublocalityPK = new SublocalityPK(countrycode, postalcode, locality, sublocality);
        this.routecode = routecode;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"route.countrycode", sublocalityPK.getCountrycode()}, 
            {"route.postalcode", sublocalityPK.getPostalcode()}, 
            {"route.locality", sublocalityPK.getLocality()}, 
            {"route.sublocality", sublocalityPK.getSublocality()}, 
            {"route.routecode", routecode}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRoute.COUNTRYCODE, sublocalityPK.getCountrycode()}, 
            {IRoute.POSTALCODE, sublocalityPK.getPostalcode()}, 
            {IRoute.LOCALITY, sublocalityPK.getLocality()}, 
            {IRoute.SUBLOCALITY, sublocalityPK.getSublocality()}, 
            {IRoute.ROUTECODE, routecode}
        };
        return new Entityvalues(keyfields);
    }

    public ISublocalityPK getSublocalityPK() {
        return this.sublocalityPK;
    }

    public void setSublocalityPK(ISublocalityPK sublocalityPK) {
        this.sublocalityPK = sublocalityPK;
    }

    public java.lang.String getCountrycode() {
        return this.sublocalityPK.getCountrycode();
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.sublocalityPK.setCountrycode(countrycode);
    }

    public java.lang.String getPostalcode() {
        return this.sublocalityPK.getPostalcode();
    }

    public void setPostalcode(java.lang.String postalcode) {
        this.sublocalityPK.setPostalcode(postalcode);
    }

    public java.lang.String getLocality() {
        return this.sublocalityPK.getLocality();
    }

    public void setLocality(java.lang.String locality) {
        this.sublocalityPK.setLocality(locality);
    }

    public java.lang.String getSublocality() {
        return this.sublocalityPK.getSublocality();
    }

    public void setSublocality(java.lang.String sublocality) {
        this.sublocalityPK.setSublocality(sublocality);
    }

    public java.lang.String getRoutecode() {
        return this.routecode;
    }

    public void setRoutecode(java.lang.String routecode) {
        this.routecode = routecode;
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
        key += "_";

        if(getRoutecode()!=null) key += getRoutecode().length() + "_" + getRoutecode();
        return key;
    }

    public static RoutePK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String routecode = keys.substring(0, keylength);
            return new RoutePK(countrycode, postalcode, locality, sublocality, routecode);
        }
    }

    public boolean equals(IRoutePK routePK2) {
        boolean isequal = routePK2!=null;
        if(isequal) {
            isequal = isequal && this.sublocalityPK.equals(routePK2.getSublocalityPK());
            isequal = isequal && this.routecode.equals(routePK2.getRoutecode());
        }
        return isequal;
    }
}
