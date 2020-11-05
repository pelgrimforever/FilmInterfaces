package film.conversion.xml;

import XML.XMLElement;
import java.io.IOException;
import object.Objectoperation;
import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import film.entity.pk.SecurityprofilePK;
import film.interfaces.entity.pk.ISecurityprofilePK;
import film.logicentity.Securityprofile;
import film.searchentity.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Iterator;
import org.jdom2.Element;

/**
 *
 * @author Franky Laseure
 */
public class XMLSecurityprofile {
    
    /**
     * 
     * @return all keys and fields as XML
     */
    public static void addXML(Element PK, ISecurityprofilePK securityprofilePK) {
        PK.addContent(XMLElement.newContent("userprofile", securityprofilePK.getUserprofile()));
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static void addXML(Element SecurityprofileXML, Securityprofile securityprofile) {
        Element PK = XMLElement.newContent("PK", "");
        addXML(PK, securityprofile.getPrimaryKey());
        SecurityprofileXML.addContent(PK);
        SecurityprofileXML.addContent(XMLElement.newContent("privateaccess", securityprofile.getPrivateaccess()));
    }
}
