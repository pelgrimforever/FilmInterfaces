/*
 * Securityuserprofilesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ISecurityuserprofilesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eSecurityuserprofile;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Securityuserprofile table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Securityuserprofilesearch extends Tablesearch implements ISecurityuserprofilesearch {

    Stringsearch siteusername = new Stringsearch("securityuserprofile.siteusername");
    Foreignkeysearch securityprofilesearcher = new Foreignkeysearch("securityprofile", ISecurityuserprofile.securityprofilePKfields, ISecurityuserprofile.securityprofileFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Securityuserprofilesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Securityuserprofilesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(siteusername);
        addKeysearcher(securityprofilesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param securityuserprofilePK: Securityuserprofile primery key
     */
    public void addPrimarykey(ISecurityuserprofilePK securityuserprofilePK) {
        super.addPrimarykey(securityuserprofilePK);
    }

    /**
     * add String search values for field siteusername, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void siteusername(String[] values) {
        addStringvalues(siteusername, values);
    }
    
    /**
     * add String search values for field siteusername
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void siteusername(String[] values, byte compare, byte andor) {
        addStringvalues(siteusername, values);
        siteusername.setCompareoperator(compare);
        siteusername.setAndoroperator(andor);
    }
    
    /**
     * set subsearch securityprofile tablesearch
     * @param securityprofilesearch: ISecurityprofilesearch
     */
    public void securityprofile(ISecurityprofilesearch securityprofilesearch) {
        securityprofilesearcher.setTablesearch(securityprofilesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Securityuserprofile
     */
    public ISecurityprofilesearch getSecurityprofilesearch() {
        if(securityprofilesearcher.used()) {
            return (ISecurityprofilesearch)securityprofilesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if securityprofilesearcher is not used
     * @return inner join statement
     */
    public String getSecurityprofileInnerjoin() {
        return securityprofilesearcher.getInnerjoin();
    }

}
