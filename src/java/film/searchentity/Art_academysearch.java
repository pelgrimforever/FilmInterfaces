/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_academysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Art_academy;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Art_academysearch extends Tablesearch implements IArt_academysearch {

    Numbersearch academyid = new Numbersearch("art_academy.academyid");
    Stringsearch academy = new Stringsearch("art_academy.academy");
    Stringsearch academylocation = new Stringsearch("art_academy.academylocation");
//foreign keys
//external foreign keys

    public String getTable() {
        return Art_academy.table;
    }

    public Art_academysearch() {
        setFieldsearchers();
    }

    public Art_academysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(academyid);
        addFieldsearcher(academy);
        addFieldsearcher(academylocation);
    }

    public void addPrimarykey(IArt_academyPK art_academyPK) {
        super.addPrimarykey(art_academyPK);
    }

    public void academyid(long[] values, byte[] operators) {
        addNumbervalues(academyid, values, operators);
    }
    
    public void academyid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(academyid, values, operators);
        academyid.setAndoroperator(andor);
    }
    
    public void academy(String[] values) {
        addStringvalues(academy, values);
    }
    
    public void academy(String[] values, byte compare, byte andor) {
        addStringvalues(academy, values);
        academy.setCompareoperator(compare);
        academy.setAndoroperator(andor);
    }
    
    public void academylocation(String[] values) {
        addStringvalues(academylocation, values);
    }
    
    public void academylocation(String[] values, byte compare, byte andor) {
        addStringvalues(academylocation, values);
        academylocation.setCompareoperator(compare);
        academylocation.setAndoroperator(andor);
    }
    
}
