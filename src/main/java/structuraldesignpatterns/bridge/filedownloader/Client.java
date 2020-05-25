package structuraldesignpatterns.bridge.filedownloader;

public class Client {
    public static void main(String[] args) {
        String os="Linux";
        FileDownLoaderAbstaction downloader = null;
        switch (os){
            case "windows":
                downloader= new FileDownLoaderAbstactionImpl(new WindowsFileDownloadImplementor());
            case "linux":
                downloader = new FileDownLoaderAbstactionImpl(new LinuxFileDownloadImplementor());
            default :
                System.out.println(" OS not supported ");
        }
        Object filecontent = downloader.download("Some Path ");
        downloader.store(filecontent);

    }
}
