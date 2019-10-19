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

import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.core.Packet;
import abs.ixi.client.core.PacketCollector;
import abs.ixi.client.lang.Duration;
import abs.ixi.client.lang.ObjectHolder;
import abs.ixi.client.net.NetworkException;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.xmpp.InvalidJabberId;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.StreamContext;
import abs.ixi.client.xmpp.StreamResumed;
import abs.ixi.client.xmpp.StreamState;
import abs.ixi.client.xmpp.XMPPNamespace;
import abs.ixi.client.xmpp.packet.Challenge;
import abs.ixi.client.xmpp.packet.FailedPacket;
import abs.ixi.client.xmpp.packet.Failure;
import abs.ixi.client.xmpp.packet.IQ;
import abs.ixi.client.xmpp.packet.IQ.IQType;
import abs.ixi.client.xmpp.packet.IQContent.IQContentType;
import abs.ixi.client.xmpp.packet.IQResourceBind;
import abs.ixi.client.xmpp.packet.Proceed;
import abs.ixi.client.xmpp.packet.ResourceBind;
import abs.ixi.client.xmpp.packet.SASLAuth;
import abs.ixi.client.xmpp.packet.SASLFeature;
import abs.ixi.client.xmpp.packet.SASLFeature.SASLMechanism;
import abs.ixi.client.xmpp.packet.SMEnable;
import abs.ixi.client.xmpp.packet.SMEnabledPacket;
import abs.ixi.client.xmpp.packet.StartTLS;
import abs.ixi.client.xmpp.packet.StreamFeature;
import abs.ixi.client.xmpp.packet.StreamFeature.StreamFeatureType;
import abs.ixi.client.xmpp.packet.StreamFeaturePacket;
import abs.ixi.client.xmpp.packet.StreamHeader;
import abs.ixi.client.xmpp.packet.StreamResume;
import abs.ixi.client.xmpp.packet.Success;
import abs.ixi.client.xmpp.packet.TLSFeature;
import abs.ixi.client.xmpp.packet.XMPPPacket;

/**
 * {@code StreamNegotiator} handles stream negotiations. XMPP stream negotiation
 * is multi-step process starting with sending stream header packet, receiving
 * header, authentication, resource bind and session creation. For more
 * information, read XMPP
 * <a href="https://tools.ietf.org/html/rfc6120">specification</a>
 * <p>
 * While stream negotiation is on, use level write operations MUST be stopped
 * otherwise negotiation will fail; however stream negotiator is not responsible
 * for it. {@linkplain XMPPStreamManager} should do that.
 * </p>
 */
public class StreamNegotiator implements PacketCollector {
	private static final Logger LOGGER = Logger.getLogger(StreamNegotiator.class.getName());

	/**
	 * During Stream neotiation, reply time-out is enforced by client sdk. So
	 * server must respond within stipulated time frome.
	 */
	private static final Duration DEFAULT_REPLY_TIMEOUT = Duration.ofSeconds(20);

	private StreamContext streamContext;
	private Writer writer;
	private Reader reader;
	private long replyTimeout;
	private ObjectHolder<XMPPPacket> holder;

	StreamNegotiator(StreamContext ctx, Writer writer, Reader reader) {
		this(ctx, writer, reader, DEFAULT_REPLY_TIMEOUT.toMillis());
	}

	StreamNegotiator(StreamContext ctx, Writer writer, Reader reader, long replyTimeout) {
		this.streamContext = ctx;
		this.writer = writer;
		this.reader = reader;
		this.replyTimeout = replyTimeout;
		this.holder = new ObjectHolder<>();
	}

