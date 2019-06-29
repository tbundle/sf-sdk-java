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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.core.AbstractPacketForwarder;
import abs.ixi.client.core.Callback;
import abs.ixi.client.core.InitializationErrorException;
import abs.ixi.client.core.Packet;
import abs.ixi.client.core.PacketCollector;
import abs.ixi.client.core.event.Event.EventType;
import abs.ixi.client.file.sfcm.ContentType;
import abs.ixi.client.file.sfcm.FileInstanceSupplier;
import abs.ixi.client.file.sfcm.FileTransfer;
import abs.ixi.client.file.sfcm.FileTransfer.FailureReason;
import abs.ixi.client.file.sfcm.FileTransferDisabledException;
import abs.ixi.client.file.sfcm.FileTransferFuture;
import abs.ixi.client.file.sfcm.FileTransferManager;
import abs.ixi.client.file.sfcm.InboundFileTransferFilter;
import abs.ixi.client.io.XMPPStreamManager;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.util.UUIDGenerator;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.XMPPNamespace;
import abs.ixi.client.xmpp.packet.CMAcknowledged;
import abs.ixi.client.xmpp.packet.CMDisplayed;
import abs.ixi.client.xmpp.packet.CMMarkable;
import abs.ixi.client.xmpp.packet.CMReceived;
import abs.ixi.client.xmpp.packet.CSNActive;
import abs.ixi.client.xmpp.packet.CSNComposing;
import abs.ixi.client.xmpp.packet.CSNGone;
import abs.ixi.client.xmpp.packet.CSNInactive;
import abs.ixi.client.xmpp.packet.CSNPaused;
import abs.ixi.client.xmpp.packet.ChatRoom;
import abs.ixi.client.xmpp.packet.MDRReceived;
import abs.ixi.client.xmpp.packet.MDRRequest;
import abs.ixi.client.xmpp.packet.Message;
import abs.ixi.client.xmpp.packet.Message.MessageType;
import abs.ixi.client.xmpp.packet.MessageBody;
import abs.ixi.client.xmpp.packet.MessageContent;
import abs.ixi.client.xmpp.packet.MessageContent.MessageContentType;
import abs.ixi.client.xmpp.packet.MessageMedia;
import abs.ixi.client.xmpp.packet.MessageThread;

/**
 * {@code ChatManager} manages user conversations. {@code ChatManager} uses
 * {@linkplain XMPPStreamManager} to manage xmpp stream with remote server. It
 * is important to note that a {@link XMPPStreamManager} can manage a single
 * stream at a time.
 * <p>
 * There is no synchronous interface available for {@code ChatManager} as
 * messaging services are inherently asynchronous.
 * </p>
 */
public class ChatManager extends AbstractPacketForwarder implements PacketCollector {
	private static final Logger LOGGER = Logger.getLogger(ChatManager.class.getName());

	/**
	 * {@link XMPPStreamManager} instance
	 */
	private XMPPStreamManager streamManager;

	/**
	 * {@link FileTransferManager} is a Singleton by design; hold the instance
	 * for convinience
	 */
	private FileTransferManager fileTransferManager;

	public ChatManager(XMPPStreamManager streamManager) {
		this.streamManager = streamManager;
		this.streamManager.addPacketCollector(Message.class, this);
		this.fileTransferManager = FileTransferManager.getInstance();
	}

	/**
	 * By default, file transfer is not enabled for a chat conversation. If a
	 * file is sent when file transfer is disabled,
	 * {@link FileTransferDisabledException} will be thrown; and if a file is
	 * received when file transfer is disbled for SDK, the file received request
	 * will be ignored silently.
	 * <p>
	 * As part of {@link FileTransfer} processing, {@link FileTransferManager}
	 * writes file on to the disk. In order to write the file, a {@link File}
	 * instance is required which is injected through
	 * {@link FileInstanceSupplier}
	 * </p>
	 * 
	 * @param fileSupplier {@link FileInstanceSupplier} implementation to supply
	 *            {@link File} instance
	 * @throws InitializationErrorException if the {@link FileTransferManager}
	 *             Initialisation fails
	 */
	public void enableFileTransfer(FileInstanceSupplier fileSupplier) throws InitializationErrorException {
		this.fileTransferManager.setXmppStreamManager(this.streamManager);
		this.fileTransferManager.setFileSupplier(fileSupplier);

		this.fileTransferManager.init();
	}

