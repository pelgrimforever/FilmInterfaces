/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.ICreatorsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Creator;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Creatorsearch extends Tablesearch implements ICreatorsearch {

    Stringsearch creatorid = new Stringsearch("creator.creatorid");
    Stringsearch name = new Stringsearch("creator.name");
    Stringsearch surname = new Stringsearch("creator.surname");
//foreign keys
//external foreign keys

    public String getTable() {
        return Creator.table;
    }

    public Creatorsearch() {
        setFieldsearchers();
    }

    public Creatorsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(creatorid);
        addFieldsearcher(name);
        addFieldsearcher(surname);
    }

    public void addPrimarykey(ICreatorPK creatorPK) {
        super.addPrimarykey(creatorPK);
    }

    public void creatorid(String[] values) {
        addStringvalues(creatorid, values);
    }
    
    public void creatorid(String[] values, byte compare, byte andor) {
        addStringvalues(creatorid, values);
        creatorid.setCompareoperator(compare);
        creatorid.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void surname(String[] values) {
        addStringvalues(surname, values);
    }
    
    public void surname(String[] values, byte compare, byte andor) {
        addStringvalues(surname, values);
        surname.setCompareoperator(compare);
        surname.setAndoroperator(andor);
    }
    
}
