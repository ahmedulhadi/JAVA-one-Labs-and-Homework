import java.util.Scanner;

public class ThreeBitLogicalCalculator {

    public static void main(String[] args) {
        ThreeBitLogicalCalculator.oneBitNOT('1');
        ThreeBitLogicalCalculator.threeBitNOT("001");
        ThreeBitLogicalCalculator.oneBitOR('0', '0');
        ThreeBitLogicalCalculator.threeBitOR("101", "111");
        ThreeBitLogicalCalculator.oneBitAND('0', '1');
        ThreeBitLogicalCalculator.threeBitAND("101", "111");
        ThreeBitLogicalCalculator.main1();
    }

    public static char oneBitNOT(char bit) {
        char reslt = ' ';
        if (bit == '0' || bit == '1') {
            if (bit == '0') {
                reslt = '1';
            } else {
                reslt = '0';
            }
        }
        return reslt;
    }

    public static String threeBitNOT(String bits) {
        char bit0;
        char bit1;
        char bit2;
        bit0 = bits.charAt(0);
        bit1 = bits.charAt(1);
        bit2 = bits.charAt(2);
        String reslt = "";
        ThreeBitLogicalCalculator calculator = new ThreeBitLogicalCalculator();
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitNOT(bit0));
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitNOT(bit1));
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitNOT(bit2));
        return reslt;
    }

    public static char oneBitOR(char firstBit, char secondBit) {
        char reslt = ' ';
        if (firstBit == '0' || firstBit == '1' || secondBit == '0' || secondBit == '1') {
            if (firstBit == '0' && secondBit == '0') {
                reslt = '0'; 
            } else if (firstBit == '0' && secondBit == '1') {
                
                reslt = '1'; 
            } else if (firstBit == '1' && secondBit == '0') {
                
                reslt = '1';  
            } else if (firstBit == '1' && secondBit == '1') {
                reslt = '1';
                
            }
        }
        return reslt; 
        
    }

    public static String threeBitOR(String firstBit, String secondBit) {
        ThreeBitLogicalCalculator calculator = new ThreeBitLogicalCalculator();
        char firstbit1; 
        char firstbit2; 
        char firstbit3;
        firstbit1 = firstBit.charAt(0);
        firstbit2 = firstBit.charAt(1);
        firstbit3 = firstBit.charAt(2);
        char secondbit1; 
        char secondtbit2; 
        char secondbit3;
        secondbit1 = secondBit.charAt(0);
        secondtbit2 = secondBit.charAt(1);
        secondbit3 = secondBit.charAt(2);
        String reslt = "";
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitOR(firstbit1, secondbit1));
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitOR(firstbit2, secondtbit2));
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitOR(firstbit3, secondbit3));

        return reslt;
    }

    public static char oneBitAND(char firstBit, char secondBit) {
        char reslt = ' ';
        if (firstBit == '0' || firstBit == '1' || secondBit == '0' || secondBit == '1') {
            if (firstBit == '0' && secondBit == '0') {
                reslt = '0';  
            } else if (firstBit == '0' && secondBit == '1') {
                reslt = '0';  
            } else if (firstBit == '1' && secondBit == '0') {
                reslt = '0';  
            } else if (firstBit == '1' && secondBit == '1') {
                reslt = '1';
            }
        }
        return reslt;
    }

    public static String threeBitAND(String firstBit, String secondBit) {
        ThreeBitLogicalCalculator calculator = new ThreeBitLogicalCalculator();
        char firstbit1; 
        char firstbit2; 
        char firstbit3;
        firstbit1 = firstBit.charAt(0);
        firstbit2 = firstBit.charAt(1);
        firstbit3 = firstBit.charAt(2);
        char secondbit1; 
        char secondtbit2; 
        char secondbit3;
        secondbit1 = secondBit.charAt(0);
        secondtbit2 = secondBit.charAt(1);
        secondbit3 = secondBit.charAt(2);
        String reslt = "";
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitAND(firstbit1, secondbit1));
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitAND(firstbit2, secondtbit2));
        reslt = reslt + String.valueOf(ThreeBitLogicalCalculator.oneBitAND(firstbit3, secondbit3));
        return reslt;
    }

    public static void main1() {
        String operation = "";
        String notBits = "";
        String resltForNot = "";
        ThreeBitLogicalCalculator calculator = new ThreeBitLogicalCalculator();
        Scanner sc = new Scanner(System.in);
        operation = sc.nextLine();
        if (operation.equals("NOT")) {
            notBits = sc.nextLine();
            resltForNot = ThreeBitLogicalCalculator.threeBitNOT(notBits);
            System.out.println(resltForNot); 
        } else if (operation.equals("AND")) {
            String number1;
            String number2;
            String reslt;
            number1 = sc.nextLine();
            number2 = sc.nextLine();
            reslt = ThreeBitLogicalCalculator.threeBitAND(number1, number2);
            System.out.println(reslt); 
        } else if (operation.equals("OR")) {
            String number1;
            String number2;
            String reslt;
            number1 = sc.nextLine();
            number2 = sc.nextLine();
            reslt = ThreeBitLogicalCalculator.threeBitOR(number1, number2);
            System.out.println(reslt);
            
        }
    }
}