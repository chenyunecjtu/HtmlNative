package com.mozz.remoteview.parser.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Yang Tao on 17/2/21.
 */

public class FileCodeReader extends StreamCodeReader {

    public FileCodeReader(File file) throws FileNotFoundException {
        super(new FileReader(file));
    }

    public FileCodeReader(InputStream stream) {
        super(new InputStreamReader(stream));
    }
}
