package Dublicateremoval;

public class dublicateremo {
        StringBuffer str = new StringBuffer("ABBCCCD");

        public void removeAdjacant() {
            for (int i = 1; i < str.length()-1; i++) {

                if (str.charAt(i) == str.charAt(i+1) || str.charAt(i)==str.charAt(i-1)) {
                    str.deleteCharAt(i);
                }
            }



            System.out.println(str);
        }
    }