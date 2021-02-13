/*
 * Uploadsession.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.entity.pk.*;
import film.interfaces.entity.pk.IUploadsessionPK;
import film.interfaces.logicentity.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 * Entity class Uploadsession
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Uploadsession extends film.entity.eUploadsession implements IUploadsession {

    public static final String SQLSelect = "select uploadsession.* from uploadsession";
    public static final String SQLWherecreator = "creator = :creator.creatorid:";

//Custom code, do not change this line
    public static final String SQLdeleteall = "delete from uploadsession";
    public static final String OrderBy = " order by filename";
    public static final String SQLSelectAllsorded = "select * from uploadsession" + OrderBy;

    private ArrayList subjects = null;
//Custom code, do not change this line

    public static final String SQLSelect4creator = "select * from uploadsession where " + SQLWherecreator + OrderBy;
    public static final String SQLDelete4creator = "delete from uploadsession where " + SQLWherecreator + OrderBy;

    /**
     * Constructor
     * Creates an empty Uploadsession entity
     */
    public Uploadsession() {
    }
    
    /**
     * Constructor
     * build an empty Uploadsession entity with initialized field values
     */
    public Uploadsession(java.lang.String filename) {
        super(filename);
    }

    /**
     * Constructor
     * build an empty Uploadsession entity with initialized Primarykey parameter
     * @param uploadsessionPK: Uploadsession Primarykey
     */
    public Uploadsession(UploadsessionPK uploadsessionPK) {
        super(uploadsessionPK);
    }

//Custom code, do not change this line
    public Tree7subjectPK[] getPhotosubjectkeys() {
        Tree7subjectPK[] subjectpks = new Tree7subjectPK[0];
        if(this.getPhotosubjects()!=null && this.getPhotosubjects().length()>0) {
            String[] photosubjectkeys = this.getPhotosubjects().split(",");
            subjectpks = new Tree7subjectPK[photosubjectkeys.length];
            for(int i=0; i<photosubjectkeys.length; i++) {
                subjectpks[i] = Tree7subjectPK.getKey(photosubjectkeys[i]);
            }
        }
        return subjectpks;
    }

    public void setSubjects(ISubject[] subjects) {
        this.subjects = new ArrayList();
        StringBuffer photosubjectsbuffer = new StringBuffer("");
        for(int i=0; i<subjects.length; i++) {
            this.subjects.add(subjects[i]);
            photosubjectsbuffer.append(subjects[i].getPrimaryKey().getKeystring()).append(",");
        }
        String photosubjects = "";
        if(photosubjectsbuffer.length()>0) photosubjects = photosubjectsbuffer.substring(0, photosubjectsbuffer.length()-1);
        this.setPhotosubjects(photosubjects);
    }

    public void setSubjects(ArrayList subjects) {
        this.subjects = subjects;
        StringBuffer photosubjectsbuffer = new StringBuffer("");
        for(int i=0; i<subjects.size(); i++) {
            photosubjectsbuffer.append(((ITree7subject)subjects.get(i)).getPrimaryKey().getKeystring()).append(",");
        }
        String photosubjects = "";
        if(photosubjectsbuffer.length()>0) photosubjects = photosubjectsbuffer.substring(0, photosubjectsbuffer.length()-1);
        this.setPhotosubjects(photosubjects);
    }

    public ArrayList getSubjects() {
        if(this.subjects==null) {
            return new ArrayList();
        } else {
            return this.subjects;
        }
    }

    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
