package org.bibsonomy.plugin.jabref.util;

import java.util.Optional;

import org.bibsonomy.plugin.jabref.BibsonomyGlobals;
import org.bibsonomy.rest.client.util.MultiDirectoryFileFactory;

public class JabRefFileFactory extends MultiDirectoryFileFactory {

    public JabRefFileFactory() {
        super(null, null, null);
    }

    @Override
    public String getPsDirectory() {
        String psFileDir = JabRefGlobalsHelper.getDBSpecificPSDirectory();
        if (psFileDir != null) return psFileDir;

        return getFileDirectory();
    }

    @Override
    public String getPdfDirectory() {
        String pdfFileDir = JabRefGlobalsHelper.getDBSpecificPDFDirectory();
        if (pdfFileDir != null) return pdfFileDir;

        return getFileDirectory();
    }

    @Override
    public String getFileDirectory() {
        String fileDir = JabRefGlobalsHelper.getDBSpecificUserFileDirIndividual();
        if (fileDir != null) return fileDir;

        fileDir = JabRefGlobalsHelper.getDBSpecificUserFileDir();
        if (fileDir != null) return fileDir;

        Optional<String> fileDirectoryOpt = BibsonomyMetaData.getMetaData().getDefaultFileDirectory();
        if (BibsonomyMetaData.getMetaData() != null && fileDirectoryOpt.isPresent()) {
            return fileDirectoryOpt.get();

        }

        return BibsonomyGlobals.BIBSONOMY_FILE_DIRECTORY;
    }

}
