/**
 * 					STRINGFLOW SDK LICENSE
 * 					http://stringflow.com/sdk-license
 *
 * 	This is an agreement between You ("You") and ALTERBASICS Technologies Pvt
 * 	Ltd., located at A1 306, Regency Orion, Baner,Pune, Maharashtra - 411045,
 * 	India, ("ALTERBASICS") regarding Your use of the Stringflow SDK and any
 * 	associated documentation or other materials made available by ALTERBASICS
 * 	(collectively the "SDK"). This agreement applies to any updates or
 * 	supplements for the SDK, unless other terms accompany those items. If so,
 * 	those other terms apply.
 *
 * 	By installing, accessing or otherwise using the SDK, You accept the terms
 * 	of this agreement. If You do not agree to the terms of this agreement, do
 * 	not install, access or use the SDK.
 *
 * 	If You comply with this agreement, You have the rights below.
 *
 * 	1. Use of the SDK.
 * 	   Subject to Your compliance with this agreement, Stringflow hereby
 * 	   authorizes You to use the SDK solely for the purpose of creating mobile
 * 	   applications designed to operate with the Services (referred to as
 * 	   "Authorized Applications"). You may not rent, lease or lend any of Your
 * 	   rights in the SDK or access to the Services. You may make a reasonable
 * 	   number of copies of the SDK for the purposes set forth herein, provided
 * 	   that You reproduce only complete copies, including without limitation
 * 	   all "read me" files, copyright notices, and other legal notices and
 * 	   terms that ALTERBASICS has included in the SDK.
 *
 * 	2. Scope of the License.
 * 	   The SDK is licensed, not sold. This agreement only gives You some rights
 * 	   to use the SDK. ALTERBASICS specifically does not grant any express or
 * 	   implied rights under its patents with respect to your Authorized
 * 	   Applications. In doing so, You must comply with any technical
 * 	   limitations in the SDK that only allow You to use it in certain ways.
 * 	   You may not:
 * 	    (a) reverse engineer, decompile, distribute or disassemble the SDK,
 * 	    	except and only to the extent that applicable law expressly
 * 	    	permits; or
 * 		(b) make more copies of the SDK than specified in this agreement,
 * 			except and only to the extent applicable law expressly permits; or
 * 		(c) publish the SDK for others to copy; or
 * 		(d) rent, lease or lend the SDK.
 *
 * 	3. Use of the Service.
 * 	   Your use of the Services, and the use of the Services by anyone hosting
 * 	   or using your Authorized Application, is governed by the then-current
 * 	   Terms of Services which can be found at: https://stringflow.com/terms
 *
 * 	4. EXPORT RESTRICTIONS.
 * 		THE SDK IS SUBJECT TO UNITED STATES EXPORT LAWS AND REGULATIONS. YOU
 * 		MUST COMPLY WITH ALL DOMESTIC AND INTERNATIONAL EXPORT LAWS AND
 * 		REGULATIONS THAT APPLY TO THE SDK.
 *
 * 	5. Feedback.
 * 	   By submitting feedback to ALTERBASICS, either via email at
 * 	   support@stringflow.com or by any other means: You automatically grant
 * 	   to ALTERBASICS a perpetual, irrevocable, transferable, royalty-free
 * 	   license to use Your feedback for any and all purposes without any
 * 	   compensation to You.
 *
 * 	6. Termination.
 * 	   ALTERBASICS reserves the right to discontinue offering the SDK or
 * 	   Services or to modify the SDK or Services at any time in its sole
 * 	   discretion. This Section and Sections 3, 4, 5, 8, 9, 10, 11, and 12 will
 * 	   survive termination of this agreement or any discontinuation of the
 * 	   offering of the SDK or Services along with any other provisions that
 * 	   would reasonably be deemed to survive such events.
 *
 * 	7. Reservation of Rights.
 * 	   You are not authorized to alter, modify, copy, edit, format, create
 * 	   derivative works of or otherwise use any materials, content or
 * 	   technology provided under this agreement except as explicitly provided
 * 	   in this agreement or approved in advance in writing by ALTERBASICS.
 *
 * 	8. Modifications; Notices.
 * 	   If we change this contract, then we will give you notice before the
 * 	   change is in force. If you do not agree to these changes, then you must
 * 	   cancel and stop using the SDK and Services before the changes are in
 * 	   force. If you do not stop using the SDK or Services, then your use of
 * 	   the SDK or Services will continue under the changed contract.
 * 	   ALTERBASICS may give notices to You, at ALTERBASICS's option, by posting
 * 	   on any portion of ALTERBASICS.com or by electronic mail to any e-mail
 * 	   address provided by You to ALTERBASICS.
 *
 * 	9. Entire Agreement.
 * 	   This agreement, and any applicable TOS or contract for Services, are the
 * 	   entire agreement with respect to the SDK or Services.
 *
 * 	10. APPLICABLE LAW AND VENUE.
 * 	    Maharashtra state law governs the interpretation of this agreement and
 * 	    applies to claims for breach of it, regardless of conflict of laws
 * 	    principles.  The laws of the state where You live govern all other
 * 	    claims, including claims under state consumer protection laws, unfair
 * 	    competition laws, and in tort.
 * 	    You agree that any action brought under this agreement will be subject
 * 	    to exclusive jurisdiction and venue in the state and federal courts
 * 	    located in Pune (Maharashtra) India.
 *
 * 	11. Disclaimer of Warranty.
 * 		The SDK is licensed "as-is." You bear the risk of using it. ALTERBASICS
 * 		gives no express or implied warranties, guarantees or conditions. You
 * 		may have additional consumer rights under Your local laws which this
 * 		agreement cannot change. To the extent permitted under Your local laws,
 * 		ALTERBASICS excludes the implied warranties of merchantability, fitness
 * 		for a particular purpose and non-infringement. ALTERBASICS does not
 * 		represent or warrant that the SDK or the Services will always be
 * 		available, uninterrupted, secure, or error free.
 *
 * 	12. LIMITATION ON AND EXCLUSION OF REMEDIES AND DAMAGES.
 * 		You can recover from ALTERBASICS and its suppliers only direct damages
 * 		up to U.S. $5.00. You cannot recover any other damages, including
 * 		consequential, lost profits, special, indirect or incidental damages.
 * 		This limitation applies to:
 *
 * 		(a) anything related to the SDK, services, or content (including code)
 * 			on third party Internet sites, or third party programs; and
 * 		(b) claims for breach of contract, breach of warranty, guarantee or
 * 			condition, strict liability, negligence, or other tort to the
 * 			extent permitted by applicable law.
 *
 */
