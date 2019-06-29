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

import abs.ixi.client.util.CollectionUtils;
import abs.ixi.client.util.StringUtils;
import abs.ixi.client.xml.Element;
import abs.ixi.client.xmpp.InvalidJabberId;
import abs.ixi.client.xmpp.JID;
import abs.ixi.client.xmpp.packet.UserProfileData.Address;
import abs.ixi.client.xmpp.packet.UserProfileData.UserAvtar;

public class IQVCardContent extends AbstractIQContent {
	private static final long serialVersionUID = -3175427158044254234L;

	public static final String XML_ELM_NAME = "vCard";
	public static final String VCARD_XMLNS = "vcard-temp";

	private static final String NAME = "N";
	private static final String GIVEN = "GIVEN";
	private static final String MIDDLE = "MIDDLE";
	private static final String FAMILY = "FAMILY";

	private static final String NICKNAME = "NICKNAME";

	private static final String EMAIL = "EMAIL";
	private static final String EMAIL_USER_ID = "USERID";

	private static final String GENDER = "GENDER";
	private static final String BDAY = "BDAY";

	private static final String TEL = "TEL";
	private static final String NUMBER = "NUMBER";

	private static final String ADR = "ADR";
	private static final String HOME = "HOME";
	private static final String STREET = "STREET";
	private static final String LOCALITY = "LOCALITY";
	private static final String CITY = "CITY";
	private static final String STATE = "STATE";
	private static final String CTRY = "CTRY";
	private static final String PCODE = "pcode";

	private static final String DESC = "DESC";

	private static final String PHOTO = "PHOTO";
	private static final String BIN_VAL = "BINVAL";
	private static final String TYPE = "TYPE";

	private static final String JABBERID = "JABBERID";

	private static final String VCARD_ELEMENT = "<vCard xmlns='vcard-temp'/>";
	private static final String VCARD_OPEN_TAG = "<vCard xmlns='vcard-temp'>";
	private static final String VCARD_CLOSE_TAG = "</vCard>";

	private static final String N_OPEN_TAG = "<N>";
	private static final String N_CLOSE_TAG = "</N>";
	private static final String GIVEN_OPEN_TAG = "<GIVEN>";
	private static final String GIVEN_CLOSE_TAG = "</GIVEN>";
	private static final String MIDDLE_OPEN_TAG = "<MIDDLE>";
	private static final String MIDDLE_CLOSE_TAG = "</MIDDLE>";
	private static final String FAMILY_OPEN_TAG = "<FAMILY>";
	private static final String FAMILY_CLOSE_TAG = "</FAMILY>";

	private static final String NICK_NAME_OPEN_TAG = "<NICKNAME>";
	private static final String NICK_NAME_CLOSE_TAG = "</NICKNAME>";

	private static final String EMAIL_OPEN_TAG = "<EMAIL>";
	private static final String EMAIL_CLOSE_TAG = "</EMAIL>";
	private static final String USER_ID_OPEN_TAG = "<USERID>";
	private static final String USER_ID_CLOSE_TAG = "</USERID>";

	private static final String GENDER_OPEN_TAG = "<GENDER>";
	private static final String GENDER_CLOSE_TAG = "</GENDER>";

	private static final String BDAY_OPEN_TAG = "<BDAY>";
	private static final String BDAY_CLOSE_TAG = "</BDAY>";

	private static final String TEL_OPEN_TAG = "<TEL>";
	private static final String TEL_CLOSE_TAG = "</TEL>";
	private static final String NUMBER_OPEN_TAG = "<NUMBER>";
	private static final String NUMBER_CLOSE_TAG = "</NUMBER>";

	private static final String ADR_OPEN_TAG = "<ADR>";
	private static final String ADR_CLOSE_TAG = "</ADR>";
	private static final String HOME_OPEN_TAG = "<HOME>";
	private static final String HOME_CLOSE_TAG = "</HOME>";
	private static final String STREET_OPEN_TAG = "<STREET>";
	private static final String STREET_CLOSE_TAG = "</STREET>";
	private static final String LOCALITY_OPEN_TAG = "<LOCALITY>";
	private static final String LOCALITY_CLOSE_TAG = "</LOCALITY>";
	private static final String CITY_OPEN_TAG = "<CITY>";
	private static final String CITY_CLOSE_TAG = "</CITY>";
	private static final String STATE_OPEN_TAG = "<STATE>";
	private static final String STATE_CLOSE_TAG = "</STATE>";
	private static final String CTRY_OPEN_TAG = "<CTRY>";
	private static final String CTRY_CLOSE_TAG = "</CTRY>";
	private static final String PCODE_OPEN_TAG = "<pcode>";
	private static final String PCODE_CLOSE_TAG = "</pcode>";

