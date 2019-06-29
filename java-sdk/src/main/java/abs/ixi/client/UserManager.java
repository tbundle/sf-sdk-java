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
package abs.ixi.client;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.core.AbstractPacketForwarder;
import abs.ixi.client.core.Callback;
import abs.ixi.client.core.Packet;
import abs.ixi.client.core.PacketCollector;
import abs.ixi.client.core.ResponseCorrelator;
import abs.ixi.client.core.TimeoutException;
import abs.ixi.client.core.event.Event.EventType;
import abs.ixi.client.core.event.EventBus;
import abs.ixi.client.core.event.EventHandler;
import abs.ixi.client.io.XMPPStreamManager;
import abs.ixi.client.net.NetworkException;
import abs.ixi.client.util.CollectionUtils;
import abs.ixi.client.util.FileUtil;
import abs.ixi.client.util.HashGenerationUtils;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.util.TaskExecutor;
import abs.ixi.client.util.UUIDGenerator;
import abs.ixi.client.xmpp.InvalidJabberId;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.PresenceSubscription;
import abs.ixi.client.xmpp.XMPPNamespace;
import abs.ixi.client.xmpp.packet.ChatRoom;
import abs.ixi.client.xmpp.packet.ChatRoom.AccessMode;
import abs.ixi.client.xmpp.packet.ChatRoom.Affiliation;
import abs.ixi.client.xmpp.packet.ChatRoom.ChatRoomMember;
import abs.ixi.client.xmpp.packet.ChatRoom.Role;
import abs.ixi.client.xmpp.packet.ChatRoom.RoomConfigParam;
import abs.ixi.client.xmpp.packet.IQ;
import abs.ixi.client.xmpp.packet.IQ.IQType;
import abs.ixi.client.xmpp.packet.IQContent.IQContentType;
import abs.ixi.client.xmpp.packet.IQPushRegistration;
import abs.ixi.client.xmpp.packet.IQQuery;
import abs.ixi.client.xmpp.packet.IQVCardContent;
import abs.ixi.client.xmpp.packet.Message;
import abs.ixi.client.xmpp.packet.Message.MessageType;
import abs.ixi.client.xmpp.packet.MessageSubject;
import abs.ixi.client.xmpp.packet.Presence;
import abs.ixi.client.xmpp.packet.Presence.PresenceType;
import abs.ixi.client.xmpp.packet.Roster;
import abs.ixi.client.xmpp.packet.Roster.RosterItem;
import abs.ixi.client.xmpp.packet.UserProfileData;
import abs.ixi.client.xmpp.packet.UserProfileData.UserAvtar;
import abs.ixi.client.xmpp.packet.UserRegistrationData;
import abs.ixi.client.xmpp.packet.UserSearchData;
import abs.ixi.client.xmpp.packet.UserSearchData.Item;

/**
 * {@code UserManager} is the top level entity which has all the convinience
 * method required to add, retrieve and update user related data. Most of the
 * times, {@code UserManager} processes {@link IQ} packets. Primary
 * responsibility includes user login, user signup, user logout, roster
 * management and Chatroom/Group related APIs.
 * <p>
 * {@code UserManager} allows both asynchronous and synchronous invocation of
 * exposed APIs. Additionally, developer can supply a {@link Callback} instance
 * to be invoked once the request to server is complete.
 * </p>
 */
public class UserManager extends AbstractPacketForwarder implements PacketCollector {
	private static final Logger LOGGER = Logger.getLogger(UserManager.class.getName());

	private static final String DEFAULT_USER_AVTAR_IMAGE_TYPE = "image/jpeg";
	private static final String FIRST = "first";
	private static final String LAST = "last";
	private static final String NICK = "nick";
	private static final String EMAIL = "email";

	private static final int USER_AVTAR_MAX_SIZE = 1024 * 8;

	private XMPPStreamManager streamManager;
	private ResponseCorrelator responseCorrelator;

	public UserManager(XMPPStreamManager streamManager, ResponseCorrelator correlator) {
		this.streamManager = streamManager;
		this.streamManager.addPacketCollector(IQ.class, this);

		this.responseCorrelator = correlator;
		this.streamManager.addPacketCollector(IQ.class, correlator);
	}

	/**
	 * Retrieve full user roster from server. The method sends a request to
	 * server for user Roster and returns. Upon receiving the the Roster,
	 * {@link EventType#ROSTER_RECEIVE} is pushed on to {@link EventBus}.
	 * Application can write an {@link EventHandler} for the event type and
	 * handle the received Roster.
	 * 
	 * @return true if the request was sent to server; otherwise false
	 */
	public boolean sendGetFullRosterRequest() {
		return sendGetRosterRequest(0);
	}

	/**
	 * Retrieve full user roster from server. The method sends a request to
	 * server for user Roster and returns. Upon receiving the the Roster,
	 * {@link EventType#ROSTER_RECEIVE} is pushed on to {@link EventBus}.
	 * Application can write an {@link EventHandler} for the event type and
	 * handle the received Roster.
	 * 
	 * @param callback callback instance
	 * @return true if the request was sent to server; otherwise false
	 */
	public boolean getFullRoster(Callback<Roster, Exception> callback) {
		// TODO Implementation is pending. We must wrap synchronous call in a
		// Runnable and invoke callback within the Runnable call.
		throw new UnsupportedOperationException();
	}

