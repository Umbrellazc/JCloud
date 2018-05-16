package model.bean;

import java.io.*;
import java.security.MessageDigest;

public class TransformMD5 {
	/** 
     * ��16λbyte[] ת��Ϊ32λString 
     * �ַ������� 
     * @param buffer 
     * @return 
     */  
    private String toHex(byte buffer[]) {  
        StringBuffer sb = new StringBuffer(buffer.length * 2);  
        for (int i = 0; i < buffer.length; i++) {  
            sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));  
            sb.append(Character.forDigit(buffer[i] & 15, 16));  
        }  
  
        return sb.toString();  
    }
    
    public String getMD5(String pwd) {  
        try {            
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
            messageDigest.update(pwd.getBytes());  
            String md5_pwd=toHex(messageDigest.digest());
            return md5_pwd;
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        return "fails";
    } 
	/** 
     * �ļ�ת������ 
     * @param buffer 
     * @return 
     */ 
    public static byte[] createChecksum(InputStream fis) throws Exception {  	  
    	   byte[] buffer = new byte[1024];  
    	   MessageDigest complete = MessageDigest.getInstance("MD5"); //�����ʹ��SHA-1��SHA-256������SHA-1,SHA-256  
    	   int numRead;  
    	  
    	   do {  
    	       numRead = fis.read(buffer);    //���ļ�����buffer�����װ��buffer  
    	       if (numRead > 0) {  
    	       complete.update(buffer, 0, numRead);  //�ö������ֽڽ���MD5�ļ��㣬�ڶ���������ƫ����  
    	       }  
    	   } while (numRead != -1);  
    	  
    	   fis.close();  
    	   return complete.digest();  
    	}  
    	  
    	public static String getFileMD5(InputStream fis) throws Exception {  
    	   byte[] b = createChecksum(fis);  
    	   String result = "";  
    	  
    	   for (int i=0; i < b.length; i++) {  
    	       result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring(1);//��0x100����Ϊ�е�b[i]��ʮ������ֻ��1λ  
    	   }  
    	   return result;  
    	}  
}
