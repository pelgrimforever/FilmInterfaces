/*
 * Tree7subject.java
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
import film.interfaces.entity.pk.ITree7subjectPK;
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
 * Entity class Tree7subject
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Tree7subject extends film.entity.eTree7subject implements ITree7subject {

    public static final String SQLSelect = "select tree7subject.* from tree7subject";
    public static final String SQLWheretree7subjectParentsubjectid = "parentsubjectid = :tree7subject.subjectid:";

//Custom code, do not change this line
    public static final String OrderBy = " order by tree7id";

    public static final String SQLWheretree7subject_step1 = "parentsubjectid = subjectid";
    public static final String SQLSelect4tree7subject_step1 = "select * from tree7subject where " + SQLWheretree7subject_step1 + OrderBy;

    public static final String SQLWhere4parent = "parentsubjectid = :tree7subject.subjectid: and parentsubjectid <> subjectid";
    public static final String SQLSelect4parent = "select * from tree7subject where " + SQLWhere4parent + OrderBy;

    public static final String SQLWherechildren4tree7id = " tree7id like :liketree7id: and tree7id <> :tree7id:";
    public static final String SQLSelectchildren4tree7id = "select * from tree7subject where " + SQLWherechildren4tree7id + OrderBy;

    public static final String SQLSelectMostused = "select tree7subject.tree7id, tree7subject.subjectid, tree7subject.subject, tree7subject.treestep, tree7subject.parentsubjectid, count(phototree7subject.*) as usedcount from tree7subject "
            + "inner join phototree7subject on tree7subject.subjectid = phototree7subject.subjectid "
            + "group by tree7subject.tree7id, tree7subject.subjectid, tree7subject.subject, tree7subject.treestep, tree7subject.parentsubjectid "
            + "order by usedcount desc "
            + "limit 20";

    private ArrayList parents;
//Custom code, do not change this line

    public static final String SQLSelect4tree7subjectParentsubjectid = "select * from tree7subject where " + SQLWheretree7subjectParentsubjectid + OrderBy;
    public static final String SQLDelete4tree7subjectParentsubjectid = "delete from tree7subject where " + SQLWheretree7subjectParentsubjectid + OrderBy;

    /**
     * Constructor
     * Creates an empty Tree7subject entity
     */
    public Tree7subject() {
    }
    
    /**
     * Constructor
     * build an empty Tree7subject entity with initialized field values
     */
    public Tree7subject(long subjectid) {
        super(subjectid);
    }

    /**
     * Constructor
     * build an empty Tree7subject entity with initialized Primarykey parameter
     * @param tree7subjectPK: Tree7subject Primarykey
     */
    public Tree7subject(Tree7subjectPK tree7subjectPK) {
        super(tree7subjectPK);
    }

//Custom code, do not change this line
    @Override
    public void setSubject(String subject) {
        super.setSubject(subject.toLowerCase());
    }
    
    @Override
    public void setTree7id(java.lang.String tree7id) {
        super.setTree7id(tree7id);
        super.setTreestep(tree7id.length());
    }

    public void setParents(ArrayList parents) {
        this.parents = parents;
    }

    public ArrayList getParents() {
        return parents;
    }

    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