	/**
	 * Send a request to server to retrieve a particular version of user Roster.
	 * The method simply sends the request and returns. Later when response
	 * arrives, {@link EventType#ROSTER_RECEIVE} event is pushed on to
	 * {@link EventBus}. Applications can create and subscribe an
	 * {@link EventHandler} for this event type.
	 * 
	 * @param version Roster version to be retrieved
	 * @return true if the request was sent successfully; otherwise false
	 */
	public boolean sendGetRosterRequest(final int version) {
		IQ iq = new IQ(UUIDGenerator.uuid(), IQType.GET);

		Roster roster = new Roster();
		roster.setVersion(version);

		IQQuery query = new IQQuery(XMPPNamespace.ROSTER_NAMESPACE, roster);
		iq.setContent(query);
		iq.setFrom(Platform.getInstance().getUserJID());

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Retrieve user Roster from server. The method blocks until server retruns
	 * the response. If server fails to respond in ReplyTimeout time, a
	 * TimeoutException will be generated.
	 * 
	 * @param version Roster version; 0 indicates full Roster
	 * @return {@link IQ} packet with Roster response
	 * @throws TimeoutException if server does not reply in configured time.
	 */
	public IQ getRoster(int version) throws TimeoutException {
		// TODO Implementation is pending; Use ResponseCorrelator and get the
		// response
		throw new UnsupportedOperationException();
	}

	/**
	 * Send request to add a memeber to the user Roster.
	 * 
	 * @param jid {@link JID} of the user who will be added to Roster
	 * 
	 * @param name name of user who will be added to Roster
	 * @return true if the request was sent successfully otherwise false
	 */
	public boolean sendAddRosterMemberRequest(JID jid, String name) {
		Roster roster = new Roster();
		RosterItem item = roster.new RosterItem(jid, name, PresenceSubscription.BOTH);
		roster.addItem(item);

		IQQuery query = new IQQuery(XMPPNamespace.ROSTER_NAMESPACE, roster);

		IQ iq = new IQ(UUIDGenerator.secureId(), IQType.SET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setContent(query);

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Update name of a roster member. The request is executed asynchronosly;
	 * supplied {@link Callback} will be invoked once response arrives. If
	 * Server fails to respond in stipulated reply time, {@link Callback} will
	 * be invoked with {@link TimeoutException}
	 * 
	 * @param jid {@link JID} of the user who will be added to Roster
	 * @param name new name of the member
	 * @param callback {@link Callback} instance for invocation
	 * @return true if the request was sent to server successfully;otherwise
	 *         false
	 */
	public IQ updateRosterMemberName(JID jid, String name, Callback<IQ, Exception> callback) {
		// TODO Implementation is pending. In the implemntation we should make a
		// asynchronous call to server and should user Response Correlator to
		// get the Server Response. Upon receiving the response, Callback will
		// be invoked
		throw new UnsupportedOperationException();
	}

	/**
	 * Send request to server to update Roster member name. The method simply
	 * send an {@link IQ} packet to server with supplied correlation id as the
	 * packet id.
	 * 
	 * @param jid {@link JID} of the member
	 * @param name new name of the member
	 * @return true if the request was sent to server successfully; otherwise
	 *         false
	 */
	public boolean sendUpdateRosterMemberNameRequest(JID jid, String name) {
		Roster roster = new Roster();
		RosterItem item = roster.new RosterItem(jid, name, PresenceSubscription.BOTH);
		roster.addItem(item);

		IQQuery query = new IQQuery(XMPPNamespace.ROSTER_NAMESPACE, roster);

		IQ iq = new IQ(UUIDGenerator.secureId(), IQType.SET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setContent(query);

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Remove a roster member from logged-in user roster. The request is
	 * executed asynchronosly; supplied {@link Callback} will be invoked once
	 * response arrives. If Server fails to respond in stipulated reply time,
	 * {@link Callback} will be invoked with {@link TimeoutException}
	 * 
	 * @param jid {@link JID} of the user who will be removed to Roster
	 * @param name new name of the member
	 * @param callback {@link Callback} instance for invocation
	 * @return true if the request was sent to server successfully;otherwise
	 *         false
	 */
	public IQ removeRosterMember(JID jid, String name, Callback<IQ, Exception> callback) {
		// TODO Implementation is pending. In the implemntation we should make a
		// asynchronous call to server and should user Response Correlator to
		// get the Server Response. Upon receiving the response, Callback will
		// be invoked
		throw new UnsupportedOperationException();
	}

	/**
	 * Send request to remove Roster member from logged-in user Roster. The
	 * method simply send an {@link IQ} packet to server with supplied
	 * correlation id as the packet id.
	 * 
	 * @param jid {@link JID} of the member
	 * @param name new name of the member
	 * @return true if the request was sent to server successfully; otherwise
	 *         false
	 */
	public boolean sendRemoveRosterMemberRequest(JID jid, String name) {
		Roster roster = new Roster();
		RosterItem item = roster.new RosterItem(jid, name, PresenceSubscription.REMOVE);
		roster.addItem(item);

		IQQuery query = new IQQuery(XMPPNamespace.ROSTER_NAMESPACE, roster);

		IQ iq = new IQ(UUIDGenerator.secureId(), IQType.SET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setContent(query);

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Request to add a memeber to the user Roster.
	 * 
	 * @param jid {@link JID} of the user who will be added to Roster
	 * 
	 * @param name name of the member if name is not specified that Roster
	 *            member name will be default name of that user.
	 * @return true if the request was sent successfully otherwise false
	 */
	public boolean addRosterMember(JID jid, String name) {
		LOGGER.info("Adding roster memnber for jid : " + jid + " and name : " + name);

		Roster roster = new Roster();
		RosterItem item = roster.new RosterItem(jid, name, PresenceSubscription.BOTH);
		roster.addItem(item);

		String corrId = this.responseCorrelator.getCorrelationId();

		IQQuery query = new IQQuery(XMPPNamespace.ROSTER_NAMESPACE, roster);

		IQ iq = new IQ(corrId, IQType.SET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {
					return true;
				}

				if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to add roster member with jid : " + jid + " and name : " + name
							+ " due to \n error Message : " + response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.info("Time out exception while adding roster member with jid : " + jid + " and name " + name + e);

		}

		return false;
	}

	/**
	 * Remove Roster member from logged-in user Roster. The method simply send
	 * an {@link IQ} packet to server with supplied correlation id as the packet
	 * id.
	 * 
	 * @param jid {@link JID} of the member
	 * 
	 * @return true if the request was sent to server successfully; otherwise
	 *         false
	 */
	public boolean removeRosterMember(JID jid) {
		Roster roster = new Roster();
		RosterItem item = roster.new RosterItem(jid, PresenceSubscription.REMOVE);
		roster.addItem(item);

		IQQuery query = new IQQuery(XMPPNamespace.ROSTER_NAMESPACE, roster);

		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.SET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {
					return true;
				}

				if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to remove roster member with jid : " + jid + " due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.info("Time out exception while removing roster member with jid : " + jid + e);

		}

		return false;
	}

	/**
	 * Request to server to update Roster member name. The method simply send an
	 * {@link IQ} packet to server with supplied correlation id as the packet
	 * id.
	 * 
	 * @param jid {@link JID} of the member
	 * 
	 * @param name new name of the member if name is not specified that Roster
	 *            member name will be default name of that user.
	 * 
	 * @return true if the request was sent to server successfully; otherwise
	 *         false
	 */
	public boolean updateRosterMemberName(JID jid, String name) {
		return this.addRosterMember(jid, name);
	}

	/**
	 * Send a request to retreive list of availave chat rooms on server.
	 * 
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean sendGetChatRoomsRequest() {
		IQ iq = new IQ(UUIDGenerator.secureId(), IQType.GET);

		iq.setFrom(Platform.getInstance().getUserJID());

		try {

			iq.setTo(Platform.getInstance().getMucServiceJID());

		} catch (InvalidJabberId e) {
			// Swallow Exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.DISCO_NAMESPACE);
		iq.setContent(query);

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Send a request to retrieve list of available chat rooms on server.
	 * 
	 * @param callback {@link Callback} instance for invocation
	 */
	public void sendGetChatRoomsRequest(Callback<List<ChatRoom>, Exception> callback) {
		String corrId = this.responseCorrelator.getCorrelationId();

		JID from = Platform.getInstance().getUserJID();

		IQ iq = new IQ(corrId, IQType.GET);
		iq.setFrom(from);

		try {
			iq.setTo(Platform.getInstance().getMucServiceJID());

		} catch (InvalidJabberId e) {
			// Swallow Exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.DISCO_NAMESPACE);
		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getContent() != null && response.getContent().getType() == IQContentType.QUERY) {
					IQQuery responseQuery = (IQQuery) response.getContent();
					List<ChatRoom> rooms = responseQuery.getChatRooms();

					callback.onSuccess(rooms);
				}

			}

		} catch (TimeoutException e) {
			callback.onFailure(e);
		}
	}

	/**
	 * Send request to retrieve memebers list of a chatroom.
	 * 
	 * @param roomJID room {@link JID}
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean sendGetChatRoomMembersRequest(JID roomJID) {
		String correlationId = UUIDGenerator.uuid();

		IQ iq = new IQ(correlationId, IQType.GET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setTo(roomJID);
		IQQuery query = new IQQuery(XMPPNamespace.DISCO_NAMESPACE);
		iq.setContent(query);

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Request to get info of chat room.
	 * 
	 * @param roomJID {@link JID} of the chatroom
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean sendGetChatRoomInfoRequest(JID roomJID) {
		JID from = Platform.getInstance().getUserJID();

		String correlationId = UUIDGenerator.uuid();

		IQ iq = new IQ(correlationId, IQType.GET);
		iq.setFrom(from);
		iq.setTo(roomJID);
		IQQuery query = new IQQuery(XMPPNamespace.INFO_NAMESPACE);
		iq.setContent(query);

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Request to change user nick name in given chat room
	 * 
	 * @param roomJID {@link JID} of the chatroom
	 * @param nickName nickName
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean sendChangeUserNicknameRequest(JID roomJID, String nickName) {
		return sendJoinChatRoomRequest(roomJID, nickName);
	}

	/**
	 * Request to join a ChatRoom.
	 * 
	 * @param roomJID {@link JID} of the chatroom
	 * @param nickName nickName
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean sendJoinChatRoomRequest(JID roomJID, String nickName) {
		JID from = Platform.getInstance().getUserJID();

		roomJID.setResource(nickName);

		Presence presence = new Presence();
		presence.setFrom(from);
		presence.setTo(roomJID);
		presence.setId(UUIDGenerator.secureId());

		presence.setMuc(true);

		return this.streamManager.sendPacketAsync(presence);
	}

	/**
	 * Request to leave a ChatRoom
	 * 
	 * @param roomJID {@link JID} of the room
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean sendLeaveChatRoomRequest(JID roomJID) {
		Presence presence = new Presence();
		presence.setFrom(Platform.getInstance().getUserJID());

		presence.setTo(roomJID);
		presence.setType(PresenceType.UNAVAILABLE);

		return this.streamManager.sendPacketAsync(presence);
	}

	/**
	 * Request to add chat room member. This request should be given by
	 * {@link Affiliation#ADMIN} or {@link Affiliation#OWNER}. otherwise request
	 * will failed
	 * 
	 * @param roomJID {@link JID} of the chatroom
	 * @param userJID {@link JID} of the user
	 */
	public void sendAddChatRoomMemberRequest(JID roomJID, JID userJID) {
		String requestId = UUIDGenerator.secureId();

		IQ iq = new IQ(requestId, IQType.SET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setTo(roomJID);

		IQQuery query = new IQQuery(XMPPNamespace.MUC_ADMIN_NAMESPACE);
		iq.setContent(query);

		ChatRoom room = new ChatRoom(roomJID, null, null);
		ChatRoomMember member = room.new ChatRoomMember(userJID, userJID.getNode());
		member.setAffiliation(Affiliation.MEMBER);
		member.setRole(Role.PARTICIPANT);

		room.addMember(member);

		query.setChatRooms(Arrays.asList(room));

		this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Request to add chat room admin. This request should be given by
	 * {@link Affiliation#ADMIN} or {@link Affiliation#OWNER} otherwise request
	 * will failed
	 * 
	 * @param roomJID {@link JID} of the chatroom
	 * @param userJID {@link JID} of the user
	 * @return true if member added successfully
	 */
	public boolean addChatRoomAdmin(JID roomJID, JID userJID) {
		return this.updateChatRoomMember(roomJID, userJID, userJID.getNode(), Affiliation.ADMIN, Role.PARTICIPANT);
	}

	/**
	 * Request to add chat room owner. This request should be given by
	 * {@link Affiliation#ADMIN} or {@link Affiliation#OWNER} otherwise request
	 * will failed
	 * 
	 * @param roomJID {@link JID} of the chatroom
	 * @param userJID user {@link JID}
	 * @return true if member added successfully
	 */
	public boolean addChatRoomOwner(JID roomJID, JID userJID) {
		return this.updateChatRoomMember(roomJID, userJID, userJID.getNode(), Affiliation.OWNER, Role.MODERATOR);
	}

	/**
	 * Request to add chat room member. This request should be given by
	 * {@link Affiliation#ADMIN} or {@link Affiliation#OWNER} otherwise request
	 * will failed
	 * 
	 * @param roomJID chatroom {@link JID}
	 * @param userJID user {@link JID}
	 * @return true if member added successfully
	 */
	public boolean addChatRoomMember(JID roomJID, JID userJID) {
		return this.updateChatRoomMember(roomJID, userJID, userJID.getNode(), Affiliation.MEMBER, Role.PARTICIPANT);
	}

	/**
	 * Request to Remove member from chat room. This request should be given by
	 * {@link Affiliation#ADMIN} or {@link Affiliation#OWNER}. otherwise request
	 * will failed
	 * 
	 * @param roomJID chatroom {@link JID}
	 * @param userJID user {@link JID}
	 * @return true if member added successfully
	 */
	public boolean removeChatRoomMember(JID roomJID, JID userJID) {
		return this.updateChatRoomMember(roomJID, userJID, userJID.getNode(), Affiliation.NONE, Role.PARTICIPANT);

	}

	/**
	 * Request to update chat room member. This request should be given by
	 * {@link Affiliation#ADMIN} or {@link Affiliation#OWNER}. otherwise request
	 * will failed
	 * 
	 * @param roomJID chatroom {@link JID}
	 * @param userJID user {@link JID}
	 * @param nickName nickName
	 * @param affiliation affiliation
	 * @param role role
	 * @return true if member added successfully
	 */
	public boolean updateChatRoomMember(JID roomJID, JID userJID, String nickName, Affiliation affiliation, Role role) {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.SET);
		iq.setFrom(Platform.getInstance().getUserJID());
		iq.setTo(roomJID);

		IQQuery query = new IQQuery(XMPPNamespace.MUC_ADMIN_NAMESPACE);
		iq.setContent(query);

		ChatRoom room = new ChatRoom(roomJID, null, null);
		ChatRoomMember member = room.new ChatRoomMember(userJID, nickName);
		member.setAffiliation(affiliation);
		member.setRole(role);

		room.addMember(member);

		query.setChatRooms(Arrays.asList(room));

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {
					return true;
				}

				if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to update char room member " + userJID + " for chat room " + roomJID
							+ " due to \n error Message : " + response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.info(
					"Time out exception while updateing chat rooom member " + userJID + " for chat room " + roomJID);

		}

		return false;

	}

	/**
	 * It create instant Room with default configurations.
	 * 
	 * In usual group chat scenarios groups behave like a private chat rooms. No
	 * one can enter in chat room itself. So Stringflow server group's default
	 * behaviour is private group. In private groups Admin or Owner can add
	 * other members. And Room creator will be made owner and moderator of the
	 * group.No one can enter these group by giving
	 * {@link UserManager#sendJoinChatRoomRequest(JID, String)} request.
	 * 
	 * @param roomName name of the chatroom
	 * 
	 * @return true is room is successfully created, otherwise false
	 */
	public boolean createInstantRoom(String roomName) {
		try {

			JID roomJID = new JID(roomName, Platform.getInstance().getMucServiceName());

			String userNickName = Platform.getInstance().getUserName();

			sendJoinChatRoomRequest(roomJID, userNickName);

			String corrId = this.responseCorrelator.getCorrelationId();

			IQ instantRoomRequest = new IQ(corrId, IQType.SET);
			instantRoomRequest.setFrom(Platform.getInstance().getUserJID());
			instantRoomRequest.setTo(roomJID);

			IQQuery query = new IQQuery(XMPPNamespace.MUC_OWNER_NAMESPACE);
			query.setRoomConfig(true);

			instantRoomRequest.setContent(query);

			this.streamManager.sendPacketAsync(instantRoomRequest);

			try {
				Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

				if (packet instanceof IQ) {
					IQ response = (IQ) packet;

					if (response.getType() == IQType.RESULT) {
						return true;

					} else if (response.getType() == IQType.ERROR) {
						LOGGER.warning("Failed to create chat room with name " + roomName
								+ " due to \n error Message : " + response.getError().getErrorXMl());
					}

				}

			} catch (TimeoutException e) {
				LOGGER.warning("Time out exception while creating instant chat room with name " + roomName + e);
			}

		} catch (Exception e) {
			LOGGER.warning("Error while creating instant chat room with name " + roomName + e);
		}

		LOGGER.info("Failed to create instant chat rooom with name " + roomName);

		return false;
	}

	/**
	 * Request to create group with some configurations rather than default
	 * configuration (private group)
	 * 
	 * @param roomName chatroom name
	 * @param configs configurations
	 * @return true if the chatroom was created successfully otherwise false
	 */
	public boolean createReservedRoom(String roomName, Map<RoomConfigParam, String> configs) {
		// TODO : implement later while needed
		// Step1: send JoinChatRoomRequest
		// Step2 : send getRoomConfigration request
		// Step3 : If getRoomConfig request success then send Set Room
		// configrations request
		// :If getRoomConfig request ERROR Then retun false (room creation
		// failed)
		// step 4: if Set Room configrations request is success then return
		// true(room created successfully) else return false room creation
		// failed.
		throw new UnsupportedOperationException();
	}

	/**
	 * Create public room with given room name. No one can enter in this room
	 * using {@link UserManager#sendJoinChatRoomRequest(JID, String)}. Only room
	 * admin and owner can add or remove other members.
	 * 
	 * @param roomName chatroom name
	 * @return true if the private room was created successfully otherwise false
	 */
	public boolean createPrivateRoom(String roomName) {
		return createInstantRoom(roomName);
	}

	/**
	 * Create public room with given room name. Any one can enter in this room
	 * using {@link UserManager#sendJoinChatRoomRequest(JID, String)}.
	 * 
	 * @param roomName chatroom name
	 * @return true if the public room was created successfully otherwise false
	 */
	public boolean createPublicRoom(String roomName) {
		try {

			JID roomJID = new JID(roomName, Platform.getInstance().getMucServiceName());

			String userNickName = Platform.getInstance().getUserName();

			boolean joinRequestSent = sendJoinChatRoomRequest(roomJID, userNickName);

			if (!joinRequestSent)
				return false;

			Set<RoomConfigParam> configParams = getChatRoomConfigParams(roomJID);

			if (CollectionUtils.isNullOrEmpty(configParams))
				return false;

			if (configParams.contains(RoomConfigParam.ACCESS_MODE)) {
				return updateRoomAccessMode(roomJID, AccessMode.PUBLIC);
			}

		} catch (Exception e) {
			LOGGER.warning("Error while creating public chat room with name " + roomName + e);
		}

		LOGGER.info("Failed to create public chat rooom with name " + roomName);

		return false;
	}

	/**
	 * Request to get list of room configurations which can be updated. This
	 * request should be given by chat room owner. Only Owner is allowed to
	 * modify group configuration.
	 * 
	 * If Other request to get room configurations then Server sends a failure
	 * error {@link IQ}. And method returns null.
	 * 
	 * @param roomJID chatroom {@link JID}
	 * @return {@link Set} of room configuration params
	 */
	public Set<RoomConfigParam> getChatRoomConfigParams(JID roomJID) {
		String corrId = this.responseCorrelator.getCorrelationId();

		JID from = Platform.getInstance().getUserJID();

		IQ iq = new IQ(corrId, IQType.GET);
		iq.setFrom(from);
		iq.setTo(roomJID);

		IQQuery query = new IQQuery(XMPPNamespace.MUC_OWNER_NAMESPACE);
		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT && response.getContent() != null
						&& response.getContent().getType() == IQContentType.QUERY) {

					IQQuery responseQuery = (IQQuery) response.getContent();

					List<ChatRoom> rooms = responseQuery.getChatRooms();

					if (!CollectionUtils.isNullOrEmpty(rooms)) {
						ChatRoom room = rooms.get(0);

						return room.getConfigParams();
					}

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to get room cofiguration params for chat room  " + roomJID
							+ " due to \n error Message : " + response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Error while getting room configuration params chat room " + roomJID + e);
		}

		return null;
	}

	/**
	 * Update room access mode
	 * 
	 * @param roomJID chatroom {@link JID}
	 * @param accessMode chatroom {@link AccessMode}
	 * @return true if the update was successful otherwise false
	 */
	private boolean updateRoomAccessMode(JID roomJID, AccessMode accessMode) {
		String corrId = this.responseCorrelator.getCorrelationId();

		JID from = Platform.getInstance().getUserJID();

		IQ iq = new IQ(corrId, IQType.SET);
		iq.setFrom(from);
		iq.setTo(roomJID);

		IQQuery query = new IQQuery(XMPPNamespace.MUC_OWNER_NAMESPACE);

		ChatRoom room = new ChatRoom(roomJID, roomJID.getNode(), roomJID.getNode());
		room.setAccessMode(accessMode);

		query.setRoomConfig(true);
		query.setChatRooms(Arrays.asList(room));

		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;
				if (response.getType() == IQType.RESULT) {
					return true;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to update access mode of chat room  " + roomJID
							+ " due to \n error Message : " + response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Error while updating accessmode of chat room " + roomJID + e);
		}

		return false;
	}

	/**
	 * Send a request to change Chat room subject. The method simply sends
	 * request to server.
	 * 
	 * @param roomJID chatroom {@link JID}
	 * @param subject subject
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean updateRoomSubject(JID roomJID, String subject) {
		JID from = Platform.getInstance().getUserJID();

		Message message = new Message(UUIDGenerator.secureId());
		message.setFrom(from);
		message.setTo(roomJID);

		message.setType(MessageType.GROUP_CHAT);

		MessageSubject messageSubject = new MessageSubject(subject);

		message.addContent(messageSubject);

		return this.streamManager.sendPacketAsync(message);
	}

	/**
	 * Destroy chat room. Only Group owner can destroy a chat room
	 * 
	 * @param roomJID chatroom {@link JID}
	 * @param reason reason string
	 * @return true if the chatroom was destroyed successfully otherwise false
	 */
	public boolean destroyChatRoom(JID roomJID, String reason) {
		String corrId = this.responseCorrelator.getCorrelationId();

		JID from = Platform.getInstance().getUserJID();

		IQ iq = new IQ(corrId, IQType.SET);
		iq.setFrom(from);
		iq.setTo(roomJID);

		IQQuery query = new IQQuery(XMPPNamespace.MUC_OWNER_NAMESPACE);
		query.setDestroyRoom(true);
		query.setReason(reason);

		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;
				if (response.getType() == IQType.RESULT) {
					return true;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to destroy a chat room  " + roomJID + " due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while destroying a chat room " + roomJID + e);
		}

		return false;
	}

	/**
	 * Update device push notification registration id on server. In order to
	 * receive push notification from any external Push Notification Service
	 * such as GCM/FCM/APNS/WPNS, device must register with any of these
	 * services. Upon successful registration, device receives registration id
	 * which is used by Server to route push notifications to device. Messaging
	 * on mobile devices can not work without server making use of external push
	 * notification service; In order to send a push notification from server,
	 * server must know the registration id of the device.
	 * 
	 * @param token Registration Id of the device
	 * @param service External Push Notification Service Name
	 * @param deviceType {@link DeviceType}
	 * @param deviceId unique id of the device
	 * @return true if the request was sent to server successfully otherwise
	 *         false
	 */
	public boolean updateDeviceToken(String token, PushNotificationService service, DeviceType deviceType,
			String deviceId) {
		IQ iq = new IQ(IQType.SET);

		IQPushRegistration push = new IQPushRegistration(XMPPNamespace.PUSH_NAMESPACE);
		push.setDeviceToken(token);
		push.setService(service);
		push.setDeviceType(deviceType);
		push.setDeviceId(deviceId);

		iq.setContent(push);

		try {

			iq.setTo(new JID(Platform.getInstance().getDomain()));

		} catch (InvalidJabberId e) {
			// Swallow Exception
		}

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * 
	 */
	/**
	 * On log out Client app developer have to un register device token.
	 * 
	 * @param regId Registration Id of the device
	 * @param service External Push Notification Service Name
	 * @param deviceType {@link DeviceType}
	 * @param deviceId unique deviceId
	 * @return true if the opeartion was successful otherwise false
	 */
	public boolean discardDeviceToken(String regId, PushNotificationService service, DeviceType deviceType,
			String deviceId) {
		IQ iq = new IQ(IQType.SET);

		IQPushRegistration push = new IQPushRegistration(XMPPNamespace.PUSH_NAMESPACE);
		push.setDeviceId(deviceId);
		push.setDeviceToken(regId);
		push.setService(service);
		push.setDeviceType(deviceType);
		push.setRemoved(true);

		iq.setContent(push);

		try {

			iq.setTo(new JID(Platform.getInstance().getDomain()));

		} catch (InvalidJabberId e) {
			// Swallow Exception
		}

		return this.streamManager.sendPacketAsync(iq);
	}

	/**
	 * Returns all required attributes to register new user. if null is return
	 * their might be some problem while processing request.
	 * 
	 * Please refer In-Band Registration(XEP-0077)
	 * 
	 * @return {@link Set} of registration attributes
	 * @throws NetworkException if encounters any network related issues
	 * 
	 */
	public Set<String> getUserRegistrationAttributes() throws NetworkException {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.GET);

		try {
			iq.setTo(Platform.getInstance().getServerJID());
		} catch (Exception e) {
			// swallow exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.USER_REGISTER_NAMESPACE);
		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT && response.getContent() != null
						&& response.getContent().getType() == IQContentType.QUERY) {

					IQQuery resultQuery = (IQQuery) response.getContent();

					UserRegistrationData registrationData = resultQuery.getUserRegistrationData();

					if (registrationData != null) {

						if (registrationData.isRegistered()) {
							// TODO: raise error event that user is already
							// registered;

						} else {
							return registrationData.getUserRegistrationAttributes();
						}

					}

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to get User registration attributes  due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while getting user registration attributes " + e);
		}

		return null;

	}

	/**
	 * Register a new user
	 * 
	 * @param userName userName
	 * @param email email of the user
	 * @param password password of the user
	 * @param callback {@link Callback} instance
	 * @throws NetworkException if network related error occurred
	 */
	public void registerNewUser(final String userName, final String email, final String password,
			final Callback<String, String> callback) throws NetworkException {
		TaskExecutor.submit(new Runnable() {

			@Override
			public void run() {
				try {

					boolean registered = registerNewUser(userName, email, password);

					if (registered) {
						callback.onSuccess("Registraion completed successfully");

					} else {
						callback.onFailure("Registraion failed");
					}

				} catch (NetworkException e) {
					LOGGER.info("Netork exceptionduring registration...");
					callback.onFailure("Registraion failed due to Network issue");
				}

			}
		});
	}

	/**
	 * Uses it for In-Band User Registration and refer XEP-0077.
	 * 
	 * @param userName user name
	 * @param email email of the user
	 * @param password password of the user
	 * @return true if user is registered successfully.
	 * @throws NetworkException if network related error occurred
	 */
	public boolean registerNewUser(String userName, String email, String password) throws NetworkException {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.SET);

		try {
			iq.setTo(Platform.getInstance().getServerJID());

		} catch (Exception e) {
			// swallow exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.USER_REGISTER_NAMESPACE);
		UserRegistrationData userRegistrationnData = new UserRegistrationData();
		userRegistrationnData.setUserName(userName);
		userRegistrationnData.setPassword(password);
		userRegistrationnData.setEmail(email);

		query.setUserRegistrationData(userRegistrationnData);

		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {

					return true;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to register new user due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while registring new user " + e);
		}

		return false;
	}

	/**
	 * Use it change user login password and refer XEP-0077.
	 * 
	 * @param newPassword new password of the user
	 * @return true if password is changed successfully
	 */
	public boolean changePassword(String newPassword) {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.SET);

		try {

			iq.setTo(Platform.getInstance().getServerJID());

		} catch (Exception e) {
			// swallow exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.USER_REGISTER_NAMESPACE);
		UserRegistrationData userRegistrationData = new UserRegistrationData();
		userRegistrationData.setUserName(Platform.getInstance().getUserName());
		userRegistrationData.setPassword(newPassword);

		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {

					return true;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to register new user due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while registring new user " + e);
		}

		return false;
	}

	/**
	 * Use it deactivate logged in user account and refer XEP-0077.
	 * 
	 * @return true if the operation was successful otherwise false
	 */
	public boolean unRegisterUser() {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.SET);

		try {

			iq.setTo(Platform.getInstance().getServerJID());

		} catch (Exception e) {
			// swallow exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.USER_REGISTER_NAMESPACE);
		UserRegistrationData userData = new UserRegistrationData();
		userData.setRemove(true);

		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {

					return true;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to register new user due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while registring new user " + e);
		}

		return false;
	}

	/**
	 * It return logged in user's data. It refers XEP-0054(vcard-temp) to access
	 * user profile related data.
	 * 
	 * @return {@link UserProfileData} instance
	 */
	public UserProfileData getUserProfileData() {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.GET);

		IQVCardContent vcard = new IQVCardContent();
		iq.setContent(vcard);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {
					IQVCardContent responseVCard = (IQVCardContent) response.getContent();

					UserProfileData userProfileData = responseVCard.getUserData();
					userProfileData.setJabberId(Platform.getInstance().getUserJID());

					return userProfileData;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to get given user's vcard data due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while geting user vcard data " + e);
		}

		return null;

	}

	/**
	 * It return given user's data. It refers XEP-0054(vcard-temp) to access
	 * user profile related data.
	 * 
	 * @param userJID {@link JID} of the user
	 * @return {@link UserProfileData} instance
	 */
	public UserProfileData getUserProfileData(JID userJID) {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.GET);
		iq.setTo(userJID);

		IQVCardContent vcard = new IQVCardContent();
		iq.setContent(vcard);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {
					IQVCardContent responseVCard = (IQVCardContent) response.getContent();

					UserProfileData userProfileData = responseVCard.getUserData();
					userProfileData.setJabberId(userJID);

					return userProfileData;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to get given user's vcard data due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while geting user vcard data for user : " + userJID.getBareJID() + e);
		}

		return null;

	}

	/**
	 * Use it to update user profile data. If do not want to update any
	 * attribute then pass null on that attribute place.
	 * <p>
	 * We do not validate data. It's client responsibility to pass all details
	 * in correct way or format.
	 * </p>
	 * 
	 * @param firstName firstName of the user
	 * @param middleName middleName of the user
	 * @param lastName last name of the user
	 * @param nickName nickName if any
	 * @param email email of the user
	 * @param phone phone no of the user
	 * @param gender gender of the suer
	 * @param birthDay birthDate(dd-mm-yyyy)
	 * @param addressHome home address
	 * @param addressStreet Street address
	 * @param addressLocality locality
	 * @param addressCity City name
	 * @param addressState state
	 * @param addressCountry country
	 * @param addressPCode Postal code
	 * @param about brief about the user
	 * @return true if the operation was successful otherwise false
	 */
	public boolean updateUserProfileData(final String firstName, final String middleName, final String lastName,
			final String nickName, final String email, final String phone, final String gender, final String birthDay,
			final String addressHome, final String addressStreet, final String addressLocality,
			final String addressCity, final String addressState, final String addressCountry, final String addressPCode,
			final String about) {

		UserProfileData userProfileData = new UserProfileData();
		userProfileData.setFirstName(firstName);
		userProfileData.setMiddleName(middleName);
		userProfileData.setLastName(lastName);
		userProfileData.setNickName(nickName);
		userProfileData.setEmail(email);
		userProfileData.setPhone(phone);
		userProfileData.setGender(gender);
		userProfileData.setBday(birthDay);

		if (addressHome != null || addressStreet != null || addressLocality != null || addressCity != null
				|| addressState != null || addressCountry != null || addressPCode != null) {
			UserProfileData.Address address = userProfileData.new Address();

			address.setHome(addressHome);
			address.setStreet(addressStreet);
			address.setLocality(addressLocality);
			address.setCity(addressCity);
			address.setState(addressState);
			address.setCountry(addressCountry);
			address.setPcode(addressPCode);

			userProfileData.setAddress(address);
		}

		userProfileData.setDescription(about);

		return this.updateUserProfileData(userProfileData);
	}

	/**
	 * return true if user data is updated successfully. Please refer V-Card
	 * XEP-0054.
	 * 
	 * @param userProfileData {@link UserProfileData}
	 * @return true if the operation was successful otherwise false
	 */
	public boolean updateUserProfileData(UserProfileData userProfileData) {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.SET);

		IQVCardContent vcard = new IQVCardContent();
		vcard.setUserData(userProfileData);

		iq.setContent(vcard);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT) {

					return true;

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to update user's vcard data due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while updating user vcard data " + e);
		}

		return false;

	}

