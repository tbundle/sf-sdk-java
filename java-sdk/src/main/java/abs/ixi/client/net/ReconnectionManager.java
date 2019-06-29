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
package abs.ixi.client.net;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.io.StreamNegotiator.NegotiationResult;
import abs.ixi.client.net.BackoffTimeCalculator.BackoffPolicy;
import abs.ixi.client.util.TaskExecutor;

/**
 * {@code ReconnectionManager} makes attempts to reconnect a broken XMPP
 * connection. Upon receiving reconnection request, reconnection is attempted
 * asynchronously in a separate thread and once connection is established, the
 * thread dies. Unless it's shutdown, the manager will continue to try to
 * establish a connection with server and negotiate a XMPP stream with it.
 * <p>
 * Each time reconnection attempt fails, the reconnection process is suspended
 * for a time calculated based upon back-off policy configured within
 * {@code ReconnectionManager}. While reconnecting, network availability on the
 * device is also taken into account. If device does not have network
 * connectivity, the reconnection process will wait until network is available
 * on device.
 * </p>
 * <p>
 * {@code ReconnectionManager} maintains a list of {@link ReconnectionListener}s
 * which it notifies at appropriate stages of the reconnection process.
 * </p>
 * 
 * @author Yogi
 *
 */
public class ReconnectionManager implements NetConnectivityListener {
	private static final Logger LOGGER = Logger.getLogger(ReconnectionManager.class.getName());

	/**
	 * Backoff policy to calculate back-off time
	 */
	private static final BackoffPolicy BAKOFF_POLICY = BackoffPolicy.EXPONENTIAL_BACKOFF;

	private BackoffTimeCalculator backoffCalculator;
	private int retryCount;
	private AtomicBoolean networkConnectivity;
	private List<ReconnectionListener> reconnectionListeners;

	private AtomicBoolean reconnecting;

	public ReconnectionManager(boolean connectivity) {
		this.retryCount = 0;
		this.networkConnectivity = new AtomicBoolean(connectivity);
		this.reconnecting = new AtomicBoolean(false);
		this.reconnectionListeners = new ArrayList<>();
		this.backoffCalculator = new BackoffTimeCalculator(BAKOFF_POLICY);
	}

	public Future<Boolean> reconnectAsync(final XMPPConnection conn) {
		synchronized (this.reconnecting) {
			if (this.reconnecting.get()) {
				return null;
			} else {
				this.reconnecting.set(true);
			}
		}

		return TaskExecutor.submit(new Reconnector(conn));
	}

	/**
	 * Notify {@link ReconnectionListener}s
	 * 
	 * @param callIndex Reconnection listeners are notified at various stages of
	 *            reconnection. CallIndex indicates reconnection stage as
	 *            following:
	 *            <ul>
	 *            <li>0 => Reconnection Started</li>
	 *            <li>1 => Reconnectioned</li>
	 *            <li>2 => Reconnection Failed</li>
	 *            </ul>
	 */
	private void notifyReconnectionListeners(int callIndex) {
		for (ReconnectionListener l : reconnectionListeners) {
			if (callIndex == 0) {
				l.reconnectionStarted();
			} else if (callIndex == 1) {
				l.reconnected();
			} else if (callIndex == 2) {
				l.reconnectionFailed();
			}
		}
	}

	@Override
	public void connected() {
		synchronized (this.networkConnectivity) {
			this.networkConnectivity.set(true);
		}
	}

	@Override
	public void disconnected() {
		synchronized (this.networkConnectivity) {
			this.networkConnectivity.set(false);
		}
	}

	/**
	 * Add a {@link ReconnectionListener} to the listener list maintaned by
	 * {@link ReconnectionManager}
	 * 
	 * @param listener {@link ReconnectionListener} to be added to list
	 */
	public void addReconnectionListener(ReconnectionListener listener) {
		this.reconnectionListeners.add(listener);
	}

	/**
	 * Reconnection Thread which makes reconnection attempts
	 * 
	 * @author Yogi
	 *
	 */
	class Reconnector implements Callable<Boolean> {
		private XMPPConnection conn;

		public Reconnector(XMPPConnection conn) {
			this.conn = conn;
		}

		@Override
		public Boolean call() throws Exception {
			LOGGER.log(Level.FINE, "Initiating reconnection on {}", this.conn);
			notifyReconnectionListeners(0);

			boolean reconnectionSuccessful = false;

			try {
				while (!reconnectionSuccessful) {
					reconnectionSuccessful = reconnect(conn);
					LOGGER.log(Level.FINE, "Reconnection Status {0}", reconnectionSuccessful);

					if (reconnectionSuccessful) {
						notifyReconnectionListeners(1);

					} else {
						long mills = backoffCalculator.calcBackoffTime(retryCount);

						LOGGER.log(Level.FINE, "Backing off by {0} millis", mills);
						TimeUnit.MILLISECONDS.sleep(mills);
					}
				}

			} catch (InterruptedException e) {
				LOGGER.log(Level.INFO, "Reconnection thread was interrupted; Exiting...");
			} catch (Exception e) {
				// Swallow exception and log it
				LOGGER.log(Level.SEVERE, "Exception occurred while reconnecting", e);
			} finally {
				if (!reconnectionSuccessful) {
					notifyReconnectionListeners(2);
				}

				retryCount = 0;
				reconnecting.set(false);
			}

			return reconnectionSuccessful;
		}

		private boolean reconnect(XMPPConnection conn) throws InterruptedException {
			try {
				retryCount++;

				ConnectionManager.getInstance().closeXMPPConnection(false);

				LOGGER.log(Level.FINE, "Checking if thread needs to wait for network");
				waitIfNoNetworkConnectivity();

				LOGGER.log(Level.FINE, "Reconnecting with remote host");
				ConnectionManager.getInstance().connectXMPPConnection(true);

				LOGGER.log(Level.FINE, "Starting Stream negotiations");
				NegotiationResult result = conn.getXmppStream().restartStream();

				return result.isSuccess();

			} catch (NetworkException e) {
				// Swallow it
				LOGGER.log(Level.FINE, "Network exception [" + e.getReason().name() + "] while reconnecting");
			}

			return false;
		}

		/**
		 * Wait until device has network connectivity
		 * 
		 * @throws InterruptedException
		 */
		private void waitIfNoNetworkConnectivity() throws InterruptedException {
			synchronized (networkConnectivity) {
				while (!networkConnectivity.get()) {
					LOGGER.log(Level.FINE, "Waiting for network connectivity");
					networkConnectivity.wait();
				}
			}
		}
	}

}
