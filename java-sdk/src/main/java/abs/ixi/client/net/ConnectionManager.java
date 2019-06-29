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

import java.io.IOException;
import java.nio.channels.UnresolvedAddressException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.NotInitializedException;
import abs.ixi.client.Platform;
import abs.ixi.client.core.event.Event;
import abs.ixi.client.core.event.Event.EventType;
import abs.ixi.client.core.event.EventBus;
import abs.ixi.client.net.NetworkException.Reason;

/**
 * A singleton entity to manage all the {@link Connection}s within SDK.
 * {@code ConnectionManager} is responsibile for instantiation and life-cycle
 * management of the connections. Any connection created outside
 * {@link ConnectionManager} (using various constructors of {@link Connection}
 * implementations) will not be managed by {@link ConnectionManager} which may
 * result in resource leak. Therefore SDK users (applications) SHOULD
 * instantiate {@link Connection} using {@link ConnectionManager} only.
 * 
 * In unstable network environments such as mobile devices, connectivity to
 * server is broken very frequently forcing SDK to reconnect with server.
 * {@code ConnectionManager} is the entity which manages reconnection
 * mechanism.However, it is important for {@link ConnectionManager} to know if
 * the underlying network is available on device; otherwise the reconnection
 * will be waste of efforts. Therefore, application developers must keep
 * {@link ConnectionManager} updated about the status of network availability on
 * device. If the network is not available on device, {@link ConnectionManager}
 * will not reconnect broken connections.
 *
 */
public final class ConnectionManager {
	private static final Logger LOGGER = Logger.getLogger(ConnectionManager.class.getName());

	/**
	 * Underlying XMPP Connection; there could be one and only one XMPP
	 * {@link Connection} with server from a {@link Platform}.
	 */
	private XMPPConnection xmppConnection;

	/**
	 * XMPP Connection configurations; Config as maintained as immutable in
	 * memory to instantiate XMPP connections with server.
	 */
	private ConnectionConfig xmppConnConfig;

	/**
	 * A {@link TCPConnection} instance used for file transfer. This is part of
	 * Stringflow Content model (SF Content Model: Stringflow proprietry file
	 * transfer mechanism which uses MIME as underlying technology to transfer
	 * files).
	 */
	private SFCMConnection mimeConnection;

	/**
	 * {@link ConnectionConfig} for mime connection. The config must be treated
	 * as immutable.
	 */
	private ConnectionConfig mimeConnConfig;

	/**
	 * {@link HeartBeatManger} isntance; this is an optimistic way of sending
	 * heartbeats assuming that only failure in sending heartbeat indicates
	 * broken connecttions. Currently {@link HeartBeatManger} is not used bt
	 * {@link ConnectionManager}.
	 */
	// private HeartBeatManger heartBeatManager;

	/**
	 * {@link ReconnectionManager} instance to manage reconnections on XMPP
	 * connections; please note, there is no reconnection attempt made on mime
	 * connections.
	 */
	private ReconnectionManager reconnectionManager;

	/**
	 * Flag to indicate if the underlying device has network connectivity;
	 * Default value is TRUE.
	 */
	private AtomicBoolean networkConnectivity;

	/**
	 * By default SDK aggresively tries to stay connected with server and this
	 * involves continuous retry for connection. However, it may happen that
	 * underlying device does not have connectivity to network, in such cases,
	 * applications using SDK can inform {@link ConnectionManager} using
	 * {@link ConnectionManager#setNetworkConnectivity(boolean)}; and connection
	 * manager will inform attached connectivity listerns about the lost
	 * nestwork connectivity on device; in such cases, various entities involved
	 * in triggering network re-connection will STOP and wait until the network
	 * connectivity is re-established on the device.
	 * <p>
	 * By default Network connectivity is assumed <i>connected</i>. Turning the
	 * connectivity OFF results in battery saving on devices particulary of
	 * network is gone for long time (hours). However it should not be used for
	 * small durations of network loss (for seconds/minutes).
	 * </p>
	 */
	private List<NetConnectivityListener> connectivityListeners;

