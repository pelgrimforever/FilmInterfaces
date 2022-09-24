/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_photodatessearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_photodates;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_photodatessearch extends Tablesearch implements IView_photodatessearch {

    Datesearch photodate = new Datesearch("view_photodates.photodate");
    Numbersearch photos = new Numbersearch("view_photodates.photos");

    public String getTable() {
        return View_photodates.table;
    }

    public View_photodatessearch() {
        setFieldsearchers();
    }

    public View_photodatessearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(photodate);
        addFieldsearcher(photos);
    }

    public void photodate(Date[] values, byte[] operators) {
        addDatevalues(photodate, values, operators);
    }
    
    public void photodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(photodate, values, operators);
        photodate.setAndoroperator(andor);
    }
    
    public void photos(Double[] values, byte[] operators) {
        addNumbervalues(photos, values, operators);
    }
    
    public void photos(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(photos, values, operators);
        photos.setAndoroperator(andor);
    }
    
}
