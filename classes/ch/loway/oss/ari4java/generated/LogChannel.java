package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Feb 04 15:23:09 CET 2017
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface LogChannel {

// String getChannel
/**********************************************************
 * The log channel path
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getChannel();



// String getType
/**********************************************************
 * Types of logs for the log channel
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getType();



// void setChannel String
/**********************************************************
 * The log channel path
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setChannel(String val );



// void setConfiguration String
/**********************************************************
 * The various log levels
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setConfiguration(String val );



// void setType String
/**********************************************************
 * Types of logs for the log channel
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setType(String val );



// String getStatus
/**********************************************************
 * Whether or not a log type is enabled
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getStatus();



// String getConfiguration
/**********************************************************
 * The various log levels
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getConfiguration();



// void setStatus String
/**********************************************************
 * Whether or not a log type is enabled
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setStatus(String val );


}
;
