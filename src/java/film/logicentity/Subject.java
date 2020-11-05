/*
 * Subject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import film.entity.pk.*;
import film.interfaces.entity.pk.ISubjectPK;
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
 * Entity class Subject
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Subject extends film.entity.eSubject implements ISubject {

    public static final String SQLSelect = "select subject.* from subject";
    public static final String SQLWheresubjectcatCat1 = "cat1 = :subjectcat.cat:";
    public static final String SQLWheretree7subject = "tree7subjectid = :tree7subject.subjectid:";
    public static final String SQLWheresubjectcatCat2 = "cat2 = :subjectcat.cat:";

//Custom code, do not change this line
        public static final String OrderBy = " order by subject";
	public static final String SQLWherecat1cat2 = "cat1 = :cat1: and cat2 = :cat2:";
	public static final String SQLSelect4cat1cat2 = "select * from subject where " + SQLWherecat1cat2 + OrderBy;
	public static final String SQLWherephoto = "photosubjects.film = :photo.film: and photosubjects.id = :photo.id:";
	public static final String SQLWherefilm = "filmsubjects.film = :film.id:";
	public static final String SQLSelect4photo = "select subject.* from subject "
                + "inner join photosubjects on subject.cat1 = photosubjects.cat1 and subject.cat2 = photosubjects.cat2 "
                + "and subject.id = photosubjects.subject "
                + " where " + SQLWherephoto + OrderBy;
	public static final String SQLSelect4film = "select subject.* from subject "
                + "inner join filmsubjects on subject.cat1 = filmsubjects.cat1 and subject.cat2 = filmsubjects.cat2 "
                + "and subject.id = filmsubjects.subject "
                + " where " + SQLWherefilm + OrderBy;
        public static final String getMaxsubjectid = "select * from subject where id = (select max(id) from subject)";
//Custom code, do not change this line

    public static final String SQLSelect4subjectcatCat1 = "select * from subject where " + SQLWheresubjectcatCat1 + OrderBy;
    public static final String SQLDelete4subjectcatCat1 = "delete from subject where " + SQLWheresubjectcatCat1 + OrderBy;
    public static final String SQLSelect4tree7subject = "select * from subject where " + SQLWheretree7subject + OrderBy;
    public static final String SQLDelete4tree7subject = "delete from subject where " + SQLWheretree7subject + OrderBy;
    public static final String SQLSelect4subjectcatCat2 = "select * from subject where " + SQLWheresubjectcatCat2 + OrderBy;
    public static final String SQLDelete4subjectcatCat2 = "delete from subject where " + SQLWheresubjectcatCat2 + OrderBy;

    /**
     * Constructor
     * Creates an empty Subject entity
     */
    public Subject() {
    }
    
    /**
     * Constructor
     * build an empty Subject entity with initialized field values
     */
    public Subject(java.lang.String cat1, java.lang.String cat2, int id) {
        super(cat1, cat2, id);
    }

    /**
     * Constructor
     * build an empty Subject entity with initialized Primarykey parameter
     * @param subjectPK: Subject Primarykey
     */
    public Subject(SubjectPK subjectPK) {
        super(subjectPK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return this.subjectPK.getCat1() + " " + this.subjectPK.getCat2() + " " + this.getSubject();
    }
//Custom code, do not change this line
}
