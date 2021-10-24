/*
 * View_backupstatus.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 20.9.2021 18:20
 *
 */

package film.logicview;

import data.interfaces.db.View;
import film.filmDatabaseproperties;

/**
 * Viewdescriptions
 *
 * store descriptions from photos
 *
 * @author Franky Laseure
 */
public class Viewdescriptions implements View, filmDatabaseproperties {

    public static final String SQLSelectAll = "";
    
    private String description;

    /**
     * Constructor
     * Creates an empty View_backupstatus entity
     */
    public Viewdescriptions() {
        description = "";
    }

    /**
     * @return DB Table name
     */
    @Override
    public String getTable() {
        return "";
    }

    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return filmDatabaseproperties.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return filmDatabaseproperties.connectionpool;
    }
    
    /**
     * @return Classname of Entity
     */
    @Override
    public String getClassName() {
        return this.getClass().getName();
    }

    /**
     * @return is :Entity: Empty ?
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
