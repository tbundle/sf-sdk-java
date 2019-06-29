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
package abs.ixi.client.xmpp.packet;

import abs.ixi.client.util.StringUtils;
import abs.ixi.client.xml.Element;
import abs.ixi.client.xmpp.InvalidJabberId;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.XMPPNamespace;
import abs.ixi.client.xmpp.XMPPTags;
import abs.ixi.client.xmpp.packet.ChatRoom.Affiliation;
import abs.ixi.client.xmpp.packet.ChatRoom.ChatRoomMember;
import abs.ixi.client.xmpp.packet.ChatRoom.Role;

public class Presence extends Stanza {
	private static final long serialVersionUID = -1823494686065699425L;

	private static final String PRESENCE = "presence";
	private static final String SHOW_OPEN_TAG = "<show>";
	private static final String SHOW_CLOSE_TAG = "</show>";
	private static final String STATUS_OPEN_TAG = "<status>";
	private static final String STATUS_CLOSE_TAG = "</status>";
	private static final String PRESENCE_CLOSE_TAG = "</presence>";
	private static final String INITIAL_PRESENCE_XML = "<presence />";
	private static final String X = "x";
	public static final String SHOW = "show";
	public static final String STATUS = "status";
	public static final String ERROR = "error";

	private static final String X_CLOSE_TAG = "</x>";

	private static final String PHOTO = "photo";
	private static final String X_WITH_VCARD_UPDATE_XML = "<x xmlns='vcard-temp:x:update'/>";
	private static final String X_WITH_VCARD_OPEN_TAG = "<x xmlns='vcard-temp:x:update'>";
	private static final String PHOTO_XML = "<photo />";
	private static final String PHOTO_OPEN_TAG = "<photo>";
	private static final String PHOTO_CLOSE_TAG = "</photo>";

	private static final Presence INITIAL_PRESENCEE_PACKET = new Presence(true);

	private PresenceType type;
	private PresenceStatus status;
	private String mood;
	private boolean initialPresence;

	private ChatRoom chatRoom;
	private boolean muc;

	private String photoSHA1Hash;
	private boolean isPhotoUpdate;
	private boolean isVCardUpdate;

	public Presence() {

	}

	public Presence(boolean initialPresence) {
		this.initialPresence = initialPresence;
	}

	public Presence(Element element) throws Exception {
		super(element);

		if (!StringUtils.isNullOrEmpty(element.getAttribute(TYPE))) {
			this.type = PresenceType.valueFrom(element.getAttribute(TYPE));

		} else {
			this.type = PresenceType.AVAILABLE;
		}

		generateContent(element);
	}

	public static Presence getInitialPresencePacket() {
		return INITIAL_PRESENCEE_PACKET;
	}

	public PresenceType getType() {
		return type;
	}

	public void setType(PresenceType type) {
		this.type = type;
	}

	public PresenceStatus getStatus() {
		return status;
	}

	public void setStatus(PresenceStatus status) {
		this.status = status;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}

	public boolean isMuc() {
		return muc;
	}

	public void setMuc(boolean muc) {
		this.muc = muc;
	}

	public boolean isInitialPresence() {
		return initialPresence;
	}

	public void setInitialPresence(boolean initialPresence) {
		this.initialPresence = initialPresence;
	}

	public String getPhotoSHA1Hash() {
		return photoSHA1Hash;
	}

	public void setPhotoSHA1Hash(String photoSHA1Hash) {
		this.photoSHA1Hash = photoSHA1Hash;
	}

	public boolean isPhotoUpdate() {
		return isPhotoUpdate;
	}

	public void setPhotoUpdate(boolean isPhotoUpdate) {
		this.isPhotoUpdate = isPhotoUpdate;
	}

	public boolean isVCardUpdate() {
		return isVCardUpdate;
	}

	public void setVCardUpdate(boolean isVCardUpdate) {
		this.isVCardUpdate = isVCardUpdate;
	}

