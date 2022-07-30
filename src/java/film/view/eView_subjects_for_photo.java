/*
 * eView_subjects_for_photo.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
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

/**
 * View class View_subjects_for_photo
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_subjects_for_photo Entity
 * 
 * @author Franky Laseure
 */
public class eView_subjects_for_photo implements filmDatabaseproperties, EntityView {

    public static final String table = "view_subjects_for_photo";
    private java.lang.String film;
    private int photoid;
    private java.lang.String cat1;
    private java.lang.String cat2;
    private int id;
    private java.lang.String subject;
    private java.lang.String description;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_subjects_for_photo.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_subjects_for_photo.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_subjects_for_photo
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_subjects_for_photo class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_subjects_for_photo entity
     */
    public eView_subjects_for_photo() {
    }

    /**
     * @return is View_subjects_for_photo Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return film value
     */
    public java.lang.String getFilm() {
        return this.film;
    }

    /**
     * set film value
     * @param film: new value
     */
    public void setFilm(java.lang.String film) {
        this.film = film;
    }

    /**
     * 
     * @return photoid value
     */
    public int getPhotoid() {
        return this.photoid;
    }

    /**
     * set photoid value
     * @param photoid: new value
     */
    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    /**
     * 
     * @return cat1 value
     */
    public java.lang.String getCat1() {
        return this.cat1;
    }

    /**
     * set cat1 value
     * @param cat1: new value
     */
    public void setCat1(java.lang.String cat1) {
        this.cat1 = cat1;
    }

    /**
     * 
     * @return cat2 value
     */
    public java.lang.String getCat2() {
        return this.cat2;
    }

    /**
     * set cat2 value
     * @param cat2: new value
     */
    public void setCat2(java.lang.String cat2) {
        this.cat2 = cat2;
    }

    /**
     * 
     * @return id value
     */
    public int getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return subject value
     */
    public java.lang.String getSubject() {
        return this.subject;
    }

    /**
     * set subject value
     * @param subject: new value
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

}
