/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.ISecurityuserprofilesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Securityuserprofile;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Securityuserprofilesearch extends Tablesearch implements ISecurityuserprofilesearch {

    Stringsearch siteusername = new Stringsearch("securityuserprofile.siteusername");
//foreign keys
    Foreignkeysearch securityprofilesearcher = new Foreignkeysearch("securityprofile", ISecurityuserprofile.securityprofilePKfields, ISecurityuserprofile.securityprofileFKfields);
//external foreign keys

    public String getTable() {
        return Securityuserprofile.table;
    }

    public Securityuserprofilesearch() {
        setFieldsearchers();
    }

    public Securityuserprofilesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(siteusername);
        addKeysearcher(securityprofilesearcher);
    }

    public void addPrimarykey(ISecurityuserprofilePK securityuserprofilePK) {
        super.addPrimarykey(securityuserprofilePK);
    }

    public void siteusername(String[] values) {
        addStringvalues(siteusername, values);
    }
    
    public void siteusername(String[] values, byte compare, byte andor) {
        addStringvalues(siteusername, values);
        siteusername.setCompareoperator(compare);
        siteusername.setAndoroperator(andor);
    }
    
    public void securityprofile(ISecurityprofilesearch securityprofilesearch) {
        securityprofilesearcher.setTablesearch(securityprofilesearch);
    }
    
    public ISecurityprofilesearch getSecurityprofilesearch() {
        if(securityprofilesearcher.used()) {
            return (ISecurityprofilesearch)securityprofilesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSecurityprofileInnerjoin() {
        return securityprofilesearcher.getInnerjoin();
    }

}
