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
package abs.ixi.client.xml;

import static abs.ixi.client.xml.ParserConfiguration.ALLOWED_CHARS_LOW;
import static abs.ixi.client.xml.ParserConfiguration.ATTR_BLOCK_SIZE;
import static abs.ixi.client.xml.ParserConfiguration.ATTR_NAME_MAX_LENGTH;
import static abs.ixi.client.xml.ParserConfiguration.ATTR_VALUE_MAX_LENGTH;
import static abs.ixi.client.xml.ParserConfiguration.CDATA_MAX_SIZE;
import static abs.ixi.client.xml.ParserConfiguration.CLOSE_BRACKET;
import static abs.ixi.client.xml.ParserConfiguration.DOUBLE_QUOTE;
import static abs.ixi.client.xml.ParserConfiguration.ELM_NAME_MAX_LENGTH;
import static abs.ixi.client.xml.ParserConfiguration.EQUALS;
import static abs.ixi.client.xml.ParserConfiguration.ERR_NAME_CHARS;
import static abs.ixi.client.xml.ParserConfiguration.EXCLAMATION_MARK;
import static abs.ixi.client.xml.ParserConfiguration.HASH;
import static abs.ixi.client.xml.ParserConfiguration.MAX_ATTR_COUNT;
import static abs.ixi.client.xml.ParserConfiguration.OPEN_BRACKET;
import static abs.ixi.client.xml.ParserConfiguration.QUESTION_MARK;
import static abs.ixi.client.xml.ParserConfiguration.SEMICOLON;
import static abs.ixi.client.xml.ParserConfiguration.SINGLE_QUOTE;
import static abs.ixi.client.xml.ParserConfiguration.SLASH;
import static abs.ixi.client.xml.ParserConfiguration.WHITE_CHARS;
import static abs.ixi.client.xml.ParserState.Error.ATTR_COUNT_LIMIT_EXCEEDED;
import static abs.ixi.client.xml.ParserState.Error.ATTR_NAME_LENGTH_LIMIT_EXCEEDED;
import static abs.ixi.client.xml.ParserState.Error.ATTR_VALUE_LENGTH_LIMIT_EXCEEDED;
import static abs.ixi.client.xml.ParserState.Error.CHAR_NOT_ALLOWED;
import static abs.ixi.client.xml.ParserState.Error.CLOSE_ELEMENT_BEFORE_OPEN;
import static abs.ixi.client.xml.ParserState.Error.ELEMENT_NAME_SIZE_LIMIT_EXCEEDED;
import static abs.ixi.client.xml.ParserState.Error.ELEMENT_VALUE_SIZE_LIMIT_EXCEEDED;
import static abs.ixi.client.xml.ParserState.Error.INVALID_ENTITY;

import java.util.Arrays;

import abs.ixi.client.lang.CharSource;
import abs.ixi.client.util.ArrayUtils;
import abs.ixi.client.util.CharUtils;

/**
 * A event based parser with very limited capability. It can not handle all the
 * XML constructs correctly. It has been written keeping in mind that it will be
 * used only for XMPP packet parsing. Also, normal text and {@link CDataSection}
 * are handled the same way in the parser currently.
 * 
 * <p>
 * It can not handle comment blocks
 * </p>
 */
public class SwiftParser implements XmlParser {

	/**
	 * {@code SwiftParser} is to be used as singleton. Therefore, restricting
	 * constructor access to package. Parser instance must be retrieved using
	 * {@link XmlParserFactory}
	 */
	SwiftParser() {
		// do-nothing constructor
	}

