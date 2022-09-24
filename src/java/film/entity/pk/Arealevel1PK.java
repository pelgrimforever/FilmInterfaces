/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArealevel1;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Arealevel1PK implements IArealevel1PK {

    private ICountryPK countryPK = new CountryPK();
    private java.lang.String al1code;
  
    public Arealevel1PK() {
    }

    public Arealevel1PK(java.lang.String countrycode, java.lang.String al1code) {
        this.countryPK = new CountryPK(countrycode);
        this.al1code = al1code;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"arealevel1.countrycode", countryPK.getCode()}, 
            {"arealevel1.al1code", al1code}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArealevel1.COUNTRYCODE, countryPK.getCode()}, 
            {IArealevel1.AL1CODE, al1code}
        };
        return new Entityvalues(keyfields);
    }

    public ICountryPK getCountryPK() {
        return this.countryPK;
    }

    public void setCountryPK(ICountryPK countryPK) {
        this.countryPK = countryPK;
    }

    public java.lang.String getCountrycode() {
        return this.countryPK.getCode();
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.countryPK.setCode(countrycode);
    }

    public java.lang.String getAl1code() {
        return this.al1code;
    }

    public void setAl1code(java.lang.String al1code) {
        this.al1code = al1code;
    }

    public String getKeystring() {
        String key = "";
        if(getCountrycode()!=null) key += getCountrycode().length() + "_" + getCountrycode();
        key += "_";

        if(getAl1code()!=null) key += getAl1code().length() + "_" + getAl1code();
        return key;
    }

    public static Arealevel1PK getKey(String keystring) {
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
            String al1code = keys.substring(0, keylength);
            return new Arealevel1PK(countrycode, al1code);
        }
    }

    public boolean equals(IArealevel1PK arealevel1PK2) {
        boolean isequal = arealevel1PK2!=null;
        if(isequal) {
            isequal = isequal && this.countryPK.equals(arealevel1PK2.getCountryPK());
            isequal = isequal && this.al1code.equals(arealevel1PK2.getAl1code());
        }
        return isequal;
    }
}
