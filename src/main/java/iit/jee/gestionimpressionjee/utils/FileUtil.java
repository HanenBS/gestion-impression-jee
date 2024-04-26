package iit.jee.gestionimpressionjee.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileUtil {
    public static void sauvegarderFichier(byte[] contenu, String chemin) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(new File(chemin))) {
            outputStream.write(contenu);
        }
    }
}
