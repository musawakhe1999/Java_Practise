public class secondClass {

    String classname;
    String classsurname;

    int classage;

    String classDateOfbirth;

    private String classSchoolName;
    public secondClass(String name,String username,int age,String dateOfBirth){
      classname=name;
      classsurname=username;
      classage=age;
      classDateOfbirth=dateOfBirth;


    }




    public void myName(){

      System.out.println("My name is "+classname);
    }
    public void surName(){

        System.out.println("My surname is "+classsurname);
    }

    public void myAge(){
        System.out.println("My age is "+classage);
    }
    public void placeOfBirth(String date){
        System.out.println(classDateOfbirth);
    }
     public String getMySchool(){
        return classSchoolName;
     }

     public void setMySchool(String school){
       this.classSchoolName=school;
       System.out.println(classSchoolName);

     }
}
