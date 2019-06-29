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
package abs.ixi.client.io.multipart;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import abs.ixi.client.core.Writable;
import abs.ixi.client.util.CollectionUtils;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.util.UUIDGenerator;

/**
 * Represents a multipart message. A multipart message is a collection of its
 * body parts. A body part contains header and body content (represented by
 * {@link Multipart}). The class maintains order of multipart bodies as they
 * appear in multipart byte stream.
 */
public class MultipartMessage implements Writable {
	private static final char COLON = ':';
	private static final String LINE_FEED = "\r\n";
	protected static final byte DASH = 45;
	protected static final byte LF = 0xA;
	protected static final byte CR = 0xD;

	protected static final byte[] LINE_FEED_BYTES = new byte[] { CR, LF };
	protected static final ByteBuffer LINE_FEED_BUFFER = ByteBuffer.wrap(new byte[] { CR, LF });

	private static final char HYPHAN_CHAR = '-';
	private static final String BOUNDARY = "boundary";

	private Map<String, String> headers;
	private byte[] boundary;
	private List<Multipart> parts;

	public MultipartMessage() {
		this.headers = new HashMap<>();
		this.parts = new ArrayList<>();
	}

	public MultipartMessage(byte[] boundary) {
		this.headers = new HashMap<>();
		this.parts = new ArrayList<>();
		this.boundary = boundary;
		this.addHeader(BOUNDARY, new String(boundary, StandardCharsets.US_ASCII));
	}

	public MultipartMessage(String boundary) {
		this.headers = new HashMap<>();
		this.parts = new ArrayList<>();
		this.boundary = boundary.getBytes(StandardCharsets.US_ASCII);
		this.addHeader(BOUNDARY, boundary);
	}

	public static String generateBoundary() {
		StringBuilder sb = new StringBuilder().append(UUIDGenerator.secureId(16)).append(HYPHAN_CHAR)
				.append(UUIDGenerator.secureId(16));

		return sb.toString();
	}

	public void addHeader(String key, String value) {
		this.headers.put(key, value);
		if (StringUtils.safeEquals(key, BOUNDARY, false) && value != null) {
			this.boundary = value.getBytes(StandardCharsets.US_ASCII);
		}
	}

	public void addHeaders(Map<String, String> headers) {
		this.headers.putAll(headers);
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public String getHeader(String key) {
		return headers.get(key);
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public List<Multipart> getParts() {
		return parts;
	}

	public void addMultiPart(Multipart part) {
		this.parts.add(part);
	}

	public byte[] getBoundary() {
		return boundary;
	}

	public int getBoundayLength() {
		return this.getBoundary().length;
	}

	/**
	 * Returns a new multipart. Returned multipart is added to multipart list
	 * before returning.
	 * 
	 * @return Multipart Multipart
	 */
	public Multipart newMultipart() {
		Multipart m = new Multipart();
		parts.add(m);
		return m;
	}

	/**
	 * @return number of body parts held by this message
	 */
	public int partCount() {
		return this.parts.size();
	}

	@Override
	public long writeTo(OutputStream os) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long writeTo(Socket socket) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long writeTo(SocketChannel socketChannel) throws IOException {
		long byteCount = 0;

		byteCount += socketChannel.write(ByteBuffer.wrap(getHeaderBytes()));
		byteCount += writeLineFeed(socketChannel);

		if (!CollectionUtils.isNullOrEmpty(parts)) {
			ByteBuffer beginBoundaryBuffer = ByteBuffer.wrap(generateBoundaryBegin());

			for (Multipart part : parts) {
				byteCount += socketChannel.write(beginBoundaryBuffer);
				beginBoundaryBuffer.flip();

				part.writeTo(socketChannel);

				byteCount += writeLineFeed(socketChannel);
			}

			byteCount += socketChannel.write(ByteBuffer.wrap(generateBoundaryEnd()));

		}

		byteCount += writeLineFeed(socketChannel);
		return byteCount;
	}

	private int writeLineFeed(SocketChannel socketChannel) throws IOException {
		int count = socketChannel.write(LINE_FEED_BUFFER);
		LINE_FEED_BUFFER.flip();
		return count;
	}

	private byte[] generateBoundaryBegin() {
		byte[] boundaryBegin = new byte[this.boundary.length + 4];
		int offset = 0;

		boundaryBegin[offset++] = DASH;
		boundaryBegin[offset++] = DASH;

		System.arraycopy(this.getBoundary(), 0, boundaryBegin, offset, this.getBoundayLength());

		offset += this.getBoundayLength();

		boundaryBegin[offset++] = CR;
		boundaryBegin[offset++] = LF;

		return boundaryBegin;
	}

	private byte[] generateBoundaryEnd() {
		byte[] boundaryEnd = new byte[this.boundary.length + 6];
		int offset = 0;

		boundaryEnd[offset++] = DASH;
		boundaryEnd[offset++] = DASH;

		System.arraycopy(this.getBoundary(), 0, boundaryEnd, offset, this.getBoundayLength());

		offset += this.getBoundayLength();

		boundaryEnd[offset++] = DASH;
		boundaryEnd[offset++] = DASH;
		boundaryEnd[offset++] = CR;
		boundaryEnd[offset++] = LF;

		return boundaryEnd;
	}

	private byte[] getHeaderBytes() {
		StringBuilder sb = new StringBuilder();

		for (Entry<String, String> header : this.headers.entrySet()) {
			if (header.getValue() != null) {
				sb.append(header.getKey());
				sb.append(COLON);
				sb.append(header.getValue());
				sb.append(LINE_FEED);
			}
		}

		return sb.toString().getBytes(StandardCharsets.US_ASCII);
	}

}
