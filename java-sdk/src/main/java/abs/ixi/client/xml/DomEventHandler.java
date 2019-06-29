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

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * DomBuilder is an implementation of {@link ParseEventHandler}. It is a very
 * simple implementation of Content Handler ({@link ParseEventHandler}) for
 * {@link SwiftParser}. {@code DomBuilder} can handle multiple document at the
 * same time (multi-root xml) and returns these document in the same order in
 * which they were received on the network.
 */
public class DomEventHandler implements ParseEventHandler {
	private static final Logger LOGGER = Logger.getLogger(DomEventHandler.class.getName());

	private ParserState parserState = null;
	private Element parsedElement;
	private Stack<Element> elmStack = new Stack<Element>();
	private Map<String, String> namespaces = new TreeMap<String, String>();
	private ParseEventCallback callback;

	public DomEventHandler(ParseEventCallback callback) {
		this.callback = callback;
	}

	@Override
	public Element getParsedElement() {
		Element element = parsedElement;
		this.parsedElement = null;

		return element;
	}

	private Element newElement(String name, String cdata, StringBuilder[] attnames, StringBuilder[] attvals) {
		return new Element(name, attnames, attvals);
	}

	public void printElmStack() {
		LOGGER.fine("Printing ElmStack Elements");

		Iterator<Element> itr = elmStack.iterator();

		while (itr.hasNext()) {
			LOGGER.fine(itr.next().stringify());
		}

	}

	@Override
	public void onStartElement(StringBuilder name, StringBuilder[] attr_names, StringBuilder[] attr_values) {
		if (attr_names != null) {
			for (int i = 0; i < attr_names.length; ++i) {
				if (attr_names[i] == null) {
					break;
				}

				if (attr_names[i].toString().startsWith("xmlns:")) {
					namespaces.put(attr_names[i].substring("xmlns:".length(), attr_names[i].length()),
							attr_values[i].toString());
				}
			}
		}

		String tmp_name = name.toString();
		String new_xmlns = null;
		String prefix = null;
		String tmp_name_prefix = null;
		int idx = tmp_name.indexOf(':');

		if (idx > 0) {
			tmp_name_prefix = tmp_name.substring(0, idx);
		}

		if (tmp_name_prefix != null) {
			for (String pref : namespaces.keySet()) {
				if (tmp_name_prefix.equals(pref)) {
					new_xmlns = namespaces.get(pref);
					tmp_name = tmp_name.substring(pref.length() + 1, tmp_name.length());
					prefix = pref;
				}
			}
		}

		Element elem = newElement(tmp_name, null, attr_names, attr_values);
		String ns = elem.getXMLNS();

		if (ns == null) {
			if (elmStack.isEmpty() || elmStack.peek().getXMLNS() == null) {
			} else {
				elem.setDefXMLNS(elmStack.peek().getXMLNS());
			}
		}
		if (new_xmlns != null) {
			elem.setXMLNS(new_xmlns);
			elem.removeAttribute("xmlns:" + prefix);
		}

		if (tmp_name.equals("stream")) {
			addParsedElement(elem);
		} else {
			elmStack.push(elem);
		}
	}

	@Override
	public void onElementCData(StringBuilder cdata) {
		try {
			System.out.println("Adding cData:" + cdata);
			elmStack.peek().addCDATASection(cdata.toString());
		} catch (EmptyStackException e) {
			System.out.println();
			// Swallow exception
			// TODO throwing exception could be a good idea
		}
	}

	@Override
	public boolean onEndElement(StringBuilder name) {
		String tmp_name = name.toString();
		String tmp_name_prefix = null;
		int idx = tmp_name.indexOf(':');

		if (idx > 0) {
			tmp_name_prefix = tmp_name.substring(0, idx);
		}

		if (tmp_name_prefix != null) {
			for (String pref : namespaces.keySet()) {
				if (tmp_name_prefix.equals(pref)) {
					tmp_name = tmp_name.substring(pref.length() + 1, tmp_name.length());
				}
			}
		}

		if (elmStack.isEmpty()) {
			// It means we have encountered end of element without start of it.
			elmStack.push(newElement(tmp_name, null, null, null));
			return false;
		}

		Element elem = elmStack.pop();
		if (!elem.getName().equals(tmp_name))
			return false;

		if (elmStack.isEmpty()) {
			addParsedElement(elem);
		} else {
			elmStack.peek().addChild(elem);
		}

		return true;
	}

	/**
	 * Adds parsed element to parsed root
	 * 
	 * @param elem element to be added
	 */
	protected void addParsedElement(Element elem) {
		this.parsedElement = elem;
		boolean quit = this.callback.onParsedElement(elem);

		if (quit) {
			// TODO Should implement better mechanism to quit
			this.parserState.foundRootElement();
		}
	}

	@Override
	public void onOtherXML(StringBuilder other) {
		LOGGER.fine("Other XML content: " + other);
	}

	@Override
	public void saveParserState(ParserState state) {
		this.parserState = state;
	}

	@Override
	public ParserState getParserState() {
		return this.parserState == null ? new ParserState() : this.parserState;
	}

	@Override
	public void onError(String errorMessage) {
		LOGGER.fine("XML content parse error.");
		LOGGER.warning(errorMessage);
		LOGGER.warning(parserState.toString());
		printElmStack();
	}

	@Override
	public boolean hasParsedElement() {
		return this.parsedElement != null;
	}

	@Override
	public void onElementText(StringBuilder text) {
		try {
			elmStack.peek().addText(text.toString());

		} catch (EmptyStackException e) {
			// Swallow exception
			// TODO throwing exception could be a good idea
		}
	}

}