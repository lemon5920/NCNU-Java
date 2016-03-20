public class SimpleOOP {
    public static void main(String[] argv) {

        // One person
        AllData ad = new PersonOne();
        System.out.println(ad.name());
        System.out.println(ad.age());

        // Two people
        /*
        AllData[] ad = new AllData[2];
        ad[0] = new PersonOne();
        ad[1] = new PersonTwo();
        for(int i = 0 ; i <= 1 ; i++) {
            System.out.println(ad[i].name());
            System.out.println(ad[i].age());
        }
        */
    }
}
