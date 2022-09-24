/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity;

import film.filmDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_photo;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eArt_photo extends AbstractEntity implements filmDatabaseproperties, Entity {

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
	  
    public String getFieldname(short fieldconstant) {
        return IArt_photo.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_photo.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eArt_photo.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eArt_photo.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eArt_photo() {
    }

    public eArt_photo(java.lang.String film, int photo) {
        this.art_photoPK = new Art_photoPK(film, photo);
    }
  
    public eArt_photo(Art_photoPK art_photoPK) {
        this.art_photoPK = art_photoPK;
    }

    public boolean isEmpty() {
        return this.art_photoPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.art_photoPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.art_photoPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Art_photoPK getPrimaryKey() {
        return this.art_photoPK;
    }

    public boolean getSelection() {
        return this.selection;
    }

    public void initSelection(boolean selection) {
        this.selection = selection;
    }

    public void setSelection(boolean selection) {
        updates.put(IArt_photo.SELECTION, selection);
        this.selection = selection;
    }

    public int getWidth() {
        return this.width;
    }

    public void initWidth(int width) {
        this.width = width;
    }

    public void setWidth(int width) {
        updates.put(IArt_photo.WIDTH, width);
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void initHeight(int height) {
        this.height = height;
    }

    public void setHeight(int height) {
        updates.put(IArt_photo.HEIGHT, height);
        this.height = height;
    }

    public java.lang.String getComment() {
        return this.comment;
    }

    public void initComment(java.lang.String comment) {
        this.comment = comment;
    }

    public void setComment(java.lang.String comment) {
	if(comment==null && comment!=this.comment || comment!=null && !comment.equals(this.comment)) {
            updates.put(IArt_photo.COMMENT, comment);
        }
        this.comment = comment;
    }

    public int getSeqno() {
        return this.seqno;
    }

    public void initSeqno(int seqno) {
        this.seqno = seqno;
    }

    public void setSeqno(int seqno) {
        updates.put(IArt_photo.SEQNO, seqno);
        this.seqno = seqno;
    }

    public boolean getArchive() {
        return this.archive;
    }

    public void initArchive(boolean archive) {
        this.archive = archive;
    }

    public void setArchive(boolean archive) {
        updates.put(IArt_photo.ARCHIVE, archive);
        this.archive = archive;
    }

    public boolean getSurround() {
        return this.surround;
    }

    public void initSurround(boolean surround) {
        this.surround = surround;
    }

    public void setSurround(boolean surround) {
        updates.put(IArt_photo.SURROUND, surround);
        this.surround = surround;
    }

    public java.lang.String getSurrounddir() {
        return this.surrounddir;
    }

    public void initSurrounddir(java.lang.String surrounddir) {
        this.surrounddir = surrounddir;
    }

    public void setSurrounddir(java.lang.String surrounddir) {
	if(surrounddir==null && surrounddir!=this.surrounddir || surrounddir!=null && !surrounddir.equals(this.surrounddir)) {
            updates.put(IArt_photo.SURROUNDDIR, surrounddir);
        }
        this.surrounddir = surrounddir;
    }

    public Art_subgroupPK getArt_subgroupPK() {
        return this.art_subgroupPK;
    }

    public void initArt_subgroupPK(IArt_subgroupPK art_subgroupPK) {
        this.art_subgroupPK = (Art_subgroupPK)art_subgroupPK;
    }

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

    public Art_academyPK getArt_academyPK() {
        return this.art_academyPK;
    }

    public void initArt_academyPK(IArt_academyPK art_academyPK) {
        this.art_academyPK = (Art_academyPK)art_academyPK;
    }

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

    public Art_groupPK getArt_groupPK() {
        return this.art_groupPK;
    }

    public void initArt_groupPK(IArt_groupPK art_groupPK) {
        this.art_groupPK = (Art_groupPK)art_groupPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
