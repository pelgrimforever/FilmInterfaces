/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IFilmsubjectsPK extends EntityPK, Serializable {

    public ISubjectPK getSubjectPK();
    public void setSubjectPK(ISubjectPK subjectPK);

    public IFilmPK getFilmPK();
    public void setFilmPK(IFilmPK filmPK);

    public java.lang.String getFilm();

    public void setFilm(java.lang.String film);

    public java.lang.String getCat1();

    public void setCat1(java.lang.String cat1);

    public java.lang.String getCat2();

    public void setCat2(java.lang.String cat2);

    public int getSubject();

    public void setSubject(int subject);


    public boolean equals(IFilmsubjectsPK filmsubjectsPK2);

}
