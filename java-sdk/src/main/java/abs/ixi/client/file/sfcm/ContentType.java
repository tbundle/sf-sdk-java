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
package abs.ixi.client.file.sfcm;

import static java.util.Objects.requireNonNull;

import abs.ixi.client.io.multipart.MimeType;
import abs.ixi.client.util.StringUtils;

/**
 * Typically a MIME multipart has a <i>Content-Type</i> header attached to it
 * indicating the content type which applications use to process the content for
 * user.
 * <p>
 * There is ever growing list of mime types and Stringflow SDK can transport any
 * content type on the wire as it does not process the content as such (core sdk
 * only transports it). However content type identification is vital for
 * applications to process the files (multipart) correctly. {@code ContentType}
 * captures the attributes to represent a valid {@link MimeType}. Additionally
 * it offers convinience methods for application around {@code ContentType}
 * handling.
 * </p>
 * <p>
 * {@code ContentType} should not be confused with {@link MimeType}.
 * {@link MimeType} is an enumeration for commonely used mime types allowing
 * users to avoid processing mime type strings. {@code MimeType} does not
 * represent the list of supported mimes in sdk; on the other hand,
 * {@code ContentType} is a generic way of handling <i>"Content-Type"</i>
 * mime-header values.
 * </p>
 * 
 * @author Yogi
 *
 */
public class ContentType {
	private static final String SLASH = "/";

	private String type;
	private String subtype;

	/**
	 * Public constructor to instantiate {@code ContentType} from a mimeType;
	 * for example "image/jpeg" will result in a {@code ContentType} instance
	 * with type "image" and subtype "jpeg". If there is only one string is
	 * specified the type will be initialized with that value and subtype will
	 * be null.
	 * 
	 * @param mimeType string
	 * @throws IllegalArgumentException if the mimeType String is not a valid
	 *             mimetype string. The validation of mimeType is done only in
	 *             terms its construction; for example mimeType argument can not
	 *             have more than two slash (/) characters in it.
	 */
	public ContentType(String mimeType) {
		requireNonNull(mimeType, "mimeType can not be null");

		String[] arr = mimeType.split(SLASH);

		if (arr.length == 1) {
			this.type = arr[0];
		} else if (arr.length == 2) {
			this.type = arr[0];
			this.subtype = arr[1];
		} else {
			throw new IllegalArgumentException(mimeType + " is not a valid mimeType");
		}
	}

	/**
	 * Public constructor to instantiate {@code ContentType} from a mimeType;
	 * Mime Type has two parts: (1) type and (2) subtype. Although both type and
	 * subtypes are required to represent a valid MIME type; the constructor
	 * enforces only "type" as required argument. If subtype is not given, it be
	 * initialized with null.
	 * 
	 * @param type string
	 * @param subtype string
	 * @throws NullPointerException if the type value is Null
	 */
	public ContentType(String type, String subtype) {
		this.type = requireNonNull(type, "type can not be null");
		this.subtype = subtype;
	}

	/**
	 * @return mime type string for example "application/json"
	 */
	public String getMimeType() {
		return this.type + "/" + this.subtype;
	}

	/**
	 * @return true if this {@link ContentType} is an Audio otherwise false
	 */
	public boolean isAudio() {
		return StringUtils.safeEquals(type, "audio", false);
	}

	/**
	 * @return true if this {@link ContentType} is an Video otherwise false
	 */
	public boolean isVideo() {
		return StringUtils.safeEquals(type, "video", false);
	}

	public boolean isImange() {
		return StringUtils.safeEquals(type, "image", false);
	}

}
