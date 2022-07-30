/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 20.9.2021 18:20
 */

package film.logicview;

import data.interfaces.db.EntityView;
import data.interfaces.db.View;
import film.filmDatabaseproperties;

/**
 * @author Franky Laseure
 */
public class Viewdescriptions implements filmDatabaseproperties, View {

    public static final String SQLSelectAll = "";
    
    private String description;

    public Viewdescriptions() {
        description = "";
    }

    @Override
    public String getTable() {
        return "";
    }

    @Override
    public String getDbtool() {
        return filmDatabaseproperties.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return filmDatabaseproperties.connectionpool;
    }
    
    @Override
    public String getClassName() {
        return this.getClass().getName();
    }

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
