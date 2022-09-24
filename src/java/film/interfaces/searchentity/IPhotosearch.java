/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

public interface IPhotosearch extends Tablesearcher {

    public void addPrimarykey(IPhotoPK photoPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void format(String[] values);
	
	public void format(String[] values, byte compare, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void photodate(Date[] values, byte[] operators);
	
	public void photodate(Date[] values, byte[] operators, byte andor);
	
	public void phototime(Time[] values, byte[] operators);
	
	public void phototime(Time[] values, byte[] operators, byte andor);
	
	public void publicf_(Boolean value);
	
	public void composition(Boolean value);
	
	public void rotation(Double[] values, byte[] operators);
	
	public void rotation(Double[] values, byte[] operators, byte andor);
	
	public void backup(Boolean value);
	
	public void imagebackup(Boolean value);
	
	public void location(String[] values);
	
	public void location(String[] values, byte compare, byte andor);
	
	public void exactlocation(Boolean value);
	
	public void locationradius(Double[] values, byte[] operators);
	
	public void locationradius(Double[] values, byte[] operators, byte andor);
	
	public void reversegeocode(String[] values);
	
	public void reversegeocode(String[] values, byte compare, byte andor);
	
	public void streetnumber(String[] values);
	
	public void streetnumber(String[] values, byte compare, byte andor);
	
	public void formattedaddress(String[] values);
	
	public void formattedaddress(String[] values, byte compare, byte andor);
	
	public void route(IRoutesearch routesearch);
	
	public void creator(ICreatorsearch creatorsearch);
	
	public void film(IFilmsearch filmsearch);
	
    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch);
    
    public void reltree7subject(ITree7subjectsearch tree7subjectsearch);
    
    public void art_photo(IArt_photosearch art_photosearch);
    
    public void photosubjects(IPhotosubjectssearch photosubjectssearch);
    
    public void relsubject(ISubjectsearch subjectsearch);
    
    public void phototags(IPhototagssearch phototagssearch);
    
}
