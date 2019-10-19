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
package abs.ixi.client.io;

import static abs.ixi.client.core.ProtocolFactory.xmppProtocolInstance;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.Platform;
import abs.ixi.client.Session;
import abs.ixi.client.core.AbstractPacketForwarder;
import abs.ixi.client.core.Packet;
import abs.ixi.client.core.PacketCollector;
import abs.ixi.client.core.event.Event.EventType;
import abs.ixi.client.io.StreamNegotiator.NegotiationError;
import abs.ixi.client.io.StreamNegotiator.NegotiationResult;
import abs.ixi.client.net.ConnectionManager;
import abs.ixi.client.net.NetworkException;
import abs.ixi.client.net.XMPPConnection;
import abs.ixi.client.util.CollectionUtils;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.StreamContext;
import abs.ixi.client.xmpp.StreamResumed;
import abs.ixi.client.xmpp.StreamState;
import abs.ixi.client.xmpp.XMPPNamespace;
import abs.ixi.client.xmpp.packet.AckPacket;
import abs.ixi.client.xmpp.packet.AckRequestPacket;
import abs.ixi.client.xmpp.packet.IQ;
import abs.ixi.client.xmpp.packet.IQ.IQType;
import abs.ixi.client.xmpp.packet.IQContent.IQContentType;
import abs.ixi.client.xmpp.packet.IQQuery;
import abs.ixi.client.xmpp.packet.Presence;
import abs.ixi.client.xmpp.packet.Presence.PresenceType;
import abs.ixi.client.xmpp.packet.Stanza;
import abs.ixi.client.xmpp.packet.StreamHeader;
import abs.ixi.client.xmpp.packet.XMPPError;

/**
 * {@code XMPPStreamManager} is responsible for managing XMPP stream with
 * server. It governs the overall stream and hence the communication with
 * server. Being a central entity, all the inbound and outbound packets pass
 * through it.
 *
 * @author Yogi
 *
 */
public class XMPPStreamManager extends AbstractPacketForwarder implements PacketCollector, XMPPStream {
	private static final Logger LOGGER = Logger.getLogger(XMPPStreamManager.class.getName());

	/**
	 * Underlying XMPP Connection
	 */
	private XMPPConnection connection;

	/**
	 * {@link StreamContext} instance
	 */
	private StreamContext streamContext;

	/**
	 * Packet Reader
	 */
	private Reader reader;

	/**
	 * Packet Writer instance
	 */
	private Writer writer;

	/**
	 * Instantiate {@code XMPPStreamManager} with given {@link XMPPConnection}.
	 * The assumption is that supplied connection will be already connected to
	 * the remote server.
	 *
	 * @param connection underlying connection
	 */
	public XMPPStreamManager(XMPPConnection connection) {
		this.connection = connection;
		this.connection.setXmppStream(this);

		this.streamContext = xmppProtocolInstance().getStreamContext();

		this.writer = new XMPPPacketWriter(connection);
		this.reader = new XMPPPacketReader(connection);

		this.reader.addPacketCollector(this);
		this.addPacketCollector(AckPacket.class, (PacketCollector) this.writer);
		this.addPacketCollector(StreamResumed.class, (PacketCollector) this.writer);

		ConnectionManager.getInstance().registerConnectionStateObserver(this);
	}

	/**
	 * Start a stream with server for the first time. If the stream is already
	 * open, it should be restarted. While the stream negotiations are in
	 * progress, <i>negotiating</i> flag is turned on.
	 *
	 * @param userName userName
	 * @param pwd pwd
	 * @param domain domain
	 * @return NegotiationResult NegotiationResult
	 * @throws NetworkException NetworkException
	 */
	public synchronized NegotiationResult startStream(String userName, String pwd, String domain)
			throws NetworkException {

		try {
			ConnectionManager.getInstance().connectXMPPConnection(true);

			StreamNegotiator negotiator = new StreamNegotiator(this.streamContext, this.writer, this.reader);
			NegotiationResult result = negotiator.negotiateStream(new JID(userName, domain), pwd, domain);

			if (result.isSuccess()) {
				this.sendInitialPresence();
				this.writer.start();
				Platform.raiseEvent(EventType.STREAM_START, null);
			}

			return result;

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Caught Exception ", e);
			ConnectionManager.getInstance().closeXMPPConnection(true);
			throw e;
		}
	}

