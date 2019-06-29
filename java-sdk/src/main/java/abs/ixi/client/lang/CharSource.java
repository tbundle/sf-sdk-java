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
package abs.ixi.client.lang;

/**
 * {@code CharSource} is a wrapper around char array. It maintains vital fields
 * such as position, limit and capacity to facilitate better reading process.
 */
public class CharSource implements Resetable {
	private char[] chars;
	private int position;
	private int limit;

	public CharSource(char[] chars) {
		this(chars, 0, chars.length);
	}

	public CharSource(char[] chars, int position, int limit) {
		this.chars = chars;
		this.position = position;
		this.limit = limit;
	}

	public char[] getChars() {
		return chars;
	}

	public int position() {
		return position;
	}

	public int limit() {
		return limit;
	}

	public int getCapacity() {
		return chars == null ? 0 : chars.length;
	}

	/**
	 * Returns true if there is another byte which can be read from this
	 * {@code ByteSource}
	 * @return boolean true or false
	 */
	public final boolean hasNext() {
		return this.position < this.limit;
	}

	/**
	 * Reads next char from data source
	 * @return char char
	 */
	public char next() {
		return this.chars[position++];
	}

	/**
	 * Copies remaining char data of this {@link CharSource} into the src char
	 * array. If the length of src array is smaller than the remaining content,
	 * the method will throw {@link ArrayIndexOutOfBoundsException}
	 * 
	 * @param src src
	 */
	public void get(char[] src) {
		System.arraycopy(src, 0, this.chars, position, (chars.length - position));
		this.position = chars.length;
	}

	/**
	 * Copies remaining char data of this {@link CharSource} into the src char
	 * starting from the srcPos. If the length of src array is smaller than the
	 * remaining content, the method will throw
	 * {@link ArrayIndexOutOfBoundsException}
	 * 
	 * @param src src
	 * @param srcPos srcPos
	 */
	public void get(char[] src, int srcPos) {
		System.arraycopy(src, srcPos, this.chars, position, (chars.length - position));
		this.position = this.chars.length;
	}

	/**
	 * Copies chars data of this {@link CharSource} into the src char starting
	 * from the srcPos. If the length of src array is smaller than the remaining
	 * content, the method will throw {@link ArrayIndexOutOfBoundsException}
	 * 
	 * @param src src
	 * @param srcPos srcPos
	 * @param length length
	 */
	public void get(char[] src, int srcPos, int length) {
		System.arraycopy(src, srcPos, this.chars, position, length);
		this.position += length;
	}

	@Override
	public void reset(boolean full) {
		this.chars = null;
		this.position = 0;
		this.limit = 0;
	}

	/**
	 * Reloads this {@code CharSource} with given chars. The position of the
	 * char source will be set to zero and limit will be set to the length of
	 * the char array.
	 * 
	 * @param chars chars array (data)
	 */
	public void reload(char[] chars) {
		this.reload(chars, 0, chars.length);
	}

	/**
	 * Reloads this {@code CharSource} with given chars. The position of the
	 * char source will be set to the position supplied and limit will be set to
	 * the length of the char array.
	 * 
	 * @param chars chars array (data)
	 * @param position position from which reading will start
	 */
	public void reload(char[] chars, int position) {
		this.reload(chars, position, chars.length);
	}

	/**
	 * Reloads this {@code CharSource} with given chars
	 * 
	 * @param chars chars array (data)
	 * @param position position from which reading will start
	 * @param limit boundary index. The reading cursor will always be behind the
	 *            boundary
	 */
	public void reload(char[] chars, int position, int limit) {
		this.chars = chars;
		this.position = position;
		this.limit = limit;
	}

	/**
	 * Sets position index to the given value
	 * 
	 * @param position position
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * Number of chars remainig in this {@link CharSource}. The number is
	 * calculated based on the value of {@link CharSource#limit} and
	 * {@link CharSource#position} variables; although at any point underlying
	 * array has all the elements.
	 * @return int int
	 */
	public int remaining() {
		return this.limit - this.position;
	}

}
