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

import java.io.Serializable;

import abs.ixi.client.util.StringUtils;

/**
 * Represents Jabber ID
 */
public class JID implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String SEPARATOR_AT = "@";
	private static final String SEPARATOR_SLASH = "/";

	private String node;
	private String domain;
	private String resource;

	/**
	 * Parses the supplied JabberId for node, domain and resource fields
	 * 
	 * @param jid String value of the jid
	 * @throws InvalidJabberId if the jid supplied is malformed
	 */
	public JID(String jid) throws InvalidJabberId {
		if (!StringUtils.isNullOrEmpty(jid)) {
			String[] arr = jid.split(SEPARATOR_AT);

			if (arr.length == 1) {
				this.domain = jid;

			} else if (arr.length == 2) {
				this.node = arr[0];

				String s = arr[1];
				String[] d = s.split(SEPARATOR_SLASH);

				if (d.length == 1) {
					this.domain = d[0];
				} else if (d.length == 2) {
					this.domain = d[0];
					this.resource = d[1];
				}
			}
		} else {
			throw new InvalidJabberId("JID supplied is invalid :" + jid);
		}
	}

	public JID(String node, String domain) {
		this.node = node;
		this.domain = domain;
	}

	public JID(String node, String domain, String resource) {
		this.node = node;
		this.domain = domain;
		this.resource = resource;
	}

	public JID(JID bareJID, String resource) {
		this.node = bareJID.getNode();
		this.domain = bareJID.getDomain();
		this.resource = resource;

	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("JID {").append(node).append(SEPARATOR_AT).append(domain)
				.append(SEPARATOR_SLASH).append(resource).append("}").toString();
	}

	public String getBareJID() {
		StringBuilder sb = new StringBuilder();

		if (!StringUtils.isNullOrEmpty(node)) {
			sb.append(node).append(SEPARATOR_AT);
		}

		sb.append(domain);

		return sb.toString();
	}

	public String getFullJID() {
		StringBuilder sb = new StringBuilder();

		if (!StringUtils.isNullOrEmpty(node)) {
			sb.append(node).append(SEPARATOR_AT);
		}

		sb.append(domain);

		if (!StringUtils.isNullOrEmpty(resource)) {
			sb.append(SEPARATOR_SLASH).append(resource);
		}

		return sb.toString();
	}

	public boolean isFullJId() {
		return StringUtils.isNullOrEmpty(this.resource) ? false : true;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}

		if (this == o) {
			return true;
		}

		if (o instanceof JID) {
			JID jid = (JID) o;

			boolean isThisFullJID = false;
			boolean isJidFullJID = false;
			boolean result = false;

			if ((isThisFullJID = isFullJId()) && (isJidFullJID = jid.isFullJId())) {
				if (node.equals(jid.node) && domain.equals(jid.domain) && resource.equals(jid.resource)) {
					result = true;
				}
			} else if (!isThisFullJID && !isJidFullJID) {
				if (node.equals(jid.node) && domain.equals(jid.domain)) {
					result = true;
				}
			}

			return result;
		}

		return false;
	}

}
