/*
 * Tree7subject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
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

//Custom code, do not change this line
    private ArrayList parents;
//Custom code, do not change this line

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
