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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.Platform;
import abs.ixi.client.core.Packet;
import abs.ixi.client.core.PacketCollector;
import abs.ixi.client.core.event.Event.EventType;
import abs.ixi.client.lang.Duration;
import abs.ixi.client.lang.Pair;
import abs.ixi.client.net.ConnectionManager;
import abs.ixi.client.net.NetworkException;
import abs.ixi.client.net.NetworkException.Reason;
import abs.ixi.client.net.ReconnectionListener;
import abs.ixi.client.net.TCPConnection;
import abs.ixi.client.net.XMPPConnection;
import abs.ixi.client.util.CollectionUtils;
import abs.ixi.client.xmpp.StreamContext;
import abs.ixi.client.xmpp.StreamResumed;
import abs.ixi.client.xmpp.packet.AckPacket;
import abs.ixi.client.xmpp.packet.Message;
import abs.ixi.client.xmpp.packet.Stanza;

/**
 * {@link Writer} implementation which writes XMPP packets onto wire.
 * {@code XMPPConnection} and {@link TCPConnection} are <b>not</b> thread-safe.
 * Moreover, a socket does not permit concurrent writes; therefore,
 * {@code XMPPPacketWriter} enforces serial execution of write calls which may
 * be triggered by different threads.
 * <p>
 * {@code XMPPPacketWriter} keeps track of the packets for which client has
 * received ACK from the server. If the client does not receive ACK from server
 * for a {@link Packet} in stipulated time, client assumes that connection to
 * server is broken. It could be that device does not have Internet connection;
 * or something unexpected has broken the connection.
 * </p>
 */
public class XMPPPacketWriter implements Writer, PacketCollector, ReconnectionListener {
	private static final Logger LOGGER = Logger.getLogger(XMPPPacketWriter.class.getName());

	/**
	 * This is the duration for which client waits for an ACK from server. If
	 * client does not receive an ACK from server within this duration,
	 * underlying connection is deemed broken and a reconnection may be
	 * triggered.
	 */
	private static final long ACK_WAITING_TIME = Duration.ofSeconds(20).toMillis();

	/**
	 * WriteWaitingQueue and ACKWaitingQueue size
	 */
	private static final int WAITING_QUEUE_SIZE = 5000;

	/**
	 * Time for which writer thread get blocked on WriteWaitingQueue if there
	 * are no elements in this queue; after which it quits and loops again.
	 */
	private static final int WRITE_QUEUE_WAIT = 10; // seconds

	// Underlying XMPP connection instance
	private XMPPConnection connection;

	/**
	 * StreamContext instance
	 */
	private StreamContext streamContext;

	private LinkedBlockingDeque<Stanza> writeWaitingQ;

	/**
	 * Queue in which packets waiting for acknowledgement from server are added
	 */
	private LinkedBlockingDeque<Pair<Stanza, Long>> ackWaitingQ;

	// Control flag for writer thread
	private volatile boolean started = false;
	private volatile boolean writing = false;
	private volatile boolean stopping = false;
	private volatile boolean shutdown = false;

	/**
	 * Flag to indicate if the reconnection is in progress
	 */
	private AtomicBoolean reconnectionInProgress;

	/**
	 * Flag to indicate if the Writer thread has suspended
	 */
	private AtomicBoolean suspended;;

	/**
	 * Writer thread
	 */
	private WriterThread writerThread;

	public XMPPPacketWriter(XMPPConnection connection) {
		this.connection = connection;
		this.streamContext = xmppProtocolInstance().getStreamContext();

		this.reconnectionInProgress = new AtomicBoolean(false);
		this.suspended = new AtomicBoolean(false);

		this.writeWaitingQ = new LinkedBlockingDeque<>(WAITING_QUEUE_SIZE);
		this.ackWaitingQ = new LinkedBlockingDeque<>(WAITING_QUEUE_SIZE);

		this.writerThread = new WriterThread();
	}

	public synchronized void start() {
		if (this.started) {
			LOGGER.log(Level.WARNING, "Writer thread is already running; can't start");
			return;
		}

		ConnectionManager.getInstance().addReconnectionListener(this);

		this.writerThread.start();

		this.started = true;
		this.shutdown = false;

		LOGGER.log(Level.INFO, "Writer thread has started");
	}

	/**
	 * Add a Stanza to writerWaitingQ. Writer thread will write the stanza
	 * whenver stream is ready
	 * 
	 * @return a true value indicates that the packet was added to the queue and
	 *         a false value indicates that the queue was full and the packet
	 *         could not be added to the queue
	 */
	@Override
	public boolean writeAsync(Stanza stanza) {
		boolean added = this.writeWaitingQ.offer(stanza);
		if (!added) {
			LOGGER.log(Level.WARNING, "WriteWaitingQ is full;could not add stanza {0}", stanza);
		}

		return added;
	}

