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
package abs.ixi.client.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Utility class to offer convenience methods around Date and Calendar objects.
 */
public class DateUtils {
	public static final String DEFAULT_DATE_FORMAT = "ddMMyyyy";

	public static final int WEEK_DAYS = 7;

	public static final long MILS_IN_A_HOUR = 3600000;
	public static final long MILS_IN_8_HOUR = 28800000;
	public static final long MILS_IN_A_DAY = 86400000;

	public static Calendar setStartOfDayTime(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.clear(Calendar.MINUTE);
		cal.clear(Calendar.SECOND);
		cal.clear(Calendar.MILLISECOND);

		return cal;
	}

	public static Calendar setEndOfDayTime(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, cal.getActualMaximum(Calendar.HOUR_OF_DAY));
		cal.set(Calendar.MINUTE, cal.getActualMaximum(Calendar.MINUTE));
		cal.set(Calendar.SECOND, cal.getActualMaximum(Calendar.SECOND));
		cal.set(Calendar.MILLISECOND, cal.getActualMaximum(Calendar.MILLISECOND));

		return cal;
	}

	public static Calendar calendarWithStartOfDayTime() {
		Calendar cal = Calendar.getInstance();
		return setStartOfDayTime(cal);
	}

	public static Calendar calendarWithEndOfDayTime() {
		Calendar cal = Calendar.getInstance();
		return setEndOfDayTime(cal);
	}

	public static int calendarDay(String day) {
		String dayUpper = StringUtils.toUpper(day);

		switch (dayUpper) {
		case "SUNDAY":
			return Calendar.SUNDAY;
		case "MONDAY":
			return Calendar.MONDAY;
		case "TUESDAY":
			return Calendar.TUESDAY;
		case "WEDNESDAY":
			return Calendar.WEDNESDAY;
		case "THURSDAY":
			return Calendar.THURSDAY;
		case "FRIDAY":
			return Calendar.FRIDAY;
		case "SATURDAY":
			return Calendar.SATURDAY;
		}

		throw new IllegalArgumentException("Illegal day string :" + day);
	}

	public static final Date now() {
		return new Date();
	}

	public static final Date today() {
		return new Date();
	}

	public static final Calendar currentTime() {
		return Calendar.getInstance();
	}

	/**
	 * Returns current date minus one day
	 * @return Date date
	 */
	public static final Date yesterday() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -1);

		return cal.getTime();
	}

	public static final Date date(String date) throws ParseException {
		DateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

		return formatter.parse(date);
	}

	public static final Date date(String date, String format) throws ParseException {
		DateFormat formatter = new SimpleDateFormat(format);

		return formatter.parse(date);
	}

	/**
	 * returns messenger style display time. The input mills must be positive
	 * number
	 * @param mills mills
	 * @return String string
	 */
	public static final String displayTime0(long mills) {
		long current = Calendar.getInstance().getTimeInMillis();

		if (mills <= 0) {
			return "invalid time";
		}

		if ((current - mills) < MILS_IN_A_HOUR) {
			return (current - mills) / (1000 * 60) + " minutes ago";

		} else if ((current - mills) < MILS_IN_8_HOUR) {
			return (current - mills) / (1000 * 60 * 60) + " hours ago";

		} else if ((current - mills) < MILS_IN_A_DAY) {
			return "today";

		} else {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(mills);

			return cal.get(Calendar.DAY_OF_MONTH) + " " + cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
		}

	}

	/**
	 * returns messenger style display time. The input mills must be positive
	 * number
	 * @param mills mills
	 * @return String string
	 */
	public static final String displayTime(long mills) {
		DateFormat dfmt = new SimpleDateFormat("HH:mm");
		Date date = new Date(mills);
		return dfmt.format(date);
	}

	public static final Timestamp timestamp(Calendar cal) {
		return new Timestamp(cal.getTimeInMillis());
	}

	public static final Timestamp currentTimestamp() {
		Calendar cal = Calendar.getInstance();
		return new Timestamp(cal.getTimeInMillis());
	}

	public static final long currentTimeInMiles() {
		Calendar cal = Calendar.getInstance();
		return cal.getTimeInMillis();
	}

	public static final Calendar calendar(Timestamp t) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(t.getTime());

		return c;
	}

	public static final Timestamp roll(int field, int amount, Timestamp t) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(t.getTime());
		Calendar cal = roll(field, amount, c);

		return new Timestamp(cal.getTimeInMillis());
	}

	public static final Calendar roll(int field, int amount, Calendar c) {
		c.add(field, amount);
		return c;
	}

	public static String shortMonthAndDate(Calendar c) {
		return c.get(Calendar.DAY_OF_MONTH) + " " + c.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
	}

	public static String shortMonthAndDate(long millis) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(millis);

		return c.get(Calendar.DAY_OF_MONTH) + " " + c.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
	}

	public static String monthAndYear(Calendar c) {
		return c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US) + " " + c.get(Calendar.YEAR);
	}

	public static String getCurrentTimeString() {
		return new SimpleDateFormat("dd-MM-YYYY-HH-MM-ss").format(new Date());
	}

	public static long addMinutesToEpoch(int minutes) {
		Date date = new Date();
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		calender.add(Calendar.MINUTE, minutes);
		return calender.getTimeInMillis();
	}

	/**
	 * @return time string from the current date object. Method takes default
	 *         timezone and locale from the system
	 */
	public static String getCurrentTime() {
		return new SimpleDateFormat("h:mm a").format(new Date());
	}

	public static String getDisplayTime(long mills) {
		return new SimpleDateFormat("h:mm a").format(new Date(mills));
	}

	/**
	 * @param mills mills
	 * @return {@link Calendar} object initialized with the mills given.
	 */
	public static final Calendar calendar(long mills) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(mills);
		return cal;
	}

	public static String getTimeString(Date date, TimeZone timeZone, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		dateFormat.setTimeZone(timeZone);

		return dateFormat.format(date);
	}

	public static Date getDateTime(String dateTimeString, String pattern) throws ParseException {
		return new SimpleDateFormat(pattern).parse(dateTimeString);
	}

	public static Date getDateTime(String dateTimeString, String pattern, TimeZone timeZone) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		sdf.setTimeZone(timeZone);

		return sdf.parse(dateTimeString);
	}
}
