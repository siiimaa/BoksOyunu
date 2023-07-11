public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        if(whoIsTheFirst()){
            this.f1 = f1;
            this.f2 = f2;
        }else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run(){
        if (isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("==========NEW ROUND!==========");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                health();
            }
        }else{
            System.out.println("The weight of athlets doesn't match!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
               (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            health();
            System.out.println(this.f2.name + " Wins!");
            return true;
        }
        if (this.f2.health == 0){
            health();
            System.out.println(this.f1.name + " Wins!");
            return true;
        }
        return false;
    }
    void health(){
        System.out.println(this.f2.name + "'s health : " + this.f2.health);
        System.out.println(this.f1.name + "'s health : " + this.f1.health);
        System.out.println(" ");
    }

    boolean whoIsTheFirst(){
        double randomChance = Math.random() * 100;
        if(randomChance <= 50){
            return true;
        }else
            return false;
    }
}
