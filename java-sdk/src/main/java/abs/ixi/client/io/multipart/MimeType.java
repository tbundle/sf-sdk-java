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

import abs.ixi.client.util.StringUtils;

/**
 * An enumeration represnting supported MIME content types. Stringflow core sdk
 * do not process the MIME content; it simply transmits it on the wire from a
 * {@link ContentSource} or receive it on the wire from server and wraps it into
 * a {@link ContentSource} which may internally persist it onto disk.
 * <p>
 * As sdk do not process the content, it does not make any decision based on
 * content type, therefore it can work even when the below list does not include
 * a content type. This enum is to allow application developers deal with
 * content types in better way. Although this list may not be exhaustive.
 * </p>
 * <p>
 * If this list does not include a content type, dont worry, we still support
 * it.
 * </p>
 * 
 * @author Yogi
 *
 */
public enum MimeType {
	/**
	 * Default content type; Archive document (multiple files embedded) (.bin)
	 */
	APPLICATION_OCTETSTREAM("application", "octet-stream", "arc"),

	/**
	 * Microsoft PowerPoint
	 */
	MS_PPT("application", "vnd.ms-powerpoint", "ppt"),

	/**
	 * Microsoft PowerPoint (OpenXML)
	 */
	MS_OPENXML_PPT("applicatiom", "vnd.openxmlformats-officedocument.presentationml.presentation", "pptx"),

	/**
	 * Adobe Portable Document Format (PDF)
	 */
	PDF("application", "pdf", "pdf"),

	/**
	 * RAR Archive
	 */
	ARCHIVE_RAR("application", "x-rar-compressed", "rar"),

	/**
	 * Rich Text Format (RTF)
	 */
	RTF("application", "rtf", "rtf"),

	/**
	 * Bourne shell script
	 */
	BOURNE_SHELL_SCRIPT("application", "x-sh", "sh"),

	/**
	 * BZip Archive
	 */
	ARCHIVE_BZIP("application", "x-bzip", ".bz"),

	/**
	 * BZip2 Archive
	 */
	ARCHIVE_BZIP2("application", "x-bzip2", "bz2"),

	/**
	 * C-Shell Script
	 */
	CSHELL_SCRIPT("application", "x-csh", "csh"),

	/**
	 * Microsoft Word
	 */
	MS_WORD_DOC("application", "msword", "doc"),

	/**
	 * Microsoft Word (OpenXML)
	 */
	MS_WORD_DOCX("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", "docx"),

	/**
	 * Microsoft Visio Document
	 */
	MS_VISIO_DOC("application", "vnd.visio", "vsd"),

	/**
	 * MS Embedded OpenType fonts
	 */
	MS_OPEN_FONTS("application", "vnd.ms-fontobject", "eot"),

	/**
	 * Microsoft Excel
	 */
	MS_EXCEL("application", "vnd.ms-excel", "xls"),

	/**
	 * Microsoft Excel (OpenXML format)
	 */
	MS_EXCEL_OPENXML("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx"),

	/**
	 * OpenDocument presentation
	 */
	OPENDOC_PPT("application", "vnd.oasis.opendocument.presentation", "odp"),

	/**
	 * OpenDocument spreadsheet document
	 */
	OPENDOC_SPREADSHEET("application", "vnd.oasis.opendocument.spreadsheet", "ods"),

	/**
	 * OpenDocument text document
	 */
	OPENDOC_TEXT_DOC("application", "vnd.oasis.opendocument.text", "odt"),

	/**
	 * JSON format
	 */
	JSON("application", "json", "json"),

	/**
	 * Java Archive (JAR)
	 */
	JAR("application", "java-archive", "jar"),

	/**
	 * Tape Archive (TAR)
	 */
	TAR_ARCHIVE("application", "x-tar", "tar"),

	/**
	 * XHTML
	 */
	XHTML("application", "xhtml+xml", "xhtml"),

	/**
	 * XML
	 */
	XML("application", "xml", "xml"),

	/**
	 * ZIP Archive
	 */
	ZIP_ARCHIVE("application", "zip", "zip"),

	/**
	 * 7-zip archive
	 */
	ZIP7_ARCHIVE("application", "x-7z-compressed", "7z"),

	/**
	 * AAC Audio format
	 */
	AUDIO_AAC("audio", "aac", "aac"),

	/**
	 * Audio Video Interleave video/x-msvideo
	 */
	VIDEO_AVI("video", "x-msvideo", "avi"),

