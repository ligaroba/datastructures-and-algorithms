package structuraldesignpatterns.bridge.filedownloader;

public class WindowsFileDownloadImplementor implements FileDownLoaderImplementor{
    @Override
    public Object downloadFile(String path) {
        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println(" File Downloaded succefully in Windows");
        return true;
    }
}
