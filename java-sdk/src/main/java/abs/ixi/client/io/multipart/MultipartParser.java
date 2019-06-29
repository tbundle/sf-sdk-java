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
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

import abs.ixi.client.io.multipart.LineReader.Line;
import abs.ixi.client.lang.ByteSource;
import abs.ixi.client.util.ArrayUtils;

/**
 * As the name suggests, {@code MultipartParser} parses a byte stream carrying a
 * multipart message. Multipart message definition supported in server is not
 * same as outlined in RFC 822. It is more simplified version of the multipart
 * message defined for mail protocol. It will fair to say that
 * {@code MultipartParser} can process multipart message used by HTTP protocol.
 * <p>
 * Parser implementation is state less; therefore it is also thread-safe.
 * </p>
 */
public class MultipartParser {
	private static final Logger LOGGER = Logger.getLogger(MultipartParser.class.getName());

	private static final LineReader<Line> reader = new BasicLineReader();
	private static final byte DASH = '-';
	private static final String COLON = ":";

	// Restricting instantiation
	MultipartParser() {
		// do-nothing constructor
	}

	/**
	 * Parses mime bytes from given {@link ByteSource} using the handler given.
	 * As the parser is state less, the parsing process state is maintained by
	 * 
	 * @param byteSource byteSource
	 * @param context context
	 * @throws MalformedMimeException MalformedMimeException
	 * @throws IOException IOException
	 */
	public void parse(ByteSource byteSource, MultipartParserContext context)
			throws MalformedMimeException, IOException {
		while (byteSource.hasNext()) {
			ParseState state = context.getParserState();

			switch (state) {
			case PARSING_PREAMBLE:
				parsePreamble(byteSource, context);
				break;

			case PARSING_MIME_HEADER:
				parseMimeHeaders(byteSource, context);
				break;

			case PARSING_MULTIPART_HEADER:
				parseMultipartHeaders(byteSource, context);
				break;
			case PARSING_MULTIPART_BODY:
				parseMultipartBody(byteSource, context);
				break;
			case END:
				context.reset();
				break;
			}
		}
	}

	/**
	 * Processes Mime message header Section.
	 * 
	 * @param byteSource
	 * @param context
	 * @throws MalformedMimeException
	 */
	private void parseMimeHeaders(ByteSource byteSource, MultipartParserContext context) throws MalformedMimeException {
		LOGGER.info("Parsing mime header...");
		Line line = reader.readLine(byteSource, false);

		if (line.isPartialLine()) {
			savePartialLineBytes(byteSource, line, context);

		} else if (line.isBlankLine()) {
			LOGGER.info("Found blank Line ...");
			Line nextLine = reader.readLine(byteSource, false);

			if (isStartBoundary(byteSource, nextLine.start(), nextLine.end(), context)) {
				LOGGER.info("Found start of boundary ...");

				context.mimeHeaderParsed();
				context.addNewMultipart();
				context.setParserState(ParseState.PARSING_MULTIPART_HEADER);

			} else if (nextLine.isBlankLine() && context.getBoundary() == null) {
				context.mimeHeaderParsed();
				context.setParserState(ParseState.END);
				context.setMessageReady(true);

			} else {

				throw new MalformedMimeException("Could not find start of boundary");
			}

		} else {
			String headerLine = new String(byteSource.bytes(), line.start(), line.length(), StandardCharsets.US_ASCII);
			prepareMimeHeader(headerLine, context);
		}

	}

	private void prepareMimeHeader(String headerLine, MultipartParserContext context) throws MalformedMimeException {
		LOGGER.info("Preparing for mime header for : " + headerLine);
		String[] header = headerLine.split(COLON);

		if (header.length == 2) {
			context.addMessageHeader(header[0].trim(), header[1].trim());

		} else {
			throw new MalformedMimeException("Could not preapre header");
		}
	}

	/**
	 * Processes preamble section of multipart. Changes the parser state to
	 * {@link ParseState#PARSING_MULTIPART_HEADER}
	 * 
	 * @param byteSource
	 * @param context
	 * @throws MalformedMimeException
	 */
	private void parsePreamble(ByteSource byteSource, MultipartParserContext context) throws MalformedMimeException {
		Line line = reader.readLine(byteSource, true);

		if (line.isPartialLine()) {
			savePartialLineBytes(byteSource, line, context);

		} else if (!line.isBlankLine()) {
			String headerLine = new String(byteSource.bytes(), line.start(), line.length(), StandardCharsets.US_ASCII);
			prepareMimeHeader(headerLine, context);
			context.setParserState(ParseState.PARSING_MIME_HEADER);
		}
	}

