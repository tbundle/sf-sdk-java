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
package abs.ixi.client.io;

import static java.io.File.separator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import abs.ixi.client.io.UndeliveredStanzaManager.PersistenceMechanism;
import abs.ixi.client.xmpp.packet.Stanza;

/**
 * Default implementation of {@link PersistenceMechanism} interface. User
 * packets generated on a client are queued up and marked delivered only when a
 * ACK is received from the server. The packets for which ACK has been received
 * are removed from the queue. Typically, when underlying network connection is
 * broken ACK packets are not recceived; if ACK is not received from the server
 * witin stipulated time, the SDK will try to resend undelivered packets to
 * server.
 * <p>
 * While undelieverd packets are queued up in writer's queue, it may happen that
 * SDK is off-loaded from memory (there could be many possible reasons such as
 * power failure on underlying device, application was killed forcefully, device
 * shutdown, application may crash due to a programming bug etc) and if the SDK
 * is off-loaded from memory, undelivered message queues will be wiped out too.
 * Therefore it is importatnt to persist undelivered messsages to avoid message
 * loss.
 * </p>
 * <p>
 * XMPP as a protocol does not recommend a mechanism to avoid undelievred
 * message loss. However Stringflow SDK provides a default mechanism to persist
 * undelivered messages on to a file. This class is the default implementation
 * in which message are written on to a file. The packets are serialized before
 * getting written to a file. It is application developer's responsibility to
 * ensure that SDK has enough permissions to be able to create/write file on the
 * underlying file system.
 * </p>
 * <p>
 * {@link PersistenceMechanism} is an injectable interface; application
 * developers can inject an implementation of {@link PersistenceMechanism}
 * interface which, instead of {@link DefaultPersistenceMechanism}, will be used
 * to persist packets.
 * </p>
 * 
 * @author Yogi
 *
 */
public class DefaultPersistenceMechanism implements PersistenceMechanism {
	private static final Logger LOGGER = Logger.getLogger(DefaultPersistenceMechanism.class.getSimpleName());

	/**
	 * file name in which stanza packets are written in serialized format
	 */
	private static final String FILE_DATA_STORE = "sf_stanza_stream.dat";

	/**
	 * file name in which data store index is written
	 */
	private static final String FILE_INDEX = "sf_store_index.dat";

	/**
	 * Number of bytes which will be mapped to {@link MappedByteBuffer}
	 */
	private static final int MAPPED_REGION_SIZE = 8;

	/**
	 * Path of the file in which packets will be written
	 */
	private ObjectOutputStream dataStore;

	/**
	 * Index file stores a {@link Long} value which indicates number of stanzas
	 * acknowledged by server.
	 */
	private MappedByteBuffer dsIndex;

	/**
	 * Instantiate {@code DefaultPersistenceMechanism} object with a directory
	 * path in which files will be created. If the given path name does not
	 * exist, a directory representing the path will be created. If the given
	 * path name exist but represents a regualr file not a directory a
	 * {@link FileNotFoundException} exception will be thrown.
	 * 
	 * @param dirPath directory path on the file system in which data files will
	 *            be stored. The may or may not exist; it could be relative or
	 *            absolute path
	 * @throws Exception if there is permission issue or any other error while
	 *             setting up the files and directories
	 */
	public DefaultPersistenceMechanism(final String dirPath) throws Exception {
		File dir = new File(dirPath);

		if (!dir.isDirectory()) {
			LOGGER.log(Level.SEVERE, "Path {0} is not a directory", dirPath);
			throw new FileNotFoundException("Path " + dirPath + " is not a directory");
		}

		if (!dir.exists()) {
			setupDirectoryAndFiles(dirPath, dir);

		} else {
			LOGGER.log(Level.INFO, "dir path {0} exists; Checking if the data store and index files exist", dirPath);
			initializeFileHandlers(dirPath);
		}
	}

