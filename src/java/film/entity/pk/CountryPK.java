/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ICountry;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class CountryPK implements ICountryPK {

    private java.lang.String code;
  
    public CountryPK() {
    }

    public CountryPK(java.lang.String code) {
        this.code = code;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"country.code", code}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ICountry.CODE, code}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public String getKeystring() {
        String key = "";
        if(getCode()!=null) key += getCode().length() + "_" + getCode();
        return key;
    }

    public static CountryPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String code = keys.substring(0, keylength);
            return new CountryPK(code);
        }
    }

    public boolean equals(ICountryPK countryPK2) {
        boolean isequal = countryPK2!=null;
        if(isequal) {
            isequal = isequal && this.code.equals(countryPK2.getCode());
        }
        return isequal;
    }
}
