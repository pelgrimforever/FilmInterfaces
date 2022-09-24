/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.ISublocalitysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Sublocality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Sublocalitysearch extends Tablesearch implements ISublocalitysearch {

    Stringsearch sublocality = new Stringsearch("sublocality.sublocality");
    Stringsearch location = new Stringsearch("sublocality.location");
    Stringsearch bounds = new Stringsearch("sublocality.bounds");
    Stringsearch viewport = new Stringsearch("sublocality.viewport");
    Booleansearch approximate = new Booleansearch("sublocality.approximate");
//foreign keys
    Foreignkeysearch localitysearcher = new Foreignkeysearch("locality", ISublocality.localityPKfields, ISublocality.localityFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch routesearcher = new Primarykeysearch("route", IRoute.sublocalityPKfields, IRoute.sublocalityFKfields);

    public String getTable() {
        return Sublocality.table;
    }

    public Sublocalitysearch() {
        setFieldsearchers();
    }

    public Sublocalitysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(sublocality);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(localitysearcher);
        addKeysearcher(routesearcher);
    }

    public void addPrimarykey(ISublocalityPK sublocalityPK) {
        super.addPrimarykey(sublocalityPK);
    }

    public void sublocality(String[] values) {
        addStringvalues(sublocality, values);
    }
    
    public void sublocality(String[] values, byte compare, byte andor) {
        addStringvalues(sublocality, values);
        sublocality.setCompareoperator(compare);
        sublocality.setAndoroperator(andor);
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

    public String getLocalityInnerjoin() {
        return localitysearcher.getInnerjoin();
    }

    public void route(IRoutesearch routesearch) {
        routesearcher.setTablesearch(routesearch);
    }
    
    public IRoutesearch getRoutesearch() {
        if(routesearcher.used()) {
            return (IRoutesearch)routesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
