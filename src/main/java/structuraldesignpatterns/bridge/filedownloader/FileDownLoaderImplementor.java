package structuraldesignpatterns.bridge.filedownloader;

public interface FileDownLoaderImplementor {
    public Object downloadFile(String path);
    public boolean storeFile(Object object);
}