	/**
	 * User it to change user avatar.
	 * 
	 * <p>
	 * The image SHOULD use less than eight kilobytes (8k) of data; And it's
	 * height and width SHOULD be between thirty-two (32) and ninety-six (96)
	 * pixels; the recommended size is sixty-four (64) pixels high and
	 * sixty-four (64) pixels wide.
	 * </p>
	 * 
	 * <p>
	 * We Only verify total size of file which should be less than eight
	 * kilobytes (8k). and other verifications like height, width, pixels client
	 * have to do.
	 * </p>
	 * 
	 * Please refer XEP-0153: vCard-Based Avatars.
	 * 
	 * 
	 * @param file avtar file
	 * @return true if user avtar is changes successfully.
	 */
	public boolean changeUserAvatar(File file) {
		return changeUserAvatar(file, DEFAULT_USER_AVTAR_IMAGE_TYPE);
	}

	/**
	 * User it to change user avatar.
	 * 
	 * <p>
	 * The image SHOULD use less than eight kilobytes (8k) of data; And it's
	 * height and width SHOULD be between thirty-two (32) and ninety-six (96)
	 * pixels; the recommended size is sixty-four (64) pixels high and
	 * sixty-four (64) pixels wide.
	 * </p>
	 * 
	 * <p>
	 * We Only verify total size of file which should be less than eight
	 * kilobytes (8k). and other verifications like height, width, pixels client
	 * have to do.
	 * </p>
	 * 
	 * Please refer XEP-0153: vCard-Based Avatars.
	 * 
	 * 
	 * @param url url of the user avtar image
	 * @return true if user avtar is changes successfully.
	 */
	public boolean changeUserAvatar(URL url) {
		final String path = url.getPath();
		final File file = new File(path);

		return changeUserAvatar(file);
	}