	/**
	 * By default, file transfer is not enabled for a chat conversation. If a
	 * file is sent when file transfer is disabled,
	 * {@link FileTransferDisabledException} will be thrown; and if a file is
	 * received when file transfer is disbled for SDK, the file received request
	 * will be ignored silently.
	 * <p>
	 * As part of {@link FileTransfer} processing, {@link FileTransferManager}
	 * writes file on to the disk. In order to write the file, a {@link File}
	 * instance is required which is injected through
	 * {@link FileInstanceSupplier}
	 * </p>
	 * 
	 * @param filter {@link InboundFileTransferFilter} implementation which is
	 *            used to accept/reject {@link FileTransfer}s
	 * @param fileSupplier {@link FileInstanceSupplier} implementation to supply
	 *            {@link File} instance
	 * @throws InitializationErrorException if the {@link FileTransferManager}
	 *             initialization fails
	 */
	public void enableFileTransfer(InboundFileTransferFilter filter, FileInstanceSupplier fileSupplier)
			throws InitializationErrorException {
		this.fileTransferManager.setFileSupplier(fileSupplier);
		this.fileTransferManager.setFileReceiveRequestFilter(filter);

		this.fileTransferManager.init();
	}

	/**
	 * Download a file for which a {@link Message} with media content has been
	 * received.
	 * 
	 * @param from {@link JID} of the sender
	 * @param fileId unique id of the file; this is received in {@link Message}
	 * @param contentType content type of the file; received in {@link Message}
	 * @param callback instance from client which will be invoked with the
	 *            result of file download
	 */
	public void downloadFile(JID from, String fileId, ContentType contentType, Callback<File, FailureReason> callback) {
		if (this.fileTransferManager.isInitialized()) {
			this.fileTransferManager.transferFileInbound(from, fileId, contentType, callback);
		} else {
			throw new FileTransferDisabledException();
		}
	}

	/**
	 * Download a file for which a {@link Message} with media content has been
	 * received.
	 * 
	 * @param from {@link JID} of the sender
	 * @param fileId unique id of the file; this is received in {@link Message}
	 * @param contentType content type of the file; received in {@link Message}
	 * @return {@link FileTransferFuture}
	 */
	public FileTransferFuture downloadFile(JID from, String fileId, ContentType contentType) {
		if (this.fileTransferManager.isInitialized()) {
			return this.fileTransferManager.transferFileInbound(from, fileId, contentType);
		} else {
			throw new FileTransferDisabledException();
		}
	}

	/**
	 * Upload a file on to server
	 * 
	 * @param mediaId Id for media message
	 * @param file {@link File} object of media
	 * @param contentType {@link ContentType} of media file
	 * @param to {@link JID} of media message receiver
	 * @param callback callback to know file transfer status
	 */
	public void uploadFile(String mediaId, final File file, ContentType contentType, final JID to,
			final Callback<String, FailureReason> callback) {

		LOGGER.fine("uploading media for mediaId : " + mediaId);

		if (this.fileTransferManager.isInitialized()) {
			FileTransferManager.getInstance().transferFileOutbound(mediaId, file, contentType, to, callback);

		} else {
			throw new FileTransferDisabledException();
		}

	}

	/**
	 * Convenience method to send a text message to a {@link JID}. A
	 * {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection.
	 * 
	 * @param messageId unique id of the message
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @return true if the message was handed over to writer otherwise false
	 */
	public boolean say(String messageId, String text, JID to) {
		return this.say(messageId, text, to, false);
	}

	/**
	 * A {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group.
	 * 
	 * @param messageId uniqueId of the message packet
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @param isGroup true if messages being sent to a group' otherwise false
	 * @return true if the message was queued up in writer queue otherwise false
	 */
	public boolean say(String messageId, String text, JID to, boolean isGroup) {
		MessageBody body = new MessageBody(text);
		Message msg = new Message(messageId);
		msg.addContent(body);
		msg.setTo(to);

		if (isGroup) {
			msg.setType(MessageType.GROUP_CHAT);
		}

		return this.send(msg);
	}

	/**
	 * A {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group. And a true value for flag 'isMarkable' indicates that
	 * this message is intended to get delivery and read receipt according to
	 * XEP-0333(Chat-Markers).
	 * 
	 * @param messageId uniqueId of the message packet
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @param isGroup true if messages being sent to a group otherwise false
	 * @param isMarkable true for getting delivery and read receipt
	 * @return true if the message was queued up in writer queue successfully
	 *         otherwise false
	 */
	public boolean say(String messageId, String text, JID to, boolean isGroup, boolean isMarkable) {
		return this.sendMarkableMessage(messageId, text, to, isGroup);
	}

