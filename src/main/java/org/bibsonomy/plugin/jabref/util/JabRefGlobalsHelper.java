package org.bibsonomy.plugin.jabref.util;

import net.sf.jabref.Globals;

public class JabRefGlobalsHelper {

    /**
     * Returns database specific UserFileDir as String if exists, else null
     */
    public static String getDBSpecificUserFileDir() {
        return getMetaDataValue(Globals.prefs.get("userFileDir"));
    }

    /**
     * Returns database specific UserFileDirIndividual as String if exists, else null
     */
    public static String getDBSpecificUserFileDirIndividual() {
        return getMetaDataValue(Globals.prefs.get("userFileDirIndividual"));
    }

    /**
     * Returns database specific PDFDirectory as String if exists, else null
     */
    public static String getDBSpecificPDFDirectory() {
        return getMetaDataValue("pdfDirectory");
    }

    /**
     * Returns database specific PDFDirectory as String if exists, else null
     */
    public static String getDBSpecificPSDirectory() {
        return getMetaDataValue("psDirectory");
    }

    private static String getMetaDataValue(String key) {
        /*
        *TODO: Investigate changes in MetaData - zellerdev
        *List<String> fileDI = BibsonomyMetaData.getMetaData().getData(key);
        *if (fileDI != null && fileDI.size() >= 1) {
        *    return fileDI.get(0).trim();
        *}
         */
        return null;
    }

}