	@Override
	public void parse(ParseEventHandler handler, CharSource charSource) throws ParserException {
		ParserState parserState = handler.getParserState();
		handler.saveParserState(parserState);

		while (charSource.hasNext()) {
			char c = charSource.next();

			if (!isValidChar(parserState, c)) {
				parserState.errorMessage = "Character '" + c + "' is not allowed in XML stream";
				parserState.stage = ParsingStage.ERROR;
				parserState.errorType = CHAR_NOT_ALLOWED;
			}

			if (ParsingStage.START == parserState.stage) {
				if (c == OPEN_BRACKET) {
					parserState.stage = ParsingStage.OPEN_BRACKET;
					parserState.slashFound = false;
				}

			} else if (ParsingStage.OPEN_BRACKET == parserState.stage) {
				handleOpenBracketStage(parserState, c);

			} else if (ParsingStage.START_ELEMENT_NAME == parserState.stage) {
				startElementNameStage(handler, parserState, c);

			} else if (ParsingStage.CLOSE_ELEMENT == parserState.stage) {
				closeElement(handler, parserState, c);

			} else if (ParsingStage.END_ELEMENT_NAME == parserState.stage) {
				endElementName(handler, parserState, c);

			} else if (ParsingStage.START_ATTR_NAME == parserState.stage) {
				startAttributeName(parserState, c);

			} else if (ParsingStage.END_ATTR_NAME == parserState.stage) {
				endAttributeName(parserState, c);

			} else if (ParsingStage.START_ATTR_VALUE_SQ == parserState.stage) {
				startAttributeValueSQ(parserState, c);

			} else if (ParsingStage.START_ATTR_VALUE_DQ == parserState.stage) {
				startAttributeValueDQ(parserState, c);

			} else if (ParsingStage.ELEMENT_TEXT == parserState.stage) {
				startElementValue(handler, parserState, c);

			} else if (ParsingStage.START_CDATA == parserState.stage) {
				startElementCData(handler, parserState, c);

			} else if (ParsingStage.START_CDATA_CONTENT == parserState.stage) {
				startCDataContent(handler, parserState, c);

			} else if (ParsingStage.END_CDATA == parserState.stage) {
				endCDataContent(handler, parserState, c);

			} else if (ParsingStage.ENTITY == parserState.stage) {
				entity(parserState, c);

			} else if (ParsingStage.END_OF_ROOT == parserState.stage) {
				parserState.stage = ParsingStage.START;
				charSource.setPosition(charSource.position() - 1);

				return;

			} else if (ParsingStage.OTHER_XML == parserState.stage) {
				otherXml(handler, parserState, c);

			} else if (ParsingStage.ERROR == parserState.stage) {
				handler.onError(parserState.errorMessage);
				parserState = null;
				return;

			} else {
				throw new ParserException("Unknown parser state");
			}
		}

		if (handler.hasParsedElement()) {
			parserState.stage = ParsingStage.START;
		}
	}

