/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IFilmtypesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Filmtype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Filmtypesearch extends Tablesearch implements IFilmtypesearch {

    Stringsearch type = new Stringsearch("filmtype.type");
    Stringsearch description = new Stringsearch("filmtype.description");
//foreign keys
//external foreign keys

    public String getTable() {
        return Filmtype.table;
    }

    public Filmtypesearch() {
        setFieldsearchers();
    }

    public Filmtypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(type);
        addFieldsearcher(description);
    }

    public void addPrimarykey(IFilmtypePK filmtypePK) {
        super.addPrimarykey(filmtypePK);
    }

    public void type(String[] values) {
        addStringvalues(type, values);
    }
    
    public void type(String[] values, byte compare, byte andor) {
        addStringvalues(type, values);
        type.setCompareoperator(compare);
        type.setAndoroperator(andor);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
}
