/*
 * Securityprofilesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ISecurityprofilesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Securityprofile;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Securityprofile table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Securityprofilesearch extends Tablesearch implements ISecurityprofilesearch {

    Stringsearch userprofile = new Stringsearch("securityprofile.userprofile");
    Booleansearch privateaccess = new Booleansearch("securityprofile.privateaccess");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch securityuserprofilesearcher = new Primarykeysearch("securityuserprofile", ISecurityuserprofile.securityprofilePKfields, ISecurityuserprofile.securityprofileFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Securityprofile.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Securityprofilesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Securityprofilesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(userprofile);
        addFieldsearcher(privateaccess);
        addKeysearcher(securityuserprofilesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param securityprofilePK: Securityprofile primery key
     */
    public void addPrimarykey(ISecurityprofilePK securityprofilePK) {
        super.addPrimarykey(securityprofilePK);
    }

    /**
     * add String search values for field userprofile, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void userprofile(String[] values) {
        addStringvalues(userprofile, values);
    }
    
    /**
     * add String search values for field userprofile
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void userprofile(String[] values, byte compare, byte andor) {
        addStringvalues(userprofile, values);
        userprofile.setCompareoperator(compare);
        userprofile.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field privateaccess
     * @param value: true or false
     */
    public void privateaccess(Boolean value) {
        addBooleanvalue(privateaccess, value);
    }
    
    /**
     * set external key - foreign key subsearch ISecurityuserprofilesearch
     * @param securityuserprofilesearch: ISecurityuserprofilesearch
     */
    public void securityuserprofile(ISecurityuserprofilesearch securityuserprofilesearch) {
        securityuserprofilesearcher.setTablesearch(securityuserprofilesearch);
    }
    
    /**
     * get external key - foreign key subsearch ISecurityuserprofilesearch
     * @return Tablesearch for ISecurityuserprofilesearch
     */
    public ISecurityuserprofilesearch getSecurityuserprofilesearch() {
        if(securityuserprofilesearcher.used()) {
            return (ISecurityuserprofilesearch)securityuserprofilesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
