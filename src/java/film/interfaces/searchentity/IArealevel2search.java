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

public interface IArealevel2search extends Tablesearcher {

    public void addPrimarykey(IArealevel2PK arealevel2PK);

	public void al2code(String[] values);
	
	public void al2code(String[] values, byte compare, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void location(String[] values);
	
	public void location(String[] values, byte compare, byte andor);
	
	public void bounds(String[] values);
	
	public void bounds(String[] values, byte compare, byte andor);
	
	public void viewport(String[] values);
	
	public void viewport(String[] values, byte compare, byte andor);
	
	public void approximate(Boolean value);
	
	public void arealevel1(IArealevel1search arealevel1search);
	
    public void arealevel3(IArealevel3search arealevel3search);
    
}
