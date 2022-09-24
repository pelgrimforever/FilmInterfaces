/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_subgroupsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Art_subgroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Art_subgroupsearch extends Tablesearch implements IArt_subgroupsearch {

    Numbersearch subgroupid = new Numbersearch("art_subgroup.subgroupid");
    Stringsearch subgroupname = new Stringsearch("art_subgroup.subgroupname");
    Numbersearch lastseqno = new Numbersearch("art_subgroup.lastseqno");
//foreign keys
    Foreignkeysearch art_groupsearcher = new Foreignkeysearch("art_group", IArt_subgroup.art_groupPKfields, IArt_subgroup.art_groupFKfields);
//external foreign keys

    public String getTable() {
        return Art_subgroup.table;
    }

    public Art_subgroupsearch() {
        setFieldsearchers();
    }

    public Art_subgroupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(subgroupid);
        addFieldsearcher(subgroupname);
        addFieldsearcher(lastseqno);
        addKeysearcher(art_groupsearcher);
    }

    public void addPrimarykey(IArt_subgroupPK art_subgroupPK) {
        super.addPrimarykey(art_subgroupPK);
    }

    public void subgroupid(long[] values, byte[] operators) {
        addNumbervalues(subgroupid, values, operators);
    }
    
    public void subgroupid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(subgroupid, values, operators);
        subgroupid.setAndoroperator(andor);
    }
    
    public void subgroupname(String[] values) {
        addStringvalues(subgroupname, values);
    }
    
    public void subgroupname(String[] values, byte compare, byte andor) {
        addStringvalues(subgroupname, values);
        subgroupname.setCompareoperator(compare);
        subgroupname.setAndoroperator(andor);
    }
    
    public void lastseqno(Double[] values, byte[] operators) {
        addNumbervalues(lastseqno, values, operators);
    }
    
    public void lastseqno(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lastseqno, values, operators);
        lastseqno.setAndoroperator(andor);
    }
    
    public void art_group(IArt_groupsearch art_groupsearch) {
        art_groupsearcher.setTablesearch(art_groupsearch);
    }
    
    public IArt_groupsearch getArt_groupsearch() {
        if(art_groupsearcher.used()) {
            return (IArt_groupsearch)art_groupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getArt_groupInnerjoin() {
        return art_groupsearcher.getInnerjoin();
    }

}
