class Player {
    String name;
    int age;
    String position;

    Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void play() {
        System.out.println(name + " is playing as " + position);
    }

    void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player {
    Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Football_Player extends Player {
    Football_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Hockey_Player extends Player {
    Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

public class lab5_q2 {
    public static void main(String[] args) {
        Cricket_Player cricketPlayer = new Cricket_Player("Rohit Sharma", 35, "Batsman");
        Football_Player footballPlayer = new Football_Player("Ronaldo", 36, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Ayush Dhiman", 32, "Midfielder");

        cricketPlayer.play();
        cricketPlayer.train();
        footballPlayer.play();
        footballPlayer.train();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}