	@Override
	public boolean writeNextAsync(Stanza stanza) {
		boolean added = this.writeWaitingQ.offerFirst(stanza);

		if (!added) {
			LOGGER.log(Level.WARNING, "WriteWaitingQ is full;could not add stanza {0}", stanza);
		}

		return added;
	}

	@Override
	public void collect(Packet packet) {
		if (packet instanceof AckPacket) {
			AckPacket ack = (AckPacket) packet;
			if (streamContext.isSmEnabled()) {
				handleAck(ack.getHandledPacketCount());
			}

		} else if (packet instanceof StreamResumed) {
			StreamResumed resumed = (StreamResumed) packet;
			int ackCount = resumed.getPrevHandledPacketCount();
			handleAck(ackCount);
		}
	}

	private void handleAck(int ackCount) {
		try {
			int ackReceivedPacketCount = ackCount - streamContext.getAckReceivedCount();
			this.streamContext.setAckReceivedCount(ackCount);

			Platform.raiseEvent(EventType.SERVER_ACK_RECEIVED, ackReceivedPacketCount);

			List<Message> messages = new ArrayList<>();

			while (ackReceivedPacketCount > 0) {
				Stanza stanza = this.ackWaitingQ.remove().getFirst();

				LOGGER.fine("Ack Received for stanza : " + stanza.xml());

				if (stanza.isMessage()) {
					messages.add((Message) stanza);
				}

				ackReceivedPacketCount--;
			}

			LOGGER.log(Level.FINE, "AckWaitingQ size after ack marking : " + ackWaitingQ.size());

			if (!CollectionUtils.isNullOrEmpty(messages)) {
				Platform.raiseEvent(EventType.MESSAGE_DELIVERED, messages);
			}

		} catch (Throwable e) {
			LOGGER.log(Level.SEVERE, "Exception caught while handling ACK", e);
		}

	}

	public synchronized boolean isWriting() {
		return this.writing;
	}

	public synchronized boolean isShutdown() {
		return this.shutdown;
	}