	/**
	 * A {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group. And a true value for flag 'isMarkable' indicates that
	 * this message is intended to get delivery and read receipt according to
	 * XEP-0333(Chat-Markers).
	 * 
	 * @param conversationId conversationId
	 * @param messageId uniqueId of the message packet
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @param isGroup true if messages being sent to a group otherwise false
	 * @param isMarkable true for getting delivery and read receipt.
	 * @return true if the message was queued up in writer queue successfully
	 *         otherwise false
	 */
	public boolean say(String conversationId, String messageId, String text, JID to, boolean isGroup,
			boolean isMarkable) {
		return this.sendMarkableMessage(conversationId, messageId, text, to, isGroup);
	}

	/**
	 * A {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group.And this * message is intended to get delivery and read
	 * receipt according to XEP-0333(Chat-Markers).
	 * 
	 * @param messageId uniqueId of the message packet
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @param isGroup true if messages being sent to a group' otherwise false
	 * @return true if the message was queued up in writer queue successfully
	 *         otherwise false
	 */
	public boolean sendMarkableMessage(String messageId, String text, JID to, boolean isGroup) {
		return this.sendTextMessage(null, messageId, text, to, isGroup, true, false, false);
	}

	/**
	 * A {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group.And this * message is intended to get delivery and read
	 * receipt according to XEP-0333(Chat-Markers).
	 * 
	 * @param conversationId uniqueId for conversation
	 * @param messageId uniqueId of the message packet
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @param isGroup true if messages being sent to a group' otherwise false
	 * @return true if the message was queued up in writer queue successfully
	 *         otherwise false
	 */
	public boolean sendMarkableMessage(String conversationId, String messageId, String text, JID to, boolean isGroup) {
		return this.sendTextMessage(conversationId, messageId, text, to, isGroup, true, false, false);
	}

	/**
	 * A {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group.And this * message is intended to get delivery and read
	 * receipt according to XEP-0333(Chat-Markers).
	 * 
	 * @param messageId uniqueId of the message
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @param isGroup true if messages being sent to a group' otherwise false
	 * @return true if the message was queued up in writer queue successfully
	 *         otherwise false
	 */
	public boolean sendMarkableMessageWithCSN(String messageId, String text, JID to, boolean isGroup) {
		return this.sendTextMessage(null, messageId, text, to, isGroup, true, false, true);
	}

	/**
	 * A {@link Message} packet is created with the given text and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group.And this * message is intended to get delivery and read
	 * receipt according to XEP-0333(Chat-Markers).
	 * 
	 * @param conversationId conversationId
	 * @param messageId uniqueId of the message
	 * @param text raw text to be sent to server within a message packet
	 * @param to receiver {@link JID}
	 * @param isGroup true if messages being sent to a group' otherwise false
	 * @return true if the message was queued up in writer queue successfully
	 *         otherwise false
	 */
	public boolean sendMarkableMessageWithCSN(String conversationId, String messageId, String text, JID to,
			boolean isGroup) {
		return this.sendTextMessage(conversationId, messageId, text, to, isGroup, true, false, true);
	}

	/**
	 * A {@link Message} packet is created with the given mediaId and sent to
	 * {@link XMPPStreamManager} which writes it on the underlying connection. A
	 * true value for flag 'isGroup' indicates that messages is intended to be
	 * sent to a group.
	 * 
	 * @param conversationId conversationId
	 * @param messageId messageId
	 * @param contentType contentType of the file being sent
	 * @param mediaThumb Base64 encoded media thumb
	 * @param toJID receiver {@link JID}
	 * @param isGroup true if messages being sent to a group' otherwise false
	 * @param isMarkable is Need Chat Markers (XEP-0333)
	 * @param isMDRSupported isMDRSupported
	 * @param isCSNSupported isCSNSupported
	 * @return true if the message was queued up in writer queue otherwise false
	 */
	public boolean sendMediaMessage(String conversationId, String messageId, ContentType contentType, String mediaThumb,
			JID toJID, boolean isGroup, boolean isMarkable, boolean isMDRSupported, boolean isCSNSupported) {
		LOGGER.fine("Sending Text Message for media send request for messageId : " + messageId);

		Message msg = new Message(messageId);
		msg.setTo(toJID);

		if (isGroup) {
			msg.setType(MessageType.GROUP_CHAT);
		}

		if (!StringUtils.isNullOrEmpty(conversationId)) {
			MessageThread thread = new MessageThread(conversationId);

			msg.addContent(thread);
		}

		MessageMedia media = new MessageMedia(messageId);
		media.setContentType(contentType);
		media.setThumb(mediaThumb);

		msg.addContent(media);

		if (isMarkable) {
			CMMarkable markable = new CMMarkable(XMPPNamespace.CHAT_MARKER_NAMESPACE);

			msg.addContent(markable);
		}

		if (isMDRSupported) {
			MDRRequest mdrRequest = new MDRRequest(XMPPNamespace.MESSAGE_DELIVERY_RECEIPTS_NAMESPACE);

			msg.addContent(mdrRequest);
		}

		if (isCSNSupported) {
			CSNActive active = new CSNActive(XMPPNamespace.CHAT_STATE_NOTIFICATION);

			msg.addContent(active);
		}

		return this.send(msg);
	}