package abs.ixi.client.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility to read configuration files (must be key/value pair based
 * configuration files).
 */
public class ConfigLoader {
	private static Set<String> mandatoryClientConfigKeys;
	private static Set<String> mandatoryConnectionConfigKeys;

	static {
		mandatoryClientConfigKeys = new HashSet<>();
		mandatoryConnectionConfigKeys = new HashSet<>();

		// Mandatory client configs
		mandatoryClientConfigKeys.add("ixi.client.username");
		mandatoryClientConfigKeys.add("ixi.client.password");
		mandatoryClientConfigKeys.add("ixi.sdk.mode");
		mandatoryClientConfigKeys.add("ixi.client.domain.name");

		// Mandatory connection configs
		mandatoryConnectionConfigKeys.add("ixi.client.server.ip");
		mandatoryConnectionConfigKeys.add("ixi.client.server.port");
	}

	private static final Logger LOGGER = Logger.getLogger(ConfigLoader.class.getName());

	/**
	 * Reads configuration file specified and loads key/value pairs found into
	 * {@link Properties} objects. The file specified must be in classpath.
	 * 
	 * @param file configuration file to be read
	 * @return instance of {@link Properties} object
	 * @throws IOException if any IO error occurs during file read
	 */
	public static Properties loadConfig(String file) throws Exception {
		Properties props = new Properties();

		try (InputStream is = ConfigLoader.class.getClassLoader().getResourceAsStream(file)) {

			if (is == null) {
				LOGGER.log(Level.SEVERE, "File {0} not found", file);
				throw new Exception("Unable to load file");

			} else {
				props.load(is);

				// if (!(isMandatoryClientConfigLoaded(props) ||
				// isMandatoryConnectionConfigLoaded(props))) {
				// LOGGER.log(Level.SEVERE, "Mandatory configs are not present
				// in config file");
				// LOGGER.log(Level.SEVERE, "Mandatory client configs are: "+
				// getAllManadatoryClientConfigs());
				// LOGGER.log(Level.SEVERE, "Mandatory connection configs are:
				// "+ getAllManadatoryConnectionConfigs());
				// throw new Exception("Mandatory configs are not present in
				// config file");
				// }
			}

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Failed to load file {0} due to {1}", new Object[] { file, e });
			throw e;
		}

		return props;
	}

