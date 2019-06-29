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

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import abs.ixi.client.lang.Consumer;
import abs.ixi.client.lang.Function;
import abs.ixi.client.lang.Pair;

/**
 * This extremely simple implementation for XML element. It does not support
 * many features offered in XML specification for an implement. However it is
 * good enough to handle XMPP Stanza elements.
 * <p>
 * Currently this does not support {@link CDataSection}
 */
public class Element implements XMLNode {
	private static final long serialVersionUID = 1L;

	protected String name = null;
	protected String defxmlns = null;
	protected String xmlns = null;

	protected LinkedList<XMLNode> children;
	protected LinkedList<Pair<String, String>> attributes;

	/**
	 * Creates a blank element with the name given
	 * 
	 * @param name element name
	 */
	public Element(String name) {
		setName(name);
	}

	/**
	 * Creates a simple element with given and name and text value
	 * 
	 * @param name element name
	 * @param text string value of the element
	 */
	public Element(String name, String text) {
		setName(name);

		if (text != null) {
			addText(text);
		}
	}

	/**
	 * Public Constructor to instantiate Element
	 * 
	 * @param name name of the element
	 * @param attributeName array of attribute names
	 * @param attributeValues array of attribute values
	 */
	public Element(String name, StringBuilder[] attributeName, StringBuilder[] attributeValues) {
		this.name = name;
		if (attributeName != null && attributeValues != null) {
			attributes = new LinkedList<>();
			for (int i = 0; i < attributeName.length; i++) {
				if (attributeName[i] == null) {
					break;
				}
				attributes.add(new Pair<String, String>(attributeName[i].toString(), attributeValues[i].toString()));
			}
		}
	}

	/**
	 * Performs a deep copy on the supplied element and populates instance
	 * variable of this instance.
	 * 
	 * @param element element isntance from which this element will be cloned
	 */
	public Element(Element element) {
		Element src = element.clone();

		this.attributes = src.attributes;
		this.name = src.name;
		this.defxmlns = src.defxmlns;
		this.xmlns = src.xmlns;
		this.children = src.children;
	}

	public void addAttribute(String attName, String attValue) {
		setAttribute(attName, attValue);
	}

	public void addAttributes(Map<String, String> attrs) {
		if (attributes == null) {
			attributes = new LinkedList<>();
		}

		for (Map.Entry<String, String> entry : attrs.entrySet()) {
			attributes.add(new Pair<String, String>(entry.getKey(), entry.getValue()));
		}
	}

	public void addChild(XMLNode child) {
		if (child == null) {
			throw new NullPointerException("Element child can not be null.");
		}
		if (children == null) {
			children = new LinkedList<>();
		}

		children.add(child);
	}

	public void addChildren(List<Element> children) {
		if (children == null) {
			return;
		}

		if (this.children == null) {
			this.children = new LinkedList<>();
		}

		for (XMLNode child : children) {
			this.children.add(child.clone());
		}
	}

	public Element findChild(String[] elemPath) {
		if (elemPath[0].isEmpty()) {
			elemPath = Arrays.copyOfRange(elemPath, 1, elemPath.length);
		}
		if (!elemPath[0].equals(getName())) {
			return null;
		}

		Element child = this;

		// we must start with 1 not 0 as 0 is name of parent element
		for (int i = 1; (i < elemPath.length) && (child != null); i++) {
			String str = elemPath[i];

			child = child.getChild(str);
		}

		return child;
	}

	public <R> List<R> flatMapChildren(Function<Element, Collection<? extends R>> mapper) {
		if (children != null) {
			LinkedList<R> result = new LinkedList<R>();

			for (XMLNode node : children) {
				if (!(node instanceof Element)) {
					continue;
				}

				Element el = (Element) node;
				result.addAll(mapper.apply(el));
			}

			return result;
		}

		return null;
	}

	public void forEachChild(Consumer<Element> consumer) {
		if (children != null) {
			for (XMLNode node : children) {
				if (!(node instanceof Element)) {
					continue;
				}

				Element el = (Element) node;
				consumer.accept(el);
			}
		}
	}

	public String getChildAttribute(String childName, String attName) {
		String result = null;
		Element child = getChild(childName);

		if (child != null) {
			result = child.getAttribute(attName);
		}

		return result;
	}

	/**
	 * Returns value for the supplied attribute. As attributes are stored in a
	 * list, it's a plain linear probe. We may change the data structure to a
	 * {@link Map} if this degrades the performance. The assumption is that XMPP
	 * packets do not have too many attributes.
	 * 
	 * @param attName attribute name
	 * @return value of the attribute if present otherwise null
	 */
	public String getAttribute(String attName) {
		if (attributes != null) {
			for (Pair<String, String> pair : this.attributes) {
				if (pair.getFirst().equals(attName)) {
					return pair.getSecond();
				}
			}
		}

		return null;
	}

	/**
	 * Returns attributes for this element. Any change in the returned
	 * attributes will reflect back in this element attribute list
	 * 
	 * @return a list of {@link Pair}s in which first value is attribute name
	 *         and second is attribute value
	 */
	public List<Pair<String, String>> getAttributes() {
		return attributes;
	}

	public Element getChild(String name) {
		if (children != null) {
			for (XMLNode el : children) {
				if (el instanceof Element) {
					Element elem = (Element) el;
					if (elem.getName().equals(name)) {
						return elem;
					}
				}
			}
		}

		return null;
	}

	public Element getChildStaticStr(String name) {
		if (children != null) {
			for (XMLNode el : children) {
				if (el instanceof Element) {
					Element elem = (Element) el;

					if (elem.getName() == name) {
						return elem;
					}
				}
			}
		}

		return null;
	}

