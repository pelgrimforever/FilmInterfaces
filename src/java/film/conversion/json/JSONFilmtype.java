package film.conversion.json;

import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import film.entity.pk.FilmtypePK;
import film.interfaces.entity.pk.IFilmtypePK;
import film.interfaces.logicentity.IFilmtype;
import film.logicentity.Filmtype;
import film.searchentity.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Franky Laseure
 */
public class JSONFilmtype {
    
    public static JSONArray toJSONArray(ArrayList filmtypes) {
        JSONArray jsonfilmtypes = new JSONArray();
        Iterator filmtypesI = filmtypes.iterator();
        while(filmtypesI.hasNext()) {
            jsonfilmtypes.add(toJSON((Filmtype)filmtypesI.next()));
        }
        return jsonfilmtypes;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IFilmtypePK filmtypePK) {
        JSONObject json = null;
        if(filmtypePK!=null) {
            json = new JSONObject();
            json.put("type", filmtypePK.getType());
        }
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(IFilmtype filmtype) {
        JSONObject json = new JSONObject();
        json.put("PK", toJSON(filmtype.getPrimaryKey()));
        json.put("description", filmtype.getDescription());
//Custom code, do not change this line
//Custom code, do not change this line
        return json;
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static JSONObject toJSON(Filmtypesearch filmtypesearch) {
        JSONObject json = new JSONObject();
        if(filmtypesearch.used()) {
            byte andoroperator = filmtypesearch.getAndoroperator();
            int maxresults = filmtypesearch.getMaxresults();
            boolean docount = filmtypesearch.getDocount();
            Iterator<EntityPKInterface> primarykeysI = filmtypesearch.getPrimarykeys().iterator();
            Iterator<IFieldsearcher> fieldsearchersI = filmtypesearch.getFieldsearchers().iterator();
            EntityPKInterface primarykey;
            IFieldsearcher fieldsearcher;
            
            json.put("andor", andoroperator);
            json.put("maxresults", maxresults);
            json.put("docount", docount);
            JSONArray pks = new JSONArray();
            int i = 0;
            while(primarykeysI.hasNext()) {
                primarykey = primarykeysI.next();
                pks.add(primarykey.getKeystring());
            }
            json.put("primarykeys", pks);
            JSONObject fss = new JSONObject();
            while(fieldsearchersI.hasNext()) {
                fieldsearcher = fieldsearchersI.next();
                if(fieldsearcher.used()) {
                    fss.put(fieldsearcher.getShortFieldname(), JSONConversion.toJSON(fieldsearcher));
                }
            }
            json.put("fields", fss);
            JSONObject kss = new JSONObject();
            json.put("keysearch", kss);
        }
        return json;
    }

    /**
     * 
     * @param json: JSONObject with the Filmsearch parameters
     * @return 
     */
    public static Filmtypesearch toFilmtypesearch(JSONObject json) {
        Filmtypesearch filmtypesearch = new Filmtypesearch();
        filmtypesearch.setANDORoperator(JSONConversion.getbyte(json, "andor"));
        filmtypesearch.setMaxresults(JSONConversion.getint(json, "maxresults"));
        filmtypesearch.setDocount(JSONConversion.getboolean(json, "docount"));
        JSONArray pks = (JSONArray)json.get("primarykeys");
        for(int i=0; i<pks.size(); i++) {
            filmtypesearch.addPrimarykey(FilmtypePK.getKey((String)pks.get(i)));
        }
        JSONObject fss = (JSONObject)json.get("fields");
        JSONObject field;
        field = (JSONObject)fss.get("type");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            filmtypesearch.type(valuearray, compareoperator, andor);
        }
        field = (JSONObject)fss.get("description");
        if(field!=null) {
            String[] valuearray = JSONConversion.getStringvalues(field);
            byte compareoperator = JSONConversion.getbyte(field, "compareoperator");
            byte andor = JSONConversion.getbyte(field, "andor");
            filmtypesearch.description(valuearray, compareoperator, andor);
        }
        JSONObject kss = (JSONObject)json.get("keysearch");
        JSONArray keysearch;
        return filmtypesearch;
    }
    
    public static FilmtypePK toFilmtypePK(JSONObject json) {
        FilmtypePK filmtypePK = null;
        if(json!=null) {
            filmtypePK = new FilmtypePK(JSONConversion.getString(json, "type"));
        }
        return filmtypePK;
    }

    public static Filmtype toFilmtype(JSONObject json) {
        Filmtype filmtype = new Filmtype(toFilmtypePK((JSONObject)json.get("PK")));
        updateFilmtype(filmtype, json);
        return filmtype;
    }

    public static void updateFilmtype(IFilmtype filmtype, JSONObject json) {
        filmtype.setDescription(JSONConversion.getString(json, "description"));
    }

    public static Filmtype initFilmtype(JSONObject json) {
        Filmtype filmtype = new Filmtype(toFilmtypePK((JSONObject)json.get("PK")));
        filmtype.initDescription(JSONConversion.getString(json, "description"));
        return filmtype;
    }
}