	private static final String DESC_OPEN_TAG = "<DESC>";
	private static final String DESC_CLOSE_TAG = "</DESC>";

	private static final String PHOTO_OPEN_TAG = "<PHOTO>";
	private static final String PHOTO_CLOSE_TAG = "</PHOTO>";
	private static final String BINVAL_OPEN_TAG = "<BINVAL>";
	private static final String BINVAL_CLOSE_TAG = "</BINVAL>";
	private static final String TYPE_OPEN_TAG = "<TYPE>";
	private static final String TYPE_CLOSE_TAG = "</TYPE>";

	private static final String JABBERID_OPEN_TAG = "<JABBERID>";
	private static final String JABBERID_CLOSE_TAG = "</JABBERID>";

	private UserProfileData userData;

	public IQVCardContent() {
		super(VCARD_XMLNS, IQContentType.VCARD);
	}

	public IQVCardContent(UserProfileData userData) {
		super(VCARD_XMLNS, IQContentType.VCARD);
		this.userData = userData;
	}

	public IQVCardContent(Element vCardElment) throws InvalidJabberId {
		super(VCARD_XMLNS, IQContentType.VCARD);
		generateUserData(vCardElment);
	}

	private void generateUserData(Element vCardElment) throws InvalidJabberId {
		if (!CollectionUtils.isNullOrEmpty(vCardElment.getChildren())) {
			this.userData = new UserProfileData();

			for (Element elm : vCardElment.getChildren()) {
				if (StringUtils.safeEquals(elm.getName(), NAME)) {

					Element firstName = elm.getChild(GIVEN);

					if (firstName != null) {
						userData.setFirstName(firstName.val());
					}

					Element middleName = elm.getChild(MIDDLE);

					if (middleName != null) {
						userData.setMiddleName(middleName.val());
					}

					Element lastName = elm.getChild(FAMILY);

					if (lastName != null) {
						userData.setLastName(lastName.val());
					}

				} else if (StringUtils.safeEquals(elm.getName(), NICKNAME)) {
					userData.setNickName(elm.val());

				} else if (StringUtils.safeEquals(elm.getName(), EMAIL)) {
					Element userIdElm = elm.getChild(EMAIL_USER_ID);

					if (userIdElm != null) {
						userData.setEmail(userIdElm.val());
					}

				} else if (StringUtils.safeEquals(elm.getName(), GENDER)) {
					userData.setGender(elm.val());

				} else if (StringUtils.safeEquals(elm.getName(), BDAY)) {
					userData.setBday(elm.val());

				} else if (StringUtils.safeEquals(elm.getName(), TEL)) {
					Element numberElm = elm.getChild(NUMBER);

					if (numberElm != null) {
						userData.setPhone(numberElm.val());
					}

				} else if (StringUtils.safeEquals(elm.getName(), ADR)) {
					Address address = userData.new Address();
					userData.setAddress(address);

					Element home = elm.getChild(HOME);

					if (home != null) {
						address.setHome(home.val());
					}

					Element street = elm.getChild(STREET);

					if (street != null) {
						address.setStreet(street.val());
					}

					Element locality = elm.getChild(LOCALITY);

					if (locality != null) {
						address.setLocality(locality.val());
					}

					Element city = elm.getChild(CITY);

					if (city != null) {
						address.setCity(city.val());
					}

					Element state = elm.getChild(STATE);

					if (state != null) {
						address.setState(state.val());
					}

					Element country = elm.getChild(CTRY);

					if (country != null) {
						address.setCountry(country.val());
					}

					Element pcode = elm.getChild(PCODE);

					if (pcode != null) {
						address.setPcode(pcode.val());
					}

				} else if (StringUtils.safeEquals(elm.getName(), DESC)) {
					userData.setDescription(elm.val());

				} else if (StringUtils.safeEquals(elm.getName(), PHOTO)) {
					Element binvalElm = elm.getChild(BIN_VAL);
					Element typeElm = elm.getChild(TYPE);

					if (binvalElm != null && typeElm != null) {
						UserAvtar avtar = userData.new UserAvtar(binvalElm.val(), typeElm.val());
						userData.setAvtar(avtar);
					}

				} else if (StringUtils.safeEquals(elm.getName(), JABBERID)) {
					userData.setJabberId(new JID(elm.val()));

				}

			}
		}
	}

