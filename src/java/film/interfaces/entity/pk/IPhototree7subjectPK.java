/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IPhototree7subjectPK extends EntityPK, Serializable {

    public ITree7subjectPK getTree7subjectPK();
    public void setTree7subjectPK(ITree7subjectPK tree7subjectPK);

    public IPhotoPK getPhotoPK();
    public void setPhotoPK(IPhotoPK photoPK);

    public java.lang.String getFilm();

    public void setFilm(java.lang.String film);

    public int getId();

    public void setId(int id);

    public long getSubjectid();

    public void setSubjectid(long subjectid);


    public boolean equals(IPhototree7subjectPK phototree7subjectPK2);

}
