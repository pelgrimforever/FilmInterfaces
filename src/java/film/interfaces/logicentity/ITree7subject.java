/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import film.interfaces.entity.pk.*;
import film.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

public interface ITree7subject extends LogicEntity {

    public ITree7subjectPK getPrimaryKey();
	
    public static short TREE7ID = 1;
    public static short SUBJECTID = 2;
    public static short SUBJECT = 3;
    public static short TREESTEP = 4;
    public static short PARENTSUBJECTID = 5;

    public static final int SIZE_TREE7ID = 25;
    public static final int SIZE_SUBJECTID = 19;
    public static final int SIZE_SUBJECT = 30;
    public static final int SIZE_TREESTEP = 5;
    public static final int SIZE_PARENTSUBJECTID = 19;
    public static final String[] fieldnames = { "tree7id", "subjectid", "subject", "treestep", "parentsubjectid" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_long, Datatypes.type_String, Datatypes.type_int, Datatypes.type_long };

    public static final String[] tree7subjectParentsubjectidPKfields = { "tree7subject.subjectid" };
    public static final String[] tree7subjectParentsubjectidFKfields = { "tree7subject.parentsubjectid" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getTree7id();

    public void setTree7id(java.lang.String tree7id);

    public java.lang.String getSubject();

    public void setSubject(java.lang.String subject);

    public int getTreestep();

    public void setTreestep(int treestep);

    public ITree7subjectPK getTree7subjectparentsubjectidPK();

    public void setTree7subjectparentsubjectidPK(ITree7subjectPK tree7subjectParentsubjectidPK);

    
//Custom code, do not change this line
//Put custom functions here
    public void setParents(ArrayList parents);

    public ArrayList getParents();

    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