	/**
	 * Reads configuration file specified and loads key/value pairs found into
	 * {@link Properties} objects.
	 * 
	 * @param file configuration file to be read
	 * @return instance of {@link Properties} object
	 * @throws IOException if any IO error occurs during file read
	 */
	public static Properties loadConfig(File file) throws Exception {
		Properties props = new Properties();

		try (InputStream is = new FileInputStream(file)) {
			props.load(is);
			// if (!(isMandatoryClientConfigLoaded(props) ||
			// isMandatoryConnectionConfigLoaded(props))) {
			// LOGGER.log(Level.SEVERE, "Mandatory configs not present in config
			// file");
			// LOGGER.log(Level.SEVERE, "Mandatory client configs are: "+
			// getAllManadatoryClientConfigs());
			// LOGGER.log(Level.SEVERE, "Mandatory connection configs are: "+
			// getAllManadatoryConnectionConfigs());
			// throw new Exception("Mandatory configs not present in config
			// file");
			// }
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Failed to load file {0} due to {1}", new Object[] { file, e });
			throw e;
		}

		return props;
	}

	/**
	 * Reads configuration file specified and loads key/value pairs found into
	 * {@link Properties} objects. The file specified must be in classpath.
	 * 
	 * @param file configuration file to be read
	 * @param props instance of {@link Properties} object which will hold
	 *            properties
	 * @return instance of {@link Properties} object
	 * @throws IOException if any IO error occurs during file read
	 */
	public static Properties loadConfig(String file, Properties props) throws Exception {
		try (InputStream is = ConfigLoader.class.getClassLoader().getResourceAsStream(file)) {

			if (is == null) {
				LOGGER.log(Level.SEVERE, "File {0} not found", file);
				throw new Exception("Unable to load file");

			} else {
				props.load(is);
				// if (!(isMandatoryClientConfigLoaded(props) ||
				// isMandatoryConnectionConfigLoaded(props))) {
				// LOGGER.log(Level.SEVERE, "Mandatory configs not present in
				// config file");
				// LOGGER.log(Level.SEVERE, "Mandatory client configs are: "+
				// getAllManadatoryClientConfigs());
				// LOGGER.log(Level.SEVERE, "Mandatory connection configs are:
				// "+ getAllManadatoryConnectionConfigs());
				// throw new Exception("Mandatory configs not present in config
				// file");
				// }
			}

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Failed to load file {0}", file);
			throw e;
		}

		return props;
	}

	/**
	 * Reads configuration file specified and loads key/value pairs found into
	 * {@link Properties} objects.
	 * 
	 * @param file configuration file to be read
	 * @param props instance of {@link Properties} object which will hold
	 *            properties
	 * @return instance of {@link Properties} object
	 * @throws IOException if any IO error occurs during file read
	 */
	public static Properties loadConfig(File file, Properties props) throws Exception {
		try (InputStream is = new FileInputStream(file)) {
			props.load(is);

			// if (!(isMandatoryClientConfigLoaded(props) ||
			// isMandatoryConnectionConfigLoaded(props))) {
			// LOGGER.log(Level.SEVERE, "Mandatory configs not present in config
			// file");
			// LOGGER.log(Level.SEVERE, "Mandatory client configs are: "+
			// getAllManadatoryClientConfigs());
			// LOGGER.log(Level.SEVERE, "Mandatory connection configs are: "+
			// getAllManadatoryConnectionConfigs());
			// throw new Exception("Mandatory configs not present in config
			// file");
			// }
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Failed to load file {0}", file.getName());
			throw e;
		}

		return props;
	}

	/**
	 * Verifies whether mandatory client configs has been loaded
	 * 
	 * @param props
	 * @return boolean
	 */
	// private static boolean isMandatoryClientConfigLoaded(Properties props) {
	// boolean result = false;
	// for (String key : mandatoryClientConfigKeys) {
	// if (!props.contains(key)) {
	// result = false;
	// break;
	// }
	// }
	// return result;
	// }

	/**
	 * Verifies whether mandatory connection configs has been loaded
	 * 
	 * @param props
	 * @return boolean
	 */

	// private static boolean isMandatoryConnectionConfigLoaded(Properties
	// props) {
	// boolean result = true;
	// for (String key : mandatoryConnectionConfigKeys) {
	// if (!props.contains(key)) {
	// result = false;
	// break;
	// }
	// }
	// return result;
	// }
	//
	// private static String getAllManadatoryClientConfigs() {
	// StringBuilder configs = new StringBuilder();
	// for (String config : mandatoryClientConfigKeys) {
	// configs.append(config);
	// configs.append(" ");
	// }
	// return configs.toString();
	// }
	//
	// private static String getAllManadatoryConnectionConfigs() {
	// StringBuilder configs = new StringBuilder();
	// for (String config : mandatoryConnectionConfigKeys) {
	// configs.append(config);
	// configs.append(" ");
	// }
	// return configs.toString();
	// }

}