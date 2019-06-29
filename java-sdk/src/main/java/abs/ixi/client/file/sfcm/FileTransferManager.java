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

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import abs.ixi.client.core.Callback;
import abs.ixi.client.core.Initializable;
import abs.ixi.client.core.InitializationErrorException;
import abs.ixi.client.file.sfcm.FileTransfer.FailureReason;
import abs.ixi.client.io.XMPPStreamManager;
import abs.ixi.client.io.multipart.MediaContent;
import abs.ixi.client.io.multipart.MultipartWriter;
import abs.ixi.client.net.Connection;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.packet.IQ;

/**
 * {@code FileTransferManager} is application facing class used to setup ability
 * to transfer files across the network.
 * <p>
 * XMPP as a protocol is not suitable for media/file transfer; it allows to
 * plug-in other technologies for media transfer. In addition to the various
 * technologies such as SOCKS5, Out-of-band transfer etc, Stringflow has its
 * Proprietary content model to transfer media content.
 * </p>
 * <p>
 * Stringflow content model uses MIME as underlying technology to transfer
 * media. As recommended in various XEP specifications, media transfer
 * negotiations take place on the XMPP stream; however the media/file is
 * transferred on a TCP connection as a MIME message. When a user wants to
 * transfer a media to another user, Stringflow transfers the thumb nail image,
 * media type and size to the destination user over XMPP message stream keeping
 * message ordering in place and real-time. Simultaneously, a request to
 * transfer the file is handed-over to {@code FileTransferManager} to transfer
 * the file in background.
 * </p>
 * 
 * @author Yogi
 *
 */
public class FileTransferManager implements Initializable {
	private static final Logger LOGGER = Logger.getLogger(FileTransferManager.class.getName());

	/**
	 * XMPP Stream manager instance to opearte with ongoing XMPP stream
	 */
	private XMPPStreamManager xmppStreamManager;

	/**
	 * FileNegotiator instance to negotiate file transfer
	 */
	private FileTransferNegotiator negotiator;

	/**
	 * {@link FileInstanceSupplier} instance to receive {@link File} instance
	 * which is used to write a file on the disk
	 */
	private FileInstanceSupplier fileSupplier;

	/**
	 * A filter to accept/reject file receive request
	 */
	private InboundFileTransferFilter fileReceiveRequestFilter;

	/**
	 * {@link InboundFileTransferProcessor} instance
	 */
	private InboundFileTransferProcessor inboundProcessor;

	/**
	 * {@link OutboundFileTransferProcessor} instance
	 */
	private OutboundFileTransferProcessor outboundProcessor;

	/**
	 * {@link MultipartWriter} instance to upload files
	 */
	private MultipartWriter writer;

	/**
	 * A flag to indicate if the instance has been initialized
	 */
	private volatile boolean initialized;

	/**
	 * static instance of {@link FileTransferManager}
	 */
	private static FileTransferManager instance;

	public static FileTransferManager getInstance() {
		if (instance == null) {
			synchronized (FileTransferManager.class) {
				if (instance == null) {
					instance = new FileTransferManager();
				}
			}
		}

		return instance;
	}

	private FileTransferManager() {
		// DO nothing
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public synchronized void init() throws InitializationErrorException {
		if (this.initialized) {
			return;
		}

		LOGGER.fine("initializing FileTransferManager");

		this.negotiator = new FileTransferNegotiator(this.xmppStreamManager);
		this.fileReceiveRequestFilter = new InboundFileTransferFilter() {

			@Override
			public boolean accept(FileTransfer request) {
				return true;
			}
		};

		this.inboundProcessor = new InboundFileTransferProcessor(negotiator, fileSupplier);
		this.outboundProcessor = new OutboundFileTransferProcessor(negotiator);

		this.initialized = true;
	}

	/**
	 * File thumb and its unique id is transferred to receiver immediately. This
	 * method is to pull that file from Server. When this method is invoked, the
	 * client already had the file thumb, it's unique id and sender JID.
	 * <p>
	 * Receiving a file involves sending an {@link IQ} stanza to server
	 * requesting file download. On success result of the {@link IQ}, client
	 * initiates a MIME {@link Connection} with the server on which server
	 * writes the file.
	 * </p>
	 * 
	 * @param from JID
	 * @param fileId string
	 * @param contentType ContentType
	 * @param callback Callback
	 */
	public void transferFileInbound(JID from, String fileId, ContentType contentType,
			Callback<File, FailureReason> callback) {
		InboundFileTransfer req = new InboundFileTransfer(from, fileId, contentType, callback);

		if (this.fileReceiveRequestFilter.accept(req)) {
			this.inboundProcessor.submit(req);
		}

	}

	/**
	 * File thumb and its unique id is transferred to receiver immediately. This
	 * method is to pull that file from Server. When this method is invoked, the
	 * client already had the file thumb, it's unique id and sender JID.
	 * <p>
	 * Receiving a file involves sending an {@link IQ} stanza to server
	 * requesting file download. On success result of the {@link IQ}, client
	 * initiates a MIME {@link Connection} with the server on which server
	 * writes the file.
	 * </p>
	 * 
	 * @param from JID
	 * @param fileId string
	 * @param contentType ContentType
	 * @return FileTransferFuture fileTransferFuture
	 */
	public FileTransferFuture transferFileInbound(JID from, String fileId, ContentType contentType) {
		// TODO Complete the implementation
		throw new UnsupportedOperationException();
	}

	public FileTransferFuture transferFileOutbound(final String mediaId, final File file, final ContentType contentType,
			final JID to) {

		// TODO Complete the implementation
		throw new UnsupportedOperationException();
	}

	/**
	 * Sends message with {@link MediaContent} to media receiver. And uploads
	 * given file to Stringflow server.
	 * 
	 * @param messageId Id for media message
	 * 
	 * @param file {@link File} object of media
	 * @param contentType {@link ContentType} of media file
	 * @param to {@link JID} of media message receiver
	 * @param callback callback to know file transfer status
	 */
	public void transferFileOutbound(final String messageId, final File file, final ContentType contentType,
			final JID to, Callback<String, FailureReason> callback) {

		OutboundFileTransfer fileTransferRequest = new OutboundFileTransfer(messageId, file, contentType, to, callback);

		this.outboundProcessor.submit(fileTransferRequest);
	}

	public void setXmppStreamManager(XMPPStreamManager xmppStreamManager) {
		this.xmppStreamManager = xmppStreamManager;
	}

	public void setFileSupplier(FileInstanceSupplier fileSupplier) {
		this.fileSupplier = fileSupplier;
	}

	public void setFileReceiveRequestFilter(InboundFileTransferFilter fileReceiveRequestFilter) {
		this.fileReceiveRequestFilter = fileReceiveRequestFilter;
	}

	/**
	 * Check if the {@link FileTransferManager} instance has been initialized
	 * 
	 * @return true if this instance has been initialized otherwise false
	 */
	public boolean isInitialized() {
		return this.initialized;
	}

	/**
	 * Shutdown {@code FileTransferManager}
	 * 
	 * @throws IOException ioexception
	 */
	public void shutdown() throws IOException {
		this.outboundProcessor.shutdown();
		this.inboundProcessor.shutdown();
		this.writer.getConnection().close();

		instance = null;

	}

}
