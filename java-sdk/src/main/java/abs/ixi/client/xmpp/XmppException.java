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
package abs.ixi.client.xmpp;

import java.util.HashMap;

/**
 * Represents XMPP protocol layer exception for client library.
 */
public class XmppException extends Exception {
	private static final long serialVersionUID = 1L;

	public static enum ErrorCondition {
		/**
		 * the sender has sent XML that is malformed or that cannot be processed
		 * (e.g., an IQ stanza that includes an unrecognized value of the 'type'
		 * attribute); the associated error type SHOULD be "modify".
		 */
		bad_request("bad-request", "modify", 400),
		/**
		 * access cannot be granted because an existing resource or session
		 * exists with the same name or address; the associated error type
		 * SHOULD be "cancel".
		 */
		conflict("conflict", "cancel", 409),
		/**
		 * the feature requested is not implemented by the recipient or server
		 * and therefore cannot be processed; the associated error type SHOULD
		 * be "cancel".
		 */
		feature_not_implemented("feature-not-implemented", "cancel", 501),
		/**
		 * the requesting entity does not possess the required permissions to
		 * perform the action; the associated error type SHOULD be "auth".
		 */
		forbidden("forbidden", "auth", 403),
		/**
		 * the recipient or server can no longer be contacted at this address
		 * (the error stanza MAY contain a new address in the XML character data
		 * of the <i>gone</i> element); the associated error type SHOULD be
		 * "modify".
		 */
		gone("gone", "modify", 302),
		/**
		 * the server could not process the stanza because of a misconfiguration
		 * or an otherwise-undefined internal server error; the associated error
		 * type SHOULD be "wait".
		 */
		internal_server_error("internal-server-error", "wait", 500),
		/**
		 * the addressed JID or item requested cannot be found; the associated
		 * error type SHOULD be "cancel".
		 */
		item_not_found("item-not-found", "cancel", 404),
		/**
		 * the sending entity has provided or communicated an XMPP address
		 * (e.g., a value of the 'to' attribute) or aspect thereof (e.g., a
		 * resource identifier) that does not adhere to the syntax defined in
		 * Addressing Scheme (Addressing Scheme); the associated error type
		 * SHOULD be "modify".
		 */
		jid_malformed("jid-malformed", "modify", 400),
		/**
		 * the recipient or server understands the request but is refusing to
		 * process it because it does not meet criteria defined by the recipient
		 * or server (e.g., a local policy regarding acceptable words in
		 * messages); the associated error type SHOULD be "modify".
		 */
		not_acceptable("not-acceptable", "modify", 406),
		/**
		 * the recipient or server does not allow any entity to perform the
		 * action; the associated error type SHOULD be "cancel".
		 */
		not_allowed("not-allowed", "cancel", 405),
		/**
		 * the sender must provide proper credentials before being allowed to
		 * perform the action, or has provided improper credentials; the
		 * associated error type SHOULD be "auth".
		 */
		not_authorized("not-authorized", "auth", 401),
		/**
		 * the requesting entity is not authorized to access the requested
		 * service because payment is required; the associated error type SHOULD
		 * be "auth".
		 */
		payment_required("payment-required", "auth", 402),
		/**
		 * the entity has violated some local service policy; the server MAY
		 * choose to specify the policy in the <i>text</i> element or an
		 * application-specific condition element.
		 */
		policy_violation("policy-violation", "cancel", 0),
		/**
		 * the intended recipient is temporarily unavailable; the associated
		 * error type SHOULD be "wait" (note: an application MUST NOT return
		 * this error if doing so would provide information about the intended
		 * recipient's network availability to an entity that is not authorized
		 * to know such information).
		 */
		recipient_unavailable("recipient-unavailable", "wait", 404),
		/**
		 * the recipient or server is redirecting requests for this information
		 * to another entity, usually temporarily (the error stanza SHOULD
		 * contain the alternate address, which MUST be a valid JID, in the XML
		 * character data of the <i>redirect</i> element); the associated error
		 * type SHOULD be "modify".
		 */
		redirect("redirect", "modify", 302),
		/**
		 * the requesting entity is not authorized to access the requested
		 * service because registration is required; the associated error type
		 * SHOULD be "auth".
		 */
		registration_required("registration-required", "auth", 407),
		/**
		 * a remote server or service specified as part or all of the JID of the
		 * intended recipient does not exist; the associated error type SHOULD
		 * be "cancel".
		 */
		remote_server_not_found("remote-server-not-found", "cancel", 404),
		/**
		 * a remote server or service specified as part or all of the JID of the
		 * intended recipient (or required to fulfill a request) could not be
		 * contacted within a reasonable amount of time; the associated error
		 * type SHOULD be "wait".
		 */
		remote_server_timeout("remote-server-timeout", "wait", 504),
		/**
		 * the server or recipient lacks the system resources necessary to
		 * service the request; the associated error type SHOULD be "wait".
		 */
		resource_constraint("resource-constraint", "wait", 500),
		/**
		 * the server or recipient does not currently provide the requested
		 * service; the associated error type SHOULD be "cancel".
		 */
		service_unavailable("service-unavailable", "cancel", 503),
		/**
		 * the requesting entity is not authorized to access the requested
		 * service because a subscription is required; the associated error type
		 * SHOULD be "auth".
		 */
		subscription_required("subscription-required", "auth", 407),
		/**
		 * the error condition is not one of those defined by the other
		 * conditions in this list; any error type may be associated with this
		 * condition, and it SHOULD be used only in conjunction with an
		 * application-specific condition.
		 */
		undefined_condition("undefined-condition", null, 500),
		/**
		 * the recipient or server understood the request but was not expecting
		 * it at this time (e.g., the request was out of order); the associated
		 * error type SHOULD be "wait".
		 */
		unexpected_request("unexpected-request", "wait", 400);

		protected final static HashMap<String, ErrorCondition> conditions = new HashMap<String, ErrorCondition>();

		private final String elementName;

		private final int errorCode;

		private final String type;

		public static ErrorCondition getByElementName(String name) {
			for (ErrorCondition e : ErrorCondition.values()) {
				if (e.elementName.equals(name)) {
					return e;
				}
			}
			return null;
		}

		private ErrorCondition(String elementName, String type, int errorCode) {
			this.elementName = elementName;
			this.type = type;
			this.errorCode = errorCode;
		}

		public String getElementName() {
			return elementName;
		}

		public int getErrorCode() {
			return errorCode;
		}

		public String getType() {
			return type;
		}
	}

}
