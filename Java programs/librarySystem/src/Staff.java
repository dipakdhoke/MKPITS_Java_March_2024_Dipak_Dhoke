public class Staff {
    private String name;
    private String staffid;
    private String addbook;
    private String removebook;
    private String issuedLibrary;

   public Staff(String name,String staffid,String addbook,String removebook,String issuedLibrary){
       this.staffid=staffid;
       this.name=name;
       this.staffid=staffid;
       this.addbook=addbook;
       this.removebook=removebook;
       this.issuedLibrary=issuedLibrary;

   }

    public String getName() {
        return name;
    }

    public String getStaffid() {
        return staffid;
    }

    public String getAddbook() {
        return addbook;
    }

    public String getRemovebook() {
        return removebook;
    }

    public String getIssuedLibrary() {
        return issuedLibrary;
    }
}


