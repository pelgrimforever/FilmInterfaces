/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IPostalcodesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Postalcode;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Postalcodesearch extends Tablesearch implements IPostalcodesearch {

    Stringsearch countrycode = new Stringsearch("postalcode.countrycode");
    Stringsearch postalcode = new Stringsearch("postalcode.postalcode");
    Stringsearch location = new Stringsearch("postalcode.location");
    Stringsearch bounds = new Stringsearch("postalcode.bounds");
    Stringsearch viewport = new Stringsearch("postalcode.viewport");
    Booleansearch approximate = new Booleansearch("postalcode.approximate");
//foreign keys
    Foreignkeysearch arealevel3searcher = new Foreignkeysearch("arealevel3", IPostalcode.arealevel3PKfields, IPostalcode.arealevel3FKfields);
//external foreign keys
    //foreign key
    Primarykeysearch localitysearcher = new Primarykeysearch("locality", ILocality.postalcodePKfields, ILocality.postalcodeFKfields);

    public String getTable() {
        return Postalcode.table;
    }

    public Postalcodesearch() {
        setFieldsearchers();
    }

    public Postalcodesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(countrycode);
        addFieldsearcher(postalcode);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(arealevel3searcher);
        addKeysearcher(localitysearcher);
    }

    public void addPrimarykey(IPostalcodePK postalcodePK) {
        super.addPrimarykey(postalcodePK);
    }

    public void countrycode(String[] values) {
        addStringvalues(countrycode, values);
    }
    
    public void countrycode(String[] values, byte compare, byte andor) {
        addStringvalues(countrycode, values);
        countrycode.setCompareoperator(compare);
        countrycode.setAndoroperator(andor);
    }
    
    public void postalcode(String[] values) {
        addStringvalues(postalcode, values);
    }
    
    public void postalcode(String[] values, byte compare, byte andor) {
        addStringvalues(postalcode, values);
        postalcode.setCompareoperator(compare);
        postalcode.setAndoroperator(andor);
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
    
    public void arealevel3(IArealevel3search arealevel3search) {
        arealevel3searcher.setTablesearch(arealevel3search);
    }
    
    public IArealevel3search getArealevel3search() {
        if(arealevel3searcher.used()) {
            return (IArealevel3search)arealevel3searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getArealevel3Innerjoin() {
        return arealevel3searcher.getInnerjoin();
    }

    public void locality(ILocalitysearch localitysearch) {
        localitysearcher.setTablesearch(localitysearch);
    }
    
    public ILocalitysearch getLocalitysearch() {
        if(localitysearcher.used()) {
            return (ILocalitysearch)localitysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
