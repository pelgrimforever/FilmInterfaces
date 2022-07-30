/*
 * IArt_photo.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
 * Entity Interface IArt_photo
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IArt_photo extends LogicEntity {

    public IArt_photoPK getPrimaryKey();
	
    public static short FILM = 1;
    public static short PHOTO = 2;
    public static short PHOTOGROUP = 3;
    public static short PHOTOSUBGROUP = 4;
    public static short ACADEMY = 5;
    public static short SELECTION = 6;
    public static short WIDTH = 7;
    public static short HEIGHT = 8;
    public static short COMMENT = 9;
    public static short SEQNO = 10;
    public static short ARCHIVE = 11;
    public static short SURROUND = 12;
    public static short SURROUNDDIR = 13;

    public static final int SIZE_FILM = 6;
    public static final int SIZE_PHOTO = 5;
    public static final int SIZE_PHOTOGROUP = 19;
    public static final int SIZE_PHOTOSUBGROUP = 10;
    public static final int SIZE_ACADEMY = 19;
    public static final int SIZE_SELECTION = 1;
    public static final int SIZE_WIDTH = 5;
    public static final int SIZE_HEIGHT = 5;
    public static final int SIZE_COMMENT = 2147483647;
    public static final int SIZE_SEQNO = 10;
    public static final int SIZE_ARCHIVE = 1;
    public static final int SIZE_SURROUND = 1;
    public static final int SIZE_SURROUNDDIR = 15;
    public static final String[] fieldnames = { "film", "photo", "photogroup", "photosubgroup", "academy", "selection", "width", "height", "comment", "seqno", "archive", "surround", "surrounddir" };
    public static final byte[] fieldtypes = { Datatypes.type_String, Datatypes.type_int, Datatypes.type_long, Datatypes.type_int, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_int, Datatypes.type_int, Datatypes.type_String, Datatypes.type_int, Datatypes.type_boolean, Datatypes.type_boolean, Datatypes.type_String };

    public static final String[] photoPKfields = { "photo.film", "photo.id" };
    public static final String[] photoFKfields = { "art_photo.film", "art_photo.photo" };
    public static final String[] art_subgroupPKfields = { "art_subgroup.subgroupid" };
    public static final String[] art_subgroupFKfields = { "art_photo.photosubgroup" };
    public static final String[] art_academyPKfields = { "art_academy.academyid" };
    public static final String[] art_academyFKfields = { "art_photo.academy" };
    public static final String[] art_groupPKfields = { "art_group.groupid" };
    public static final String[] art_groupFKfields = { "art_photo.photogroup" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return selection value
     */
    public boolean getSelection();

    /**
     * set selection value
     * @param selection: new value
     */
    public void setSelection(boolean selection);

    /**
     * 
     * @return width value
     */
    public int getWidth();

    /**
     * set width value
     * @param width: new value
     */
    public void setWidth(int width);

    /**
     * 
     * @return height value
     */
    public int getHeight();

    /**
     * set height value
     * @param height: new value
     */
    public void setHeight(int height);

    /**
     * 
     * @return comment value
     */
    public java.lang.String getComment();

    /**
     * set comment value
     * @param comment: new value
     */
    public void setComment(java.lang.String comment);

    /**
     * 
     * @return seqno value
     */
    public int getSeqno();

    /**
     * set seqno value
     * @param seqno: new value
     */
    public void setSeqno(int seqno);

    /**
     * 
     * @return archive value
     */
    public boolean getArchive();

    /**
     * set archive value
     * @param archive: new value
     */
    public void setArchive(boolean archive);

    /**
     * 
     * @return surround value
     */
    public boolean getSurround();

    /**
     * set surround value
     * @param surround: new value
     */
    public void setSurround(boolean surround);

    /**
     * 
     * @return surrounddir value
     */
    public java.lang.String getSurrounddir();

    /**
     * set surrounddir value
     * @param surrounddir: new value
     */
    public void setSurrounddir(java.lang.String surrounddir);

    /**
     * 
     * @return foreign key art_subgroupPK, instance of Art_subgroupPK
     */
    public IArt_subgroupPK getArt_subgroupPK();

    /**
     * set foreign key art_subgroup
     * @param art_subgroupPK: instance of Art_subgroupPK
     */
    public void setArt_subgroupPK(IArt_subgroupPK art_subgroupPK);

    /**
     * 
     * @return foreign key art_academyPK, instance of Art_academyPK
     */
    public IArt_academyPK getArt_academyPK();

    /**
     * set foreign key art_academy
     * @param art_academyPK: instance of Art_academyPK
     */
    public void setArt_academyPK(IArt_academyPK art_academyPK);

    /**
     * 
     * @return foreign key art_groupPK, instance of Art_groupPK
     */
    public IArt_groupPK getArt_groupPK();

    /**
     * set foreign key art_group
     * @param art_groupPK: instance of Art_groupPK
     */
    public void setArt_groupPK(IArt_groupPK art_groupPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
