public  class main{

    public static void main(String[]args){
        secondClass myObj=new secondClass("Musawakhe","Mbatha",12,"12/01/2024");
        myObj.surName();
        myObj.myName();
        myObj.myAge();
        //Method for encapsulation using private modifier
        myObj.setMySchool("Mhlanganyelwa");
        System.out.println(myObj.getMySchool());
    }

}