public class rome {

    public static String RomanCalc(String a, String b, char simvol) {


        String result = null;

                int n1 = Number(a);
                int n2 = Number(b);

                if (n1!=-1313 & n2!=-1313){

                    int n3 = Vicheslenie(n1, n2, simvol);
                    result = Romania(n3);
                }
                else return "Ошибка!";

            return result;
    }


    private static int Number(String RomeNumber) {

        switch (RomeNumber) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return -1313;
        }
    }

    private static int Vicheslenie (int k1, int k2,char k3){

        int res = 0;

        switch (k3) {
            case '+':
                res = k1 + k2;
                break;
            case '-':
                res = k1 - k2;
                break;
            case '*':
                res = k1 * k2;
                break;
            case '/':
                res = k1 / k2;

                break;

            default:
                System.out.printf("Ошибка! Неправильный знак. Нужно выбрать + - / или *");
        }
        return res;

    }

    private static String Romania(int n4) {

        switch (n4) {

            case -9:
                return "-IX";
            case -8:
                return "-VIII";
            case -7:
                return "-VII";
            case -6:
                return "VI";
            case -5:
                return "-V";
            case -4:
                return "-IV";
            case -3:
                return "-III";
            case -2:
                return "-II";
            case -1:
                return "-I";
            case 0:
                return "0";
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 11:
                return "XI";
            case 12:
                return "XII";
            case 13:
                return "XIII";
            case 14:
                return "XIV";
            case 15:
                return "XV";
            case 16:
                return "XVI";
            case 17:
                return "XVII";
            case 18:
                return "XVIII";
            case 19:
                return "XIX";
            case 20:
                return "XX";
            case 21:
                return "XXI";
            case 22:
                return "XXII";
            case 23:
                return "XXIII";
            case 24:
                return "XXIV";
            case 25:
                return "XXV";
            case 26:
                return "XXVI";
            case 27:
                return "XXVII";
            case 28:
                return "XXVIII";
            case 29:
                return "XXIX";
            case 30:
                return "XXX";
            case 31:
                return "XXXI";
            case 32:
                return "XXXII";
            case 33:
                return "XXXIII";
            case 34:
                return "XXXIV";
            case 35:
                return "XXXV";
            case 36:
                return "XXXVI";
            case 37:
                return "XXXVII";
            case 38:
                return "XXXVIII";
            case 39:
                return "XXXIX";
            case 40:
                return "XL";
            case 41:
                return "XLI";
            case 42:
                return "XLII";
            case 43:
                return "XLIII";
            case 44:
                return "XLIV";
            case 45:
                return "XLV";
            case 46:
                return "XLVI";
            case 47:
                return "XLVII";
            case 48:
                return "XLVIII";
            case 49:
                return "XLIX";
            case 50:
                return "L";
            case 51:
                return "LI";
            case 52:
                return "LII";
            case 53:
                return "LIII";
            case 54:
                return "LIV";
            case 55:
                return "LV";
            case 56:
                return "LVI";
            case 57:
                return "LVII";
            case 58:
                return "LVIII";
            case 59:
                return "LIX";
            case 60:
                return "LX";
            case 61:
                return "LXI";
            case 62:
                return "LXII";
            case 63:
                return "LXIII";
            case 64:
                return "LXIV";
            case 65:
                return "LXV";
            case 66:
                return "LXVI";
            case 67:
                return "LXVII";
            case 68:
                return "LXVIII";
            case 69:
                return "LXIX";
            case 70:
                return "LXX";
            case 71:
                return "LXXI";
            case 72:
                return "LXXII";
            case 73:
                return "LXXII";
            case 74:
                return "LXXIV";
            case 75:
                return "LXXV";
            case 76:
                return "LXXVI";
            case 77:
                return "LXXVII";
            case 78:
                return "LXXVIII";
            case 79:
                return "LXXIX";
            case 80:
                return "LXX";
            case 81:
                return "LXXXI";
            case 82:
                return "LXXXII";
            case 83:
                return "LXXXIII";
            case 84:
                return "LXXXIV";
            case 85:
                return "LXXXV";
            case 86:
                return "LXXXVI";
            case 87:
                return "LXXXVII";
            case 88:
                return "LXXXVIII";
            case 89:
                return "LXXXIX";
            case 90:
                return "XX";
            case 91:
                return "XCI";
            case 92:
                return "XCII";
            case 93:
                return "XCIII";
            case 94:
                return "XCIV";
            case 95:
                return "XCV";
            case 96:
                return "XCVI";
            case 97:
                return "XCVII";
            case 98:
                return "XCVIII";
            case 99:
                return "XCIX";
            case 100:
                return "C";


            default:
                return "Ошибка";
        }
    }
}
