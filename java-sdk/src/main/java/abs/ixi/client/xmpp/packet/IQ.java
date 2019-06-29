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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import abs.ixi.client.Platform;
import abs.ixi.client.Session;
import abs.ixi.client.io.MalformedXmppDataException;
import abs.ixi.client.util.CollectionUtils;
import abs.ixi.client.util.ObjectUtils;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.util.UUIDGenerator;
import abs.ixi.client.xml.Element;
import abs.ixi.client.xmpp.InvalidJabberId;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.PresenceSubscription;
import abs.ixi.client.xmpp.XMPPNamespace;
import abs.ixi.client.xmpp.XMPPTags;
import abs.ixi.client.xmpp.packet.ChatRoom.AccessMode;
import abs.ixi.client.xmpp.packet.ChatRoom.Affiliation;
import abs.ixi.client.xmpp.packet.ChatRoom.ChatRoomMember;
import abs.ixi.client.xmpp.packet.ChatRoom.Role;
import abs.ixi.client.xmpp.packet.ChatRoom.RoomConfigParam;
import abs.ixi.client.xmpp.packet.IQContent.IQContentType;
import abs.ixi.client.xmpp.packet.Roster.RosterItem;

public class IQ extends Stanza {
	private static final long serialVersionUID = -7254204786067416143L;

	private static final Logger LOGGER = Logger.getLogger(Stanza.class.getName());

	private static final String FIRST = "first";
	private static final String LAST = "last";
	private static final String NICK = "nick";
	private static final String EMAIL = "email";

	private static final String FIRST_OPEN_TAG = "<first>";
	private static final String FIRST_CLOSE_TAG = "</first>";
	private static final String LAST_OPEN_TAG = "<last>";
	private static final String LAST_CLOSE_TAG = "</last>";
	private static final String NICK_OPEN_TAG = "<nick>";
	private static final String NICK_CLOSE_TAG = "</nick>";
	private static final String EMAIL_OPEN_TAG = "<email>";
	private static final String EMAIL_CLOSE_TAG = "</email>";

	private static final String JID = "jid";
	private static final String NAME = "name";
	private static final String SUBJECT = "subject";
	private static final String DATA = "data";
	private static final String SUBSCIPTION = "subscription";
	private static final String VERSION = "ver";
	private static final String IQ = "iq";
	private static final String IQ_CLOSE = "</iq>";
	private static final String PING = "ping";
	private static final String BIND = "bind";
	private static final String AFFILIATION = "affiliation";
	private static final String ROLE = "role";
	private static final String MEDIA_TAG = "media";
	private static final String MEDIA_ID_ATTRIBUTE = "media-id";
	private static final String SID_ATTRIBUTE = "sid";
	private IQType type;
	private IQContent content;

	public IQ(IQType type) {
		super(UUIDGenerator.uuid());
		this.type = type;
	}

	public IQ(String id, IQType type) {
		super(id);
		this.type = type;
	}

	public IQ(String id, IQType type, IQContent content) {
		super(id);
		this.type = type;
		this.content = content;
	}

	public IQ(Element element) throws Exception {
		super(element);

		if (!StringUtils.isNullOrEmpty(element.getAttribute(TYPE))) {
			this.type = IQType.valueFrom(element.getAttribute(TYPE));
		}

		this.content = generateContent(element);

	}

