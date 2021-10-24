/*
 * Spatial_ref_syssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ISpatial_ref_syssearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Spatial_ref_sys;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Spatial_ref_sys table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Spatial_ref_syssearch extends Tablesearch implements ISpatial_ref_syssearch {

    Numbersearch srid = new Numbersearch("spatial_ref_sys.srid");
    Stringsearch auth_name = new Stringsearch("spatial_ref_sys.auth_name");
    Numbersearch auth_srid = new Numbersearch("spatial_ref_sys.auth_srid");
    Stringsearch srtext = new Stringsearch("spatial_ref_sys.srtext");
    Stringsearch proj4text = new Stringsearch("spatial_ref_sys.proj4text");

    /**
     * @return tablename
     */
    public String getTable() {
        return Spatial_ref_sys.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Spatial_ref_syssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Spatial_ref_syssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(srid);
        addFieldsearcher(auth_name);
        addFieldsearcher(auth_srid);
        addFieldsearcher(srtext);
        addFieldsearcher(proj4text);
    }

    /**
     * add a primary key instance to search for
     * @param spatial_ref_sysPK: Spatial_ref_sys primery key
     */
    public void addPrimarykey(ISpatial_ref_sysPK spatial_ref_sysPK) {
        super.addPrimarykey(spatial_ref_sysPK);
    }

    /**
     * add Numeric search values for field srid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void srid(long[] values, byte[] operators) {
        addNumbervalues(srid, values, operators);
    }
    
    /**
     * add Numeric search values for field srid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void srid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(srid, values, operators);
        srid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field auth_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void auth_name(String[] values) {
        addStringvalues(auth_name, values);
    }
    
    /**
     * add String search values for field auth_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void auth_name(String[] values, byte compare, byte andor) {
        addStringvalues(auth_name, values);
        auth_name.setCompareoperator(compare);
        auth_name.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field auth_srid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void auth_srid(Double[] values, byte[] operators) {
        addNumbervalues(auth_srid, values, operators);
    }
    
    /**
     * add Numeric search values for field auth_srid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void auth_srid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(auth_srid, values, operators);
        auth_srid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field srtext, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void srtext(String[] values) {
        addStringvalues(srtext, values);
    }
    
    /**
     * add String search values for field srtext
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void srtext(String[] values, byte compare, byte andor) {
        addStringvalues(srtext, values);
        srtext.setCompareoperator(compare);
        srtext.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field proj4text, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void proj4text(String[] values) {
        addStringvalues(proj4text, values);
    }
    
    /**
     * add String search values for field proj4text
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void proj4text(String[] values, byte compare, byte andor) {
        addStringvalues(proj4text, values);
        proj4text.setCompareoperator(compare);
        proj4text.setAndoroperator(andor);
    }
    
}
