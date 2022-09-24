/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ISubjectPK extends EntityPK, Serializable {

    public ISubjectcatPK getSubjectcatcat1PK();
    public void setSubjectcatcat1PK(ISubjectcatPK subjectcatPK);

    public ISubjectcatPK getSubjectcatcat2PK();
    public void setSubjectcatcat2PK(ISubjectcatPK subjectcatPK);

    public java.lang.String getCat1();

    public void setCat1(java.lang.String cat1);

    public java.lang.String getCat2();

    public void setCat2(java.lang.String cat2);

    public int getId();

    public void setId(int id);


    public boolean equals(ISubjectPK subjectPK2);

}
