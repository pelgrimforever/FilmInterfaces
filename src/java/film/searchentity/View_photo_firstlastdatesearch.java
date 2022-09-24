/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_photo_firstlastdatesearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_photo_firstlastdate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_photo_firstlastdatesearch extends Tablesearch implements IView_photo_firstlastdatesearch {

    Datesearch minphotodate = new Datesearch("view_photo_firstlastdate.minphotodate");
    Datesearch maxphotodate = new Datesearch("view_photo_firstlastdate.maxphotodate");

    public String getTable() {
        return View_photo_firstlastdate.table;
    }

    public View_photo_firstlastdatesearch() {
        setFieldsearchers();
    }

    public View_photo_firstlastdatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(minphotodate);
        addFieldsearcher(maxphotodate);
    }

    public void minphotodate(Date[] values, byte[] operators) {
        addDatevalues(minphotodate, values, operators);
    }
    
    public void minphotodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(minphotodate, values, operators);
        minphotodate.setAndoroperator(andor);
    }
    
    public void maxphotodate(Date[] values, byte[] operators) {
        addDatevalues(maxphotodate, values, operators);
    }
    
    public void maxphotodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(maxphotodate, values, operators);
        maxphotodate.setAndoroperator(andor);
    }
    
}
