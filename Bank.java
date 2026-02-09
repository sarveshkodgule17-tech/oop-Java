class Bank {
    int getRateOfInterest() {
        return 0; // Default rate of interest
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 5; // Example rate for SBI
    }
}

class Axis extends Bank {
    int getRateOfInterest() {
        return 6; // Example rate for Axis
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7; // Example rate for ICICI
    }
}

class Test2 {
    public static void main(String[] args) {
        Bank sbi = new SBI(); // Polymorphic reference
        Bank axis = new Axis();
        Bank icici = new ICICI();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("Axis Rate of Interest: " + axis.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
    }
}
