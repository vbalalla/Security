import java.security.MessageDigest;

public class SimpleHash{

public static void main(String args[]) {

 try {

   String data = "hello world";
   byte dataBytes[] = data.getBytes();

   MessageDigest md1 = MessageDigest.getInstance("md5");
   md1.update(dataBytes);
   byte digest[] = md1.digest();
   
   for(int i=0; i<digest.length; i++){
	   System.out.format("%x", digest[i]);
   }

   
  } catch (Exception e) {
     System.out.println(e);
  }
 }
}

