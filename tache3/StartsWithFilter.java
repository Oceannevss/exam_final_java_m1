package m1.examen_final.tache3;

import java.io.File;
import java.io.FilenameFilter;

public class StartsWithFilter implements FilenameFilter {
    private String prefix;

    public StartsWithFilter(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.startsWith(prefix);
    }
}
