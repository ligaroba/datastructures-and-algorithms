package structuraldesignpatterns.bridge.filedownloader;

public interface FileDownLoaderAbstaction {
    public Object download(String path);
    public boolean store(Object object);
}
