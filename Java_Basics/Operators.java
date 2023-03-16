/*Operators :-
 * 1-Arithmetic Opertors- +,-,/,*,%
 * 2- Assignment Operators- =,+=,-=,*=,/=
 * 3- Relational Operators- ==,>,>=,<,<=,!=
 * 4- Logical Operators- &&,||,!
 * 5- Bitwise Operators- |(Bitwise OR),&(Bitwise AND),^(Bitwise XOR),~(Bitwise Complement),<<(Left Shift),>>(Right Shift),>>>(Unsigned Right Shift)
 * 6- Unary Operators- +,-,--,++,!
 * 7- Other Operators- instanceof,ternary Operators
 * 
 * Bitwise OR :-
 * - returns 1 if atleast one of the operand is 1
 * a    b   a|b
 * 0    0   0
 * 0    1   1
 * 1    0   1
 * 1    1   1
 * 
 * Bitwise AND :-
 * - returns 1 if Both of the operand are 1
 * a    b   a&b
 * 0    0   0
 * 0    1   0
 * 1    0   0
 * 1    1   1
 * 
 * Bitwise XOR :-
 * - returns 1 if and only if one of the operand is 1
 * a    b   a^b
 * 0    0   0
 * 0    1   1
 * 1    0   1
 * 1    1   0
 * 
 * Bitwise Complement :-
 * 
 * 1s complement 
 * changes 0 to 1 and 1 to 0
 * 
 * 2s complement
 * - first find 1s complement then add 1
 * 
 * jshell> Integer.toBinaryString(5)
 * $1 ==> "101"
 *  
 * jshell> Integer.toBinaryString(~5)
 * $2 ==> "11111111111111111111111111111010"
 * 
 * jshell> Integer.toBinaryString(-6)
 * $3 ==> "11111111111111111111111111111010"
 * 
 * Left Shift Operator -<< (x << y) ==>(x * (2^y))
 * - shifts the bits to the left by specified number of bits
 * 
 * jshell> Integer.toBinaryString(5)
 * $4 ==> "101"
 * 
 * jshell> Integer.toBinaryString(5<<1)
 * $5 ==> "1010"
 * 
 * jshell> 5<<1
 * $6 ==> 10
 * 
 * Right Shift Operator ->> (x >> y) ==>(x / (2^y))
 * - shifts the bits to the right by specified number of bits
 * 
 * jshell> Integer.toBinaryString(20>>3)
 * $7 ==> "0010"
 * 
 * jshell> 20>>3
 * $8 ==> 2
 * 
 * Unsigned Right Shift >>> (Zero fill Right Shift Opeators)
 * 
 * jshell> Integer.toBinaryString(5);
 *  $9 ==> "101"

    jshell>
    Integer.toBinaryString(-5);
    $10 ==> "11111111111111111111111111111011"

    jshell> Integer.toBinaryString(-5).length();
    $11 ==> 32

    jshell> Integer.toBinaryString(5>>>1)
 *  $12 ==> "10

    jshell> Integer.toBinaryString(-5>>1)
 *  $13 ==> "11111111111111111111111111111101"
 * 
 *  jshell> Integer.toBinaryString(-5>>>1)
 *  $14 ==> "1111111111111111111111111111101"
 * 
 * jshell> Integer.toBinaryString(-5>>1).length();
    $15 ==> 32

    jshell> Integer.toBinaryString(-5>>>1).length();
    $16 ==> 31

    Unary Operators:-

    +12
    -45
    x=12
    x++
    ++x
    x=33
    x--
    --x
    jshell> boolean x = true;
    x ==> true

    jshell> x = !x
    x ==> false

    jshell> x = !x
    x ==> true

    Other Operators:-
    jshell> String name = "Hello";
    name ==> "Hello"

    jshell> name instanceof String
    $17 ==> true

*/
public class Operators {
    public static void main(String[] args) {
        int a = 20,b = 30;
        String Result = a > b?"X":"Y";
        System.out.println(Result);
    }
}