	/**
	 * List of connection state observers
	 */
	private List<ConnectionStateObserver> connStateObservers;

	/**
	 * Singleton instance of {@link ConnectionManager}
	 */
	private static ConnectionManager instance;

	/**
	 * {@link ConnectionManager} is a singleton entity; it must be instantiated
	 * with {@link ConnectionConfig} before
	 * {@link ConnectionManager#getInstance()} can be invoked.
	 * 
	 * @param config xmpp connection configurations
	 */
	public static void instantiate(ConnectionConfig config) {
		instance = new ConnectionManager(config);
	}

	/**
	 * {@link ConnectionManager} is a singleton entity; it must be instantiated
	 * with {@link ConnectionConfig} before
	 * {@link ConnectionManager#getInstance()} can be invoked.
	 * 
	 * @param xmppHost server ip for xmpp service
	 * @param xmppPort server port of xmpp service
	 */
	public static void instantiate(String xmppHost, int xmppPort) {
		ConnectionConfig xmppConfig = new ConnectionConfigBuilder().withServerIP(xmppHost).withServerPort(xmppPort)
				.build();
		instance = new ConnectionManager(xmppConfig);
	}

	/**
	 * {@link ConnectionManager} is a singleton entity; it must be instantiated
	 * with {@link ConnectionConfig} before
	 * {@link ConnectionManager#getInstance()} can be invoked.
	 * 
	 * @param xmppConfig xmpp connection configuration
	 * @param mimeConfig file transfer connection configuration
	 */
	public static void instantiate(ConnectionConfig xmppConfig, ConnectionConfig mimeConfig) {
		instance = new ConnectionManager(xmppConfig, mimeConfig);
	}

	/**
	 * {@link ConnectionManager} is a singleton entity; it must be instantiated
	 * with {@link ConnectionConfig} before
	 * {@link ConnectionManager#getInstance()} can be invoked.
	 * 
	 * @param xmppHost xmpp service ip address
	 * @param xmppPort xmpp service port
	 * @param sfcmHost mime service IP address
	 * @param sfcmPort mime service port
	 */
	public static void instantiate(String xmppHost, int xmppPort, String sfcmHost, int sfcmPort) {
		ConnectionConfig xmppConfig = new ConnectionConfigBuilder().withServerIP(xmppHost).withServerPort(xmppPort)
				.build();
		ConnectionConfig mimeConfig = new ConnectionConfigBuilder().withServerIP(sfcmHost).withServerPort(sfcmPort)
				.build();

		instance = new ConnectionManager(xmppConfig, mimeConfig);
	}

	/**
	 * Get {@code ConnectionManager} instance. {@code ConnectionManager} must be
	 * instantiated before this call otherwise it throws
	 * {@link NotInitializedException}
	 * 
	 * @return ConnectionManager ConnectionManager
	 */
	public static ConnectionManager getInstance() {
		if (instance == null) {
			throw new NotInitializedException("Connection Manager has not been initialized yet");
		}

		return instance;
	}

	// Private constructor
	private ConnectionManager(ConnectionConfig config) {
		this(config, null);
	}

	// Private constructor
	private ConnectionManager(ConnectionConfig xmppConfig, ConnectionConfig mimeConfig) {
		// defaulting network connectivity to true; It is up to the application
		// to supply the network status on the device. Please note, an incorrect
		// value for this flag can stop the SDK from reconnecting to server.
		this.networkConnectivity = new AtomicBoolean(true);

		this.reconnectionManager = new ReconnectionManager(true);
		this.connectivityListeners = new ArrayList<>();
		this.connStateObservers = new ArrayList<>();
		this.connectivityListeners.add(this.reconnectionManager);

		this.xmppConnConfig = xmppConfig;
		this.mimeConnConfig = mimeConfig;
	}

