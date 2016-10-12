package org.bibsonomy.plugin.jabref.util;


import net.sf.jabref.model.metadata.MetaData;

public class BibsonomyMetaData {

    private static MetaData metaData;

    private BibsonomyMetaData() {
    }

    public static MetaData getMetaData() {
        if (BibsonomyMetaData.metaData == null) {
            metaData = new MetaData();
            //TODO: Investigate changes in MetaData - zellerdev
            //metaData.initializeNewDatabase();
        }
        return metaData;
    }

}