	/**
	 * Negotiates XMPP stream with server using the supplied user credentials
	 * 
	 * @param userName node from {@link JID}
	 * @param pwd user password
	 * @throws NetworkException if there is a netwrok related error
	 */
	synchronized NegotiationResult negotiateStream(JID userJID, String pwd, String domain) throws NetworkException {
		this.reader.addPacketCollector(this);

		try {
			if (streamContext.getState() == abs.ixi.client.xmpp.StreamState.INITIATED) {
				sendStartStreamHeader(userJID, domain);

			} else if (streamContext.getState() == StreamState.SASL_FAILED) {
				if (streamContext.getSaslMechanism() == SASLMechanism.PLAIN) {
					this.writer.writeSync(new SASLAuth(userJID.getNode(), pwd, SASLMechanism.PLAIN));
					this.streamContext.setState(StreamState.SASL_STARTED);
				}

			} else {
				closeConnection(true);
				return new NegotiationResult(true, NegotiationError.ERROR);
			}

			while (true) {
				if (streamContext.getState() == StreamState.UNKNOWN) {
					closeConnection(true);
					return new NegotiationResult(true, NegotiationError.ERROR);

				} else {
					XMPPPacket xmppPacket = receivePacket();

					if (xmppPacket instanceof StreamHeader) {
						NegotiationResult result = handleStreamHeader((StreamHeader) xmppPacket);

						if (result != null)
							return result;

					} else if (xmppPacket instanceof StreamFeaturePacket) {
						handleStreamFeature((StreamFeaturePacket) xmppPacket, userJID, pwd);

					} else if (xmppPacket instanceof Proceed) {
						handleProceed((Proceed) xmppPacket, userJID);

					} else if (xmppPacket instanceof Success) {
						handleSuccessPacket((Success) xmppPacket, userJID);

					} else if (xmppPacket instanceof Challenge) {
						// Send challenge response for SASL mechanisms

					} else if (xmppPacket instanceof IQ) {
						NegotiationResult result = handleIQPacket(userJID, (IQ) xmppPacket);

						if (result != null) {
							return result;
						}

					} else if (xmppPacket instanceof SMEnabledPacket) {
						return handleSMEnabledPacket((SMEnabledPacket) xmppPacket);

					} else if (xmppPacket instanceof StreamResumed) {
						return handleStreamResumedPacket((StreamResumed) xmppPacket);

					} else if (xmppPacket instanceof Failure) {
						NegotiationResult result = handleFailurePacket((Failure) xmppPacket);

						if (result != null)
							return result;

					} else if (xmppPacket instanceof FailedPacket) {
						NegotiationResult result = handleFailedPacket((FailedPacket) xmppPacket);
						if (result != null) {
							return result;
						}

					} else {
						// Other Packet are not allowed during Stream
						// Negotiation.
						closeConnection(true);
						return new NegotiationResult(true, NegotiationError.ERROR);
					}
				}

			}

		} catch (InterruptedException e) {
			LOGGER.log(Level.WARNING, "Negotiation intrupted", e);
			closeConnection(true);
			return new NegotiationResult(true, NegotiationError.NEGOTIATION_INTERUPTED);

		} catch (TimeoutException e) {
			LOGGER.log(Level.WARNING, "Connection timeout", e);
			closeConnection(true);
			return new NegotiationResult(true, NegotiationError.TIME_OUT);

		} finally {
			this.reader.removePacketCollector(this);
		}
	}

	private NegotiationResult handleFailedPacket(FailedPacket xmppPacket) throws NetworkException {
		if (StringUtils.safeEquals(XMPPNamespace.SM_NAMESPACE, xmppPacket.getXmlns())) {

			if (this.streamContext.getState() == StreamState.SM_ENABLING) {
				this.streamContext.setState(StreamState.OPEN);
				return new NegotiationResult(false, null);

			} else if (this.streamContext.getState() == StreamState.STREAM_RESUMING) {
				sendResourceBindRequest();

			} else {
				closeConnection(true);
				return new NegotiationResult(true, NegotiationError.ERROR);
			}
		}

		return null;
	}

