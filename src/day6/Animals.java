package day6;

 class Animals {
    public void makeSounds() {
        System.out.println("The animal makes a sound");
    }
}

class Dogs extends Animals {
    @Override
    public void makeSounds() {
        System.out.println("The dog barks");
    }
}

class Cats extends Animals {
    @Override
    public void makeSounds() {
        System.out.println("The cat meows");
    }
    public static void main(String[] args) {
        Animals animal = new Animals();
        Dogs dog = new Dogs();
        Cats cat = new Cats();

        animal.makeSounds();
        dog.makeSounds();
        cat.makeSounds();

        Animals animal2 = new Dogs();
        Animals animal3 = new Cats();

        animal2.makeSounds();
        animal3.makeSounds();
    }
}
