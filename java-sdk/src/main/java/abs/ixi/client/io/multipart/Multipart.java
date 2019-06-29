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
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import abs.ixi.client.core.Writable;
import abs.ixi.client.util.ObjectUtils;

/**
 * A {@link MultipartMessage} can have multiple parts within it; each of these
 * parts is represented by {@link Multipart}. A {@code Multipart} contains
 * headers and body. Headers are stored in a {@link Map} and miltipart body is
 * held in a {@link Content}
 */
public class Multipart implements Writable {
	private static final char COLON = ':';
	private static final String LINE_FEED = "\r\n";
	public static final byte LF = 0xA;
	public static final byte CR = 0xD;

	public static final String NAME = "name";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CONTENT_LENGTH = "Content-Length";

	protected static final byte[] LINE_FEED_BYTES = new byte[] { CR, LF };
	public static final ByteBuffer LINE_FEED_BUFFER = ByteBuffer.wrap(new byte[] { CR, LF });

	private Map<String, String> headers;
	private Content content;
	private byte[] headerBytes;
	private boolean generatedHeaderBytes;

	public Multipart() {
		this.headers = new HashMap<>();
	}

	public Multipart(String name) {
		this(name, null);
	}

	public Multipart(String name, Content content) {
		this.headers = new HashMap<>();
		this.content = content;
		this.setContentName(name);
		addHeaders();
	}

	public Multipart(Map<String, String> headers, byte[] content) {
		this.headers = headers;
		this.content = new BinaryContent(new ByteArrayContentSource(content));
		addHeaders();
	}

	private void setContentName(String name) {
		this.headers.put(NAME, name);
	}

	/**
	 * Add Content-Type and Content-Length header to {@link Multipart} headers
	 */
	private void addHeaders() {
		if (content != null) {
			this.headers.put(CONTENT_TYPE, content.getContentType());
			this.headers.put(CONTENT_LENGTH, Long.toString(content.getContentLength()));
		}
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
		addHeaders();
	}

	public ContentSource getContentSource() {
		return this.content.getContentSource();
	}

	public void addHeader(String key, String value) {
		this.headers.put(key, value);
	}

	public void addHeaders(Map<String, String> headers) {
		this.headers.putAll(headers);
	}

	public String getHeader(String key) {
		return this.headers.get(key);
	}

	public Map<String, String> getHeaders() {
		return this.headers;
	}

	public int getContentLength() {
		return ObjectUtils.parseToInt(this.getHeader(CONTENT_LENGTH).toString());
	}

	public String getName() {
		return this.getHeader(NAME);
	}

	/**
	 * Append headers to a String and generate bytes using
	 * {@link StandardCharsets#US_ASCII} encoding.
	 * 
	 * @return byte byte array
	 */
	protected byte[] generateHeaderBytes() {
		StringBuilder sb = new StringBuilder();

		for (Entry<String, String> header : this.headers.entrySet()) {
			if (header.getValue() != null) {
				sb.append(header.getKey());
				sb.append(COLON);
				sb.append(header.getValue());
				sb.append(LINE_FEED);
			}
		}

		this.headerBytes = sb.toString().getBytes(StandardCharsets.US_ASCII);
		this.generatedHeaderBytes = true;

		return this.headerBytes;
	}

	public byte[] getHeaderBytes() {
		return this.generatedHeaderBytes ? this.headerBytes : generateHeaderBytes();
	}

	/**
	 * @return value of Content-Type header for this {@link Multipart}
	 */
	public String getContentType() {
		Object contentType = this.headers.get(CONTENT_TYPE);
		return contentType == null ? null : contentType.toString();
	}

	/**
	 * Calculate the length of this multipart object. Length is the number of
	 * bytes required to represent this Multipart in memeory. Returned length
	 * includes both header bytes along with body content bytes.
	 * @return long long
	 */
	public long getMultipartLength() {
		long byteCount = 0;

		if (content == null) {
			return byteCount;
		}

		byteCount += getHeaderBytes().length;
		byteCount += LINE_FEED_BUFFER.limit();

		if (this.getContentSource() != null) {
			byteCount += this.getContentSource().getLength();
		}

		byteCount += LINE_FEED_BUFFER.limit();

		return byteCount;
	}

	@Override
	public long writeTo(Socket socket) throws IOException {
		return 0;
	}

	@Override
	public long writeTo(OutputStream os) throws IOException {
		return 0;
	}

	@Override
	public long writeTo(SocketChannel socketChannel) throws IOException {
		long byteCount = 0;

		if (content == null) {
			return byteCount;
		}

		byteCount += socketChannel.write(ByteBuffer.wrap(getHeaderBytes()));
		byteCount += writeLineFeed(socketChannel);

		if (this.getContentSource() != null) {
			byteCount += this.getContentSource().writeTo(socketChannel);
		}

		return byteCount;
	}

	private long writeLineFeed(SocketChannel socketChannel) throws IOException {
		int count = socketChannel.write(LINE_FEED_BUFFER);
		LINE_FEED_BUFFER.flip();

		return count;
	}

}