	/**
	 * Send a message
	 * 
	 * @param conversationId conversationId
	 * @param messageId messageId
	 * @param text message text
	 * @param to receiver {@link JID}
	 * @param isGroup true if the message is sent to a group
	 * @param isMarkable is Need Chat Markers (XEP-0333)
	 * @param isMDRSupported isMDRSupported
	 * @param isCSNSupported is support Chat State Notification (XEP-0085)
	 * @return true if the message was queued up in writer queue for delivery
	 *         otherwise false
	 */
	public boolean sendTextMessage(String conversationId, String messageId, String text, JID to, boolean isGroup,
			boolean isMarkable, boolean isMDRSupported, boolean isCSNSupported) {
		Message msg = new Message(messageId);
		msg.setTo(to);

		MessageBody body = new MessageBody(text);
		msg.addContent(body);

		if (!StringUtils.isNullOrEmpty(conversationId)) {
			MessageThread thread = new MessageThread(conversationId);
			msg.addContent(thread);
		}

		if (isMarkable) {
			CMMarkable markable = new CMMarkable(XMPPNamespace.CHAT_MARKER_NAMESPACE);

			msg.addContent(markable);
		}

		if (isMDRSupported) {
			MDRRequest mdrRequest = new MDRRequest(XMPPNamespace.MESSAGE_DELIVERY_RECEIPTS_NAMESPACE);

			msg.addContent(mdrRequest);
		}

		if (isCSNSupported) {
			CSNActive active = new CSNActive(XMPPNamespace.CHAT_STATE_NOTIFICATION);

			msg.addContent(active);
		}

		if (isGroup) {
			msg.setType(MessageType.GROUP_CHAT);
		}

		return this.send(msg);
	}

	/**
	 * Sending message received receipt to sender explained in XEP-0184(Message
	 * Deliver receipt)
	 * 
	 * @param messageId received message id
	 * @param to message sender {@link JID}
	 * @param isGroup isGroup flag
	 * @return true if the message was queued up in writer queue successfully
	 *         otherwise false
	 */
	public boolean sendMsgMDRReceivedReceipt(String messageId, JID to, boolean isGroup) {
		Message msg = new Message(UUIDGenerator.secureId());
		msg.setTo(to);

		MDRReceived received = new MDRReceived(messageId, XMPPNamespace.MESSAGE_DELIVERY_RECEIPTS_NAMESPACE);
		msg.addContent(received);

		if (isGroup) {
			msg.setType(MessageType.GROUP_CHAT);
		}

		return this.send(msg);
	}

	/**
	 * Sending message received receipt to sender explained in XEP-0333(Chat
	 * Markers)
	 * 
	 * @param messageId received message id
	 * @param to message sender {@link JID}
	 * @param isGroup isGroup
	 * @return true if the message was queued up in writer queue for delivery
	 *         otherwise false
	 */
	public boolean sendMsgCMReceivedReceipt(String messageId, JID to, boolean isGroup) {
		Message msg = new Message(UUIDGenerator.secureId());
		msg.setTo(to);

		CMReceived received = new CMReceived(messageId, XMPPNamespace.CHAT_MARKER_NAMESPACE);
		msg.addContent(received);

		if (isGroup) {
			msg.setType(MessageType.GROUP_CHAT);
		}

		return this.send(msg);
	}

	/**
	 * Sending message displayed receipt to sender explained in XEP-0333(Chat
	 * Markers)
	 * 
	 * @param messageId received message id
	 * @param to message sender {@link JID}
	 * @param isGroup isGroup
	 * @return true if the message was queued up in writer queue otherwise false
	 */
	public boolean sendMsgCMDisplayedReceipt(String messageId, JID to, boolean isGroup) {
		Message msg = new Message(UUIDGenerator.secureId());
		msg.setTo(to);

		CMDisplayed displayed = new CMDisplayed(messageId, XMPPNamespace.CHAT_MARKER_NAMESPACE);
		msg.addContent(displayed);

		if (isGroup) {
			msg.setType(MessageType.GROUP_CHAT);
		}

		return this.send(msg);
	}

