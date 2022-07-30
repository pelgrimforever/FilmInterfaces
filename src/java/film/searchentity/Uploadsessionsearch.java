/*
 * Uploadsessionsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IUploadsessionsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Uploadsession;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Uploadsession table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Uploadsessionsearch extends Tablesearch implements IUploadsessionsearch {

    Stringsearch filename = new Stringsearch("uploadsession.filename");
    Booleansearch upload = new Booleansearch("uploadsession.upload");
    Numbersearch rotation = new Numbersearch("uploadsession.rotation");
    Stringsearch filmgroupid = new Stringsearch("uploadsession.filmgroupid");
    Stringsearch photosubjects = new Stringsearch("uploadsession.photosubjects");
    Stringsearch description = new Stringsearch("uploadsession.description");
//foreign keys
    Foreignkeysearch creatorsearcher = new Foreignkeysearch("creator", IUploadsession.creatorPKfields, IUploadsession.creatorFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Uploadsession.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Uploadsessionsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Uploadsessionsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(filename);
        addFieldsearcher(upload);
        addFieldsearcher(rotation);
        addFieldsearcher(filmgroupid);
        addFieldsearcher(photosubjects);
        addFieldsearcher(description);
        addKeysearcher(creatorsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param uploadsessionPK: Uploadsession primery key
     */
    public void addPrimarykey(IUploadsessionPK uploadsessionPK) {
        super.addPrimarykey(uploadsessionPK);
    }

    /**
     * add String search values for field filename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void filename(String[] values) {
        addStringvalues(filename, values);
    }
    
    /**
     * add String search values for field filename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void filename(String[] values, byte compare, byte andor) {
        addStringvalues(filename, values);
        filename.setCompareoperator(compare);
        filename.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field upload
     * @param value: true or false
     */
    public void upload(Boolean value) {
        addBooleanvalue(upload, value);
    }
    
    /**
     * add Numeric search values for field rotation, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void rotation(Double[] values, byte[] operators) {
        addNumbervalues(rotation, values, operators);
    }
    
    /**
     * add Numeric search values for field rotation
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void rotation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(rotation, values, operators);
        rotation.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field filmgroupid, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void filmgroupid(String[] values) {
        addStringvalues(filmgroupid, values);
    }
    
    /**
     * add String search values for field filmgroupid
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void filmgroupid(String[] values, byte compare, byte andor) {
        addStringvalues(filmgroupid, values);
        filmgroupid.setCompareoperator(compare);
        filmgroupid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field photosubjects, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void photosubjects(String[] values) {
        addStringvalues(photosubjects, values);
    }
    
    /**
     * add String search values for field photosubjects
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void photosubjects(String[] values, byte compare, byte andor) {
        addStringvalues(photosubjects, values);
        photosubjects.setCompareoperator(compare);
        photosubjects.setAndoroperator(andor);
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
    
    /**
     * set foreign key subsearch creator ICreatorsearch
     * @param creatorsearch: ICreatorsearch
     */
    public void creator(ICreatorsearch creatorsearch) {
        creatorsearcher.setTablesearch(creatorsearch);
    }
    
    /**
     * get foreign key subsearch creator ICreatorsearch
     * @return Tablesearch for Uploadsession
     */
    public ICreatorsearch getCreatorsearch() {
        if(creatorsearcher.used()) {
            return (ICreatorsearch)creatorsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if creatorsearcher is not used
     * @return inner join statement
     */
    public String getCreatorInnerjoin() {
        return creatorsearcher.getInnerjoin();
    }

}