	/**
	 * The method assumes that given directory path does not exist on the file
	 * system; therefore the dir path is created. Also the data store and index
	 * files are created inside the directory represented by the given directory
	 * path.
	 * 
	 * @param dirPath
	 * @param dir
	 * @throws IOException
	 */
	private void setupDirectoryAndFiles(final String dirPath, File dir) throws IOException {
		LOGGER.log(Level.INFO, "directory path {0} does not exist", dirPath);
		boolean success = dir.mkdirs();

		if (!success) {
			LOGGER.log(Level.SEVERE, "Failed to create directory path {0}", dirPath);
			throw new FileNotFoundException("Failed to create directory path " + dirPath);
		} else {
			LOGGER.log(Level.INFO, "created dir path {0}", dirPath);
		}

		this.dataStore = new ObjectOutputStream(new FileOutputStream(dirPath + separator + FILE_DATA_STORE));
		LOGGER.log(Level.INFO, "created file {0}", FILE_DATA_STORE);

		setupIndexFileHandler(dirPath);
	}

	/**
	 * Check if the data store and index files exist; if yes, get the file
	 * handlers assigned to class variables if not create the files and
	 * initialize file handler class variables.
	 * 
	 * @param dirPath
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private void initializeFileHandlers(final String dirPath) throws IOException, FileNotFoundException {
		File dsFile = new File(dirPath + separator + FILE_DATA_STORE);
		if (dsFile.exists()) {
			LOGGER.log(Level.FINE, "Found data store file");
			this.dataStore = new ObjectOutputStream(new FileOutputStream(dirPath + separator + FILE_DATA_STORE));

		} else {
			dsFile.createNewFile();
			LOGGER.log(Level.INFO, "{} file was not found; created new one", FILE_DATA_STORE);
		}

		File indexFile = new File(dirPath + separator + FILE_INDEX);
		if (!indexFile.exists()) {
			indexFile.createNewFile();
			LOGGER.log(Level.INFO, "created data store index file {0}", FILE_INDEX);
		}

		setupIndexFileHandler(dirPath);

	}

	/**
	 * Initialized the {@link MappedByteBuffer} instance for data store index
	 * file. Assuming that given directory path already exists; if the index
	 * file does not exist, it will be created.
	 * 
	 * @param dirPath
	 * @throws IOException
	 */
	private void setupIndexFileHandler(final String dirPath) throws IOException {
		RandomAccessFile raf = null;

		try {
			raf = new RandomAccessFile(new File(dirPath + File.separator + FILE_INDEX), "rwd");
			this.dsIndex = raf.getChannel().map(MapMode.READ_WRITE, 0, MAPPED_REGION_SIZE);

		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Failed to create data store index file", e);
			throw e;
		} finally {
			// Closing the underlying file/fileChannel does not impact
			// MemoryMappedBuffer; therefore close it right away
			if (raf != null) {
				raf.close();
			}
		}
	}

	@Override
	public void write(Stanza stanza) throws IOException {
		this.dataStore.writeObject(stanza);
	}

	@Override
	public void write(List<Stanza> stanzas) throws IOException {
		for (Stanza s : stanzas) {
			this.write(s);
		}
	}

	@Override
	public void remove(int count) throws IOException {
		this.incrementDSIndex(count);
	}

	@Override
	public List<Stanza> readAll() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void truncateUndeliverStanzas() {
		// TODO Auto-generated method stub

	}

	/**
	 * Increment the value of the index by a given count.
	 * 
	 * @param count
	 */
	private synchronized void incrementDSIndex(int count) {
		this.dsIndex.position(0);
		this.dsIndex.limit(MAPPED_REGION_SIZE);

		long val = this.dsIndex.asLongBuffer().get();
		this.dsIndex.flip();
		this.dsIndex.asLongBuffer().put(val + count);
	}

	/**
	 * The idea is that we keep storing stanza packets in data store in
	 * serialized format. Essentially data store file acts as a database. The
	 * index file stores just a long value indicating number of acknowledgement
	 * received from server.
	 * <p>
	 * It may happen that an object was half written on the file and device got
	 * switched off. It may also happen that an ACK was received but it could
	 * not be updated in the file properly.
	 * </p>
	 */
}
