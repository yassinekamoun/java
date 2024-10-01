public class Zoo {

    Animal [] animals ;
    String name ;
    String city ;
    final int nbrCages = 25 ;
    int count;


    public Zoo(String name, String city,  int count)
    {
        this.animals = new Animal[nbrCages];
        this.name = name ;
        this.city = city ;
        this.count = 0 ;
    }
    public String toString(){
        return "Zoo Name :" + name + " \nCity: " + city ;
    }

    public boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà dans le zoo
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal existe déjà dans le zoo.");
            return false;  // Ne pas ajouter l'animal s'il existe déjà
        }

        // Vérifier si le zoo a atteint sa capacité maximale
        if (count >= animals.length) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal.");
            return false;  // Le zoo est plein
        }

        // Ajouter l'animal et incrémenter le compteur
        animals[count] = animal;
        count++;
        return true;  // L'animal a été ajouté avec succès
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < count ; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal)
    {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
            return false;
        }

        for (int i = index; i < count - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[count - 1] = null;
        count--;
        System.out.println("L'animal a été supprimé du zoo avec succès.");
        return true;
    }
    public boolean isZooFull() {
        return count >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.count > z2.count) {
            return z1;
        } else if (z2.count > z1.count) {
            return z2;
        } else {
            System.out.println("Les deux zoos contiennent le même nombre d'animaux.");
            return null; // ou vous pouvez retourner l'un des zoos arbitrairement
        }
    }



}