	/**
	 * Sending message acknowledged receipt to sender explained in XEP-0333(Chat
	 * Markers)
	 * 
	 * @param messageId received message id
	 * @param to message sender {@link JID}
	 * @param isGroup isGroup flag
	 * @return true if the message was queued up in writer queue for delivery
	 *         otherwise false
	 */
	public boolean sendMsgCMAcknowledgedReceipt(String messageId, JID to, boolean isGroup) {
		Message msg = new Message(UUIDGenerator.secureId());
		msg.setTo(to);

		CMAcknowledged acknowledged = new CMAcknowledged(messageId, XMPPNamespace.CHAT_MARKER_NAMESPACE);
		msg.addContent(acknowledged);

		if (isGroup) {
			msg.setType(MessageType.GROUP_CHAT);
		}

		return this.send(msg);
	}

	/**
	 * Sending INACTIVE chat state notification explained in XEP-0085(Chat State
	 * Notifications)
	 * 
	 * @param to contact {@link JID}
	 * @return true if the packet was queued up in writer queue for delivery
	 *         otherwise false
	 */
	public boolean sendInactiveCSN(JID to) {
		Message msg = new Message();
		msg.setTo(to);

		CSNInactive inactive = new CSNInactive(XMPPNamespace.CHAT_STATE_NOTIFICATION);
		msg.addContent(inactive);

		return this.send(msg);
	}

	/**
	 * Sending COMPOSING chat state notification explained in XEP-0085(Chat
	 * State Notifications)
	 *
	 * @param to contact {@link JID}
	 * @return true if the packet was queued up in writer queue for delivery
	 *         otherwise false
	 */
	public boolean sendComposingCSN(JID to) {
		Message msg = new Message();
		msg.setTo(to);

		CSNComposing composing = new CSNComposing(XMPPNamespace.CHAT_STATE_NOTIFICATION);
		msg.addContent(composing);

		return this.send(msg);
	}

	/**
	 * Sending PAUSED chat state notification explained in XEP-0085(Chat State
	 * Notifications)
	 *
	 * @param to contact {@link JID}
	 * @return true if the packet was queued up in writer queue for delivery
	 *         otherwise false
	 */
	public boolean sendPausedCSN(JID to) {
		Message msg = new Message();
		msg.setTo(to);

		CSNPaused paused = new CSNPaused(XMPPNamespace.CHAT_STATE_NOTIFICATION);
		msg.addContent(paused);

		return this.send(msg);
	}

	/**
	 * Sending GONE chat state notification explained in XEP-0085(Chat State
	 * Notifications)
	 *
	 * @param to contact {@link JID}
	 * @return true if the packet was queued up in writer queue for delivery
	 *         otherwise false
	 */
	public boolean sendGoneCSN(JID to) {
		Message msg = new Message();
		msg.setTo(to);

		CSNGone gone = new CSNGone(XMPPNamespace.CHAT_STATE_NOTIFICATION);
		msg.addContent(gone);

		return this.send(msg);
	}

	/**
	 * Write {@link Message} packet on to wire using {@link XMPPStreamManager}
	 * 
	 * @param msg outbound {@link Message} packet
	 * @return true if the message was successfully written on the connection;
	 *         false if the
	 */
	public boolean send(Message msg) {
		addFromAddress(msg);
		return this.streamManager.sendPacketAsync(msg);
	}

	/**
	 * Add from address to outgoing {@link Message} packaet. The from address is
	 * extracted from user {@link Session} kept inside {@link Platform}
	 */
	private void addFromAddress(Message msg) {
		JID jid = (JID) Platform.getInstance().getUserSession().get(Session.KEY_USER_JID);
		msg.setFrom(jid);
	}

	@Override
	public void collect(Packet packet) {
		try {

			forwardPacket(packet);

			if (packet instanceof Message) {
				Message msg = (Message) packet;

				if (msg.getType() == MessageType.GROUP_CHAT) {
					List<MessageContent> contents = msg.getContents();

					for (MessageContent content : contents) {
						if (content.isContentType(MessageContentType.SUBJECT)) {

							ChatRoom chatRoom = new ChatRoom(new JID(msg.getFrom().getBareJID()),
									msg.getFrom().getNode(), content.toString());

							Platform.raiseEvent(EventType.CHAT_ROOM_SUBJECT_UPDATE, chatRoom);
						}
					}
				}
			}

		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Failed to handle  packet " + packet, e);
		}
	}

}