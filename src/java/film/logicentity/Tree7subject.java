/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class Tree7subject extends film.entity.eTree7subject implements ITree7subject {

//Custom code, do not change this line
    private ArrayList parents;
//Custom code, do not change this line

    public Tree7subject() {
    }
    
    public Tree7subject(long subjectid) {
        super(subjectid);
    }

    public Tree7subject(Tree7subjectPK tree7subjectPK) {
        super(tree7subjectPK);
    }

//Custom code, do not change this line
    @Override
    public void setSubject(String subject) {
        if(subject==null)
            super.setSubject(subject);
        else
            super.setSubject(subject.toLowerCase());
    }
    
    @Override
    public void setTree7id(java.lang.String tree7id) {
        super.setTree7id(tree7id);
        if(tree7id==null)
            super.setTreestep(0);
        else
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