	private IQContent generateContent(Element element) throws InvalidJabberId, MalformedXmppDataException {
		Element elm;

		if ((elm = element.getChild(IQQuery.XML_ELM_NAME)) != null) {
			String xmlns = elm.getAttribute(XMLNS);
			IQQuery query = new IQQuery(xmlns);

			if (StringUtils.safeEquals(XMPPNamespace.ROSTER_NAMESPACE, xmlns, false)) {
				Roster roster = generateRoster(elm);
				query.setRoster(roster);

			} else if (StringUtils.safeEquals(XMPPNamespace.JABBER_SEARCH_NAMESPACE, xmlns, false)) {
				UserSearchData userSearchData = new UserSearchData(elm);
				query.setUserSearchData(userSearchData);

			} else if (StringUtils.safeEquals(XMPPNamespace.USER_REGISTER_NAMESPACE, xmlns, false)
					&& getType() == IQType.RESULT) {

				UserRegistrationData userData = generateUserData(elm);
				query.setUserRegistrationData(userData);

			} else if (StringUtils.safeEquals(XMPPNamespace.DISCO_NAMESPACE, xmlns, false)
					&& StringUtils.safeEquals(this.from.getDomain(),
							Platform.getInstance().getUserSession().get(Session.KEY_MUC_SERVICE).toString())) {

				if (!CollectionUtils.isNullOrEmpty(elm.getChildren())) {
					List<ChatRoom> chatRooms = new ArrayList<>();

					if (StringUtils.isNullOrEmpty(this.from.getNode())) {
						// List of rooms
						for (Element child : elm.getChildren()) {
							if (StringUtils.safeEquals(child.getName(), XMPPTags.ITEM_TAG)) {
								JID jid = new JID(child.getAttribute(JID));
								String name = child.getAttribute(NAME);
								String subject = child.getAttribute(SUBJECT);

								ChatRoom room = new ChatRoom(jid, name, subject);
								chatRooms.add(room);
							}
						}
					} else {
						// List of ChatRoom Members
						ChatRoom room = new ChatRoom(new JID(this.from.getBareJID()), this.from.getNode(), null);

						for (Element child : elm.getChildren()) {
							if (StringUtils.safeEquals(child.getName(), XMPPTags.ITEM_TAG)) {
								JID jid = new JID(child.getAttribute(JID));

								ChatRoomMember member = room.new ChatRoomMember(jid, child.getAttribute(NAME));

								if (child.getAttribute(AFFILIATION) != null) {
									member.setAffiliation(Affiliation.valueFrom(child.getAttribute(AFFILIATION)));
								}

								if (child.getAttribute(ROLE) != null) {
									member.setRole(Role.valueFrom(child.getAttribute(ROLE)));
								}

								room.addMember(member);
							}
						}

						chatRooms.add(room);

					}

					query.setChatRooms(chatRooms);

				} else if (StringUtils.safeEquals(XMPPNamespace.STREAM_NAMESPACE, xmlns, false)) {
					Element mediaElm = element.getChild(MEDIA_TAG);
					query.setMediaId(mediaElm.getAttribute(MEDIA_ID_ATTRIBUTE));
					query.setSid(mediaElm.getAttribute(SID_ATTRIBUTE));
				}

			} else if (StringUtils.safeEquals(XMPPNamespace.INFO_NAMESPACE, xmlns, false)
					&& StringUtils.safeEquals(this.from.getDomain(),
							Platform.getInstance().getUserSession().get(Session.KEY_MUC_SERVICE).toString())) {

				ChatRoom room = new ChatRoom(new JID(this.from.getBareJID()), this.from.getNode(), this.from.getNode());

				for (Element child : elm.getChildren()) {
					if (StringUtils.safeEquals(child.getName(), "x")
							&& StringUtils.safeEquals(child.getAttribute(XMLNS), XMPPNamespace.JABBER_X_DATA, false)) {

						for (Element xChild : child.getChildren()) {
							if (StringUtils.safeEquals(xChild.getName(), "field")
									&& StringUtils.safeEquals(xChild.getAttribute("var"), "muc#roominfo_accessmode")) {

								Element value = xChild.getChild("value");
								if (!StringUtils.isNullOrEmpty(value.val())) {
									room.setAccessMode(AccessMode.valueFrom(value.val()));
								}

							} else if (StringUtils.safeEquals(xChild.getName(), "field")
									&& StringUtils.safeEquals(xChild.getAttribute("var"), "muc#roominfo_subject")) {

								Element value = xChild.getChild("value");
								if (!StringUtils.isNullOrEmpty(value.val())) {
									room.setSubject(value.val());
								}
							}
						}

					}

				}

				query.setChatRooms(Arrays.asList(room));

			} else if (StringUtils.safeEquals(XMPPNamespace.MUC_OWNER_NAMESPACE, xmlns, false)
					&& StringUtils.safeEquals(this.from.getDomain(),
							Platform.getInstance().getUserSession().get(Session.KEY_MUC_SERVICE).toString())) {

				ChatRoom room = new ChatRoom(new JID(this.from.getBareJID()), this.from.getNode(), this.from.getNode());

				Element x = elm.getChild("x");
				if (x != null && StringUtils.safeEquals(x.getAttribute("xmlns"), XMPPNamespace.JABBER_X_DATA)
						&& StringUtils.safeEquals(x.getAttribute("type"), "form")) {

					Set<RoomConfigParam> roomConfig = new HashSet<>();

					for (Element fChild : x.getChildren()) {
						if (StringUtils.safeEquals(fChild.getName(), "field")) {

							roomConfig.add(RoomConfigParam.valueFrom(fChild.getAttribute("var")));
						}
					}

					room.setConfigParams(roomConfig);
				}

				query.setChatRooms(Arrays.asList(room));
			} else {
				LOGGER.fine("IQ query stanza with xmlns " + xmlns + "not supported by server so escaping.");

			}

			return query;

		} else if ((elm = element.getChild(IQInbandOpen.XML_ELM_NAME)) != null) {
			return new IQInbandOpen(elm.getAttribute(XMLNS));

		} else if ((elm = element.getChild(IQInbandData.XML_ELM_NAME)) != null) {
			return new IQInbandData(elm.getAttribute(XMLNS), elm.getChild(DATA).val());

		} else if ((elm = element.getChild(IQInbandClose.XML_ELM_NAME)) != null) {
			return new IQInbandClose(elm.getAttribute(XMLNS));

		} else if ((elm = element.getChild(IQPing.XML_ELM_NAME)) != null) {
			return new IQPing(elm.getAttribute(XMLNS));

		} else if ((elm = element.getChild(IQResourceBind.XML_ELM_NAME)) != null) {
			IQResourceBind bind = new IQResourceBind(elm.getAttribute(XMLNS));

			if (elm.getChild(XMPPTags.JID_TAG).val() != null) {
				String resource = new JID(elm.getChild(XMPPTags.JID_TAG).val()).getResource();

				bind.setResource(resource);
			}

			return bind;

		} else if ((elm = element.getChild(IQVCardContent.XML_ELM_NAME)) != null) {
			return new IQVCardContent(element.getChild(IQVCardContent.XML_ELM_NAME));

		}

		LOGGER.info("IQ query stanza does not contain supported child tags . so escaping.");

		return null;
	}