	@Override
	public synchronized NegotiationResult restartStream() throws NetworkException {
		try {

			StreamNegotiator negotiator = new StreamNegotiator(this.streamContext, this.writer, this.reader);

			String passwd = Platform.getInstance().getUserSession().get(Session.KEY_USER_PASSWORD).toString();
			NegotiationResult result = negotiator.negotiateStream(Platform.getInstance().getUserJID(), passwd,
					Platform.getInstance().getDomain());

			if (result.isSuccess()) {
				sendInitialPresence();
				Platform.raiseEvent(EventType.STREAM_RESTART, null);
			}

			return result;

		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Unexpected exception while restarting stream", e);
			// TODO Raise an event so that applications can handle it and take
			// appropriate action; this will also initiate a re-negotiation loop
			return new NegotiationResult(true, NegotiationError.AUTHENTICATION_FAILED);
		}
	}

	/**
	 * Initial presence is the trigger for server to send undelivered packets
	 * for this user. Initial presence must be the first user-level packet to be
	 * sent to server after stream negotiation.
	 */
	private void sendInitialPresence() {
		Presence presence = new Presence();
		presence.setInitialPresence(true);
		presence.setFrom((JID) Platform.getInstance().getUserSession().get(Session.KEY_USER_JID));
		this.writer.writeNextAsync(presence);
	}

	@Override
	public void collect(Packet packet) {
		try {
			if (streamContext.getState() == StreamState.UNKNOWN) {
				LOGGER.severe("Stream state is UNKNOWN");

			} else if (this.streamContext.getState() == StreamState.INITIATED && packet instanceof IQ) {
				forwardPacket(packet);

			} else if (packet instanceof StreamResumed) {
				this.forwardPacket(packet);

			} else if (streamContext.getState() == StreamState.OPEN) {
				this.forwardPacket(packet);

				if (packet.isStanza() && this.streamContext.isSmEnabled()) {
					Stanza stanza = ((Stanza) packet);
					LOGGER.fine("Received Stanza : {} " + stanza.xml());
					// TODO: For now not sending ack for ping iq. later we need
					// to remove this check.

					LOGGER.fine("Before sending ack handledStanza count " + this.streamContext.getHandledStanzaCount());

					if (packet instanceof IQ) {
						IQ iq = (IQ) packet;
						if (iq.getContent() != null && iq.getContent().getType() == IQContentType.PING) {
							LOGGER.fine("Acking is escaped for stanza : " + stanza.xml());

						} else {
							this.streamContext.increaseHandledStanzaCount();
							LOGGER.fine("Sending Ack : " + this.streamContext.getHandledStanzaCount() + " for stanza : "
									+ stanza.xml());
							sendAck();
						}
					} else {
						this.streamContext.increaseHandledStanzaCount();
						LOGGER.fine("Sending Ack : " + this.streamContext.getHandledStanzaCount() + " for stanza : "
								+ stanza.xml());
						sendAck();
					}
				}

				if (packet instanceof Presence) {
					Presence presence = (Presence) packet;

					if (presence.getType() == PresenceType.ERROR) {
						Platform.raiseEvent(EventType.ERROR, presence.getError());

					} else {
						if (presence.isMuc()) {
							if (presence.getChatRoom() != null) {
								Platform.raiseEvent(EventType.CHAT_ROOM_RECEIVE, Arrays.asList(presence.getChatRoom()));
							}
						}
					}

				} else if (packet instanceof IQ) {
					IQ iq = (IQ) packet;

					if (iq.getContent() == null) {
						return;

					} else if (iq.getContent().getType() == IQContentType.QUERY) {
						IQQuery query = (IQQuery) iq.getContent();

						if (StringUtils.safeEquals(XMPPNamespace.ROSTER_NAMESPACE, query.getXmlns(), false)) {

							if (IQType.RESULT == iq.getType()) {
								Platform.raiseEvent(EventType.ROSTER_RECEIVE, query.getRoster());

							} else if (IQType.SET == iq.getType()) {
								Platform.raiseEvent(EventType.ROSTER_UPDATE, query.getRoster());
							}

						} else if (StringUtils.safeEquals(XMPPNamespace.DISCO_NAMESPACE, query.getXmlns(), false)
								|| StringUtils.safeEquals(XMPPNamespace.INFO_NAMESPACE, query.getXmlns(), false)) {
							if (!CollectionUtils.isNullOrEmpty(query.getChatRooms())) {
								Platform.raiseEvent(EventType.CHAT_ROOM_RECEIVE, query.getChatRooms());
							}

						} else if (StringUtils.safeEquals(XMPPNamespace.STRINGFLOW_MEDIA_NAMESPACE, query.getXmlns(),
								false)) {
							if (iq.getType() == IQType.ERROR) {
								Platform.raiseEvent(EventType.MEDIA_RETRIVAL_FAILED, query.getMediaId());

							} else if (iq.getType() == IQType.RESULT) {
								Platform.raiseEvent(EventType.MEDIA_RETRIVAL_PRCESSESED, query.getMediaId());
							}
						}

					} else if (iq.getContent().getType() == IQContentType.PING) {
						IQ pongIQ = new IQ(IQType.RESULT);
						pongIQ.setId(iq.getId());
						pongIQ.setFrom(Platform.getInstance().getUserJID());
						pongIQ.setTo(Platform.getInstance().getServerJID());

						this.sendPacketAsync(pongIQ);
					}

				} else if (packet instanceof StreamHeader) {
					StreamHeader header = (StreamHeader) packet;

					if (header.isCloseStream()) {
						this.closeStream();
					} else {
						LOGGER.severe("Received header without close; failed to process");
					}

				} else if (packet instanceof AckRequestPacket) {
					sendAck();

				} else if (packet instanceof XMPPError) {
					// TODO: Report this error To user.

					// Behind this packet their will be Close Stream Packet.
					// That will close this connection.
				}
			}

		} catch (Exception e) {
			LOGGER.log(Level.FINE, "Failed to handle packet due to some exception", e);
		}
	}