	/**
	 * User it to change user avatar.
	 * 
	 * <p>
	 * The image SHOULD use less than eight kilobytes (8k) of data; And it's
	 * height and width SHOULD be between thirty-two (32) and ninety-six (96)
	 * pixels; the recommended size is sixty-four (64) pixels high and
	 * sixty-four (64) pixels wide.
	 * </p>
	 * 
	 * <p>
	 * We Only verify total size of file which should be less than eight
	 * kilobytes (8k). and other verifications like height, width, pixels client
	 * have to do.
	 * </p>
	 * 
	 * Please refer XEP-0153: vCard-Based Avatars.
	 * 
	 * @param url Avtar image url
	 * @param imageType ContyentType of the image
	 * @return true if user avtar is changes successfully.
	 */
	public boolean changeUserAvatar(URL url, String imageType) {
		final String path = url.getPath();
		final File file = new File(path);

		return changeUserAvatar(file, imageType);
	}

	/**
	 * User it to change user avatar.
	 * 
	 * <p>
	 * The image SHOULD use less than eight kilobytes (8k) of data; And it's
	 * height and width SHOULD be between thirty-two (32) and ninety-six (96)
	 * pixels; the recommended size is sixty-four (64) pixels high and
	 * sixty-four (64) pixels wide.
	 * </p>
	 * 
	 * <p>
	 * We Only verify total size of file which should be less than eight
	 * kilobytes (8k). and other verifications like height, width, pixels client
	 * have to do.
	 * </p>
	 * 
	 * Please refer XEP-0153: vCard-Based Avatars.
	 * 
	 * @param file Avtar file
	 * @param imageType content type of the file
	 * @return true if user avtar is changes successfully.
	 */
	public boolean changeUserAvatar(final File file, final String imageType) {
		boolean validAvtar = validateAvtar(file);

		if (!validAvtar) {
			LOGGER.fine("Avtar file size : " + file.length());
			LOGGER.log(Level.WARNING, "Avtar is not a valid avtar");
			return false;
		}

		byte[] bytes = new byte[0];

		try {

			bytes = FileUtil.getFileBytes(file);

		} catch (IOException e) {
			LOGGER.log(Level.FINE, "Error getting bytes from File: " + file, e);

			return false;
		}

		boolean changed = updateUserAvatar(Base64.getEncoder().encodeToString(bytes), imageType);

		if (changed) {
			try {

				final String sha1Hash = HashGenerationUtils.generateSHA1Hash(file);
				broadcastAvtarChangePresence(sha1Hash);

			} catch (Exception e) {
				LOGGER.warning("Failed to generate SHA-1 has of avtar" + e);
			}
		}

		return changed;
	}