	/**
	 * Windows OS/2 Bitmap Graphics
	 */
	IMAGE_BITMAP("image", "bmp", "bmp"),

	/**
	 * Cascading Style Sheets (CSS)
	 */
	TEXT_CSS("text", "css", "css"),

	/**
	 * Comma-separated values (CSV)
	 */
	TEXT_CSV("text", "csv", "csv"),

	/**
	 * Graphics Interchange Format (GIF)
	 */
	IMAGE_GIF("image", "gif", "gif"),

	/**
	 * HyperText Markup Language (HTML)
	 */
	TEXT_HTML("text", "html", "html"),

	/**
	 * HyperText Markup Language (HTML)
	 */
	TEXT_HTM("text", "html", "htm"),

	/**
	 * Icon format
	 */
	IMAGE_ICON("image", "x-icon", "ico"),

	/**
	 * iCalendar format
	 */
	TEXT_CALENDAR("text", "calendar", "ics"),

	/**
	 * JPEG images
	 */
	IMAGE_JPEG("image", "jpeg", "jpeg"),

	/**
	 * JPEG images
	 */
	IMAGE_JPG("image", "jpeg", "jpg"),

	/**
	 * Musical Instrument Digital Interface (MIDI)
	 */
	AUDIO_MIDI("audio", "midi", "midi"),

	/**
	 * Musical Instrument Digital Interface (MIDI)
	 */
	AUDIO_MID("audio", "x-midi", "mid"),

	/**
	 * MPEG Video
	 */
	VIDEO_MPEG("application", "mpeg", "mpeg"),

	/**
	 * OGG audio
	 */
	AUDIO_OGG("audio", "ogg", "oga"),

	/**
	 * OGG Video
	 */
	VIDEO_OGG("video", "ogv", "ogv"),

	/**
	 * Portable Network Graphics
	 */
	IMAGE_PNG("image", "png", "png"),

	/**
	 * Scalable Vector Graphics (SVG)
	 */
	IMAGE_SVG("image", "svg+xml", "svg"),

	/**
	 * Text, (generally ASCII or ISO 8859-n)
	 */
	PLAIN_TEXT("text", "plain", "txt"),

	/**
	 * Waveform Audio Format
	 */
	AUDIO_WAVE("audio", "wav", "wav"),

	/**
	 * 3GPP audio container
	 */
	AUDIO_3GPP("audio", "3gpp", "3gp"),

	/**
	 * 3GPP video container
	 */
	VIDEO_3GPP("video", "3gpp", "3gp");

	private String type;
	private String subtype;
	private String extension;

	private MimeType(String type, String subtype, String extension) {
		this.type = type;
		this.subtype = subtype;
		this.extension = extension;
	}

	public String getType() {
		return type;
	}

	public String getSubtype() {
		return subtype;
	}

	public String getExtension() {
		return extension;
	}

	public String getMimeType() {
		return this.type + "/" + this.subtype;
	}

	/**
	 * Return the {@link MimeType} based on extension
	 * 
	 * @param ext ext
	 * @return MimeType MimeType
	 */
	public static MimeType getMimeTypeByExtension(String ext) {
		for (MimeType mt : MimeType.values()) {
			if (StringUtils.safeEquals(mt.getExtension(), ext, false)) {
				return mt;
			}
		}

		throw new IllegalArgumentException("there is no MimeType for extenstion: " + ext);
	}

	/**
	 * Get {@link MimeType} based on a subtype
	 * 
	 * @param subtype subtype
	 * @return MimeType MimeType
	 */
	public static MimeType getMimeTypeBySubtype(String subtype) {
		for (MimeType mt : MimeType.values()) {
			if (StringUtils.safeEquals(mt.getSubtype(), subtype, false)) {
				return mt;
			}
		}

		throw new IllegalArgumentException("there is no MimeType for subtype: " + subtype);
	}

	/**
	 * Get {@link MimeType} based on mime type string
	 * 
	 * @param mimeType mimeType
	 * @return MimeType MimeType
	 */
	public static MimeType getMimeType(String mimeType) {
		for (MimeType mt : MimeType.values()) {
			if (StringUtils.safeEquals(mt.getMimeType(), mimeType, false)) {
				return mt;
			}
		}

		throw new IllegalArgumentException("there is no MimeType with name: " + mimeType);
	}

}
