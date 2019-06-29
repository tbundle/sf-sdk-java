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
package abs.ixi.client.xmpp;

import abs.ixi.client.core.Packet;
import abs.ixi.client.lang.Resetable;
import abs.ixi.client.xmpp.packet.SASLFeature.SASLMechanism;

/**
 * {@code StreamContext} captures state of the ongoing XMPP stream state. It
 * contains all the vital attributes of the XMPP stream such as stream state,
 * negotiated features, security, id, language, charset and version.
 * <p>
 * This implementation is <b> thread-safe</b>.
 * </p>
 */
public final class StreamContext implements Resetable {
	/**
	 * XMPP protocol uses UTF-8 character encoding
	 */
	public static final String UTF8 = "UTF-8";

	/**
	 * Default language for the stream; it's English
	 */
	public static final String STREAM_LANG = "en";

	/**
	 * Default value of the XMPP stream version a
	 */
	public static final String STREAM_VERSION = "1.0";

	/**
	 * Streams which have stream management enabled can be resumed. However
	 * stream resumption is possible, if the request for resumption is made
	 * within a time limit i.e. max resumption time. Maximum resumption time is
	 * negotiated between server and client. Below value is the default time
	 * that SDK uses, if the application has not specified.
	 */
	public static final int MAX_RESUMPTION_TIME = 300;

	/**
	 * Unique id of this XMPP Stream
	 */
	private String streamId;

	/**
	 * Current state of this stream
	 */
	private StreamState state;

	/**
	 * {@link SASLMechanism} used for this stream for authentication
	 */
	private SASLMechanism saslMechanism;

	/**
	 * Character encoding for this stream; keep it UTF-8 always
	 */
	private String encoding;

	/**
	 * Stream version
	 */
	private String version;

	/**
	 * Language of this stream; default is English
	 */
	private String lang;

	private boolean smSupported;
	private boolean smEnabled;
	private boolean resumable;
	private int maxResumptionTimeInSecs;

	private int handledStanzaCount;
	private int ackReceivedCount;

	/**
	 * Default constructor which enables stream management and max resumption
	 * time is set to {@link StreamContext#MAX_RESUMPTION_TIME}
	 */
	public StreamContext() {
		this(true, MAX_RESUMPTION_TIME);
	}

	/**
	 * Instantiate StreamContext with given max stream resumption time (in secs)
	 * and a flag to indicate of the stream management is supported
	 * 
	 * @param smSupported flag to indicate if stream management is supported
	 * @param maxResumptionTime max resumtpion time in seconds
	 */
	public StreamContext(boolean smSupported, int maxResumptionTime) {
		this.state = StreamState.INITIATED;
		this.encoding = UTF8;
		this.version = STREAM_VERSION;
		this.lang = STREAM_LANG;
		this.smSupported = smSupported;
		this.maxResumptionTimeInSecs = maxResumptionTime;
	}

	public synchronized String getStreamId() {
		return streamId;
	}

	public synchronized void setStreamId(String streamId) {
		this.streamId = streamId;
	}

	public synchronized StreamState getState() {
		return state;
	}

	public synchronized void setState(StreamState state) {
		this.state = state;
	}

	public synchronized SASLMechanism getSaslMechanism() {
		return saslMechanism;
	}

	public synchronized void setSaslMechanism(SASLMechanism saslMechanism) {
		this.saslMechanism = saslMechanism;
	}

	public synchronized String getEncoding() {
		return encoding;
	}

	public synchronized void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public synchronized String getVersion() {
		return version;
	}

	public synchronized void setVersion(String version) {
		this.version = version;
	}

	public synchronized String getLang() {
		return lang;
	}

	public synchronized void setLang(String lang) {
		this.lang = lang;
	}

	public synchronized boolean isSMSupported() {
		return smSupported;
	}

	public synchronized void setSMSupported(boolean isSMSupported) {
		this.smSupported = isSMSupported;
	}

	public synchronized boolean isSmEnabled() {
		return smEnabled;
	}

	public synchronized void setSmEnabled(boolean smEnabled) {
		this.smEnabled = smEnabled;
	}

	public synchronized boolean isResumable() {
		return resumable;
	}

	public synchronized void setResumable(boolean resumable) {
		this.resumable = resumable;
	}

	public synchronized void increaseHandledStanzaCount() {
		this.handledStanzaCount++;
	}

	public synchronized int getHandledStanzaCount() {
		return handledStanzaCount;
	}

	public synchronized void setHandledStanzaCount(int handledStanzaCount) {
		this.handledStanzaCount = handledStanzaCount;
	}

	public synchronized int getAckReceivedCount() {
		return this.ackReceivedCount;
	}

	public synchronized void setAckReceivedCount(int ackReceivedCount) {
		this.ackReceivedCount = ackReceivedCount;
	}

	public synchronized void setStreamState(Packet packet) {
		this.state.setState(this, packet);
	}

	public synchronized int getMaxResumptionTimeInSecs() {
		return maxResumptionTimeInSecs;
	}

	public synchronized void setMaxResumptionTimeInSecs(int maxResumptionTimeInSecs) {
		this.maxResumptionTimeInSecs = maxResumptionTimeInSecs;
	}

	public synchronized void enableStreamManagement(boolean isResumeable, int maxResumptionTimeInMillis) {
		this.setSmEnabled(true);
		this.setResumable(isResumeable);
		this.setMaxResumptionTimeInSecs(maxResumptionTimeInMillis);
		this.setHandledStanzaCount(0);
		this.setAckReceivedCount(0);
		this.setState(StreamState.SM_ENABLED);
	}

	@Override
	public synchronized void reset(boolean full) {
		this.encoding = UTF8;
		this.version = STREAM_VERSION;
		this.lang = STREAM_LANG;

		if (full || !(smEnabled && resumable)) {
			this.streamId = null;
			this.smSupported = false;
			this.resumable = false;
			this.state = StreamState.INITIATED;
			this.saslMechanism = null;
			this.smEnabled = false;
			this.handledStanzaCount = 0;
			this.ackReceivedCount = 0;

		} else {
//			if (this.state != StreamState.SASL_FAILED) {
//				this.state = StreamState.INITIATED;
//				this.saslMechanism = null;
//			}
			
			//TODO: User uper code if auth retry count works
			
			this.state = StreamState.INITIATED;
			this.saslMechanism = null;
		}
	}

	/**
	 * Check if this stream is ready for sending/receiving user packets. While
	 * stream is getting negotiated, it is NOT ready for sending/receiving user
	 * packets.
	 * 
	 * @return true if the stream is ready to send/receive user packets
	 *         otherwise false
	 */
	public synchronized boolean isReadyForUsePackets() {
		return this.state == StreamState.OPEN;
	}

}
