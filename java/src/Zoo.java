public class Zoo {

    Animal [] animals ;
    String name ;
    String city ;
    int nbrCages ;


    public Zoo(String name, String city, int nbrCages)
    {
        this.animals = new Animal[25];
        this.name = name ;
        this.city = city ;
        this.nbrCages = nbrCages;
    }
    public String toString(){
        return "Zoo Name :" + name + " \nCity: " + city + " \nNbrCages: " + nbrCages;
    }
}