	private void otherXml(ParseEventHandler handler, ParserState parserState, char c) {
		if (c == CLOSE_BRACKET) {
			parserState.stage = ParsingStage.START;
			handler.onOtherXML(parserState.elementCData);
			parserState.elementCData = null;
			return;

		}

		if (parserState.elementCData == null) {
			parserState.elementCData = new StringBuilder(100);
		}

		parserState.elementCData.append(c);

		if (parserState.elementCData.length() > CDATA_MAX_SIZE) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Max cdata size exceeded: " + CDATA_MAX_SIZE + "\nreceived: "
					+ parserState.elementCData.toString();
			parserState.errorType = ELEMENT_VALUE_SIZE_LIMIT_EXCEEDED;
		}
	}

	private void entity(ParserState parserState, char c) {
		boolean alpha = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
		boolean numeric = !alpha && (c >= '0' && c <= '9');

		boolean valid = true;

		switch (parserState.entityType) {
		case UNKNOWN:
			if (alpha) {
				parserState.entityType = Entity.NAMED;
			} else if (c == HASH) {
				parserState.entityType = Entity.CODEPOINT;
			} else {
				valid = false;
			}
			break;
		case NAMED:
			if (!(alpha || numeric)) {
				if (c != SEMICOLON)
					valid = false;
				else
					parserState.stage = parserState.prevStage;
			}
			break;
		case CODEPOINT:
			if (c == 'x') {
				parserState.entityType = Entity.CODEPOINT_HEX;
			}
			if (numeric) {
				parserState.entityType = Entity.CODEPOINT_DEC;
			} else {
				valid = false;
			}
			break;
		case CODEPOINT_DEC:
			if (!numeric) {
				if (c != SEMICOLON)
					valid = false;
				else
					parserState.stage = parserState.prevStage;
			}
			break;
		case CODEPOINT_HEX:
			if (!((c >= 'a' && c <= 'f') || (c >= 'A' || c <= 'F') || numeric)) {
				if (c != SEMICOLON)
					valid = false;
				else
					parserState.stage = parserState.prevStage;
			}
			break;
		}

		if (valid) {
			switch (parserState.prevStage) {
			case START_ATTR_VALUE_DQ:
			case START_ATTR_VALUE_SQ:
				parserState.attributeValues[parserState.curAttrIndex].append(c);
				break;
			case START_CDATA:
			case ELEMENT_TEXT:
				parserState.elementCData.append(c);
				break;
			default:
				break;
			}
		} else {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Invalid XML entity";
			parserState.errorType = INVALID_ENTITY;
		}
	}

	private void startElementCData(ParseEventHandler handler, ParserState parserState, char c) {
		parserState.cDataBoundaryCharIndex++;

		if (c == ParserConfiguration.CDATA_START[parserState.cDataBoundaryCharIndex]) {
			if (parserState.cDataBoundaryCharIndex == 8) {
				parserState.stage = ParsingStage.START_CDATA_CONTENT;
				parserState.elementCData = new StringBuilder(100);
				parserState.cDataBoundaryCharIndex = -1;
				return;
			}

		} else {
			parserState.stage = ParsingStage.ERROR;
		}
	}

	private void startCDataContent(ParseEventHandler handler, ParserState parserState, char c) {
		if (c == ']') {
			parserState.stage = ParsingStage.END_CDATA;
		} else {
			parserState.elementCData.append(c);
		}
	}

	private void endCDataContent(ParseEventHandler handler, ParserState parserState, char c) {
		if (c == ']') {
			return;
		} else if (c == '>') {
			parserState.stage = ParsingStage.ELEMENT_TEXT;
			handler.onElementCData(parserState.elementCData);
			parserState.elementCData = null;
		} else {
			parserState.stage = ParsingStage.ERROR;
		}
	}

	private void startElementValue(ParseEventHandler handler, ParserState parserState, char c) {
		if (c == OPEN_BRACKET) {
			parserState.stage = ParsingStage.OPEN_BRACKET;
			parserState.slashFound = false;

			if (parserState.elementCData != null) {
				handler.onElementText(parserState.elementCData);
				parserState.elementCData = null;
			}

		} else {

			if (parserState.elementCData == null) {
				parserState.elementCData = new StringBuilder(100);
			}

			parserState.elementCData.append(c);
			if (c == '&') {
				parserState.prevStage = parserState.stage;
				parserState.stage = ParsingStage.ENTITY;
				parserState.entityType = Entity.UNKNOWN;
			}

			if (parserState.elementCData.length() > CDATA_MAX_SIZE) {
				parserState.stage = ParsingStage.ERROR;
				parserState.errorMessage = "Max cdata size exceeded: " + CDATA_MAX_SIZE + "\nreceived: "
						+ parserState.elementCData.toString();
				parserState.errorType = ELEMENT_VALUE_SIZE_LIMIT_EXCEEDED;
			}
		}
	}

	private void startAttributeValueDQ(ParserState parserState, char c) {
		if (c == DOUBLE_QUOTE) {
			parserState.stage = ParsingStage.END_ELEMENT_NAME;

			return;
		}

		parserState.attributeValues[parserState.curAttrIndex].append(c);

		switch (c) {
		case '&':
			parserState.prevStage = parserState.stage;
			parserState.stage = ParsingStage.ENTITY;
			parserState.entityType = Entity.UNKNOWN;
			break;
		case '<':
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Not allowed character in element attribute value: " + c
					+ "\nExisting characters in element attribute value: "
					+ parserState.attributeValues[parserState.curAttrIndex].toString();
			parserState.errorType = CHAR_NOT_ALLOWED;
			break;
		default:
			break;
		}

		if (parserState.attributeValues[parserState.curAttrIndex].length() > ATTR_VALUE_MAX_LENGTH) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Max attribute value size exceeded: " + ATTR_VALUE_MAX_LENGTH + "\nreceived: "
					+ parserState.attributeValues[parserState.curAttrIndex].toString();
			parserState.errorType = ATTR_VALUE_LENGTH_LIMIT_EXCEEDED;
		}
	}

	private void startAttributeValueSQ(ParserState parserState, char c) {
		if (c == SINGLE_QUOTE) {
			parserState.stage = ParsingStage.END_ELEMENT_NAME;

			return;
		}

		parserState.attributeValues[parserState.curAttrIndex].append(c);

		switch (c) {
		case '&':
			parserState.prevStage = parserState.stage;
			parserState.stage = ParsingStage.ENTITY;
			parserState.entityType = Entity.UNKNOWN;
			break;
		case '<':
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Not allowed character in element attribute value: " + c
					+ "\nExisting characters in element attribute value: "
					+ parserState.attributeValues[parserState.curAttrIndex].toString();
			parserState.errorType = CHAR_NOT_ALLOWED;
			break;
		default:
			break;
		}

		if (parserState.attributeValues[parserState.curAttrIndex].length() > ATTR_VALUE_MAX_LENGTH) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Max attribute value size exceeded: " + ATTR_VALUE_MAX_LENGTH + "\nreceived: "
					+ parserState.attributeValues[parserState.curAttrIndex].toString();
			parserState.errorType = ATTR_VALUE_LENGTH_LIMIT_EXCEEDED;
		}
	}

	private void endAttributeName(ParserState parserState, char c) {
		if (c == SINGLE_QUOTE) {
			parserState.stage = ParsingStage.START_ATTR_VALUE_SQ;
			parserState.attributeValues[parserState.curAttrIndex] = new StringBuilder(64);
		}

		if (c == DOUBLE_QUOTE) {
			parserState.stage = ParsingStage.START_ATTR_VALUE_DQ;
			parserState.attributeValues[parserState.curAttrIndex] = new StringBuilder(64);
		}
	}

	private void startAttributeName(ParserState parserState, char c) {
		if (CharUtils.isWhiteChar(c) || (c == EQUALS)) {
			parserState.stage = ParsingStage.END_ATTR_NAME;

			return;
		}

		if ((c == ERR_NAME_CHARS[0]) || (c == ERR_NAME_CHARS[1]) || (c == ERR_NAME_CHARS[2])) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Not allowed character in element attribute name: " + c
					+ "\nExisting characters in element attribute name: "
					+ parserState.attributeNames[parserState.curAttrIndex].toString();
			parserState.errorType = CHAR_NOT_ALLOWED;
			return;
		}

		parserState.attributeNames[parserState.curAttrIndex].append(c);

		if (parserState.attributeNames[parserState.curAttrIndex].length() > ATTR_NAME_MAX_LENGTH) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Max attribute name size exceeded: " + ATTR_NAME_MAX_LENGTH + "\nreceived: "
					+ parserState.attributeNames[parserState.curAttrIndex].toString();
			parserState.errorType = ATTR_NAME_LENGTH_LIMIT_EXCEEDED;
		}
	}

	private void endElementName(ParseEventHandler handler, ParserState parserState, char c) {
		if (c == SLASH) {
			parserState.slashFound = true;
			return;
		}

		if (c == CLOSE_BRACKET) {
			parserState.stage = ParsingStage.ELEMENT_TEXT;
			handler.onStartElement(parserState.elementName, parserState.attributeNames, parserState.attributeValues);
			parserState.attributeNames = null;
			parserState.attributeValues = null;
			parserState.curAttrIndex = -1;

			if (parserState.slashFound) {
				handler.onEndElement(parserState.elementName);
			}

			parserState.elementName = null;

			return;
		}

		if (!CharUtils.isWhiteChar(c)) {
			parserState.stage = ParsingStage.START_ATTR_NAME;

			if (parserState.attributeNames == null) {
				parserState.attributeNames = ArrayUtils.initArray(ATTR_BLOCK_SIZE);
				parserState.attributeValues = ArrayUtils.initArray(ATTR_BLOCK_SIZE);
			} else {
				if (parserState.curAttrIndex == parserState.attributeNames.length - 1) {
					if (parserState.attributeNames.length >= MAX_ATTR_COUNT) {
						parserState.stage = ParsingStage.ERROR;
						parserState.errorMessage = "Attributes nuber limit exceeded: " + MAX_ATTR_COUNT + "\nreceived: "
								+ parserState.elementName.toString();
						parserState.errorType = ATTR_COUNT_LIMIT_EXCEEDED;
						return;
					} else {
						int new_size = parserState.attributeNames.length + ATTR_BLOCK_SIZE;
						parserState.attributeNames = ArrayUtils.resizeArray(parserState.attributeNames, new_size);
						parserState.attributeValues = ArrayUtils.resizeArray(parserState.attributeValues, new_size);
					}
				}
			}

			parserState.attributeNames[++parserState.curAttrIndex] = new StringBuilder(8);
			parserState.attributeNames[parserState.curAttrIndex].append(c);
		}
	}

	private void closeElement(ParseEventHandler handler, ParserState parserState, char c) {
		if (CharUtils.isWhiteChar(c)) {
			return;
		}

		if (c == SLASH) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Not allowed character in close element name: " + c
					+ "\nExisting characters in close element name: " + parserState.elementName.toString();
			parserState.errorType = CHAR_NOT_ALLOWED;
			return;
		}

		if (c == CLOSE_BRACKET) {
			parserState.stage = ParsingStage.ELEMENT_TEXT;
			if (!handler.onEndElement(parserState.elementName)) {
				parserState.stage = ParsingStage.ERROR;
				parserState.errorMessage = "Malformed XML: element close found without open for this element: "
						+ parserState.elementName;
				parserState.errorType = CLOSE_ELEMENT_BEFORE_OPEN;
				return;
			}

			parserState.elementName = null;
			return;
		}

		if ((c == ERR_NAME_CHARS[0]) || (c == ERR_NAME_CHARS[1]) || (c == ERR_NAME_CHARS[2])) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Not allowed character in close element name: " + c
					+ "\nExisting characters in close element name: " + parserState.elementName.toString();
			parserState.errorType = CHAR_NOT_ALLOWED;
			return;
		}

		parserState.elementName.append(c);

		if (parserState.elementName.length() > ELM_NAME_MAX_LENGTH) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Max element name size exceeded: " + ELM_NAME_MAX_LENGTH + "\nreceived: "
					+ parserState.elementName.toString();
			parserState.errorType = ELEMENT_NAME_SIZE_LIMIT_EXCEEDED;
		}
	}

	private void startElementNameStage(ParseEventHandler handler, ParserState parserState, char c) {
		if (CharUtils.isWhiteChar(c)) {
			parserState.stage = ParsingStage.END_ELEMENT_NAME;

			return;
		}

		if (c == SLASH) {
			parserState.slashFound = true;

			return;
		}

		if (c == CLOSE_BRACKET) {
			parserState.stage = ParsingStage.ELEMENT_TEXT;
			handler.onStartElement(parserState.elementName, null, null);

			if (parserState.slashFound) {
				handler.onEndElement(parserState.elementName);
			}

			parserState.elementName = null;

			return;
		}

		if ((c == ERR_NAME_CHARS[0]) || (c == ERR_NAME_CHARS[1]) || (c == ERR_NAME_CHARS[2])) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Not allowed character in start element name: " + c
					+ "\nExisting characters in start element name: " + parserState.elementName.toString();
			parserState.errorType = CHAR_NOT_ALLOWED;

			return;
		}

		parserState.elementName.append(c);

		if (parserState.elementName.length() > ELM_NAME_MAX_LENGTH) {
			parserState.stage = ParsingStage.ERROR;
			parserState.errorMessage = "Max element name size exceeded: " + ELM_NAME_MAX_LENGTH + "\nreceived: "
					+ parserState.elementName.toString();
			parserState.errorType = ELEMENT_NAME_SIZE_LIMIT_EXCEEDED;
		}
	}

	private void handleOpenBracketStage(ParserState parserState, char c) {
		switch (c) {
		case QUESTION_MARK:
			parserState.stage = ParsingStage.OTHER_XML;
			parserState.elementCData = new StringBuilder(100);
			parserState.elementCData.append(c);

			break;

		case EXCLAMATION_MARK:
			parserState.stage = ParsingStage.START_CDATA;
			parserState.elementCData = new StringBuilder(100);
			parserState.cDataBoundaryCharIndex = 1;
			break;

		case SLASH:
			parserState.stage = ParsingStage.CLOSE_ELEMENT;
			parserState.elementName = new StringBuilder(10);
			parserState.slashFound = true;

			break;

		default:
			if (Arrays.binarySearch(WHITE_CHARS, c) < 0) {
				if ((c == ERR_NAME_CHARS[0]) || (c == ERR_NAME_CHARS[1]) || (c == ERR_NAME_CHARS[2])) {
					parserState.stage = ParsingStage.ERROR;
					parserState.errorMessage = "Not allowed character in start element name: " + c;
					parserState.errorType = CHAR_NOT_ALLOWED;
					break;
				}

				parserState.stage = ParsingStage.START_ELEMENT_NAME;
				parserState.elementName = new StringBuilder(10);
				parserState.elementName.append(c);
			}
		}
	}

	private boolean isValidChar(ParserState parserState, char chr) {
		boolean highSurrogate = parserState.highSurrogate;

		parserState.highSurrogate = false;

		if (chr <= 0xD7FF) {
			if (chr >= 0x20)
				return true;
			return ALLOWED_CHARS_LOW[chr];

		} else if (chr <= 0xFFFD) {
			if (chr >= 0xE000)
				return true;

			if (Character.isLowSurrogate(chr)) {
				return highSurrogate;
			} else if (Character.isHighSurrogate(chr)) {
				parserState.highSurrogate = true;
				return true;
			}
		}

		return false;
	}

	@Override
	public String getName() {
		return "SwiftParser";
	}

	public static enum Entity {
		NAMED,

		CODEPOINT,

		CODEPOINT_DEC,

		CODEPOINT_HEX,

		UNKNOWN;
	}

	public static enum ParsingStage {
		START,

		OPEN_BRACKET,

		START_ELEMENT_NAME,

		END_ELEMENT_NAME,

		START_ATTR_NAME,

		END_ATTR_NAME,

		START_ATTR_VALUE_SQ,

		START_ATTR_VALUE_DQ,

		ELEMENT_TEXT,

		START_CDATA,

		START_CDATA_CONTENT,

		END_CDATA,

		OTHER_XML,

		CLOSE_ELEMENT,

		ENTITY,

		END_OF_ROOT,

		ERROR;
	}

}