	private NegotiationResult handleFailurePacket(Failure failure) throws NetworkException {
		if (StringUtils.safeEquals(XMPPNamespace.SASL_NAMESAPCE, failure.getXmlns())) {
			this.streamContext.setState(StreamState.SASL_FAILED);
			return new NegotiationResult(true, NegotiationError.AUTHENTICATION_FAILED);

		} else if (StringUtils.safeEquals(XMPPNamespace.TLS_NAMESPACE, failure.getXmlns())) {
			this.streamContext.setState(StreamState.TLS_FAILED);

			closeConnection(true);

			return new NegotiationResult(true, NegotiationError.TLS_FAILURE);

		} else {
			closeConnection(true);
			return new NegotiationResult(true, NegotiationError.ERROR);
		}

	}

	private NegotiationResult handleStreamResumedPacket(StreamResumed resumed) {
		this.streamContext.setStreamId(resumed.getPrevStreamId());
		this.streamContext.setState(StreamState.STREAM_RESUMED);
		this.streamContext.setState(StreamState.OPEN);

		return new NegotiationResult(false, null);
	}

	private NegotiationResult handleSMEnabledPacket(SMEnabledPacket smEnabledPacket) {
		this.streamContext.enableStreamManagement(smEnabledPacket.isResumable(),
				smEnabledPacket.getMaxResumptionTimeInSec());

		this.streamContext.setState(StreamState.OPEN);

		return new NegotiationResult(false, null);
	}

	private NegotiationResult handleIQPacket(JID userJID, IQ iq) throws NetworkException {
		if (iq.getType() == IQType.RESULT) {
			if (iq.getContent().getType() == IQContentType.BIND) {
				IQResourceBind bind = (IQResourceBind) iq.getContent();

				bindResource(userJID, bind.getResource());

				streamContext.setState(StreamState.RESOURCE_BOUND);

				if (streamContext.isSMSupported()) {
					this.writer.writeSync(new SMEnable(streamContext.getMaxResumptionTimeInSecs()));
					this.streamContext.setState(StreamState.SM_ENABLING);

				} else {
					this.streamContext.setState(StreamState.OPEN);
					return new NegotiationResult(false, null);
				}
			}

		} else if (iq.getType() == IQType.ERROR && streamContext.getState() == StreamState.RESOURCE_BINDING) {
			closeConnection(true);

			return new NegotiationResult(true, NegotiationError.RESOURCE_BIND_FAILED);
		}

		return null;
	}

	private NegotiationResult handleStreamHeader(StreamHeader header) throws NetworkException {
		if (header.isCloseStream()) {
			closeConnection(false);
			return new NegotiationResult(true, NegotiationError.STREAM_CLOSED);

		} else {
			if (streamContext.getState() == StreamState.INITIATED) {
				streamContext.setStreamId(header.getStreamId());
				streamContext.setLang(header.getLanguage());
				streamContext.setVersion(header.getVersion());
				streamContext.setState(StreamState.STARTED);

			}
		}

		return null;
	}

	private void handleSuccessPacket(Success success, JID userJID) throws NetworkException {
		if (StringUtils.safeEquals(success.getXmlns(), XMPPNamespace.SASL_NAMESAPCE)) {
			this.streamContext.setState(StreamState.SASL_DONE);
			sendStartStreamHeader(userJID, userJID.getDomain());
		}
	}

	private void handleProceed(Proceed proceed, JID userJID) throws NetworkException {
		if (StringUtils.safeEquals(proceed.getXmlns(), XMPPNamespace.TLS_NAMESPACE)) {
			this.streamContext.setState(StreamState.TLS_DONE);
			sendStartStreamHeader(userJID, userJID.getDomain());
		}
	}

