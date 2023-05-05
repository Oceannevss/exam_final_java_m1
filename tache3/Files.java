package m1.examen_final.tache3;

import java.io.File;
import java.io.FilenameFilter;

public class Files {
    private String pathRep;
    private StartsWithFilter filter;
    class StartsWithFilter implements FilenameFilter {
        private String prefix;
        public StartsWithFilter(String prefix) {
            this.prefix = prefix;
        }
        @Override
        public boolean accept(File dir, String name) {
            return name.startsWith(prefix);
        }
    }
    interface FileAction {
        void perform(File file);
    }
    private static void applyActionOnFiles(File dir,String prefix,FileAction action) {
        File[] list = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(prefix);
            }
        });
        for (int i=0 ; i< list.length ; i++) {
            action.perform(list[i]);
        }

    }

    public Files(String pathRep) {
        this.pathRep = pathRep;
    }
    public void printFiles() {
        File f = new File(this.pathRep);
        String[] list = f.list();
        for (int i=0 ; i<list.length ; i++) {
            System.out.println(list[i]);
        }
    }

    public void printFiles(String prefix) {
        File f = new File(this.pathRep);
        // StartsWithFilter filter = new StartsWithFilter(prefix);
        // this.filter = new StartsWithFilter(prefix);
        String[] list = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(prefix);
            }
        });
        for (int i=0 ; i<list.length ; i++) {
            System.out.println(list[i]);
        }
    }
    public void printFiles2(String prefix) {
        File f = new File(this.pathRep);
        applyActionOnFiles(f, prefix, new FileAction() {
            @Override
            public void perform(File file) {
                System.out.println(file);
            }
        });
    }

    public long totalSizeOfFiles() {
        File f = new File(this.pathRep);
        long r = 0;
        for(File file : f.listFiles()) {
            r += file.getTotalSpace();
        }
        return r;
    }
/*    public long totalSizeOfFiles(String prefix) {
        File f = new File(this.pathRep);
        FileAction r = new FileAction() {
            @Override
            public void perform(File file) {
                file.getTotalSpace();
            }
        };
        applyActionOnFiles(f, prefix, r);
        return r
    }*/

    public File mostRecentFile() {
        File f = new File(this.pathRep);
        long t = 0;
        File mostRecent = f;
        for(File file : f.listFiles()) {
            if (file.lastModified() > t) {
                t = file.lastModified();
                mostRecent = file;
            }
        }
        return mostRecent;
    }
}