	private UserRegistrationData generateUserData(Element queryElm) {
		UserRegistrationData userRegistration = new UserRegistrationData();

		Element registeredElement = queryElm.getChild(XMPPTags.REGISTERED_TAG);

		if (registeredElement != null) {
			userRegistration.setRegistered(true);

			for (Element child : queryElm.getChildren()) {
				if (StringUtils.safeEquals(child.getName(), XMPPTags.USERNAME_TAG)) {
					userRegistration.setUserName(child.val());

				} else if (StringUtils.safeEquals(child.getName(), XMPPTags.EMAIL_TAG)) {
					userRegistration.setEmail(child.val());

				}
			}

		} else {
			Set<String> userRegistrationAttributes = new HashSet<>();
			userRegistration.setUserRegistrationAttributes(userRegistrationAttributes);

			for (Element child : queryElm.getChildren()) {
				if (StringUtils.safeEquals(child.getName(), "instructions")) {
					userRegistration.setRegistrationInstruction(child.val());

				} else {
					userRegistrationAttributes.add(child.getName());
				}
			}

		}

		return userRegistration;
	}

	private Roster generateRoster(Element queryElemet) throws InvalidJabberId {
		Roster roster = new Roster();

		roster.setVersion(ObjectUtils.parseToInt(queryElemet.getAttribute(VERSION)));

		if (!CollectionUtils.isNullOrEmpty(queryElemet.getChildren())) {
			List<RosterItem> items = new ArrayList<>();

			for (Element child : queryElemet.getChildren()) {

				if (StringUtils.safeEquals(child.getName(), XMPPTags.ITEM_TAG)) {
					RosterItem item = roster.new RosterItem(new JID(child.getAttribute(JID)));

					item.setName(child.getAttribute(NAME));

					if (!StringUtils.isNullOrEmpty(child.getAttribute(SUBSCIPTION))) {
						item.setSubscription(PresenceSubscription.valueFrom(child.getAttribute(SUBSCIPTION)));
					}

					if (!CollectionUtils.isNullOrEmpty(child.getChildren())) {
						List<String> groups = new ArrayList<>();

						for (Element chind2 : child.getChildren()) {

							if (StringUtils.safeEquals(chind2.getName(), XMPPTags.GROUP_TAG)) {
								if (!StringUtils.isNullOrEmpty(chind2.val())) {
									groups.add(chind2.val());
								}
							}

						}

						item.setGroups(groups);
					}

					items.add(item);
				}

			}

			roster.setItems(items);
		}

		return roster;
	}