	private void handleStreamFeature(StreamFeaturePacket streamFeaturePacket, JID userJID, String pwd)
			throws NetworkException {
		for (StreamFeature feature : streamFeaturePacket.getFeatures()) {

			if (feature.getFeatureType() == StreamFeatureType.TLS) {
				TLSFeature tls = (TLSFeature) feature;

				if (tls.isRequired()) {
					this.writer.writeSync(new StartTLS());
					this.streamContext.setState(StreamState.TLS_STARTED);
				}

			} else if (feature.getFeatureType() == StreamFeatureType.SASL) {
				SASLFeature sasl = (SASLFeature) feature;

				List<SASLMechanism> mechanisms = sasl.getMechanisms();

				if (mechanisms.contains(SASLMechanism.PLAIN)) {
					this.streamContext.setSaslMechanism(SASLMechanism.PLAIN);
					this.writer.writeSync(new SASLAuth(userJID.getNode(), pwd, SASLMechanism.PLAIN));
					this.streamContext.setState(StreamState.SASL_STARTED);
				}

			} else if (feature.getFeatureType() == StreamFeatureType.BIND) {
				if (!this.isStreamResumable()) {
					sendResourceBindRequest();
				}

			} else if (feature.getFeatureType() == StreamFeatureType.SM) {
				if (this.isStreamResumable()) {
					this.writer.writeSync(new StreamResume(this.streamContext.getStreamId(),
							this.streamContext.getHandledStanzaCount()));
					this.streamContext.setState(StreamState.STREAM_RESUMING);

				} else {
					this.streamContext.setSMSupported(true);
				}
			}
		}

	}

	private boolean isStreamResumable() {
		return this.streamContext.isSmEnabled() && this.streamContext.isResumable();
	}

	private void sendResourceBindRequest() throws NetworkException {
		this.writer.writeSync(new ResourceBind());
		this.streamContext.setState(StreamState.RESOURCE_BINDING);
	}

	private void sendStartStreamHeader(JID userJid, String domain) throws NetworkException {
		StreamHeader startStream = new StreamHeader();
		startStream.setFrom(userJid);

		try {
			startStream.setTo(new JID(domain));

		} catch (InvalidJabberId e) {
			// Swallow this exception; as we are insatntiating JID, there is no
			// possibility of JID being invalid
			LOGGER.log(Level.SEVERE, "Unexpected exception; this shouldn't have happened", e);
		}

		this.writer.writeSync(startStream);
	}

	private XMPPPacket receivePacket() throws InterruptedException, TimeoutException {
		XMPPPacket xmppPacket = null;

		synchronized (this.holder) {
			long start = System.currentTimeMillis();

			while (this.holder.getObj() == null) {
				this.holder.wait(this.replyTimeout);

				long end = System.currentTimeMillis();

				if (end - start > this.replyTimeout) {
					throw new TimeoutException("Server did not reply in time:" + this.replyTimeout);
				}
			}

			xmppPacket = this.holder.getObj();
			this.holder.setObj(null);
		}

		return xmppPacket;
	}

	private void bindResource(JID userJID, String resourceId) {
		// TODO: this line is meaningless. check it.
		userJID.setResource(resourceId);
		LOGGER.info("Login successfull");
	}

	private void closeConnection(boolean sendCloseStream) throws NetworkException {
		if (sendCloseStream) {
			StreamHeader header = new StreamHeader();
			header.setCloseStream(true);
			this.writer.writeSync(header);
			this.streamContext.setState(StreamState.CLOSED);
		}
	}

	@Override
	public void collect(Packet packet) {
		synchronized (this.holder) {
			if (packet instanceof XMPPPacket) {
				this.holder.setObj((XMPPPacket) packet);
				this.holder.notify();
			}
		}
	}

	/**
	 * Represents various outcomes if {@link XMPPStreamManager} is asked to
	 * start/restart a stream. Starting/Restarting a stream involves negotiating
	 * a stream.
	 */
	public static class NegotiationResult {
		private final boolean isError;
		private NegotiationError error;

		public NegotiationResult(boolean isError, NegotiationError error) {
			this.isError = isError;
			this.error = error;
		}

		public boolean isError() {
			return isError;
		}

		public boolean isSuccess() {
			return !isError;
		}

		public NegotiationError getError() {
			return error;
		}

	}

	/**
	 * Indicates type of error during stream negotiation.
	 */
	public enum NegotiationError {
		TIME_OUT,

		AUTHENTICATION_FAILED,

		TLS_FAILURE,

		RESOURCE_BIND_FAILED,

		STREAM_CLOSED,

		STREAM_ERROR,

		NEGOTIATION_INTERUPTED,

		STREAM_ALREADY_OPEN,

		ERROR;
	}

}
