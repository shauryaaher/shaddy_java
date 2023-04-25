public class ParseFunctions {

  public static void main(String args[]) {
    String i = "12";
    String j = "13463";
    String k = "299594492";
    String l = "939394822";
    byte iByte = Byte.parseByte(i);
    short jShort = Short.parseShort(j);
    int kInt = Integer.parseInt(k);
    long lLong = Long.parseLong(l);
    System.out.println("Byte example\t" + iByte);
    System.out.println("Short example\t" + jShort);
    System.out.println("Integer example\t" + kInt);
    System.out.println("Long example\t" + lLong);
  }
}
