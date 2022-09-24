/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class Securityprofilesearch extends Tablesearch implements ISecurityprofilesearch {

    Stringsearch userprofile = new Stringsearch("securityprofile.userprofile");
    Booleansearch privateaccess = new Booleansearch("securityprofile.privateaccess");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch securityuserprofilesearcher = new Primarykeysearch("securityuserprofile", ISecurityuserprofile.securityprofilePKfields, ISecurityuserprofile.securityprofileFKfields);

    public String getTable() {
        return Securityprofile.table;
    }

    public Securityprofilesearch() {
        setFieldsearchers();
    }

    public Securityprofilesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(userprofile);
        addFieldsearcher(privateaccess);
        addKeysearcher(securityuserprofilesearcher);
    }

    public void addPrimarykey(ISecurityprofilePK securityprofilePK) {
        super.addPrimarykey(securityprofilePK);
    }

    public void userprofile(String[] values) {
        addStringvalues(userprofile, values);
    }
    
    public void userprofile(String[] values, byte compare, byte andor) {
        addStringvalues(userprofile, values);
        userprofile.setCompareoperator(compare);
        userprofile.setAndoroperator(andor);
    }
    
    public void privateaccess(Boolean value) {
        addBooleanvalue(privateaccess, value);
    }
    
    public void securityuserprofile(ISecurityuserprofilesearch securityuserprofilesearch) {
        securityuserprofilesearcher.setTablesearch(securityuserprofilesearch);
    }
    
    public ISecurityuserprofilesearch getSecurityuserprofilesearch() {
        if(securityuserprofilesearcher.used()) {
            return (ISecurityuserprofilesearch)securityuserprofilesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