	public UserProfileData getUserData() {
		return userData;
	}

	public void setUserData(UserProfileData userData) {
		this.userData = userData;
	}

	@Override
	public String xml() {
		StringBuilder sb = new StringBuilder();
		this.appendXml(sb);
		return sb.toString();
	}

	@Override
	public StringBuilder appendXml(StringBuilder sb) {
		if (userData == null) {
			sb.append(VCARD_ELEMENT);

		} else {
			sb.append(VCARD_OPEN_TAG);

			sb.append(N_OPEN_TAG);

			if (userData.getFirstName() != null) {
				sb.append(GIVEN_OPEN_TAG).append(userData.getFirstName()).append(GIVEN_CLOSE_TAG);
			}

			if (userData.getMiddleName() != null) {
				sb.append(MIDDLE_OPEN_TAG).append(userData.getMiddleName()).append(MIDDLE_CLOSE_TAG);
			}

			if (userData.getLastName() != null) {
				sb.append(FAMILY_OPEN_TAG).append(userData.getLastName()).append(FAMILY_CLOSE_TAG);
			}

			sb.append(N_CLOSE_TAG);
			
			if (userData.getNickName() != null) {
				sb.append(NICK_NAME_OPEN_TAG).append(userData.getNickName()).append(NICK_NAME_CLOSE_TAG);
			}

			if (userData.getEmail() != null) {
				sb.append(EMAIL_OPEN_TAG).append(USER_ID_OPEN_TAG).append(userData.getEmail()).append(USER_ID_CLOSE_TAG)
						.append(EMAIL_CLOSE_TAG);
			}

			if (userData.getGender() != null) {
				sb.append(GENDER_OPEN_TAG).append(userData.getGender()).append(GENDER_CLOSE_TAG);
			}

			if (userData.getBday() != null) {
				sb.append(BDAY_OPEN_TAG).append(userData.getBday()).append(BDAY_CLOSE_TAG);
			}

			if (userData.getPhone() != null) {
				sb.append(TEL_OPEN_TAG).append(NUMBER_OPEN_TAG).append(userData.getPhone()).append(NUMBER_CLOSE_TAG)
						.append(TEL_CLOSE_TAG);
			}

			if (userData.getAddress() != null) {
				Address address = userData.getAddress();

				sb.append(ADR_OPEN_TAG);

				if (address.getHome() != null) {
					sb.append(HOME_OPEN_TAG).append(address.getHome()).append(HOME_CLOSE_TAG);
				}

				if (address.getStreet() != null) {
					sb.append(STREET_OPEN_TAG).append(address.getStreet()).append(STREET_CLOSE_TAG);
				}

				if (address.getLocality() != null) {
					sb.append(LOCALITY_OPEN_TAG).append(address.getLocality()).append(LOCALITY_CLOSE_TAG);
				}

				if (address.getCity() != null) {
					sb.append(CITY_OPEN_TAG).append(address.getCity()).append(CITY_CLOSE_TAG);
				}

				if (address.getState() != null) {
					sb.append(STATE_OPEN_TAG).append(address.getState()).append(STATE_CLOSE_TAG);
				}

				if (address.getCountry() != null) {
					sb.append(CTRY_OPEN_TAG).append(address.getCountry()).append(CTRY_CLOSE_TAG);
				}

				if (address.getPcode() != null) {
					sb.append(PCODE_OPEN_TAG).append(address.getPcode()).append(PCODE_CLOSE_TAG);
				}

				sb.append(ADR_CLOSE_TAG);

			}

			if (userData.getDescription() != null) {
				sb.append(DESC_OPEN_TAG).append(userData.getDescription()).append(DESC_CLOSE_TAG);
			}

			if (userData.getAvtar() != null) {
				UserAvtar avtar = userData.getAvtar();

				sb.append(PHOTO_OPEN_TAG).append(BINVAL_OPEN_TAG).append(avtar.getBase64EncodedImage())
						.append(BINVAL_CLOSE_TAG).append(TYPE_OPEN_TAG).append(avtar.getImageType())
						.append(TYPE_CLOSE_TAG).append(PHOTO_CLOSE_TAG);

			}

			if (userData.getJabberId() != null) {
				sb.append(JABBERID_OPEN_TAG).append(userData.getJabberId().toString()).append(JABBERID_CLOSE_TAG);
			}

			sb.append(VCARD_CLOSE_TAG);
		}

		return sb;
	}

}
