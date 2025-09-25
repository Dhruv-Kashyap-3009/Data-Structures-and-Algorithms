class FractionClass{

    public static int gcd(int num, int den){
        int min=Math.min(num,den);
        for(int i=min;i>=1;i--){
            if(num%i==0 && den%i==0) return i;
        }
        return min;
    }

    public static Fraction Add(Fraction f1,Fraction f2){
        int numerator=f1.num*f2.den + f2.num*f1.den;
        int denominator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator, denominator);
        return f3;
    }

    public static Fraction Subtract(Fraction f1,Fraction f2){
        int numerator=f1.num*f2.den - f2.num*f1.den;
        int denominator=f1.den*f2.den;
        Fraction f5=new Fraction(numerator, denominator);
        return f5;
    }

    public static Fraction Multiply(Fraction f1, Fraction f2){
        int numerator=f1.num*f2.num;
        int denominator=f1.den*f2.den;
        Fraction f4=new Fraction(numerator,denominator);
        return f4;
    }

    public static Fraction Divide(Fraction f1, Fraction f2){
        int numerator=f1.num*f2.den;
        int denominator=f1.den*f2.num;
        Fraction f6=new Fraction(numerator,denominator);
        return f6;
    }


    public static class Fraction{
        int num;
        int den;

        public Fraction(int num, int den){
            this.num=num;
            this.den=den;
            Simplify();
        }

        public void Simplify(){
            int hcf=gcd(num,den);
            num/=hcf;
            den/=hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(35,21);
        System.out.println("The First Fraction is: "+f1.num+"/"+f1.den);

        Fraction f2=new Fraction(7,3);
        System.out.println("The Second Fraction is: "+f2.num+"/"+f2.den);

        Fraction f3=Add(f1,f2);
        System.out.println("The Addition is: "+f3.num+"/"+f3.den);

        Fraction f4=Multiply(f1,f2);
        System.out.println("The Multiplication is: "+ f4.num+"/"+f4.den);

        Fraction f5=Subtract(f1,f2);
        System.out.println("The Subtraction is: "+f5.num+"/"+f5.den);

        Fraction f6=Divide(f1,f2);
        System.out.println("The Division is: "+ f6.num+"/"+f6.den);
    }
}