public interface LibraryInterfaceDemo {

    public static void main(String[] args){
        //First Testing for Kid object
        KidUser kidOne = new KidUser();
        kidOne.setAge(10);
        kidOne.setBookType("Kids");
        kidOne.registerAccount();
        kidOne.requestBook();

        //Second Testing for kid object
        kidOne.setAge(18);
        kidOne.setBookType("Fiction");
        kidOne.registerAccount();
        kidOne.requestBook();


        AdultUser adultOne = new AdultUser();
        //First Testing for Adult object
        adultOne.setAge(5);
        adultOne.setBookType("Kids");
        adultOne.registerAccount();
        adultOne.requestBook();

        //Second Testing for Kid object
        adultOne.setAge(23);
        adultOne.setBookType("Fiction");
        adultOne.requestBook();
        adultOne.registerAccount();
    }

}
