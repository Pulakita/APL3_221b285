class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Pandav fights bravely.");
    }

    @Override
    void obey() {
        System.out.println("Pandav obeys the rules.");
    }

    @Override
    void kind() {
        System.out.println("Pandav is kind.");
    }
}

class Arjun extends Pandav {
    // Additional characteristics or methods specific to Arjun can be added here
}

class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println("Bheem is less kind.");
    }
}
