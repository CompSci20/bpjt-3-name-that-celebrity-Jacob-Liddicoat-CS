//Author: Jacob Liddicoat
//Date created: Mar 10,2018
public class NameThatCelebrity
 {
  public static void main(String args[])
  {
   String s1 ="Allan Alda";
   String s2 ="John Wayne";
   String s3 ="Gregory Peck";
   String s4 =">>>";
   String s1part2 = s1.substring(2,7);
   String s2part2 = s2.substring(2,7);
   String s3part2 = s3.substring(2,9);
   System.out.println(s1 + s4 + s1part2); //prints Allan Alda>>>lan A
   System.out.println(s2 + s4 + s2part2); //prints John Wayne>>>hn Wa
   System.out.println(s3 + s4 + s3part2); //prints Gregory Peck>>>egory P
  }
 }
