/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IArealevel2search;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Arealevel2;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Arealevel2search extends Tablesearch implements IArealevel2search {

    Stringsearch al2code = new Stringsearch("arealevel2.al2code");
    Stringsearch name = new Stringsearch("arealevel2.name");
    Stringsearch location = new Stringsearch("arealevel2.location");
    Stringsearch bounds = new Stringsearch("arealevel2.bounds");
    Stringsearch viewport = new Stringsearch("arealevel2.viewport");
    Booleansearch approximate = new Booleansearch("arealevel2.approximate");
//foreign keys
    Foreignkeysearch arealevel1searcher = new Foreignkeysearch("arealevel1", IArealevel2.arealevel1PKfields, IArealevel2.arealevel1FKfields);
//external foreign keys
    //foreign key
    Primarykeysearch arealevel3searcher = new Primarykeysearch("arealevel3", IArealevel3.arealevel2PKfields, IArealevel3.arealevel2FKfields);

    public String getTable() {
        return Arealevel2.table;
    }

    public Arealevel2search() {
        setFieldsearchers();
    }

    public Arealevel2search(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(al2code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(arealevel1searcher);
        addKeysearcher(arealevel3searcher);
    }

    public void addPrimarykey(IArealevel2PK arealevel2PK) {
        super.addPrimarykey(arealevel2PK);
    }

    public void al2code(String[] values) {
        addStringvalues(al2code, values);
    }
    
    public void al2code(String[] values, byte compare, byte andor) {
        addStringvalues(al2code, values);
        al2code.setCompareoperator(compare);
        al2code.setAndoroperator(andor);
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
    
    public void arealevel1(IArealevel1search arealevel1search) {
        arealevel1searcher.setTablesearch(arealevel1search);
    }
    
    public IArealevel1search getArealevel1search() {
        if(arealevel1searcher.used()) {
            return (IArealevel1search)arealevel1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getArealevel1Innerjoin() {
        return arealevel1searcher.getInnerjoin();
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

}
