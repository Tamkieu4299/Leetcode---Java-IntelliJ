public class Problem2 {

    static class Rational{
        private long num;
        private long denum;

        Rational(long num, long denum) {
            this.num = num;
            this.denum = denum;
        }

        // Default constructor
        Rational(){
            this.num=0;
            this.denum=1;
        }

        // Arthrimetic operation
        public Rational add(Rational augend) {
             return new Rational(this.num*augend.denum+augend.num*this.denum,this.denum*augend.denum);
        }
        public Rational substrac(Rational augend){
            return new Rational(this.num*augend.denum-augend.num*this.denum,this.denum*augend.denum);
        }
        public Rational multiply(Rational augend){
            return new Rational(this.num*augend.num,this.denum*augend.denum);
        }
        public Rational divide(Rational augend){
            return new Rational(this.num*augend.denum,this.denum*augend.num);
        }
        public void display(){
            System.out.println(this.num + "/" + this.denum);
        }

        // Helper()
        private void validate(){
            if (this.num==0){
                // the num is 0 then we will call the default constructors
                this.num = 0;
                this.denum = 1;
            }
            else{
                long value_gcd=gcd(this.num,this.denum);
                this.num=this.num/value_gcd;
                this.denum=this.denum/value_gcd;
            }
        }

        // gcd method
        //https://stackoverflow.com/questions/4009198/java-get-greatest-common-divisorpublic
        long gcd(long num, long denom) {
            if (denom==0) return num;
            return gcd(denom,num%denom);
        }

        public static void main(String[] args) {
            Rational r1 = new Rational(8,9);
            Rational r2 = new Rational(8,11);

        }
    }
}
