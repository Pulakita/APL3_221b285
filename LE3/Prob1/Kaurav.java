class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Kaurav fights fiercely.");
    }

    @Override
    void obey() {
        System.out.println("Kaurav disobeys the rules.");
    }

    @Override
    void kind() {
        System.out.println("Kaurav is cruel.");
    }
}

class Duryodhan extends Kaurav {
    // Additional characteristics or methods specific to Duryodhan can be added here
}

class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn obeys the rules.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind.");
    }
}