	@Override
	public String xml() {
		if (this.isInitialPresence()) {
			return INITIAL_PRESENCE_XML;

		} else {
			StringBuilder sb = new StringBuilder();
			sb.append(OPEN_BRACKET).append(PRESENCE);

			if (!StringUtils.isNullOrEmpty(this.getId())) {
				sb.append(StringUtils.SPACE).append(ID).append(EQUALS).append(SINGLE_QUOTE).append(this.getId())
						.append(SINGLE_QUOTE);
			}

			if (this.getFrom() != null) {
				sb.append(StringUtils.SPACE).append(FROM).append(EQUALS).append(SINGLE_QUOTE)
						.append(this.getFrom().getFullJID()).append(SINGLE_QUOTE);
			}

			if (this.getTo() != null) {
				sb.append(StringUtils.SPACE).append(TO).append(EQUALS).append(SINGLE_QUOTE)
						.append(this.getTo().getFullJID()).append(SINGLE_QUOTE);
			}

			if (this.getType() != null) {
				sb.append(StringUtils.SPACE).append(TYPE).append(EQUALS).append(SINGLE_QUOTE)
						.append(this.getType().val()).append(SINGLE_QUOTE);
			}

			if (this.getLang() != null) {
				sb.append(StringUtils.SPACE).append(XML_LANG).append(EQUALS).append(SINGLE_QUOTE)
						.append(this.getLang().val()).append(SINGLE_QUOTE);
			}

			sb.append(CLOSE_BRACKET);

			if (this.getStatus() != null) {
				sb.append(SHOW_OPEN_TAG).append(this.getStatus().val()).append(SHOW_CLOSE_TAG);

			}

			if (!StringUtils.isNullOrEmpty(this.getMood())) {
				sb.append(STATUS_OPEN_TAG).append(this.getMood()).append(STATUS_CLOSE_TAG);
			}

			if (this.isMuc()) {
				sb.append(OPEN_BRACKET).append(X).append(StringUtils.SPACE).append(XMLNS).append(EQUALS)
						.append(SINGLE_QUOTE).append(XMPPNamespace.MUC_NAMESPACE).append(SINGLE_QUOTE)
						.append(StringUtils.SPACE).append(SLASH).append(CLOSE_BRACKET);
			}

			if (this.isVCardUpdate) {
				if (this.isPhotoUpdate) {

					sb.append(X_WITH_VCARD_OPEN_TAG);

					if (StringUtils.isNullOrEmpty(this.photoSHA1Hash)) {
						sb.append(PHOTO_XML);

					} else {
						sb.append(PHOTO_OPEN_TAG).append(this.photoSHA1Hash).append(PHOTO_CLOSE_TAG);
					}

					sb.append(X_CLOSE_TAG);

				} else {
					sb.append(X_WITH_VCARD_UPDATE_XML);
				}
			}

			sb.append(PRESENCE_CLOSE_TAG);

			return sb.toString();
		}

	}

	private void generateContent(Element elm) throws InvalidJabberId {
		if (elm.getChildren() == null)
			return;

		for (Element child : elm.getChildren()) {

			if (StringUtils.safeEquals(child.getName(), SHOW, false)) {
				this.setStatus(PresenceStatus.valueFrom(child.val()));

			} else if (StringUtils.safeEquals(child.getName(), STATUS, false)) {
				this.setMood(child.val());

			} else if (StringUtils.safeEquals(child.getName(), X, false)) {

				if (StringUtils.safeEquals(child.getAttribute("xmlns"), XMPPNamespace.MUC_USER_NAMESPACE)) {

					this.setMuc(true);

					ChatRoom chatRoom = new ChatRoom(new JID(from.getBareJID()), from.getNode(), null);

					Element item = child.getChild(XMPPTags.ITEM_TAG);

					if (item != null) {
						boolean membershipStatus = this.type != null && this.type == PresenceType.UNAVAILABLE ? false
								: true;

						ChatRoomMember member = chatRoom.new ChatRoomMember(new JID(item.getAttribute("jid")),
								from.getResource(), membershipStatus);

						if (!StringUtils.isNullOrEmpty(item.getAttribute("affiliation"))) {
							member.setAffiliation(Affiliation.valueFrom(item.getAttribute("affiliation")));
						}

						if (!StringUtils.isNullOrEmpty(item.getAttribute("role"))) {
							member.setRole(Role.valueFrom(item.getAttribute("role")));
						}

						if (!StringUtils.isNullOrEmpty(item.getAttribute("nick"))) {
							member.setNickName(item.getAttribute("nick"));
						}

						chatRoom.addMember(member);
					}

					this.setChatRoom(chatRoom);

				} else if (StringUtils.safeEquals(child.getAttribute("xmlns"),
						XMPPNamespace.VCARD_TEMP_X_UPDATE_NAMESPACE)) {

					this.isVCardUpdate = true;

					Element photoElement = elm.getChild(PHOTO);

					if (photoElement != null) {
						this.isPhotoUpdate = true;
						this.photoSHA1Hash = photoElement.val();
					}
				}

			}

		}
	}

	public enum PresenceType {
		ERROR("error "),

		PROBE("probe"),

		SUBSCRIBE("subscribe"),

		SUBSCRIBED("subscribed"),

		AVAILABLE("available"),

		UNAVAILABLE("unavailable"),

		UNSUBSCRIBE("unsubscribe"),

		UNSUBSCRIBED("unsubscribed");

		private String val;

		private PresenceType(String val) {
			this.val = val;
		}

		public String val() {
			return val;
		}

		public static PresenceType valueFrom(String val) throws IllegalArgumentException {
			for (PresenceType type : values()) {
				if (type.val().equalsIgnoreCase(val)) {
					return type;
				}
			}

			throw new IllegalArgumentException("No PresenceType for value [" + val + "]");
		}

	}

	public enum PresenceStatus {
		AWAY("away"), CHAT("chat"), DND("dnd"), XA("xa");

		private String val;

		private PresenceStatus(String val) {
			this.val = val;
		}

		public String val() {
			return val;
		}

		public static PresenceStatus valueFrom(String val) {
			for (PresenceStatus type : values()) {
				if (type.val().equalsIgnoreCase(val)) {
					return type;
				}
			}

			throw new IllegalArgumentException("No PresenceStatus for value [" + val + "]");
		}
	}

}
