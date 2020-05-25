package hr.documents;

public class WorkContract implements ExportTxtDocument,ExportPDFDocument,ExportJsonDocument{

    private final String content;

    public WorkContract(String content){
       this.content= content;

   }


    @Override
    public String toJson() {
        return "{ 'content' : '" + this.content + "' }";
    }

    @Override
    public byte[] toPDF() {
        return  content.getBytes();
    }

    @Override
    public String toTxt() {
        return this.content;
    }
}
