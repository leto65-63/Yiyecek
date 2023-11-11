public class Depo {

        private int fruit ;
        private int water ;
        private int bread ;
        private int vegetables ;

        public Depo(int fruit,int watter,int bread, int vegetables){

            this.fruit = fruit;
            this.water = watter;
            this.bread = bread;
            this.vegetables = vegetables;

        }

    public void setFruit(int fruit) {
        this.fruit = fruit;
    }

    public void setWatter(int watter) {
        this.water = watter;
    }

    public void setBread(int bread) {
        this.bread = bread;
    }

    public void setVegetables(int vegetables) {
        this.vegetables = vegetables;
    }

    public int getFruit() {
        return fruit;
    }

    public int getWatter() {
        return water;
    }

    public int getBread() {
        return bread;
    }

    public int getVegetables() {
        return vegetables;
    }
    public void consumeFruit(int kilo){
            if (fruit - kilo < 0){
                System.out.println("not enough fruit");
                System.out.println("Amount of fruit :"+fruit);
            }
            else {
                fruit -= kilo;
                System.out.println("Remaining fruit :"+fruit);

            }


    } public void consumeWater(int kilo){
        if (water - kilo < 0){
            System.out.println("not enough water");
            System.out.println("Amount of fruit :"+water);
        }
        else {
            water -= kilo;
            System.out.println("Remaining Water :"+water);

        }


    } public void consumeBread(int kilo){
        if (bread - kilo < 0){
            System.out.println("not enough bread");
            System.out.println("Amount of fruit :"+bread);
        }
        else {
            bread -= kilo;
            System.out.println("Remaining Bread :"+bread);

        }


    } public void consumeVegetables(int kilo){
        if (vegetables - kilo < 0){
            System.out.println("not enough fruit");
            System.out.println("Amount of fruit :"+vegetables);
        }
        else {
            vegetables -= kilo;
            System.out.println("Remaining Vegetables :"+vegetables);

        }


    }

}
