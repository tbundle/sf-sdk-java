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

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import abs.ixi.client.util.UUIDGenerator;

/**
 * Utility class to hold xmpp constants, namespaces, string literals and
 * convenience methods.
 */
public class XMPPUtils {
	private static final String START_STREAM = "<?xml version=\"1.0\" encoding=\'%s\' ?>"
			+ "<stream:stream from=\'%s\' to=\'%s\' version='1.0' xml:lang='en' xmlns='jabber:client' xmlns:stream='http://etherx.jabber.org/streams'>";

	private static final String STREAM_CLOSE = "</stream:stream>";

	private static final String START_TLS = "<starttls xmlns='urn:ietf:params:xml:ns:xmpp-tls'/>";

	private static final String SM_ENABLE_XML = "<enable xmlns='urn:xmpp:sm:3'/>";

	private static final String SASL_PLAIN_AUTH = "<auth xmlns='urn:ietf:params:xml:ns:xmpp-sasl' mechanism='PLAIN'>%s</auth>";

	private static final String RESOURCE_BIND = "<iq id='%s' type='set'><bind xmlns='urn:ietf:params:xml:ns:xmpp-bind'/></iq>";

	private static final String USER_REGISTRATION = "<iq type='set' id='%s'>" + "<query xmlns='jabber:iq:register'>"
			+ "<username>%s</username>" + "<password>%s</password>" + "<email>%s</email>" + "</query>" + "</iq>";

	private static final String RESET_USER_PASSWORD = "<iq type='set' to='%s' id='%s'>"
			+ "<query xmlns='jabber:iq:register'>" + "<username>%s</username>" + "<password>%s</password>" + "</query>"
			+ "</iq>";

	private static final String GET_ROSTER_REQUEST = "<iq from='%s' " + "id='%s' " + "type='get'>"
			+ "<query xmlns='jabber:iq:roster'/>" + "</iq>";

	private static final String GET_CHAT_SERVICE_INFO = "<iq from='%s'" + "id='%s'" + "to='%s'" + "type='get'>"
			+ "<query xmlns='http://jabber.org/protocol/disco#info'/>" + "</iq>";

	private static final String DISCOVER_CHAT_ROOMS_REQUEST = "<iq from='%s' " + "id='%s' " + "to='%s' " + "type='get'>"
			+ "<query xmlns='http://jabber.org/protocol/disco#items'/>" + "</iq>";

	private static final String GET_MEMBERS_IN_CHAT_ROOM = "<iq from='%s' " + "id='%s' " + "to='%s' " + "type='get'>"
			+ "<query xmlns='http://jabber.org/protocol/disco#items'/>" + "</iq>";

	private static final String STREAM_RESUME = "<resume xmlns='urn:xmpp:sm:3' previd='%s' h='%s'/>";

	private static final String ACK_REQUEST_STRING = "<r xmlns='urn:xmpp:sm:3'/>";

	private static final String ACK_PACKET_STRING = "<a xmlns='urn:xmpp:sm:3' h='%s'/>";

	public static String getDiscoverChatRoomRequest(String userJID, String chatServiceJID, String id) {
		return String.format(DISCOVER_CHAT_ROOMS_REQUEST, userJID, chatServiceJID, id);
	}

	public static String getMembersInChatRoomRequest(String userJID, String chatRoomJID, String id) {
		return String.format(GET_MEMBERS_IN_CHAT_ROOM, userJID, chatRoomJID, id);
	}

	public static String getChatServcieInfo(String userJID, String chatServiceJID, String id) {
		return String.format(GET_CHAT_SERVICE_INFO, userJID, chatServiceJID, id);
	}

	public static String getUserRegistrationRequest(String id, String userName, String password, String email) {
		return String.format(USER_REGISTRATION, id, userName, password, email);
	}

	public static String getRosterRequest(String id, String userJID) {
		return String.format(GET_ROSTER_REQUEST, id, userJID);
	}

	public static String getResetUserPasswordRequest(String id, String serverJID, String userName, String newPassword) {
		return String.format(RESET_USER_PASSWORD, id, serverJID, userName, newPassword);
	}

	public static String getStartStream(String from, String to) {
		return String.format(START_STREAM, StandardCharsets.UTF_8, from, to);
	}

	public static String getStreamClose() {
		return STREAM_CLOSE;
	}

	public static String getStartTLS() {
		return START_TLS;
	}

	public static String getSASLPlainAuth(String userName, String password) {
		String authData = new StringBuilder().append('\u0000').append(userName).append('\u0000').append(password)
				.toString();

		byte[] bytes = authData.getBytes(StandardCharsets.UTF_8);

		// TODO: Java compatibility issue. Change the use of Base64 with BASE64
		// in Android.

		return String.format(SASL_PLAIN_AUTH, Base64.getEncoder().encodeToString(bytes));

	}

	public static String getResourceBind() {
		return String.format(RESOURCE_BIND, UUIDGenerator.uuid());
	}

	public static String getSMEnableXml() {
		return SM_ENABLE_XML;
	}

	public static String getStreamResumeString(String streamId, int prevHandledPacketCount) {
		return String.format(STREAM_RESUME, streamId, prevHandledPacketCount);
	}

	public static String getAckPacketString(int handledPacketCount) {
		return String.format(ACK_PACKET_STRING, handledPacketCount);
	}

	public static String getAckRequestString() {
		return ACK_REQUEST_STRING;
	}

}