	@Override
	public void reconnectionStarted() {
		LOGGER.fine("Turning reconnecting flag on");
		this.reconnectionInProgress.set(true);

		while (!suspended.get()) {
			LOGGER.fine("Waiting for writer to be suspended");
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// Swallow exception
			}
		}
	}

	@Override
	public void reconnected() {
		this.reconnectionInProgress.set(false);

		Iterator<Pair<Stanza, Long>> itr = this.ackWaitingQ.descendingIterator();

		while (itr.hasNext()) {
			this.writeWaitingQ.offerFirst(itr.next().getFirst());
		}

		this.ackWaitingQ.clear();

		synchronized (this.reconnectionInProgress) {
			this.reconnectionInProgress.notify();
		}
	}

	@Override
	public void reconnectionFailed() {
		this.reconnectionInProgress.set(false);

		synchronized (this.reconnectionInProgress) {
			this.reconnectionInProgress.notify();
		}
	}

	/**
	 * Write packets on to the wire directly bypassing normal flow of
	 * {@link XMPPPacketWriter} process. This method has restricted access and
	 * meant to be used by SDK only; specifically {@link StreamNegotiator}
	 * <p>
	 * While stream negotiations are in progress, writer thread waits for
	 * negotiation process to finish. In this case, anything added to writer
	 * queue will not be processed by writer thread.
	 * </p>
	 * 
	 * @param packet packet to be written
	 * @throws NetworkException when IO error occurrs, device does not have
	 *             internet or connection is not connected
	 */
	public void writeSync(Packet packet) throws NetworkException {
		LOGGER.log(Level.FINE, "Writing packet synchronously  : " + packet);

		if (!ConnectionManager.getInstance().isNetworkConnectivity()) {
			throw new NetworkException(Reason.NO_CONNECTIVITY);
		}

		this.write0(packet);
	}

	/**
	 * Write a packet onto the wire. This is low level method which writes
	 * packet on the connection, provided connection is connetced. Writing a
	 * stanza/ack packet onto the wire while stream negotiation is in progress
	 * can result server closing the connection citing unexpected packet order.
	 * 
	 * @param packet
	 * @throws NetworkException
	 */
	private void write0(Packet packet) throws NetworkException {
		if (connection.isConnected()) {
			try {
				LOGGER.log(Level.FINE, "SEND: {0}", packet);
				connection.write(packet);
			} catch (IOException e) {
				throw new NetworkException(Reason.IO_ERROR);
			}

		} else {
			throw new NetworkException(Reason.DISCONNECTED);
		}
	}

	public synchronized boolean shutdown() {
		return this.shutdownNow();
	}

	@Override
	public synchronized boolean shutdownNow() {
		if (this.shutdown) {
			return true;
		}

		if (this.writing) {

			if (this.reconnectionInProgress.get()) {
				synchronized (this.reconnectionInProgress) {
					this.reconnectionInProgress.set(false);
					this.reconnectionInProgress.notify();
				}
			}

			this.writing = false;
			this.stopping = true;

			waitForShutdown();
		}

		return this.shutdown;
	}

	private void waitForShutdown() {
		while (!this.shutdown) {
			try {
				LOGGER.log(Level.FINE, "Waiting for writer shutdown");
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// Ignore
			}
		}

	}

	@Override
	public String toString() {
		return "XMPPPacketWriter";
	}

	/**
	 * Continuously running Writer thread which pools writeWaitingQ and writes
	 * packets on {@link XMPPConnection}.
	 * 
	 * @author Yogi
	 *
	 */
	private class WriterThread extends Thread {
		@Override
		public void run() {
			writing = true;

			while (writing && !stopping && !shutdown) {
				try {

					suspendIfReconnecting();

					/**
					 * Writer thread suspension can be broken in two conditions
					 * (a) reconnection was successful (b) shutdown command was
					 * issued on Writer. If the shutdown command was issued, we
					 * must not attempt to write packets instead we should quit
					 * immediately.
					 */
					if (stopping || shutdown) {
						break;
					}

					// In order to ensure packet ordering, Ack waiting queue
					// must be handled before any write takes place
					checkAckWaitingQueue();

					suspendIfConnectionResetInProgress();

					Packet packet = writeWaitingQ.poll(WRITE_QUEUE_WAIT, TimeUnit.SECONDS);

					if (packet != null) {
						this.write(packet);
					}

				} catch (InterruptedException e) {
					LOGGER.log(Level.INFO, "Poll on WriteWaitingQ was interrupted");
					// Ignore
				} catch (NetworkException e) {
					triggerReconnection();
				}
			}

			started = false;
			writing = false;
			shutdown = true;
			stopping = false; // first shutdown then remove stoping flag

			LOGGER.log(Level.INFO, "Writer thread has exited");
		}

		private void suspendIfConnectionResetInProgress() throws InterruptedException {
			if (reconnectionInProgress.get()) {
				synchronized (reconnectionInProgress) {
					while (reconnectionInProgress.get()) {
						suspended.set(true);
						reconnectionInProgress.wait(TimeUnit.SECONDS.toMillis(5));
					}

					suspended.set(false);
				}
			}

		}

		/**
		 * Trigger Reconnection and wait for few seocnds for reconnection
		 * manager to update listeners
		 */
		private void triggerReconnection() {
			LOGGER.log(Level.FINE, "Reconnecting from Packet Writer thread");
			ConnectionManager.getInstance().reconnectAsync();

			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// Ignore
			}
		}

		/**
		 * Suspend ongoing thread if reconnection is in progress
		 * 
		 * @throws InterruptedException
		 */
		private void suspendIfReconnecting() {
			try {
				if (reconnectionInProgress.get()) {
					synchronized (reconnectionInProgress) {
						while (reconnectionInProgress.get()) {
							suspended.set(true);
							reconnectionInProgress.wait(TimeUnit.SECONDS.toMillis(500));
						}
					}
				}

			} catch (InterruptedException e) {
				LOGGER.log(Level.INFO, "Writer thread has been suspended");
			} finally {
				suspended.set(false);
			}
		}

		/**
		 * Before a packet is written on to the wire through
		 * {@link XMPPConnection}, it is added to queue with packets waiting for
		 * ACK from server. With the resilience built in TCP protocol, a
		 * read/write operations on a network socket may not fail immediately
		 * giving false assumption that underlying connection is alive. To avoid
		 * packet loss and improve reconnection mechanism, writer uses server
		 * ACK to determine underlying connection state.
		 * <p>
		 * For a packet, if client did not receive an ACK from server in
		 * stipulated time, writer will assume that packets for which ACK has
		 * not been received were lost and also the connection to server is
		 * broken. Therefore it will trigger reconnection for the underlying
		 * {@link XMPPConnection} and drain all the packets on to wire which
		 * were not ACKed by server.
		 * </p>
		 */
		private void checkAckWaitingQueue() {
			if (!ackWaitingQ.isEmpty()) {
				for (Pair<Stanza, Long> p : ackWaitingQ) {
					long packetAge = System.currentTimeMillis() - p.getSecond();

					if (packetAge > ACK_WAITING_TIME) {
						LOGGER.log(Level.FINE, "ACK was not received for stanza : {0}", p.getFirst().xml());
						triggerReconnection();
						break;
					}
				}
			}
		}

		/**
		 * Write a packet on underlying connection. If the packet is a stanza
		 * packet, it is added to AckWaitingQ and related counters are updated
		 * in {@link StreamContext}
		 * 
		 * @param packet packet to be written
		 * @throws NetworkException if the connection is disconnected or device
		 *             does not have network connectivity
		 */
		private void write(Packet packet) throws NetworkException {
			if (packet.isStanza()) {
				Stanza stanza = (Stanza) packet;
				ackWaitingQ.offer(new Pair<Stanza, Long>(stanza, System.currentTimeMillis()));
			}

			write0(packet);
		}
	}

}
