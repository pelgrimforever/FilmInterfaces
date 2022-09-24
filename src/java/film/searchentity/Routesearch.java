/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IRoutesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Route;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Routesearch extends Tablesearch implements IRoutesearch {

    Stringsearch routecode = new Stringsearch("route.routecode");
    Stringsearch name = new Stringsearch("route.name");
    Stringsearch location = new Stringsearch("route.location");
    Stringsearch bounds = new Stringsearch("route.bounds");
    Stringsearch viewport = new Stringsearch("route.viewport");
    Booleansearch approximate = new Booleansearch("route.approximate");
//foreign keys
    Foreignkeysearch sublocalitysearcher = new Foreignkeysearch("sublocality", IRoute.sublocalityPKfields, IRoute.sublocalityFKfields);
//external foreign keys

    public String getTable() {
        return Route.table;
    }

    public Routesearch() {
        setFieldsearchers();
    }

    public Routesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(routecode);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(sublocalitysearcher);
    }

    public void addPrimarykey(IRoutePK routePK) {
        super.addPrimarykey(routePK);
    }

    public void routecode(String[] values) {
        addStringvalues(routecode, values);
    }
    
    public void routecode(String[] values, byte compare, byte andor) {
        addStringvalues(routecode, values);
        routecode.setCompareoperator(compare);
        routecode.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
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

    public String getSublocalityInnerjoin() {
        return sublocalitysearcher.getInnerjoin();
    }

}