	/**
	 * Get XMPP connection held by this {@link ConnectionManager}. It uses
	 * {@link ConnectionConfig} instance held by the mananger; throws
	 * {@link NullPointerException} if there is no {@link ConnectionConfig}
	 * found.
	 * 
	 * @return XMPPConnection XMPPConnection
	 */
	public XMPPConnection getXmppConnection() {
		if (this.xmppConnection == null) {
			createXmppConnection();
		}

		return this.xmppConnection;
	}

	/**
	 * Create a {@link XMPPConnection} instance with xmpp connection
	 * configurations. Important to note that returned connection instance will
	 * NOT have a physical connection with remote server. In order to establish
	 * a physical connection with remote server,
	 * {@link ConnectionManager#connect(Connection, boolean)} should be invoked
	 * with returned connection from this method.
	 */
	private XMPPConnection createXmppConnection() {
		if (this.xmppConnConfig == null) {
			throw new NullPointerException("Connection config is null");
		}

		this.xmppConnection = new XMPPConnection(this.xmppConnConfig);

		// TODO It may be a good idea to have heart beat manager inside
		// XMPPConnection. There could be many connections and if we want each
		// of them to have a heart beat manager it should be inside XMPP
		// connection instance. Moreover thats where it belongs.
		if (this.xmppConnConfig.isHeartBeatManaged()) {
			// this.heartBeatManager = new HeartBeatManger(this.xmppConnection,
			// this.xmppConnConfig.getHeartBeatFrequency());
		}

		return this.xmppConnection;
	}

	/**
	 * Get File Transfer connection held by this {@link ConnectionManager}. It
	 * uses {@link ConnectionConfig} instance held by the mananger; throws
	 * {@link NullPointerException} if there is no {@link ConnectionConfig}
	 * found.
	 * 
	 * @return SFCMConnection SFCMConnection
	 */
	public SFCMConnection getFileTransferConnection() {
		if (this.mimeConnection == null) {
			createFileTransferConnection();
		}

		return this.mimeConnection;
	}

	/**
	 * Create a {@link TCPConnection} instance with mime connection
	 * configurations. Important to note that returned connection instance will
	 * NOT have a physical connection with remote server. In order to establish
	 * a physical connection with remote server,
	 * {@link ConnectionManager#connect(Connection, boolean)} should be invoked
	 * with returned connection from this method.
	 */
	private SFCMConnection createFileTransferConnection() {
		if (this.mimeConnConfig == null) {
			throw new NullPointerException("Connection config is null");
		}

		this.mimeConnection = new SFCMConnection(this.mimeConnConfig);

		return this.mimeConnection;
	}

	/**
	 * The application may choose to keep {@code ConnectionManager} informed
	 * about network connectivity on device. Correct status of network
	 * connectivity helps optimise the reconnection mechanism in SDK resulting
	 * in power saving.
	 *
	 * @return a flag indicating netwrok connectivity on device. This may not be
	 *         the correct status as the {@link ConnectionManager} relies on the
	 *         application update its network connectivity flag as and when
	 *         there is a change
	 */
	public boolean isNetworkConnectivity() {
		return this.networkConnectivity.get();
	}

	/**
	 * Set network connectivity status. If the underlying network connectivity
	 * is broken, SDK will stop attempting reconnection.
	 * 
	 * @param networkConnectivity networkConnectivity
	 */
	public void setNetworkConnectivity(boolean networkConnectivity) {
		LOGGER.log(Level.FINE, "Updating Network connectivity to " + networkConnectivity);

		this.networkConnectivity.set(networkConnectivity);

		for (NetConnectivityListener l : this.connectivityListeners) {
			if (networkConnectivity) {
				l.connected();
			} else {
				l.disconnected();
			}
		}
	}

