public class enc {
    public static void main(String[] args) {
        Doctor t = new Doctor();
        t.setSname("Vansh");
        t.setStatus(false);
        String name = t.getSname();
        boolean Status = t.isStatus();
        System.out.println("Name is " + name);
        System.out.println("Status is " + Status);

    }
}

class Doctor{
    private String Sname;
    private boolean Status;
    
    public void setSname(String Sname){
        this.Sname = Sname;
    }

    public void setStatus(boolean Status){
        this.Status = Status;
    }

    public String getSname() {
        return Sname;
    }

    public boolean isStatus() {
        return Status;
    }



}

