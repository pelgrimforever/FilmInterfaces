/*
 * Filmtypesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
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

/**
 * Search class for Filmtype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Filmtypesearch extends Tablesearch implements IFilmtypesearch {

    Stringsearch type = new Stringsearch("filmtype.type");
    Stringsearch description = new Stringsearch("filmtype.description");

    /**
     * @return tablename
     */
    public String getTable() {
        return Filmtype.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Filmtypesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Filmtypesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(type);
        addFieldsearcher(description);
    }

    /**
     * add a primary key instance to search for
     * @param filmtypePK: Filmtype primery key
     */
    public void addPrimarykey(IFilmtypePK filmtypePK) {
        super.addPrimarykey(filmtypePK);
    }

    /**
     * add String search values for field type, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void type(String[] values) {
        addStringvalues(type, values);
    }
    
    /**
     * add String search values for field type
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void type(String[] values, byte compare, byte andor) {
        addStringvalues(type, values);
        type.setCompareoperator(compare);
        type.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field description, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    /**
     * add String search values for field description
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
}
