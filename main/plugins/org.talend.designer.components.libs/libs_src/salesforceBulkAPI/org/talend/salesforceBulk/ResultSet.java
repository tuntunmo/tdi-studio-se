package org.talend.salesforceBulk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.IOException;

import com.talend.csv.CSVReader;

/**
 * a simple resultset reader, only go forward, can't go back.
 * @author wwang
 *
 */
public class ResultSet {
	
	CSVReader reader;
	List<String> header;
	
	public ResultSet(com.talend.csv.CSVReader reader, List<String> header) {
		this.reader = reader;
		this.header = header;
	}

	public Map<String, String> next() throws IOException {
        boolean hasNext = false;
        try {
        	hasNext = reader.readNext();
		} catch(IOException e) {
			closeFileRead();
			throw e;
		}
        
		Map<String, String> result = null;
        String[] row;
        
        if (hasNext) {
            if ((row = reader.getValues()) != null) {
                result = new HashMap<String, String>();
                for (int i = 0; i < this.header.size(); i++) {
                	result.put(header.get(i), row[i]);
                }
                return result;
            } else {
            	return next();
            }
        } else {
        	closeFileRead();
        }
        return null;
	}
	
	private void closeFileRead() throws IOException {
		if (this.reader != null) {
			this.reader.close();
		}
    }
}