	public IQType getType() {
		return type;
	}

	public void setType(IQType type) {
		this.type = type;
	}

	public IQContent getContent() {
		return content;
	}

	public void setContent(IQContent content) {
		this.content = content;
	}

	@Override
	public String xml() {
		if (content != null) {
			if (content.getType() == IQContentType.QUERY) {
				return getQueryPacketString();

			} else if (content.getType() == IQContentType.BIND) {
				return getResourceBindPacketString();

			} else if (content.getType() == IQContentType.PING) {
				return getPingPacketString();

			} else if (content.getType() == IQContentType.JINGLE) {
				return getJinglePacketString();

			} else if (content.getType() == IQContentType.DATA) {
				return getDataPacketString();

			} else if (content.getType() == IQContentType.OPEN) {
				return getOpenPacketString();

			} else if (content.getType() == IQContentType.CLOSE) {
				return getClosePackteString();

			} else if (content.getType() == IQContentType.PUSH_REGISTRATION) {
				return getPushPackteString();

			} else if (content.getType() == IQContentType.VCARD) {
				return generateVCardString();
			}

			LOGGER.fine("IQ content not supported");
		}

		StringBuilder sb = new StringBuilder();
		sb.append(OPEN_BRACKET).append(IQ).append(StringUtils.SPACE).append(ID).append(EQUALS).append(SINGLE_QUOTE)
				.append(this.getId()).append(SINGLE_QUOTE).append(StringUtils.SPACE).append(TYPE).append(EQUALS)
				.append(SINGLE_QUOTE).append(this.getType().val()).append(SINGLE_QUOTE);

		if (this.from != null) {
			sb.append(StringUtils.SPACE).append(FROM).append(EQUALS).append(SINGLE_QUOTE)
					.append(this.getFrom().getFullJID()).append(SINGLE_QUOTE);
		}

		if (this.to != null) {
			sb.append(StringUtils.SPACE).append(TO).append(EQUALS).append(SINGLE_QUOTE)
					.append(this.getTo().getBareJID()).append(SINGLE_QUOTE);
		}

		sb.append(StringUtils.SPACE).append(SLASH).append(CLOSE_BRACKET);

		return sb.toString();
	}

	private String generateVCardString() {
		StringBuilder sb = new StringBuilder();
		prepareIqStartTag(sb);

		this.content.appendXml(sb);

		sb.append(IQ_CLOSE);

		return sb.toString();
	}

	@Override
	public StringBuilder appendXml(StringBuilder sb) {
		sb.append(this.xml());
		return sb;
	}

	private String getClosePackteString() {
		return null;
	}

	private String getOpenPacketString() {
		return null;
	}

	private String getDataPacketString() {
		return null;
	}

	private String getJinglePacketString() {
		return null;
	}

