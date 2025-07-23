class Complex {
    int real;
    int imaginary;

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    void print() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        Complex result = c1.add(c2);

        System.out.print("Sum = ");
        result.print();
    }
}
