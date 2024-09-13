package org.example.e142;

public class SyntaxTechnologies {
    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    public SyntaxTechnologies(){
        schoolName=null;
        batch=0;
        year=0;
        lastDayOfClass=null;
    }

    public SyntaxTechnologies( String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;


    }
    void display( ){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);

    }

}