	private void savePartialLineBytes(ByteSource byteSource, Line line, MultipartParserContext context) {
		byte[] partialLineBytes = new byte[line.length()];
		System.arraycopy(byteSource.bytes(), line.start(), partialLineBytes, 0, line.length());
		context.setPartialLineBytes(partialLineBytes);
	}

	/**
	 * Checks if the range given in byte source is multipart boundary.The method
	 * MUST not change {@link ByteSource} markers such as position, limit.
	 * 
	 * @param byteSource
	 * @param startIndex
	 * @param endIndex
	 * @param context
	 * @return
	 */
	private boolean isStartBoundary(ByteSource byteSource, int startIndex, int endIndex,
			MultipartParserContext context) {
		if (byteSource.get(startIndex++) == DASH && byteSource.get(startIndex++) == DASH) {
			if (ArrayUtils.areEqual(byteSource.bytes(), startIndex, endIndex - 1, context.getBoundary(), 0,
					(context.getBoundary().length - 1))) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Parses header section of a multipart. At this point, we assume that
	 * boundary has already been parsed.
	 * 
	 * @param src
	 * @param context
	 */
	private void parseMultipartHeaders(ByteSource src, MultipartParserContext context) throws MalformedMimeException {
		Line line = reader.readLine(src, false);
		if (line.isPartialLine()) {
			savePartialLineBytes(src, line, context);

		} else if (line.isBlankLine()) {
			context.mltipartHeaderParsed();
			context.setParserState(ParseState.PARSING_MULTIPART_BODY);

		} else {
			String headerLine = new String(src.bytes(), line.start(), line.length(), StandardCharsets.US_ASCII);
			prepareMultipartHeader(headerLine, context);
		}
	}

	/**
	 * Processes header line received in byte stream and generates header
	 * key-value pairs
	 * 
	 * @param headerLine header line received for a mime
	 * @param context parser context
	 * @throws MalformedMimeException
	 */
	private void prepareMultipartHeader(String headerLine, MultipartParserContext context)
			throws MalformedMimeException {
		String[] header = headerLine.split(COLON);

		if (header.length == 2) {
			context.addMultipartHeader(header[0].trim(), header[1].trim());

		} else {
			throw new MalformedMimeException("Could not preapre header");
		}
	}

	/**
	 * Parses mime body for a multipart in the incoming byte stream.
	 * 
	 * @param byteSource
	 * @param context
	 * @throws IOException
	 */
	private void parseMultipartBody(ByteSource byteSource, MultipartParserContext context) throws IOException {
		Line line = reader.readLine(byteSource, false);

		if (line.isPartialLine()) {
			savePartialLineBytes(byteSource, line, context);

		} else {
			int isBoundary = isBoundary(byteSource, line.start(), line.end(), context);

			switch (isBoundary) {
			case 0:
				context.onMultipartContent(byteSource, line.start(), line.length(), line.getLineBreak().getBytes());
				break;

			case 1:
				context.notifyMultipartEnd();
				context.setParserState(ParseState.PARSING_MULTIPART_HEADER);
				context.addNewMultipart();
				break;

			case 2:
				context.notifyMultipartEnd();
				context.setParserState(ParseState.END);
				context.setMessageReady(true);
				break;

			default:
				break;
			}
		}

	}

	/**
	 * Checks if the {@link Line} is start boundary or end boundary
	 * 
	 * @param line
	 * @param byteSource
	 * @param context
	 * @return 0 if not a boundary, 1 if it is a start boundary and 2 if it is a
	 *         end boundary
	 */
	private int isBoundary(ByteSource byteSource, int startIndex, int endIndex, MultipartParserContext context) {

		if (byteSource.get(startIndex++) == DASH && byteSource.get(startIndex++) == DASH) {
			if (ArrayUtils.areEqual(byteSource.bytes(), startIndex, endIndex - 1, context.getBoundary(), 0,
					(context.getBoundary().length - 1))) {

				return 1;

			} else {
				if (ArrayUtils.areEqual(byteSource.bytes(), startIndex, endIndex - 3, context.getBoundary(), 0,
						(context.getBoundary().length - 1)) && byteSource.get(endIndex - 2) == DASH
						&& byteSource.get(endIndex - 1) == DASH) {

					return 2;
				}
			}
		}

		return 0;
	}

	/**
	 * While parsing a mime byte stream, parser transitions through various
	 * message parts and the parsing mechanism differs for each section.
	 * {@code ParseState} indicates the section of mime message which parser is
	 * parsing currently.
	 */
	enum ParseState {
		PARSING_PREAMBLE,

		PARSING_MIME_HEADER,

		PARSING_MULTIPART_HEADER,

		PARSING_MULTIPART_BODY,

		END;
	}

}
