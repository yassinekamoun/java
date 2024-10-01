class ZooManagement
{

    public static void main(String[] args)
    {

        Animal lion = new Animal("lion", "simba", 5, true);
        Zoo myZoo = new Zoo("my zoo", "Ariana", 0);
        Zoo z1 = new Zoo("belvedre","Tunis ", 0);

        System.out.println(myZoo);
        //System.out.println(myZoo.toString());//

        Animal rlion=new Animal("Lion","simba" , 5 ,  true);
        Animal tiger =new Animal("Tigre" ,"rose", 7, true);
        Animal elephant =new Animal("Elephant" , "babar", 8, true );
        Animal giraffe =new Animal("Giraffe", "ggg",9,true);
        Animal doggy =new Animal("doggy", "doggy",10,true);
        Animal chat =new Animal("chat", "chat",10,true);


        System.out.println("Ajout du lion :" + myZoo.addAnimal(rlion));
        System.out.println("Ajout du tigre :" + myZoo.addAnimal(tiger));
        System.out.println("Ajout du elephant :" + myZoo.addAnimal(elephant));
        System.out.println("Ajout du giraffe :" + myZoo.addAnimal(giraffe));
        System.out.println("Ajout du doggy :" + myZoo.addAnimal(doggy));
        System.out.println("Ajout du doggy :" + myZoo.addAnimal(doggy));

        int index= myZoo.searchAnimal( doggy );
        myZoo.removeAnimal( chat );

        //System.out.println( index );//

    }



}