	private void broadcastAvtarChangePresence(String sha1Hash) {
		Presence presence = new Presence();
		presence.setVCardUpdate(true);
		presence.setPhotoUpdate(true);
		presence.setPhotoSHA1Hash(sha1Hash);

		this.streamManager.sendPacketAsync(presence);
	}

	/**
	 * It validate user Avtar file size
	 * 
	 * @param file {@link File} object of the Avtar
	 * @return true if it was OK
	 */
	private boolean validateAvtar(File file) {
		if (file != null) {
			return file.length() < USER_AVTAR_MAX_SIZE;
		}

		return false;
	}

	/**
	 * Wrap base64 encoded image and image type in {@link UserAvtar} and send
	 * {@link #updateUserProfileData(UserProfileData)} request. Please refer
	 * XEP-0153: vCard-Based Avatars.
	 * 
	 * @param base64EncodedImage
	 * @param imageType
	 * @return true if avtar is updated successfully.
	 */
	private boolean updateUserAvatar(String base64EncodedImage, String imageType) {
		UserProfileData userData = new UserProfileData();
		UserAvtar avtar = userData.new UserAvtar(base64EncodedImage, imageType);

		userData.setAvtar(avtar);

		return updateUserProfileData(userData);
	}

	/**
	 * Use it to remove user avatar.
	 * 
	 * Please refer XEP-0153: vCard-Based Avatars.
	 * 
	 * @return true if avtar was removed successfully
	 * 
	 */
	public boolean removeUserAvatar() {
		boolean removed = updateUserAvatar("", "");

		if (removed) {
			broadcastAvtarChangePresence(null);
		}

		return removed;
	}

