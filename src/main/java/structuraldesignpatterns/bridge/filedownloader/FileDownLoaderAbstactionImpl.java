package structuraldesignpatterns.bridge.filedownloader;

public class FileDownLoaderAbstactionImpl implements FileDownLoaderAbstaction{
    private FileDownLoaderImplementor provider = null;

    public FileDownLoaderAbstactionImpl(FileDownLoaderImplementor provider){
        this.provider=provider;
    }

    @Override
    public Object download(String path) {
        return provider.downloadFile(path);
    }

    @Override
    public boolean store(Object object) {
        return provider.storeFile(object);
    }
}
