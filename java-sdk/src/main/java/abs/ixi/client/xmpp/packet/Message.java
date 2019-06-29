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
package abs.ixi.client.xmpp.packet;

import static abs.ixi.client.util.StringUtils.SPACE;

import java.util.ArrayList;
import java.util.List;

import abs.ixi.client.core.Language;
import abs.ixi.client.file.sfcm.ContentType;
import abs.ixi.client.io.MalformedXmppDataException;
import abs.ixi.client.util.CollectionUtils;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.util.UUIDGenerator;
import abs.ixi.client.xml.Element;
import abs.ixi.client.xml.XMLUtils;
import abs.ixi.client.xmpp.XMPPNamespace;
import abs.ixi.client.xmpp.packet.MessageContent.MessageContentType;

public class Message extends Stanza {
	private static final long serialVersionUID = -7596606642056110385L;

	private static final String CONTENT_TYPE = "content-type";
	private static final String THUMB = "thumb";

	private static final String MESSAGE_OPEN = "<message".intern();
	private static final String MEDIA_OPEN = "<media".intern();
	private static final String MEDIA_CLOSE = "</media>";
	private static final String CONTENT_TYPE_OPEN = "<content-type>";
	private static final String CONTENT_TYPE_CLOSE = "</content-type>";
	private static final String THUMB_OPEN = "<thumb>";
	private static final String THUMB_CLOSE = "</thumb>";

	private static final String ATTR_PARENT = "parent";
	private static final String ATTR_ID = "id='".intern();
	private static final String ATTR_FROM = "from='".intern();
	private static final String ATTR_TO = "to='".intern();
	private static final String ATTR_TYPE = "type='".intern();
	private static final String SUBJECT_OPEN = "<subject>".intern();
	private static final String SUBJECT_CLOSE = "</subject>".intern();
	private static final String BODY_OPEN = "<body>".intern();
	private static final String BODY_CLOSE = "</body>".intern();
	private static final String THREAD_CLOSE = "</thread>".intern();
	private static final String MESSAGE_CLOSE = "</message>".intern();
	private static final String STAMP = "stamp".intern();

	private MessageType type;
	private List<MessageContent> contents;

	public Message() {
		this(UUIDGenerator.secureId(), MessageType.CHAT);
	}

	public Message(String messageId) {
		this(messageId, MessageType.CHAT);
	}

	public Message(String messageId, MessageType type) {
		super(messageId);
		this.type = type;
		this.lang = Language.ENGLISH;
	}

	public Message(Element element) throws Exception {
		super(element);

		if (StringUtils.isNullOrEmpty(element.getAttribute(TYPE))) {
			this.type = MessageType.CHAT;

		} else {

			this.type = MessageType.valueFrom(element.getAttribute(TYPE));
		}

		generateContent(element);
	}