	public boolean connectXMPPConnection(boolean forceConnect) throws NetworkException {
		if (networkConnectivity.get()) {
			try {
				return connect(forceConnect, this.xmppConnection);

			} catch (IOException | UnresolvedAddressException e) {
				throw new NetworkException(Reason.IO_ERROR);
			}

		} else {
			throw new NetworkException(Reason.NO_CONNECTIVITY);
		}
	}

	public boolean connectFileTransferConnection(boolean forceConnect) throws NetworkException {
		if (networkConnectivity.get()) {
			try {

				return connect(forceConnect, this.mimeConnection);

			} catch (IOException | UnresolvedAddressException e) {
				throw new NetworkException(Reason.IO_ERROR);
			}
		} else {
			throw new NetworkException(Reason.NO_CONNECTIVITY);
		}
	}

	/**
	 * CONNECT is a command for {@code ConnectionManager} to re-establish
	 * underlying network connection which may be broken. If the connection is
	 * reconnected, {@link HeartBeatManger} for the connection will also be
	 * restarted.
	 * 
	 * @param forceConnect if true, a <b>connect</b> operation will be invoked
	 *            as long as device has network connectivity; If the value is
	 *            false, <b>connect</b> operation will be triggered only if
	 *            {@link Connection#isConnected()} returns false
	 * @param isXMPPConnection true if CONNECT needs to be issued on XMPP
	 *            Connection otherwise false
	 * @return true if an attempt was made to establish a physical connection
	 *         and the attempt was successful
	 * @throws NetworkException with {@link Reason#NO_CONNECTIVITY} when device
	 *             has no connectivity; the exception is also thrown if the
	 *             {@link Connection#connect()} operation fails. The
	 *             {@link Reason} specified in this case will be
	 *             {@link Reason#IO_ERROR}
	 */
	public boolean connect(boolean forceConnect, boolean isXMPPConnection) throws NetworkException {
		if (networkConnectivity.get()) {
			try {
				Connection conn = isXMPPConnection ? this.xmppConnection : this.mimeConnection;
				return connect(forceConnect, conn);

			} catch (IOException | UnresolvedAddressException e) {
				throw new NetworkException(Reason.IO_ERROR);
			}
		} else {
			throw new NetworkException(Reason.NO_CONNECTIVITY);
		}
	}

	/**
	 * Issue a CONNECT command on a {@link Connection} instance. The CONNECT
	 * command will be issued if either the forceConnect is true of
	 * {@link Connection} state is found <i>disconnected</i>.
	 * 
	 * @param forceConnect if true CONNECT will be triggered on the
	 *            {@link Connection} even if its state is found CONNECTED
	 * @param connection {@link Connection} instance to be connected
	 * @return true if the CONNECT was successful otherwise false
	 * @throws IOException
	 */
	private boolean connect(boolean forceConnect, Connection connection) throws IOException {
		if (forceConnect || !connection.isConnected()) {
			closeConnection(connection);

			boolean connected = connection.connect();

			if (connected) {
				notifyConnectionStateObservers(2);
			}

			return connected;

			// disabling heartbeat manager
			// if (reset && connConfig.isHeartBeat()) {
			// this.heartBeatManager.start();
			// }
		}

		return false;
	}

	/**
	 * Notify registered {@link ConnectionStateObserver}s. CallIndex parameter
	 * indicates which notification call will be invoked from
	 * {@link ConnectionStateObserver} interface.
	 * <ul>
	 * <li>0 => Closing Connection</li>
	 * <li>1 => Connection closed</li>
	 * <li>2 => Connection has been reconnected</li>
	 * </ul>
	 * 
	 * @param callIndex Notification call Index
	 */
	private void notifyConnectionStateObservers(int callIndex) {
		if (callIndex == 0) {
			this.connStateObservers.forEach((v) -> v.closingConnection());
		} else if (callIndex == 1) {
			this.connStateObservers.forEach((v) -> v.closed());
		} else if (callIndex == 2) {
			this.connStateObservers.forEach((v) -> v.connected());
		}
	}

