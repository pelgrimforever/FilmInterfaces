/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArealevel2;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class Arealevel2PK implements IArealevel2PK {

    private IArealevel1PK arealevel1PK = new Arealevel1PK();
    private java.lang.String al2code;
  
    public Arealevel2PK() {
    }

    public Arealevel2PK(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code) {
        this.arealevel1PK = new Arealevel1PK(countrycode, al1code);
        this.al2code = al2code;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"arealevel2.countrycode", arealevel1PK.getCountrycode()}, 
            {"arealevel2.al1code", arealevel1PK.getAl1code()}, 
            {"arealevel2.al2code", al2code}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArealevel2.COUNTRYCODE, arealevel1PK.getCountrycode()}, 
            {IArealevel2.AL1CODE, arealevel1PK.getAl1code()}, 
            {IArealevel2.AL2CODE, al2code}
        };
        return new Entityvalues(keyfields);
    }

    public IArealevel1PK getArealevel1PK() {
        return this.arealevel1PK;
    }

    public void setArealevel1PK(IArealevel1PK arealevel1PK) {
        this.arealevel1PK = arealevel1PK;
    }

    public java.lang.String getCountrycode() {
        return this.arealevel1PK.getCountrycode();
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.arealevel1PK.setCountrycode(countrycode);
    }

    public java.lang.String getAl1code() {
        return this.arealevel1PK.getAl1code();
    }

    public void setAl1code(java.lang.String al1code) {
        this.arealevel1PK.setAl1code(al1code);
    }

    public java.lang.String getAl2code() {
        return this.al2code;
    }

    public void setAl2code(java.lang.String al2code) {
        this.al2code = al2code;
    }

    public String getKeystring() {
        String key = "";
        if(getCountrycode()!=null) key += getCountrycode().length() + "_" + getCountrycode();
        key += "_";

        if(getAl1code()!=null) key += getAl1code().length() + "_" + getAl1code();
        key += "_";

        if(getAl2code()!=null) key += getAl2code().length() + "_" + getAl2code();
        return key;
    }

    public static Arealevel2PK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String al2code = keys.substring(0, keylength);
            return new Arealevel2PK(countrycode, al1code, al2code);
        }
    }

    public boolean equals(IArealevel2PK arealevel2PK2) {
        boolean isequal = arealevel2PK2!=null;
        if(isequal) {
            isequal = isequal && this.arealevel1PK.equals(arealevel2PK2.getArealevel1PK());
            isequal = isequal && this.al2code.equals(arealevel2PK2.getAl2code());
        }
        return isequal;
    }
}
