/*
 * eArt_photo.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_photo;
import film.interfaces.entity.pk.*;

/**
 * Entity class Art_photo
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Art_photo Entity
 * 
 * @author Franky Laseure
 */
public class eArt_photo extends AbstractEntity implements EntityInterface {

    protected Art_photoPK art_photoPK;
    private Art_subgroupPK art_subgroupPK;
    private Art_academyPK art_academyPK;
    private Art_groupPK art_groupPK;
    private boolean selection;
    private int width;
    private int height;
    private java.lang.String comment;
    private int seqno;
    private boolean archive;
    private boolean surround;
    private java.lang.String surrounddir;
	  
    public static final String table = "art_photo";
    public static final String SQLWhere1 = "film = :art_photo.film: and photo = :art_photo.photo:";
    public static final String SQLSelect1 = "select art_photo.* from art_photo where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from art_photo where " + SQLWhere1;
    public static final String SQLSelectAll = "select art_photo.* from art_photo";
	  
    public String getFieldname(short fieldconstant) {
        return IArt_photo.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_photo.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Art_photo
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Art_photo (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Art_photo (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Art_photos
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Art_photo class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Art_photo entity
     */
    public eArt_photo() {
    }

    /**
     * Constructor
     * build an empty Art_photo entity with initialized field values
     */
    public eArt_photo(java.lang.String film, int photo) {
        this.art_photoPK = new Art_photoPK(film, photo);
    }
  
    /**
     * Constructor
     * build an empty Art_photo entity with initialized Primarykey parameter
     * @param art_photoPK: Art_photo Primarykey
     */
    public eArt_photo(Art_photoPK art_photoPK) {
        this.art_photoPK = art_photoPK;
    }

    /**
     * @return is Art_photo Empty ?
     */
    public boolean isEmpty() {
        return this.art_photoPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.art_photoPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.art_photoPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IArt_photo.PHOTOSUBGROUP, this.art_subgroupPK.getSubgroupid());

        updates.put(IArt_photo.ACADEMY, this.art_academyPK.getAcademyid());

        updates.put(IArt_photo.PHOTOGROUP, this.art_groupPK.getGroupid());

        updates.put(IArt_photo.SELECTION, selection);
        updates.put(IArt_photo.WIDTH, width);
        updates.put(IArt_photo.HEIGHT, height);
        updates.put(IArt_photo.COMMENT, comment);
        updates.put(IArt_photo.SEQNO, seqno);
        updates.put(IArt_photo.ARCHIVE, archive);
        updates.put(IArt_photo.SURROUND, surround);
        updates.put(IArt_photo.SURROUNDDIR, surrounddir);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public Art_photoPK getPrimaryKey() {
        return this.art_photoPK;
    }

    /**
     * 
     * @return selection value
     */
    public boolean getSelection() {
        return this.selection;
    }

    /**
     * set selection value
     * @param selection: new value
     */
    public void initSelection(boolean selection) {
        this.selection = selection;
    }

    /**
     * set selection value
     * @param selection: new value
     */
    public void setSelection(boolean selection) {
	if(selection!=this.selection) {
            updates.put(IArt_photo.SELECTION, selection);
        }
        this.selection = selection;
    }

    /**
     * 
     * @return width value
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * set width value
     * @param width: new value
     */
    public void initWidth(int width) {
        this.width = width;
    }

    /**
     * set width value
     * @param width: new value
     */
    public void setWidth(int width) {
	if(width!=this.width) {
            updates.put(IArt_photo.WIDTH, width);
        }
        this.width = width;
    }

    /**
     * 
     * @return height value
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * set height value
     * @param height: new value
     */
    public void initHeight(int height) {
        this.height = height;
    }

    /**
     * set height value
     * @param height: new value
     */
    public void setHeight(int height) {
	if(height!=this.height) {
            updates.put(IArt_photo.HEIGHT, height);
        }
        this.height = height;
    }

    /**
     * 
     * @return comment value
     */
    public java.lang.String getComment() {
        return this.comment;
    }

    /**
     * set comment value
     * @param comment: new value
     */
    public void initComment(java.lang.String comment) {
        this.comment = comment;
    }

    /**
     * set comment value
     * @param comment: new value
     */
    public void setComment(java.lang.String comment) {
	if(comment==null && comment!=this.comment || comment!=null && !comment.equals(this.comment)) {
            updates.put(IArt_photo.COMMENT, comment);
        }
        this.comment = comment;
    }

    /**
     * 
     * @return seqno value
     */
    public int getSeqno() {
        return this.seqno;
    }

    /**
     * set seqno value
     * @param seqno: new value
     */
    public void initSeqno(int seqno) {
        this.seqno = seqno;
    }

    /**
     * set seqno value
     * @param seqno: new value
     */
    public void setSeqno(int seqno) {
	if(seqno!=this.seqno) {
            updates.put(IArt_photo.SEQNO, seqno);
        }
        this.seqno = seqno;
    }

    /**
     * 
     * @return archive value
     */
    public boolean getArchive() {
        return this.archive;
    }

    /**
     * set archive value
     * @param archive: new value
     */
    public void initArchive(boolean archive) {
        this.archive = archive;
    }

    /**
     * set archive value
     * @param archive: new value
     */
    public void setArchive(boolean archive) {
	if(archive!=this.archive) {
            updates.put(IArt_photo.ARCHIVE, archive);
        }
        this.archive = archive;
    }

    /**
     * 
     * @return surround value
     */
    public boolean getSurround() {
        return this.surround;
    }

    /**
     * set surround value
     * @param surround: new value
     */
    public void initSurround(boolean surround) {
        this.surround = surround;
    }

    /**
     * set surround value
     * @param surround: new value
     */
    public void setSurround(boolean surround) {
	if(surround!=this.surround) {
            updates.put(IArt_photo.SURROUND, surround);
        }
        this.surround = surround;
    }

    /**
     * 
     * @return surrounddir value
     */
    public java.lang.String getSurrounddir() {
        return this.surrounddir;
    }

    /**
     * set surrounddir value
     * @param surrounddir: new value
     */
    public void initSurrounddir(java.lang.String surrounddir) {
        this.surrounddir = surrounddir;
    }

    /**
     * set surrounddir value
     * @param surrounddir: new value
     */
    public void setSurrounddir(java.lang.String surrounddir) {
	if(surrounddir==null && surrounddir!=this.surrounddir || surrounddir!=null && !surrounddir.equals(this.surrounddir)) {
            updates.put(IArt_photo.SURROUNDDIR, surrounddir);
        }
        this.surrounddir = surrounddir;
    }

    /**
     * 
     * @return foreign key art_subgroupPK, instance of Art_subgroupPK
     */
    public Art_subgroupPK getArt_subgroupPK() {
        return this.art_subgroupPK;
    }

    /**
     * set foreign key art_subgroup
     * @param art_subgroupPK: instance of Art_subgroupPK
     */
    public void initArt_subgroupPK(IArt_subgroupPK art_subgroupPK) {
        this.art_subgroupPK = (Art_subgroupPK)art_subgroupPK;
    }

    /**
     * set foreign key art_subgroup
     * @param art_subgroupPK: instance of Art_subgroupPK
     */
    public void setArt_subgroupPK(IArt_subgroupPK art_subgroupPK) {
	if(art_subgroupPK==null && art_subgroupPK!=this.art_subgroupPK || art_subgroupPK!=null) {
            if(art_subgroupPK==null) {
                updates.put(IArt_photo.PHOTOSUBGROUP, null);
            } else {
                updates.put(IArt_photo.PHOTOSUBGROUP, art_subgroupPK.getSubgroupid());
            }
        }
        this.art_subgroupPK = (Art_subgroupPK)art_subgroupPK;
    }

    /**
     * 
     * @return foreign key art_academyPK, instance of Art_academyPK
     */
    public Art_academyPK getArt_academyPK() {
        return this.art_academyPK;
    }

    /**
     * set foreign key art_academy
     * @param art_academyPK: instance of Art_academyPK
     */
    public void initArt_academyPK(IArt_academyPK art_academyPK) {
        this.art_academyPK = (Art_academyPK)art_academyPK;
    }

    /**
     * set foreign key art_academy
     * @param art_academyPK: instance of Art_academyPK
     */
    public void setArt_academyPK(IArt_academyPK art_academyPK) {
	if(art_academyPK==null && art_academyPK!=this.art_academyPK || art_academyPK!=null) {
            if(art_academyPK==null) {
                updates.put(IArt_photo.ACADEMY, null);
            } else {
                updates.put(IArt_photo.ACADEMY, art_academyPK.getAcademyid());
            }
        }
        this.art_academyPK = (Art_academyPK)art_academyPK;
    }

    /**
     * 
     * @return foreign key art_groupPK, instance of Art_groupPK
     */
    public Art_groupPK getArt_groupPK() {
        return this.art_groupPK;
    }

    /**
     * set foreign key art_group
     * @param art_groupPK: instance of Art_groupPK
     */
    public void initArt_groupPK(IArt_groupPK art_groupPK) {
        this.art_groupPK = (Art_groupPK)art_groupPK;
    }

    /**
     * set foreign key art_group
     * @param art_groupPK: instance of Art_groupPK
     */
    public void setArt_groupPK(IArt_groupPK art_groupPK) {
	if(art_groupPK==null && art_groupPK!=this.art_groupPK || art_groupPK!=null) {
            if(art_groupPK==null) {
                updates.put(IArt_photo.PHOTOGROUP, null);
            } else {
                updates.put(IArt_photo.PHOTOGROUP, art_groupPK.getGroupid());
            }
        }
        this.art_groupPK = (Art_groupPK)art_groupPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
