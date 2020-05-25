package structuraldesignpatterns.bridge.filedownloader;

public class LinuxFileDownloadImplementor implements FileDownLoaderImplementor{
    @Override
    public Object downloadFile(String path) {
        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println(" File Downloaded succefully in Linux");
        return true;
    }
}
