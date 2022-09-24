/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class Spatial_ref_syssearch extends Tablesearch implements ISpatial_ref_syssearch {

    Numbersearch srid = new Numbersearch("spatial_ref_sys.srid");
    Stringsearch auth_name = new Stringsearch("spatial_ref_sys.auth_name");
    Numbersearch auth_srid = new Numbersearch("spatial_ref_sys.auth_srid");
    Stringsearch srtext = new Stringsearch("spatial_ref_sys.srtext");
    Stringsearch proj4text = new Stringsearch("spatial_ref_sys.proj4text");
//foreign keys
//external foreign keys

    public String getTable() {
        return Spatial_ref_sys.table;
    }

    public Spatial_ref_syssearch() {
        setFieldsearchers();
    }

    public Spatial_ref_syssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(srid);
        addFieldsearcher(auth_name);
        addFieldsearcher(auth_srid);
        addFieldsearcher(srtext);
        addFieldsearcher(proj4text);
    }

    public void addPrimarykey(ISpatial_ref_sysPK spatial_ref_sysPK) {
        super.addPrimarykey(spatial_ref_sysPK);
    }

    public void srid(long[] values, byte[] operators) {
        addNumbervalues(srid, values, operators);
    }
    
    public void srid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(srid, values, operators);
        srid.setAndoroperator(andor);
    }
    
    public void auth_name(String[] values) {
        addStringvalues(auth_name, values);
    }
    
    public void auth_name(String[] values, byte compare, byte andor) {
        addStringvalues(auth_name, values);
        auth_name.setCompareoperator(compare);
        auth_name.setAndoroperator(andor);
    }
    
    public void auth_srid(Double[] values, byte[] operators) {
        addNumbervalues(auth_srid, values, operators);
    }
    
    public void auth_srid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(auth_srid, values, operators);
        auth_srid.setAndoroperator(andor);
    }
    
    public void srtext(String[] values) {
        addStringvalues(srtext, values);
    }
    
    public void srtext(String[] values, byte compare, byte andor) {
        addStringvalues(srtext, values);
        srtext.setCompareoperator(compare);
        srtext.setAndoroperator(andor);
    }
    
    public void proj4text(String[] values) {
        addStringvalues(proj4text, values);
    }
    
    public void proj4text(String[] values, byte compare, byte andor) {
        addStringvalues(proj4text, values);
        proj4text.setCompareoperator(compare);
        proj4text.setAndoroperator(andor);
    }
    
}