	/**
	 * Send an ACK packet to server
	 * 
	 * @throws NetworkException if there is any network related error
	 */
	private void sendAck() throws NetworkException {
		if (streamContext.isSmEnabled()) {
			AckPacket ack = new AckPacket(XMPPNamespace.SM_NAMESPACE, this.streamContext.getHandledStanzaCount());
			this.sendPacketSync(ack);
		}
	}

	/**
	 * Send stanza packet to server; Stanza packets are delivered to server
	 * asynchronously.This methos simply adds the stanza to Writer queue and
	 * Writer thread will write the stanza whenver stream is ready
	 * 
	 * @param stanza packet which will be written on the wire
	 * @return if the packet is a stanza packet, a true value indicates that the
	 *         packet was added to the queue and a false value indicates that
	 *         the queue was full and the packet could not be added to the
	 *         queue.
	 */
	public boolean sendPacketAsync(Stanza stanza) {
		return this.writer.writeAsync(stanza);
	}

	/**
	 * Send a packet to server synchronously. The packet is not queued in
	 * writer's queue instead written to the connection directly.
	 * 
	 * @param packet packet to be sent
	 * @throws NetworkException if an IO error occurrs
	 */
	synchronized void sendPacketSync(Packet packet) throws NetworkException {
		this.writer.writeSync(packet);
	}

	public void closeStream() throws NetworkException {
		if (this.streamContext.isSmEnabled()) {
			AckPacket ack = new AckPacket(XMPPNamespace.SM_NAMESPACE, this.streamContext.getHandledStanzaCount());
			this.sendPacketSync(ack);
		}

		sendPacketSync(new StreamHeader(true));
	}

	@Override
	public void closed() {
		this.resetStream();
	}

	@Override
	public void resetStream() {
		if (isStreamResumable()) {
			this.streamContext.reset(false);

		} else {
			this.streamContext.reset(true);
		}
	}

	/**
	 * Check if the stream is resumable
	 * 
	 * @return true if the stream is resumable otherwise false
	 */
	private boolean isStreamResumable() {
		return (System.currentTimeMillis() - this.connection.getLastActivity()) > this.streamContext
				.getMaxResumptionTimeInSecs() * 1000;
	}

	/**
	 * Initiate stream manager shutdown sequence. During stream manager
	 * shutdown, an attemp is made to gracefully close the ongoing stream with
	 * server. Further, {@link StreamContext} state is reset, {@link Reader} and
	 * {@link Writer} are shutdown.
	 */
	public synchronized void shutdown() {
		try {
			this.closeStream();
		} catch (NetworkException e1) {
			LOGGER.warning("Failed to close stream gracefully due to network error");
		}

		try {
			this.reader.stop();
			this.writer.shutdown();
			this.streamContext = new StreamContext();

		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Exception caught during stream manager shutdown", e);
			// Swallow exception
		}
	}

}