	private String getPushPackteString() {
		StringBuilder sb = new StringBuilder();
		prepareIqStartTag(sb);

		IQPushRegistration push = (IQPushRegistration) content;

		sb.append("<push xmlns='" + XMPPNamespace.PUSH_NAMESPACE + "'>");
		sb.append("<device-id>").append(push.getDeviceId()).append("</device-id>");
		sb.append("<device-token>").append(push.getDeviceToken()).append("</device-token>");
		sb.append("<notification-service>").append(push.getService().name()).append("</notification-service>");
		sb.append("<device-type>").append(push.getDeviceType().name()).append("</device-type>");

		if (push.isRemoved()) {
			sb.append("<remove />");
		}
		sb.append("</push>").append("</iq>");

		return sb.toString();
	}

	private String getQueryPacketString() {
		StringBuilder sb = new StringBuilder();
		prepareIqStartTag(sb);

		IQQuery query = (IQQuery) content;

		if (StringUtils.safeEquals(XMPPNamespace.ROSTER_NAMESPACE, query.getXmlns())) {
			String val = getRosterQueryString(query);

			if (!StringUtils.isNullOrEmpty(val)) {
				sb.append(val);
			}

		} else if (StringUtils.safeEquals(XMPPNamespace.USER_REGISTER_NAMESPACE, query.getXmlns())) {
			sb.append(getRegistrationQueryString(query));

		} else if (StringUtils.safeEquals(XMPPNamespace.JABBER_SEARCH_NAMESPACE, query.getXmlns())) {
			sb.append(getJabberSearchQueryString(query));

		} else if (StringUtils.safeEquals(XMPPNamespace.DISCO_NAMESPACE, query.getXmlns())) {
			sb.append(getMucDiscoQueryString());

		} else if (StringUtils.safeEquals(XMPPNamespace.INFO_NAMESPACE, query.getXmlns())) {
			sb.append(getMucInfoQueryString());

		} else if (StringUtils.safeEquals(XMPPNamespace.MUC_OWNER_NAMESPACE, query.getXmlns())) {
			sb.append(getMucOwnerQueryString(query));

		} else if (StringUtils.safeEquals(XMPPNamespace.MUC_ADMIN_NAMESPACE, query.getXmlns())) {
			sb.append(getMucAdminQueryString(query));

		} else if (StringUtils.safeEquals(XMPPNamespace.STRINGFLOW_MEDIA_NAMESPACE, query.getXmlns())) {
			sb.append(getMediaQueryString(query));
		}

		sb.append(IQ_CLOSE);

		return sb.toString();
	}

	private String getJabberSearchQueryString(IQQuery query) {
		if (this.getType() == IQType.GET) {
			return "<query xmlns='jabber:iq:search'/>";

		} else if (this.getType() == IQType.SET) {
			StringBuilder sb = new StringBuilder();

			sb.append("<query xmlns='jabber:iq:search'>");

			UserSearchData userSearchData = query.getUserSearchData();

			if (userSearchData != null && userSearchData.getSearchRequestData() != null) {

				for (Entry<String, String> entry : userSearchData.getSearchRequestData().entrySet()) {

					if (StringUtils.safeEquals(entry.getKey(), FIRST)) {
						sb.append(FIRST_OPEN_TAG).append(entry.getValue()).append(FIRST_CLOSE_TAG);

					} else if (StringUtils.safeEquals(entry.getKey(), LAST)) {
						sb.append(LAST_OPEN_TAG).append(entry.getValue()).append(LAST_CLOSE_TAG);

					} else if (StringUtils.safeEquals(entry.getKey(), NICK)) {
						sb.append(NICK_OPEN_TAG).append(entry.getValue()).append(NICK_CLOSE_TAG);

					} else if (StringUtils.safeEquals(entry.getKey(), EMAIL)) {
						sb.append(EMAIL_OPEN_TAG).append(entry.getValue()).append(EMAIL_CLOSE_TAG);
					}
				}

			}

			sb.append("</query>");

			return sb.toString();

		}
		return null;
	}