	/**
	 * It Returns all server supported attributes for searching a user.
	 * <p>
	 * Please refer XEP-0055.
	 * </p>
	 * 
	 * @return user search attributes
	 */
	public Set<String> getUserSearchAttributes() {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.GET);

		try {

			iq.setTo(Platform.getInstance().getJabberSearchServiceJID());

		} catch (Exception e) {
			// swallow exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.JABBER_SEARCH_NAMESPACE);
		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT && response.getContent() != null
						&& response.getContent().getType() == IQContentType.QUERY) {

					IQQuery resultQuery = (IQQuery) response.getContent();

					UserSearchData userSearchData = resultQuery.getUserSearchData();

					if (userSearchData != null) {
						return userSearchData.getUserSearchAttributes();

					}

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to get User search attributes  due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while getting user search attributes " + e);
		}

		return null;
	}

	/**
	 * This method returns list of matched users. return null if no user match
	 * found with searching details.
	 * <p>
	 * Please refer XEP-0055.
	 * </p>
	 * 
	 * @param firstName firstName of the user
	 * @param lastName lastName of the user
	 * @param nickName nickName of the user
	 * @param email email of the user
	 * @return list of matched users. return null if no user match found with
	 *         searching details.
	 */
	public List<Item> searchUser(String firstName, String lastName, String nickName, String email) {
		String corrId = this.responseCorrelator.getCorrelationId();

		IQ iq = new IQ(corrId, IQType.SET);

		try {

			iq.setTo(Platform.getInstance().getJabberSearchServiceJID());

		} catch (Exception e) {
			// swallow exception
		}

		IQQuery query = new IQQuery(XMPPNamespace.JABBER_SEARCH_NAMESPACE);

		UserSearchData userSearchData = new UserSearchData();

		Map<String, String> map = new HashMap<>();

		if (!StringUtils.isNullOrEmpty(firstName)) {
			map.put(FIRST, firstName);
		}

		if (!StringUtils.isNullOrEmpty(lastName)) {
			map.put(LAST, lastName);
		}

		if (!StringUtils.isNullOrEmpty(nickName)) {
			map.put(NICK, nickName);
		}

		if (!StringUtils.isNullOrEmpty(email)) {
			map.put(EMAIL, email);
		}

		userSearchData.setSearchRequestData(map);

		query.setUserSearchData(userSearchData);

		iq.setContent(query);

		this.streamManager.sendPacketAsync(iq);

		try {
			Packet packet = this.responseCorrelator.getCorrelatedResponse(corrId);

			if (packet instanceof IQ) {
				IQ response = (IQ) packet;

				if (response.getType() == IQType.RESULT && response.getContent() != null
						&& response.getContent().getType() == IQContentType.QUERY) {

					IQQuery resultQuery = (IQQuery) response.getContent();

					UserSearchData resultUserSearchData = resultQuery.getUserSearchData();

					if (resultUserSearchData != null) {
						return resultUserSearchData.getSearchedItems();

					}

				} else if (response.getType() == IQType.ERROR) {
					LOGGER.warning("Failed to get searching user due to \n error Message : "
							+ response.getError().getErrorXMl());
				}
			}

		} catch (TimeoutException e) {
			LOGGER.warning("Time out exception while searching user " + e);
		}

		return null;
	}

	/**
	 * This method returns list of matched users. return null if no user match
	 * found with searching details.
	 * <p>
	 * Please refer XEP-0055.
	 * </p>
	 * 
	 * @param firstName firstName of the user
	 * @return {@link List} of users matching the search criteria
	 */
	public List<Item> searchUserWithFirstName(String firstName) {
		return this.searchUser(firstName, null, null, null);
	}

	/**
	 * This method returns list of matched users. return null if no user match
	 * found with searching details.
	 * <p>
	 * Please refer XEP-0055.
	 * </p>
	 * 
	 * @param lastName lastName
	 * @return {@link List} of users matching the search criteria
	 */
	public List<Item> searchUserWithLastName(String lastName) {
		return this.searchUser(null, lastName, null, null);
	}

	/**
	 * This method returns list of matched users. return null if no user match
	 * found with searching details.
	 * <p>
	 * Please refer XEP-0055.
	 * </p>
	 * 
	 * @param nickName nickName
	 * @return {@link List} of users matching the search criteria
	 */
	public List<Item> searchUserWithNickName(String nickName) {
		return this.searchUser(null, null, nickName, null);
	}

	/**
	 * This method returns list of matched users. return null if no user match
	 * found with searching details.
	 * <p>
	 * Please refer XEP-0055.
	 * </p>
	 * 
	 * @param email email of the user
	 * @return {@link List} of users matching the search criteria
	 */
	public List<Item> searchUserWithEmail(String email) {
		return this.searchUser(null, null, null, email);
	}

	@Override
	public void collect(Packet packet) {
		forwardPacket(packet);
	}

}
