/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_groupsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Art_group;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Art_groupsearch extends Tablesearch implements IArt_groupsearch {

    Numbersearch groupid = new Numbersearch("art_group.groupid");
    Stringsearch groupname = new Stringsearch("art_group.groupname");
//foreign keys
//external foreign keys

    public String getTable() {
        return Art_group.table;
    }

    public Art_groupsearch() {
        setFieldsearchers();
    }

    public Art_groupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(groupid);
        addFieldsearcher(groupname);
    }

    public void addPrimarykey(IArt_groupPK art_groupPK) {
        super.addPrimarykey(art_groupPK);
    }

    public void groupid(long[] values, byte[] operators) {
        addNumbervalues(groupid, values, operators);
    }
    
    public void groupid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(groupid, values, operators);
        groupid.setAndoroperator(andor);
    }
    
    public void groupname(String[] values) {
        addStringvalues(groupname, values);
    }
    
    public void groupname(String[] values, byte compare, byte andor) {
        addStringvalues(groupname, values);
        groupname.setCompareoperator(compare);
        groupname.setAndoroperator(andor);
    }
    
}