	private void generateContent(Element element) throws MalformedXmppDataException {

		for (Element elm : element.getChildren()) {
			if (StringUtils.safeEquals(elm.getName(), MessageBody.XML_ELM_NAME)) {
				this.addContent(new MessageBody(XMLUtils.decodeSpecialChars(elm.val())));

			} else if (StringUtils.safeEquals(elm.getName(), MessageThread.XML_ELM_NAME)) {
				MessageThread thread = new MessageThread(elm.val());
				thread.setParentId(elm.getAttribute(ATTR_PARENT));
				this.addContent(thread);

			} else if (StringUtils.safeEquals(elm.getName(), MessageSubject.XML_ELM_NAME)) {
				this.addContent(new MessageSubject(XMLUtils.decodeSpecialChars(elm.val())));

			} else if (StringUtils.safeEquals(elm.getName(), MessageMedia.XML_ELM_NAME)) {
				this.addContent(generateMessageMedia(elm));

			} else if (StringUtils.safeEquals(elm.getName(), MDRRequest.XML_ELM_NAME)) {
				this.addContent(new MDRRequest(elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), MDRReceived.XML_ELM_NAME) && StringUtils
					.safeEquals(elm.getAttribute(XMLNS), XMPPNamespace.MESSAGE_DELIVERY_RECEIPTS_NAMESPACE)) {

				this.addContent(new MDRReceived(elm.getAttribute(ID), elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CMMarkable.XML_ELM_NAME)) {
				this.addContent(new CMMarkable(elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CMReceived.XML_ELM_NAME)
					&& StringUtils.safeEquals(elm.getAttribute(XMLNS), XMPPNamespace.CHAT_MARKER_NAMESPACE)) {

				this.addContent(new CMReceived(elm.getAttribute(ID), elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CMDisplayed.XML_ELM_NAME)) {
				this.addContent(new CMDisplayed(elm.getAttribute(ID), elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CMAcknowledged.XML_ELM_NAME)) {
				this.addContent(new CMAcknowledged(elm.getAttribute(ID), elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), MessageDelay.XML_ELM_NAME)) {
				this.addContent(generateMessageDelay(elm));

			} else if (StringUtils.safeEquals(elm.getName(), CSNActive.XML_ELM_NAME)) {
				this.addContent(new CSNActive(elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CSNInactive.XML_ELM_NAME)) {
				this.addContent(new CSNInactive(elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CSNComposing.XML_ELM_NAME)) {
				this.addContent(new CSNComposing(elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CSNPaused.XML_ELM_NAME)) {
				this.addContent(new CSNPaused(elm.getAttribute(XMLNS)));

			} else if (StringUtils.safeEquals(elm.getName(), CSNGone.XML_ELM_NAME)) {
				this.addContent(new CSNGone(elm.getAttribute(XMLNS)));

			}
		}

	}

	private MessageContent generateMessageDelay(Element elm) {
		MessageDelay delay = new MessageDelay(elm.getAttribute(XMLNS));
		delay.setStamp(elm.getAttribute(STAMP));
		delay.setFrom(elm.getAttribute(FROM));

		return delay;
	}

	private MessageContent generateMessageMedia(Element elm) {
		MessageMedia media = new MessageMedia(elm.getAttribute(ID));

		for (Element child : elm.getChildren()) {
			if (StringUtils.safeEquals(child.getName(), CONTENT_TYPE, false)) {
				media.setContentType(new ContentType(child.val()));

			} else if (StringUtils.safeEquals(child.getName(), THUMB, false)) {
				media.setThumb(child.val());

			}
		}

		return media;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public List<MessageContent> getContents() {
		return this.contents;
	}

	public void setContents(List<MessageContent> contents) {
		this.contents = contents;
	}

	public void addContent(MessageContent content) {
		if (this.contents == null)
			this.contents = new ArrayList<MessageContent>();

		this.contents.add(content);
	}

	@Override
	public boolean isMessage() {
		return true;
	}

	@Override
	public String xml() {
		StringBuilder sb = new StringBuilder();
		prepareStartTag(sb);

		if (!CollectionUtils.isNullOrEmpty(this.contents)) {
			for (MessageContent content : this.contents) {
				if (content.isContentType(MessageContentType.BODY)) {
					sb.append(BODY_OPEN).append(XMLUtils.encodeSpecialChars(content.toString())).append(BODY_CLOSE);

				} else if (content.isContentType(MessageContentType.THREAD)) {
					MessageThread thread = (MessageThread) content;

					sb.append(OPEN_BRACKET).append(MessageThread.XML_ELM_NAME);

					if (!StringUtils.isNullOrEmpty(thread.getParentId())) {
						sb.append(SPACE).append(ATTR_PARENT).append(EQUALS).append(SINGLE_QUOTE)
								.append(thread.getParentId()).append(SINGLE_QUOTE);
					}

					sb.append(CLOSE_BRACKET).append(thread.getThreadId()).append(THREAD_CLOSE);

				} else if (content.isContentType(MessageContentType.SUBJECT)) {
					sb.append(SUBJECT_OPEN).append(XMLUtils.encodeSpecialChars(content.toString()))
							.append(SUBJECT_CLOSE);

				} else if (content.isContentType(MessageContentType.MEDIA)) {
					sb.append(prepareMediaXml((MessageMedia) content));

				} else if (content.isContentType(MessageContentType.MDR_REQUEST)) {
					MDRRequest request = (MDRRequest) content;

					sb.append(OPEN_BRACKET).append(MDRRequest.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(request.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.MDR_RECEIVED)) {
					MDRReceived received = (MDRReceived) content;

					sb.append(OPEN_BRACKET).append(MDRReceived.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(received.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(ID).append(SPACE).append(SINGLE_QUOTE).append(received.getMessageId())
							.append(SINGLE_QUOTE).append(SPACE).append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CM_MARKABLE)) {
					CMMarkable markable = (CMMarkable) content;

					sb.append(OPEN_BRACKET).append(CMMarkable.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(markable.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CM_RECEIVED)) {
					CMReceived received = (CMReceived) content;

					sb.append(OPEN_BRACKET).append(CMReceived.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(received.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(ID).append(EQUALS).append(SINGLE_QUOTE).append(received.getMessageId())
							.append(SINGLE_QUOTE).append(SPACE).append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CM_DISPLAYED)) {
					CMDisplayed displayed = (CMDisplayed) content;

					sb.append(OPEN_BRACKET).append(CMDisplayed.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(displayed.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(ID).append(EQUALS).append(SINGLE_QUOTE).append(displayed.getMessageId())
							.append(SINGLE_QUOTE).append(SPACE).append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CM_ACKNOWLEDGED)) {
					CMAcknowledged acknowledged = (CMAcknowledged) content;

					sb.append(OPEN_BRACKET).append(CMAcknowledged.XML_ELM_NAME).append(SPACE).append(XMLNS)
							.append(EQUALS).append(SINGLE_QUOTE).append(acknowledged.getXmlns()).append(SINGLE_QUOTE)
							.append(SPACE).append(ID).append(EQUALS).append(SINGLE_QUOTE)
							.append(acknowledged.getMessageId()).append(SINGLE_QUOTE).append(SPACE).append(SLASH)
							.append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CSN_ACTIVE)) {
					CSNActive active = (CSNActive) content;

					sb.append(OPEN_BRACKET).append(CSNActive.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(active.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CSN_COMPOSING)) {
					CSNComposing composing = (CSNComposing) content;

					sb.append(OPEN_BRACKET).append(CSNComposing.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(composing.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CSN_PAUSED)) {
					CSNPaused paused = (CSNPaused) content;

					sb.append(OPEN_BRACKET).append(CSNPaused.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(paused.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CSN_INACTIVE)) {
					CSNInactive inactive = (CSNInactive) content;

					sb.append(OPEN_BRACKET).append(CSNInactive.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(inactive.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.CSN_GONE)) {
					CSNGone gone = (CSNGone) content;

					sb.append(OPEN_BRACKET).append(CSNGone.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(gone.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(SLASH).append(CLOSE_BRACKET);

				} else if (content.isContentType(MessageContentType.DELAY)) {
					MessageDelay delay = (MessageDelay) content;
					sb.append(OPEN_BRACKET).append(MessageDelay.XML_ELM_NAME).append(SPACE).append(XMLNS).append(EQUALS)
							.append(SINGLE_QUOTE).append(delay.getXmlns()).append(SINGLE_QUOTE).append(SPACE)
							.append(STAMP).append(EQUALS).append(SINGLE_QUOTE).append(delay.getStamp())
							.append(SINGLE_QUOTE).append(SPACE).append(SLASH).append(CLOSE_BRACKET);

				}
			}
		}

		sb.append(MESSAGE_CLOSE);

		return sb.toString();
	}

	private String prepareMediaXml(MessageMedia media) {
		StringBuilder sb = new StringBuilder();

		sb.append(MEDIA_OPEN).append(SPACE).append(ATTR_ID).append(media.getMediaId()).append(SINGLE_QUOTE)
				.append(CLOSE_BRACKET);

		if (media.getContentType() != null) {
			sb.append(CONTENT_TYPE_OPEN).append(media.getContentType().getMimeType()).append(CONTENT_TYPE_CLOSE);
		}

		if (!StringUtils.isNullOrEmpty(media.getThumb())) {
			sb.append(THUMB_OPEN).append(media.getThumb()).append(THUMB_CLOSE);
		}

		sb.append(MEDIA_CLOSE);

		return sb.toString();
	}

	/**
	 * Prepares start tag of the message element
	 * 
	 * @param sb String builder which will be appended with data
	 * @return StringBuilder instance after appending start element
	 */
	private StringBuilder prepareStartTag(StringBuilder sb) {
		sb.append(MESSAGE_OPEN).append(SPACE);

		if (this.getId() != null) {
			sb.append(ATTR_ID).append(this.getId()).append(SINGLE_QUOTE).append(SPACE);
		}

		if (this.getFrom() != null) {
			sb.append(ATTR_FROM).append(this.getFrom().getFullJID()).append(SINGLE_QUOTE).append(SPACE);
		}

		if (this.getTo() != null) {
			sb.append(ATTR_TO).append(this.getTo().getBareJID()).append(SINGLE_QUOTE).append(SPACE);
		}

		if (this.getType() != null) {
			sb.append(ATTR_TYPE).append(this.getType().val()).append(SINGLE_QUOTE).append(SPACE);

		} else {
			sb.append(ATTR_TYPE).append(MessageType.CHAT).append(SINGLE_QUOTE).append(SPACE);
		}

		sb.append(CLOSE_BRACKET);

		return sb;
	}

	public enum MessageType {
		GROUP_CHAT("groupchat"),

		CHAT("chat"),

		ERROR("error "),

		HEADLINE("headline"),

		NORMAL("normal");

		private String val;

		private MessageType(String val) {
			this.val = val;
		}

		public String val() {
			return this.val;
		}

		public static MessageType valueFrom(String val) throws IllegalArgumentException {
			for (MessageType type : values()) {
				if (type.val().equalsIgnoreCase(val)) {
					return type;
				}
			}

			throw new IllegalArgumentException("No MsgType for value [" + val + "]");
		}

	}

}