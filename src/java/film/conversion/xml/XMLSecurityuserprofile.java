package film.conversion.xml;

import XML.XMLElement;
import java.io.IOException;
import object.Objectoperation;
import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import film.entity.pk.SecurityuserprofilePK;
import film.interfaces.entity.pk.ISecurityuserprofilePK;
import film.logicentity.Securityuserprofile;
import film.searchentity.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Iterator;
import org.jdom2.Element;

/**
 *
 * @author Franky Laseure
 */
public class XMLSecurityuserprofile {
    
    /**
     * 
     * @return all keys and fields as XML
     */
    public static void addXML(Element PK, ISecurityuserprofilePK securityuserprofilePK) {
        PK.addContent(XMLElement.newContent("siteusername", securityuserprofilePK.getSiteusername()));
        PK.addContent(XMLElement.newContent("userprofile", securityuserprofilePK.getUserprofile()));
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static void addXML(Element SecurityuserprofileXML, Securityuserprofile securityuserprofile) {
        Element PK = XMLElement.newContent("PK", "");
        addXML(PK, securityuserprofile.getPrimaryKey());
        SecurityuserprofileXML.addContent(PK);
    }
}

