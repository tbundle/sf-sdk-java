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

import static abs.ixi.client.util.StringUtils.safeEquals;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.core.Packet;
import abs.ixi.client.core.PacketFactory;
import abs.ixi.client.lang.ByteSource;
import abs.ixi.client.lang.CharSource;
import abs.ixi.client.xml.DomEventHandler;
import abs.ixi.client.xml.Element;
import abs.ixi.client.xml.ParseEventHandler;
import abs.ixi.client.xml.ParseEventHandler.ParseEventCallback;
import abs.ixi.client.xml.ParserException;
import abs.ixi.client.xml.ParserState.Error;
import abs.ixi.client.xml.XmlParser;
import abs.ixi.client.xml.XmlParserFactory;
import abs.ixi.client.xmpp.StreamClosedException;
import abs.ixi.client.xmpp.XMPPTags;
import abs.ixi.client.xmpp.packet.StreamHeader;
import abs.ixi.client.xmpp.packet.XMPPPacket;

public class XMPPByteProcessor implements ByteProcessor {
	private static final Logger LOGGER = Logger.getLogger(XMPPByteProcessor.class.getName());

	private static XmlParser xmlParser = XmlParserFactory.getParser();

	private byte[] partialBytes;
	private CharsetDecoder decoder;
	private CharsetEncoder encoder;
	private CharSource charSource;
	private ParseEventHandler xmlParserHandler;

	private PacketReceiver<XMPPPacket> packetReceiver;

	public XMPPByteProcessor(PacketReceiver<XMPPPacket> receiver) {
		this.xmlParserHandler = new DomEventHandler(new XmlParserCallback());
		this.decoder = StandardCharsets.UTF_8.newDecoder();
		this.encoder = StandardCharsets.UTF_8.newEncoder();
		this.charSource = new CharSource(new char[0]);
		this.packetReceiver = receiver;
	}

	@Override
	public void resume(Packet switchOver) {
		this.partialBytes = null;
	}

	public void processBytes(ByteSource networkData) throws Exception {
		this.processBytes(networkData, networkData.remaining());
	}

	public void processBytes(ByteSource networkData, int length) throws Exception {
		// Partial bytes are appended to input data so lets flush it
		this.partialBytes = null;

		CharBuffer chars = readChar(networkData.bytes(), networkData.position(), length);
		charSource.reload(chars.array(), 0, chars.position());

		processCharStream(this.charSource);
	}

	/**
	 * Parse xml characters stored in {@link CharSource} object. Parsed elements
	 * generate {@link XMPPPacket} and these packets are handled in Callback
	 * invocation. Each time character source exhausts or parser quits
	 * processing, we check if there is an error in parser. For parser errors,
	 * {@link ParserException} is thrown.
	 * 
	 * @param chars chars
	 * 
	 * @throws Exception Exception
	 */
	public void processCharStream(CharSource chars) throws Exception {
		xmlParser.parse(this.xmlParserHandler, chars);

		if (this.xmlParserHandler.getParserState().isError()) {
			Error error = this.xmlParserHandler.getParserState().getErrorType();

			if (error == Error.CLOSE_ELEMENT_BEFORE_OPEN && xmlParserHandler.getParserState().getElementName() != null
					&& safeEquals(xmlParserHandler.getParserState().getElementName().toString(), XMPPTags.STREAM_TAG)) {

				StreamHeader header = new StreamHeader();
				header.setCloseStream(true);
				this.packetReceiver.receive(header);

				throw new StreamClosedException();

			} else {
				LOGGER.log(Level.SEVERE, "XMLParser is in Error state. Stopping stream processing");
				throw new ParserException("Encountered XMPP stream parsing error");
			}
		}
	}

	private CharBuffer readChar(byte[] b, int offset, int length) throws MalformedStreamException {
		return readChar(ByteBuffer.wrap(b, offset, length));
	}

	// TODO Allocating buffer again and again is not a good idea. Lets resuse
	// it.
	private CharBuffer readChar(ByteBuffer buf) throws MalformedStreamException {
		CharBuffer cb = CharBuffer.allocate(buf.remaining());

		CoderResult cr = this.decoder.decode(buf, cb, false);

		if (cr.isError()) {
			throw new MalformedStreamException();
		}

		if (cr.isUnderflow() && buf.remaining() > 0) {
			LOGGER.fine("cr underflow encountered");

			this.partialBytes = new byte[buf.remaining()];
			buf.get(this.partialBytes);
		}

		if (cr.isOverflow()) {
			LOGGER.fine("Not sure how can we reach here");
		}

		return cb;
	}

	@Override
	public int unprocessedByteCount() {
		int unprocessedByteCount = 0;

		if (this.charSource.remaining() > 0) {
			CharBuffer cbuf = CharBuffer.wrap(charSource.getChars(), charSource.position(), charSource.remaining());

			try {
				ByteBuffer bbuf = this.encoder.encode(cbuf);
				unprocessedByteCount += bbuf.remaining();

			} catch (CharacterCodingException e) {
				LOGGER.log(Level.SEVERE, "Character coding exception caught");
			}
		}

		return unprocessedByteCount + partialBytesCount();
	}

	public boolean hasPartialBytes() {
		return this.partialBytes != null && this.partialBytes.length > 0;
	}

	public byte[] getPartialBytes() {
		return partialBytes;
	}

	public int partialBytesCount() {
		return this.partialBytes != null ? this.partialBytes.length : 0;
	}

	@Override
	public void flushUnprocessedBytes() {
		this.partialBytes = null;
		this.charSource.reload(new char[0]);
	}

	/**
	 * Callback event handler for {@link DomEventHandler}.
	 * {@link DomEventHandler} invokes the callback whenever it has a new
	 * element or there is a parsing error.
	 */
	class XmlParserCallback implements ParseEventCallback {
		@Override
		public boolean onParsedElement(Element e) {
			try {
				Element element = xmlParserHandler.getParsedElement();
				XMPPPacket xmppPacket = PacketFactory.createPacket(element);

				if (xmppPacket != null) {
					return packetReceiver.receive(xmppPacket);

				} else {
					LOGGER.log(Level.WARNING, "Generated packet is null " + element);
					return true;
				}

			} catch (Exception e1) {
				LOGGER.log(Level.SEVERE, "failed to handle packet", e1);
				// swallowing it for now.
				return true;
			}
		}
	}

}
