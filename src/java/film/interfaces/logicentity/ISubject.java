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

public interface ISubject extends LogicEntity {

    public ISubjectPK getPrimaryKey();
	
    public static short CAT1 = 1;
    public static short CAT2 = 2;
    public static short ID = 3;
    public static short SUBJECT = 4;
    public static short DESCRIPTION = 5;
    public static short TREE7SUBJECTID = 6;

    public static final int SIZE_CAT1 = 30;
    public static final int SIZE_CAT2 = 30;
    public static final int SIZE_ID = 10;
    public static final int SIZE_SUBJECT = 30;
    public static final int SIZE_DESCRIPTION = 100;
    public static final int SIZE_TREE7SUBJECTID = 19;
    public static final String[] fieldnames = { "cat1", "cat2", "id", "subject", "description", "tree7subjectid" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_String, Datatypes.type_int_serial, Datatypes.type_String, Datatypes.type_String, Datatypes.type_long };

    public static final String[] subjectcatCat1PKfields = { "subjectcat.cat" };
    public static final String[] subjectcatCat1FKfields = { "subject.cat1" };
    public static final String[] tree7subjectPKfields = { "tree7subject.subjectid" };
    public static final String[] tree7subjectFKfields = { "subject.tree7subjectid" };
    public static final String[] subjectcatCat2PKfields = { "subjectcat.cat" };
    public static final String[] subjectcatCat2FKfields = { "subject.cat2" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getSubject();

    public void setSubject(java.lang.String subject);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public ITree7subjectPK getTree7subjectPK();

    public void setTree7subjectPK(ITree7subjectPK tree7subjectPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
