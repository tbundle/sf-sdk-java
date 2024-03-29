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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.core.AbstractPacketForwarder;
import abs.ixi.client.core.BufferFactory;
import abs.ixi.client.core.PacketCollector;
import abs.ixi.client.net.ConnectionManager;
import abs.ixi.client.net.ConnectionStateObserver;
import abs.ixi.client.net.XMPPConnection;
import abs.ixi.client.xmpp.XMPPProtocol;
import abs.ixi.client.xmpp.packet.XMPPPacket;

/**
 * {@code XMPPPacketReader} continuously reads bytes from underlying
 * {@link XMPPConnection}; generates packets from the data and forwards to
 * registered {@link PacketCollector}s. By default, {@link XMPPStreamManager} is
 * always registered as {@link PacketCollector}.
 * <p>
 * {@code XMPPPacketReader} is a stateful entity; therefore it must be restarted
 * whenever underlying connection is reset.
 * </p>
 */
public class XMPPPacketReader extends AbstractPacketForwarder
		implements Reader, PacketHandler<XMPPPacket>, ConnectionStateObserver {

	private static final Logger LOGGER = Logger.getLogger(XMPPPacketReader.class.getName());

	/**
	 * Undelrying connection instance from which bytes will be read
	 */
	private XMPPConnection connection;

	/**
	 * Singleton {@link XMPPProtocol} instance
	 */
	private XMPPProtocol xmppProtocol;

	/**
	 * Byte processor
	 */
	private ByteHoldingProcessor streamProcessor;

	/**
	 * Flag to indicate that connection reset is in progress; typically
	 * {@link ConnectionManager} resets the connection
	 */
	private AtomicBoolean connResetInProgress;

	/**
	 * Flag to indicate if the Reader loop has suspended
	 */
	private AtomicBoolean suspended;;

	/**
	 * Flag to indicate if reconnection is enabled
	 */
	private volatile boolean reconnectionEnabled;

	/**
	 * A mutex used to suspend reader when reconnection is not enabled.
	 */
	private AtomicBoolean disconnectedMutex;

	/**
	 * Reader state flags
	 */
	private volatile boolean started = false;
	private volatile boolean reading = false;
	private volatile boolean stopping = false;
	private volatile boolean shutdown = false;

	private Thread readerThread;

	public XMPPPacketReader(XMPPConnection connection) {
		this.connection = connection;
		this.xmppProtocol = xmppProtocolInstance();
		this.connResetInProgress = new AtomicBoolean(false);
		this.suspended = new AtomicBoolean(false);
		this.disconnectedMutex = new AtomicBoolean(false);

		ConnectionManager.getInstance().registerConnectionStateObserver(this);
	}

	public synchronized void start() {
		LOGGER.log(Level.FINE, "Starting reader thread");

		if (this.reading || this.stopping) {
			LOGGER.log(Level.WARNING, "Reader is already running; can't start");
			return;
		}

		this.streamProcessor = new XmppStreamProcessor(this);

		this.readerThread = new Thread(this);
		this.readerThread.start();

		this.connResetInProgress = new AtomicBoolean(false);

		this.started = true;

		LOGGER.log(Level.INFO, "Reader thread has started");
	}

	@Override
	public void run() {
		this.reading = true;

		try {
			LOGGER.log(Level.FINE, "Entering reader loop");

			while (this.reading && !this.stopping && !this.shutdown) {
				try {
					ByteBuffer buff = read();
					processBytes(buff);
				} catch (AsynchronousCloseException e) {
					LOGGER.log(Level.INFO, "Failed to read bytes from connection", e);
					// Ignore; this is when another thread has closed the
					// socket. It happens when a reconenction is triggered from
					// another thread (typically from writer) and the socket is
					// closed
				} catch (IOException e) {
					LOGGER.log(Level.FINE, "Failed to read bytes from connection", e);
					if (!this.reconnectionEnabled) {
						suspendWhenReconnectionNotEnabled();
					}

					if (!this.connResetInProgress.get() && !this.stopping && !this.shutdown) {
						LOGGER.log(Level.FINE, "Trigring reconnection from Reader");
						this.connResetInProgress.set(true);
						ConnectionManager.getInstance().reconnectAsync();
					}
				}

				/**
				 * Suspension must be evaluated at end of the loop sothat after
				 * thread comes out of suspension, immediately the loop
				 * conditions are revaluated. While shutting down the Reader,
				 * Reader state flags will be modified and in such case Reader
				 * must exist immediately after coming out of suspension.
				 */
				suspendIfReconnecting();

			}

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Unexpected exception caught; Exiting", e);

		} finally {
			this.reading = false;
			this.shutdown = true;

			LOGGER.fine("Reader Thread has exited");
		}
	}

	/**
	 * Suspend Reader thread if connection reset is in progress
	 * 
	 * @throws InterruptedException if thread is interrupted
	 */
	private void suspendIfReconnecting() throws InterruptedException {
		LOGGER.log(Level.FINE, "Evaluating READER suspend condition");

		if (connResetInProgress.get()) {
			synchronized (this.connResetInProgress) {
				try {
					while (connResetInProgress.get()) {
						LOGGER.log(Level.FINE, "Suspending READER thread");

						this.suspended.set(true);
						connResetInProgress.wait(TimeUnit.SECONDS.toMillis(5));
					}
				} catch (Exception e) {
					// Ignore this
				}

				// Destroy stream processor because its stateful
				this.streamProcessor = new XmppStreamProcessor(this);
				this.suspended.set(false);
			}
		}
	}

	private void suspendWhenReconnectionNotEnabled() throws InterruptedException {
		LOGGER.log(Level.FINE, "Evaluating READER suspension condition when reconnection is not enabled");

		synchronized (this.disconnectedMutex) {
			try {
				while (disconnectedMutex.get()) {
					LOGGER.log(Level.FINE, "Suspending READER thread (reconnection is not enabled)");

					this.suspended.set(true);
					this.disconnectedMutex.wait(TimeUnit.SECONDS.toMillis(5));
				}
			} catch (Exception e) {
				// Ignore this
			}

			// Destroy stream processor because its stateful
			this.streamProcessor = new XmppStreamProcessor(this);
			this.suspended.set(false);
		}
	}

	protected ByteBuffer read() throws IOException {
		ByteBuffer buff = BufferFactory.getBuffer();

		if (this.streamProcessor.hasBytePipeline()) {
			buff.put(this.streamProcessor.getBytePipeline());
			this.streamProcessor.flushBytePipeline();
		}

		LOGGER.fine("Reading bytes from socket");
		int count = this.connection.read(buff);
		LOGGER.fine("RECEIVED: " + new String(buff.array(), 0, buff.position()));

		if (count == -1) {
			LOGGER.log(Level.FINE, "Reached end of stream");
			throw new IOException("Failed to read from Socket");
		}

		return buff;
	}

	/**
	 * Process bytes read from the underlying network socket. The method
	 * swallows all the exceptions whatsoever as we have no mechanism to recover
	 * from processing errors at this point.
	 * 
	 * @param buff byte buffer with bytes read from socket
	 */
	private void processBytes(ByteBuffer buff) {
		try {
			LOGGER.log(Level.FINE, "Generating packet from received bytes");
			this.streamProcessor.process(buff.array(), 0, buff.position());
			LOGGER.log(Level.FINE, "Done processing received bytes");

		} catch (Throwable e) {
			LOGGER.log(Level.WARNING, "Exception caught in Reader while processing", e);
		}
	}

	@Override
	public void handle(XMPPPacket packet) throws Exception {
		LOGGER.fine("Received packet : " + packet);

		try {
			this.xmppProtocol.inforceInbound(packet);
			this.forwardPacket(packet);

		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Caught exception while forwarding the packet " + packet, e);
		}
	}

	private void waitForShutdown() {
		while (!this.shutdown) {
			try {
				LOGGER.log(Level.FINE, "Waiting for Reader shutdown");
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// Ignore
			}
		}
	}

	@Override
	public synchronized boolean isReading() {
		return this.reading;
	}

	@Override
	public synchronized boolean isShutdown() {
		return this.shutdown;
	}

	@Override
	public synchronized void closingConnection() {
		if (!this.stopping && !this.shutdown) {
			this.connResetInProgress.set(true);
		}
	}

	@Override
	public synchronized void closed() {
		LOGGER.log(Level.FINE, "Executing Connection Closed callback");

		if (this.reading && !this.stopping && !this.shutdown) {
			while (!this.suspended.get()) {
				LOGGER.log(Level.FINE, "Waiting for Reader thread to be suspended");
				try {
					TimeUnit.MILLISECONDS.sleep(500);
				} catch (InterruptedException e) {
					// Ignore
				}
			}
		}
	}

	@Override
	public synchronized void connected() {
		LOGGER.log(Level.FINE, "Executing connected callback");

		this.connResetInProgress.set(false);

		if (!this.started) {
			this.start();

		} else {
			if (this.reconnectionEnabled) {
				synchronized (this.disconnectedMutex) {
					this.disconnectedMutex.notifyAll();
					LOGGER.log(Level.INFO, "Notified reader thread on mutex");
				}
			} else {
				synchronized (this.connResetInProgress) {
					this.connResetInProgress.notify();
					LOGGER.log(Level.FINE, "Reader thread has been notified");
				}
			}
		}
	}

	@Override
	public void enableReconnection() {
		this.reconnectionEnabled = true;
	}

	@Override
	public void stop() {
		this.stopping = true;
	}

	@Override
	public synchronized boolean shutdown() {
		LOGGER.log(Level.INFO, "Shutting down packet reader");
		this.connResetInProgress.set(false);

		if (this.shutdown) {
			return true;
		}

		if (this.reading) {
			this.reading = false;
			this.stopping = true;

			waitForShutdown();
		}

		return this.shutdown;
	}

	@Override
	public String toString() {
		return "XMPPPacketReader";
	}

}