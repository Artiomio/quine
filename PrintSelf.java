public class PrintSelf {
  static String s1 = "NL  static void printSome(String s) {NL    char dQ=34;NL    char sQ=39;NL    String cR=System.lineSeparator();NL    System.out.println('public class PrintSelf {');NL    System.out.println(s);NL    String s2=s1.replace(sQ,dQ);NL    String s3=s2.replaceAll('N'+(char)76,cR);NL    System.out.println(s3);NL    System.out.println('  public static void main(String[] args) { '+cR+'    printSome('+dQ+'  static String s1 = '+dQ+'+(char)34+s1+(char)34+'+dQ+';'+dQ+');'+cR+'  }'+cR+'}');NL  }";

  static void printSome(String s) {
    char dQ=34;
    char sQ=39;
    String cR=System.lineSeparator();
    System.out.println("public class PrintSelf {");
    System.out.println(s);
    String s2=s1.replace(sQ,dQ);
    String s3=s2.replaceAll("N"+(char)76,cR);
    System.out.println(s3);
    System.out.println("  public static void main(String[] args) { "+cR+"    printSome("+dQ+"  static String s1 = "+dQ+"+(char)34+s1+(char)34+"+dQ+";"+dQ+");"+cR+"  }"+cR+"}");
  }
  public static void main(String[] args) { 
    printSome("  static String s1 = "+(char)34+s1+(char)34+";");
  }
}
