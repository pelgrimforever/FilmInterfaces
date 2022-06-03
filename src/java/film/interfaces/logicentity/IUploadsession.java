/*
 * IUploadsession.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
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

/**
 * Entity Interface IUploadsession
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IUploadsession extends LogicEntity {

    public IUploadsessionPK getPrimaryKey();
	
    public static short FILENAME = 1;
    public static short UPLOAD = 2;
    public static short ROTATION = 3;
    public static short FILMGROUPID = 4;
    public static short PHOTOSUBJECTS = 5;
    public static short DESCRIPTION = 6;
    public static short CREATOR = 7;

    public static final int SIZE_FILENAME = 100;
    public static final int SIZE_UPLOAD = 1;
    public static final int SIZE_ROTATION = 5;
    public static final int SIZE_FILMGROUPID = 3;
    public static final int SIZE_PHOTOSUBJECTS = 2147483647;
    public static final int SIZE_DESCRIPTION = 50;
    public static final int SIZE_CREATOR = 25;
    public static final String[] fieldnames = { "filename", "upload", "rotation", "filmgroupid", "photosubjects", "description", "creator" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_boolean, Datatypes.type_float, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String, Datatypes.type_String };

    public static final String[] creatorPKfields = { "creator.creatorid" };
    public static final String[] creatorFKfields = { "uploadsession.creator" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return upload value
     */
    public boolean getUpload();

    /**
     * set upload value
     * @param upload: new value
     */
    public void setUpload(boolean upload);

    /**
     * 
     * @return rotation value
     */
    public float getRotation();

    /**
     * set rotation value
     * @param rotation: new value
     */
    public void setRotation(float rotation);

    /**
     * 
     * @return filmgroupid value
     */
    public java.lang.String getFilmgroupid();

    /**
     * set filmgroupid value
     * @param filmgroupid: new value
     */
    public void setFilmgroupid(java.lang.String filmgroupid);

    /**
     * 
     * @return photosubjects value
     */
    public java.lang.String getPhotosubjects();

    /**
     * set photosubjects value
     * @param photosubjects: new value
     */
    public void setPhotosubjects(java.lang.String photosubjects);

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription();

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description);

    /**
     * 
     * @return foreign key creatorPK, instance of CreatorPK
     */
    public ICreatorPK getCreatorPK();

    /**
     * set foreign key creator
     * @param creatorPK: instance of CreatorPK
     */
    public void setCreatorPK(ICreatorPK creatorPK);

    
//Custom code, do not change this line
//Put custom functions here
    public Tree7subjectPK[] getPhotosubjectkeys();

    public void setSubjects(ISubject[] subjects);

    public void setSubjects(ArrayList subjects);

    public ArrayList getSubjects();
    
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