	public Element getChild(String name, String child_xmlns) {
		if (child_xmlns == null) {
			return getChild(name);
		}
		if (children != null) {
			for (XMLNode el : children) {
				if (el instanceof Element) {
					Element elem = (Element) el;
					if (elem.getName().equals(name) && (child_xmlns.equals(elem.getXMLNS()))) {
						return elem;
					}
				}
			}
		}

		return null;
	}

	public List<Element> getChildren() {
		if (children != null) {
			LinkedList<Element> result = new LinkedList<Element>();

			for (XMLNode node : children) {
				if (node instanceof Element) {
					result.add((Element) node);
				}
			}

			return result;
		}

		return null;
	}

	public List<Element> getChildren(String[] elementPath) {
		Element child = findChild(elementPath);

		return (child != null) ? child.getChildren() : null;
	}

	public String getXMLNS() {
		if (xmlns == null) {
			xmlns = getAttribute("xmlns");
			xmlns = ((xmlns != null) ? xmlns.intern() : null);
		}

		return (xmlns != null) ? xmlns : defxmlns;
	}

	public String getXMLNS(String[] elementPath) {
		Element child = findChild(elementPath);

		return (child != null) ? child.getXMLNS() : null;
	}

	public void removeAttribute(String key) {
		if (attributes != null) {
			attributes.remove(key.intern());
		}
	}

	public boolean removeChild(Element child) {
		boolean res = false;

		if (children != null) {
			res = children.remove(child);
		}

		return res;
	}

	public void setAttribute(String key, String value) {
		if (attributes == null) {
			attributes = new LinkedList<>();
		}

		String k = key.intern();
		String v = value;

		if (k == "xmlns") {
			xmlns = value.intern();
			v = xmlns;
		}

		attributes.add(new Pair<String, String>(k, v));
	}

	/**
	 * Adds text node in the children of this element. This operation will
	 * remove exiting {@link CDataSection} and {@link Text} nodes from the
	 * children
	 * 
	 * @param text String value for this element
	 */
	public void addText(String text) {
		addText(text, true);
	}

	/**
	 * adds {@link Text} node to this element children. If
	 * {@code removeExisting} flag is on, exisitng {@link CDataSection} and
	 * {@link Text} nodes will be removed
	 *
	 * @param text String value of this element
	 * @param removeExiting a flag indicating if the exisitng value should be
	 *            removed
	 */
	public void addText(String text, boolean removeExiting) {
		if (removeExiting) {
			removeText();
		}

		addChild(new Text(text));
	}

	/**
	 * Removes {@link Text} nodes and {@link CDataSection} nodes from the
	 * children of this element
	 */
	public void removeText() {
		if (this.children == null)
			return;
		Iterator<XMLNode> iterator = this.children.iterator();

		while (iterator.hasNext()) {
			XMLNode node = iterator.next();

			if (node instanceof Text && !(node instanceof CDataSection))
				this.children.remove(node);
		}

	}

	/**
	 * Adds {@link CDataSection} node in the children of this element
	 * 
	 * @param cdata CDATA content String
	 */
	public void addCDATASection(String cdata) {
		addChild(new CDataSection(cdata));
	}

	public void setChildren(List<XMLNode> children) {
		this.children = new LinkedList<>();

		for (XMLNode child : children) {
			this.children.add(child.clone());
		}
	}

	public void setDefXMLNS(String ns) {
		defxmlns = ns.intern();
	}

	public void setName(String argName) {
		this.name = argName.intern();
	}

	public void setXMLNS(String ns) {
		if (ns == null) {
			xmlns = null;
			removeAttribute("xmlns");
		} else {
			xmlns = ns.intern();
			setAttribute("xmlns", xmlns);
		}
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int children() {
		return children != null && !children.isEmpty() ? children.size() : 0;
	}

	@Override
	public String stringify() {
		StringBuilder xml = new StringBuilder();

		xml.append("<").append(name);

		if (attributes != null) {
			for (Pair<String, String> pair : this.attributes) {
				xml.append(" ").append(pair.getFirst()).append("='").append(pair.getSecond()).append("'");
			}
		}

		if (children != null && !children.isEmpty()) {
			xml.append(">");
			xml.append(stringifyChildren());
			xml.append("</").append(name).append(">");
		} else {
			xml.append("/>");
		}

		return xml.toString();
	}

	@Override
	public String stringifyChildren() {
		StringBuilder xml = new StringBuilder();

		if (children != null && !children.isEmpty()) {
			for (XMLNode child : children) {
				xml.append(child.stringify());
			}
		}

		return xml.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Element clone() {
		Element clone = null;

		try {

			clone = (Element) super.clone();

		} catch (CloneNotSupportedException e) {
			throw new ParserInternalError("Clone is not supported on element");
		}

		if (this.attributes != null) {
			clone.attributes = (LinkedList<Pair<String, String>>) this.attributes.clone();

		} else {
			clone.attributes = null;
		}

		if (children != null) {
			clone.setChildren(this.children);

		} else {
			clone.children = null;
		}

		return clone;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Element) {
			String objString = ((Element) obj).stringify();
			String thisString = this.stringify();

			return objString == thisString;
		}

		return false;
	}

	@Override
	public String val() {
		if (this.children == null)
			return null;

		StringBuilder val = new StringBuilder();

		for (XMLNode child : this.children) {
			if (child instanceof Text || child instanceof CDataSection) {
				val.append(child.val());
			}
		}

		return val.toString();
	}

	@Override
	public String toString() {
		return "Element " + this.name + "[Children: " + this.children() + "]";
	}

}