	private String getMediaQueryString(IQQuery query) {
		StringBuilder sb = new StringBuilder("<query xmlns='" + XMPPNamespace.STRINGFLOW_MEDIA_NAMESPACE + "' >");

		if (!StringUtils.isNullOrEmpty(query.getMediaId()) && !StringUtils.isNullOrEmpty(query.getSid())) {
			sb.append("<media media-id='" + query.getMediaId() + "' sid='" + query.getSid() + "' />");
		}

		sb.append("</query>");

		return sb.toString();
	}

	private String getMucAdminQueryString(IQQuery query) {
		StringBuilder sb = new StringBuilder("<query xmlns='http://jabber.org/protocol/muc#admin'>");

		if (!CollectionUtils.isNullOrEmpty(query.getChatRooms())) {
			for (ChatRoomMember member : query.getChatRooms().get(0).getMembers()) {
				sb.append("<item affiliation='").append(member.getAffiliation().val()).append("' ").append("jid ='")
						.append(member.getUserJID().getBareJID()).append("' ").append("role ='")
						.append(member.getRole().val()).append("' ").append("nick ='").append(member.getNickName())
						.append("' />");
			}
		}

		sb.append("</query>");

		return sb.toString();
	}

	private String getMucDiscoQueryString() {
		return "<query xmlns='" + XMPPNamespace.DISCO_NAMESPACE + "'/>";
	}

	private String getMucInfoQueryString() {
		return "<query xmlns='" + XMPPNamespace.INFO_NAMESPACE + "'/>";
	}

	private String getMucOwnerQueryString(IQQuery query) {
		if (this.getType() == IQType.SET) {
			StringBuilder sb = new StringBuilder("<query xmlns='" + XMPPNamespace.MUC_OWNER_NAMESPACE + "'>");

			if (query.isRoomConfig()) {
				sb.append("<x xmlns='jabber:x:data' type='submit'>");

				List<ChatRoom> rooms = query.getChatRooms();

				if (!CollectionUtils.isNullOrEmpty(rooms)) {
					ChatRoom room = rooms.get(0);

					if (room.getAccessMode() != null) {
						sb.append("<field var='").append(RoomConfigParam.ACCESS_MODE.val()).append("'>")
								.append("<value>").append(room.getAccessMode().val()).append("</value>")
								.append("</field>");
					}
				}

				sb.append("</x>");

			} else if (query.isDestroyRoom()) {
				sb.append("<destroy>");

				if (!StringUtils.isNullOrEmpty(query.getReason())) {
					sb.append("<reason>").append(query.getReason()).append("</reason>");
				}

				sb.append("</destroy>");
			}

			sb.append("</query>");

			return sb.toString();
		}

		return "<query xmlns='" + XMPPNamespace.MUC_OWNER_NAMESPACE + "'/>";
	}

	private String getRegistrationQueryString(IQQuery query) {
		if (this.getType() == IQType.GET) {
			return "<query xmlns='jabber:iq:register'/>";

		} else {
			UserRegistrationData userRegistrationData = query.getUserRegistrationData();

			if (userRegistrationData != null) {
				if (userRegistrationData.isRemove()) {
					return "<query xmlns='jabber:iq:register'><remove/></query>";

				} else {
					StringBuilder sb = new StringBuilder();
					sb.append("<query xmlns='jabber:iq:register'>");

					if (!StringUtils.isNullOrEmpty(userRegistrationData.getUserName())) {
						sb.append("<username>").append(userRegistrationData.getUserName()).append("</username>");
					}

					if (!StringUtils.isNullOrEmpty(userRegistrationData.getPassword())) {
						sb.append("<password>").append(userRegistrationData.getPassword()).append("</password>");
					}

					if (!StringUtils.isNullOrEmpty(userRegistrationData.getEmail())) {
						sb.append("<email>").append(userRegistrationData.getEmail()).append("</email>");
					}

					sb.append("</query>");

					return sb.toString();
				}
			}

			// TODO: throw exception no user data found
		}

		return null;
	}

