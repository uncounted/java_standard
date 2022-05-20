public class ch6_6_2 {
    public static void main(String[] args){
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }

    public static class SutdaCard{
        int num = (int) (Math.random()*10);
        boolean isKwang = true;

        SutdaCard(){
            this.num = 1;
            this.isKwang = true;
        }

        SutdaCard(int num, boolean isKwang){
            this.num = num;
            this.isKwang = false;
        }

        public String info(){
            if(isKwang){
                return num+"K";
            } else {
                return num+"";
            }
        }
    }
}
