/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package film.logic;

import film.interfaces.logicentity.ISecurityprofile;
import film.logicentity.Securityprofile;
import java.io.Serializable;
import java.util.ArrayList;
import sitesecurity.interfaces.logicentity.ISitegroup;

/**
 *
 * @author pelgrim
 */
public class Userprofile implements Serializable {

        public final static String ADMIN = "admin";
        public final static String EDITOR = "editor";
        public final static String PRIVATEUSER = "privateuser";

        private ArrayList<ISitegroup> sitegroups;
        private ArrayList<ISecurityprofile> profiles;

        //profiles
        private boolean admin = false;
        private boolean editor = false;
        private boolean privateuser = false;

        //access flags
        private boolean privateaccess = false;

        public Userprofile(ArrayList<ISitegroup> sitegroups, ArrayList<ISecurityprofile> profiles) {
            this.sitegroups = sitegroups;
            this.profiles = profiles;
            Initialize();
        }

        private void Initialize() {
            ISecurityprofile profile;
            for(int i=0; i<profiles.size(); i++) {
                profile = profiles.get(i);
                privateaccess = privateaccess || profile.getPrivateaccess();
                if(profile.getPrimaryKey().getUserprofile().equals(ADMIN)) admin = true;
                if(profile.getPrimaryKey().getUserprofile().equals(EDITOR)) editor = true;
                if(profile.getPrimaryKey().getUserprofile().equals(PRIVATEUSER)) privateuser = true;
            }
        }

        public boolean privateaccess() {
            return privateaccess;
        }

        public boolean isAdmin() {
            return admin;
        }
        public boolean isEditor() {
            return editor;
        }
        public boolean isPrivateuser() {
            return privateuser;
        }

}