	private String getRosterQueryString(IQQuery query) {
		Roster roster = query.getRoster();

		if (this.getType() == IQType.GET) {
			return "<query xmlns='jabber:iq:roster' ver='" + roster.getVersion() + "'/>";

		} else {
			if (roster != null) {
				StringBuilder sb = new StringBuilder();
				sb.append("<query").append(" xmlns='jabber:iq:roster'");

				if (roster.getVersion() != 0) {
					sb.append(" ver='").append(roster.getVersion()).append("'");
				}

				sb.append(">");

				if (!CollectionUtils.isNullOrEmpty(roster.getItems())) {
					for (RosterItem item : roster.getItems()) {
						sb.append("<item jid='").append(item.getJid().getBareJID()).append("'");

						if (!StringUtils.isNullOrEmpty(item.getName())) {
							sb.append(" name='").append(item.getName()).append("'");
						}

						if (item.getSubscription() != null) {
							sb.append(" subscription='").append(item.getSubscription().val()).append("'");
						}

						sb.append(">");

						if (!CollectionUtils.isNullOrEmpty(item.getGroups())) {
							for (String group : item.getGroups()) {
								sb.append("<group>").append(group).append("</group>");
							}
						}

						sb.append("</item>");
					}
				}

				sb.append("</query>");
				return sb.toString();
			}

			// TODO : throw exception no roster data found
		}

		return null;
	}

	private String getPingPacketString() {
		StringBuilder sb = new StringBuilder();
		prepareIqStartTag(sb);
		sb.append(OPEN_BRACKET).append(PING).append(XMLNS).append(EQUALS).append(SINGLE_QUOTE)
				.append(XMPPNamespace.PING_NAMESPACE).append(SINGLE_QUOTE).append(StringUtils.SPACE).append(SLASH)
				.append(CLOSE_BRACKET).append(IQ_CLOSE);

		return sb.toString();
	}

	private String getResourceBindPacketString() {
		StringBuilder sb = new StringBuilder();
		prepareIqStartTag(sb);

		sb.append(OPEN_BRACKET).append(BIND).append(XMLNS).append(EQUALS).append(SINGLE_QUOTE)
				.append(XMPPNamespace.RESOURCE_BIND_NAMESPACE).append(SINGLE_QUOTE).append(CLOSE_BRACKET);

		IQResourceBind bind = (IQResourceBind) content;

		if (StringUtils.isNullOrEmpty(bind.getResource())) {
			sb.append("<resource>").append(bind.getResource()).append("</resource>");
		}

		sb.append("</bind></iq>");

		return sb.toString();
	}

	public void prepareIqStartTag(StringBuilder sb) {
		sb.append(OPEN_BRACKET).append(IQ).append(StringUtils.SPACE).append(ID).append(EQUALS).append(SINGLE_QUOTE)
				.append(this.getId()).append(SINGLE_QUOTE).append(StringUtils.SPACE).append(TYPE).append(EQUALS)
				.append(SINGLE_QUOTE).append(this.getType().val()).append(SINGLE_QUOTE);

		if (this.from != null) {
			sb.append(StringUtils.SPACE).append(FROM).append(EQUALS).append(SINGLE_QUOTE)
					.append(this.getFrom().getFullJID()).append(SINGLE_QUOTE);
		}

		if (this.to != null) {
			sb.append(StringUtils.SPACE).append(TO).append(EQUALS).append(SINGLE_QUOTE)
					.append(this.getTo().getBareJID()).append(SINGLE_QUOTE);
		}

		sb.append(CLOSE_BRACKET);
	}

	public enum IQType {
		SET("set"), GET("get"), RESULT("result"), ERROR("error");

		String val;

		private IQType(String val) {
			this.val = val;
		}

		public String val() {
			return val;
		}

		public static IQType valueFrom(String val) throws IllegalArgumentException {
			for (IQType type : values()) {
				if (type.val().equalsIgnoreCase(val)) {
					return type;
				}
			}

			throw new IllegalArgumentException("No IQType for value [" + val + "]");
		}
	}

}
