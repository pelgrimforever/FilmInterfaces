/*
 * eView_subjects_for_film.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.view;

import data.interfaces.db.EntityViewInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_subjects_for_film
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_subjects_for_film Entity
 * 
 * @author Franky Laseure
 */
public class eView_subjects_for_film implements EntityViewInterface {

    private java.lang.String film;
    private java.lang.String cat1;
    private java.lang.String cat2;
    private int id;
    private java.lang.String subject;
    private java.lang.String description;
	  
    public static final String table = "view_subjects_for_film";
    public static final String SQLSelectAll = "select view_subjects_for_film.* from view_subjects_for_film";
	  
    /**
     * 
     * @return view name for View_subjects_for_film
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_subjects_for_films
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_subjects_for_film class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_subjects_for_film entity
     */
    public eView_subjects_for_film() {
    }

    /**
     * @return is View_subjects_for_film Empty ?
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
