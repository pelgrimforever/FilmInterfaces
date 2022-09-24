/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.ILocalitysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Locality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Localitysearch extends Tablesearch implements ILocalitysearch {

    Stringsearch locality = new Stringsearch("locality.locality");
    Stringsearch location = new Stringsearch("locality.location");
    Stringsearch bounds = new Stringsearch("locality.bounds");
    Stringsearch viewport = new Stringsearch("locality.viewport");
    Booleansearch approximate = new Booleansearch("locality.approximate");
    Booleansearch hassublocality = new Booleansearch("locality.hassublocality");
//foreign keys
    Foreignkeysearch postalcodesearcher = new Foreignkeysearch("postalcode", ILocality.postalcodePKfields, ILocality.postalcodeFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch sublocalitysearcher = new Primarykeysearch("sublocality", ISublocality.localityPKfields, ISublocality.localityFKfields);

    public String getTable() {
        return Locality.table;
    }

    public Localitysearch() {
        setFieldsearchers();
    }

    public Localitysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(locality);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addFieldsearcher(hassublocality);
        addKeysearcher(postalcodesearcher);
        addKeysearcher(sublocalitysearcher);
    }

    public void addPrimarykey(ILocalityPK localityPK) {
        super.addPrimarykey(localityPK);
    }

    public void locality(String[] values) {
        addStringvalues(locality, values);
    }
    
    public void locality(String[] values, byte compare, byte andor) {
        addStringvalues(locality, values);
        locality.setCompareoperator(compare);
        locality.setAndoroperator(andor);
    }
    
    public void location(String[] values) {
        addStringvalues(location, values);
    }
    
    public void location(String[] values, byte compare, byte andor) {
        addStringvalues(location, values);
        location.setCompareoperator(compare);
        location.setAndoroperator(andor);
    }
    
    public void bounds(String[] values) {
        addStringvalues(bounds, values);
    }
    
    public void bounds(String[] values, byte compare, byte andor) {
        addStringvalues(bounds, values);
        bounds.setCompareoperator(compare);
        bounds.setAndoroperator(andor);
    }
    
    public void viewport(String[] values) {
        addStringvalues(viewport, values);
    }
    
    public void viewport(String[] values, byte compare, byte andor) {
        addStringvalues(viewport, values);
        viewport.setCompareoperator(compare);
        viewport.setAndoroperator(andor);
    }
    
    public void approximate(Boolean value) {
        addBooleanvalue(approximate, value);
    }
    
    public void hassublocality(Boolean value) {
        addBooleanvalue(hassublocality, value);
    }
    
    public void postalcode(IPostalcodesearch postalcodesearch) {
        postalcodesearcher.setTablesearch(postalcodesearch);
    }
    
    public IPostalcodesearch getPostalcodesearch() {
        if(postalcodesearcher.used()) {
            return (IPostalcodesearch)postalcodesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getPostalcodeInnerjoin() {
        return postalcodesearcher.getInnerjoin();
    }

    public void sublocality(ISublocalitysearch sublocalitysearch) {
        sublocalitysearcher.setTablesearch(sublocalitysearch);
    }
    
    public ISublocalitysearch getSublocalitysearch() {
        if(sublocalitysearcher.used()) {
            return (ISublocalitysearch)sublocalitysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
