package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/** =====================================================
 * Effective user/group id
 * 
 * Defined in file :asterisk.json
 * ====================================================== */
public class SetId_impl_ari_0_0_1 implements SetId, java.io.Serializable {
  /**  Effective group id.  */
  private String group;
 public String getGroup() {
   return group;
 }

 public void setGroup(String val ) {
   group = val;
 }

  /**  Effective user id.  */
  private String user;
 public String getUser() {
   return user;
 }

 public void setUser(String val ) {
   user = val;
 }

}
