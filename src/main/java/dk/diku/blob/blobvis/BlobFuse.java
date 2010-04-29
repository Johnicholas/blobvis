package dk.diku.blob.blobvis;

import model.Blob;
import prefuse.data.Schema;

public class BlobFuse {
	public static final String BLOBFIELD = "blob.field";
	
	public static final Schema BLOB_SCHEMA = new Schema();

	public static final String BLOBINPGR = "blob.inpgr";

	public static final String EDGENUMBERSRC = "edge.number.src";
	public static final String EDGENUMBERTAR = "edge.number.tar";
	static {
		BLOB_SCHEMA.addColumn(BLOBFIELD, Blob.class, null);
		BLOB_SCHEMA.addColumn(BLOBINPGR, Boolean.class, true);
		BLOB_SCHEMA.addColumn(EDGENUMBERSRC, Integer.class,-1);
		BLOB_SCHEMA.addColumn(EDGENUMBERTAR, Integer.class,-1);
	}
	
}
