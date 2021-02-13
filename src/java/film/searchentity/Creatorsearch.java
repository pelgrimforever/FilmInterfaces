/*
 * Creatorsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ICreatorsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eCreator;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Creator table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Creatorsearch extends Tablesearch implements ICreatorsearch {

    Stringsearch creatorid = new Stringsearch("creator.creatorid");
    Stringsearch name = new Stringsearch("creator.name");
    Stringsearch surname = new Stringsearch("creator.surname");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Creatorsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Creatorsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(creatorid);
        addFieldsearcher(name);
        addFieldsearcher(surname);
    }

    /**
     * add a primary key instance to search for
     * @param creatorPK: Creator primery key
     */
    public void addPrimarykey(ICreatorPK creatorPK) {
        super.addPrimarykey(creatorPK);
    }

    /**
     * add String search values for field creatorid, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void creatorid(String[] values) {
        addStringvalues(creatorid, values);
    }
    
    /**
     * add String search values for field creatorid
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void creatorid(String[] values, byte compare, byte andor) {
        addStringvalues(creatorid, values);
        creatorid.setCompareoperator(compare);
        creatorid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field surname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void surname(String[] values) {
        addStringvalues(surname, values);
    }
    
    /**
     * add String search values for field surname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void surname(String[] values, byte compare, byte andor) {
        addStringvalues(surname, values);
        surname.setCompareoperator(compare);
        surname.setAndoroperator(andor);
    }
    
}