	/**
	 * Add a {@link ReconnectionListener} to the listener list maintaned by
	 * {@link ConnectionManager}
	 *
	 * @param listener {@link ReconnectionListener} to be added to list
	 */
	public void addReconnectionListener(ReconnectionListener listener) {
		this.reconnectionManager.addReconnectionListener(listener);
	}

	/**
	 * Add a {@link NetConnectivityListener} to the listener list maintaned by
	 * {@link ConnectionManager}
	 *
	 * @param listener {@link ReconnectionListener} to be added to list
	 */
	public void addConnectivityListener(NetConnectivityListener listener) {
		this.connectivityListeners.add(listener);
	}

	/**
	 * Register {@link ConnectionStateObserver} with Connection Manager
	 * 
	 * @param o {@link ConnectionStateObserver} instance to be registered
	 */
	public void registerConnectionStateObserver(ConnectionStateObserver o) {
		this.connStateObservers.add(o);
	}

	/**
	 * Trigger connection reconnect on the persistent connection asynchronously.
	 * Before starting reconnection process, {@link ReconnectionListener}s will
	 * be executed. Once reconnection is completed, {@link ReconnectionListener}
	 * will be notified about success/failure.
	 *
	 * @return a future instance with a boolean flag indicating if the
	 *         reconnection was successful. Null if reconnection is already in
	 *         progress.
	 */
	public Future<Boolean> reconnectAsync() {
		return this.reconnectionManager.reconnectAsync(this.xmppConnection);
	}

	/**
	 * Close a {@link Connection}. If it is XMPP connection, file transfer
	 * connections will not also be closed.
	 * 
	 * @param conn Connection to be closed
	 */
	public void closeConnection(Connection conn) {
		if (conn == this.xmppConnection) {
			closeXMPPConnection(false);
		} else if (conn == this.mimeConnection) {
			closeFileTransferConnection();
		}
	}

	/**
	 * Close xmpp connection. While closing a xmpp connection, we also close
	 * file transfer connection. because file transfer connection is tightly
	 * coupled with XMPP connection. For existence of file transfer connection
	 * xmpp connection should be already established.
	 * 
	 * @param closeAll flag to indicate of all the connections (inlcuding
	 *            non-XMPP) should be closed
	 */
	public void closeXMPPConnection(boolean closeAll) {
		try {
			notifyConnectionStateObservers(0);
			this.xmppConnection.close();
			notifyConnectionStateObservers(1);

			fireEvent(new Event(EventType.CONNECTION_CLOSE, this.xmppConnection, Calendar.getInstance()));

			if (closeAll) {
				closeFileTransferConnection();
			}
		} catch (Exception e) {
			LOGGER.log(Level.FINE, "Caught exception", e);
		}
	}

	/**
	 * Close File transfer connection
	 */
	public void closeFileTransferConnection() {
		try {
			if (this.mimeConnection != null) {
				this.mimeConnection.close();
			}

		} catch (Exception e) {
			LOGGER.log(Level.FINE, "Caught exception", e);
		}
	}

	/**
	 * Push an event onto {@link EventBus} so that it gets propagated to all
	 * listeners
	 *
	 * @param event event object which will be pushed to event bus
	 */
	private void fireEvent(Event event) {
		LOGGER.log(Level.FINE, "Firing {0} event", event);
		Platform.getInstance().getUserSession().getEventBus().fire(event);
	}

	/**
	 * Shutdown this connection manager instance. All the connections are closed
	 * prior to shutting down connection manager.
	 */
	public void shutdown() {
		LOGGER.log(Level.FINE, "Shutdowning Connection manager");
		this.closeXMPPConnection(true);

		// Below is not required though
		this.xmppConnection = null;
		this.mimeConnection = null;

		instance = null;
	}

}