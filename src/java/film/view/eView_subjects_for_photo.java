/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.view;

import film.filmDatabaseproperties;
import data.interfaces.db.EntityView;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

public class eView_subjects_for_photo implements filmDatabaseproperties, EntityView {

    public static final String table = "view_subjects_for_photo";
    private java.lang.String film;
    private int photoid;
    private java.lang.String cat1;
    private java.lang.String cat2;
    private int id;
    private java.lang.String subject;
    private java.lang.String description;
	  
    @Override
    public String getDbtool() {
        return eView_subjects_for_photo.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_subjects_for_photo.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_subjects_for_photo() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getFilm() {
        return this.film;
    }

    public void setFilm(java.lang.String film) {
        this.film = film;
    }

    public int getPhotoid() {
        return this.photoid;
    }

    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    public java.lang.String getCat1() {
        return this.cat1;
    }

    public void setCat1(java.lang.String cat1) {
        this.cat1 = cat1;
    }

    public java.lang.String getCat2() {
        return this.cat2;
    }

    public void setCat2(java.lang.String cat2) {
        this.cat2 = cat2;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getSubject() {
        return this.subject;
    }

    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

}
