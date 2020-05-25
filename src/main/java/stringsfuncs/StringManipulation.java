package stringsfuncs;


public  class StringManipulation {

   // Encodes a list of strings to a single string.
  /*  public static AbstractMap<String, String> encodeString(String str){
          System.out.println("Encodes a list of strings to a single string.");
          LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
          int asciiVal=0;
          String seq ="";
          for (int i=0;i<str.length();i++){
              asciiVal=(int)str.charAt(i)-64;
              if (freq.containsKey(str.charAt(i))){
                  freq.put(str.charAt(i),freq.get(str.charAt(i))+1) ;
              }else{
                  freq.put(str.charAt(i),1) ;
              }
              //Generate a key sequence for decoding the string
              seq=seq+asciiVal+","+i+";";
          }
          String res="";
          for(Map.Entry<Character,Integer> entry : freq.entrySet()){
              res=res+entry.getKey()+entry.getValue();
          }
        return new Pair<String, String>(res,seq);
    }
    // Decodes a single string to a list of strings.
    public static void decodeString(Pair<String,String> estr){
      System.out.println("\nDecodes a single string to a list of strings.");
      String val = estr.getValue();
      String  key = estr.getKey();
      System.out.println(val);
      char charval;
      char sep=',';
      //Split every section of the String char with its position in the initial sequence
      String [] str = val.split(";");
      String [] res =new String[str.length];

      for (int i = 0 ; i<str.length;i++){
          //separate the ascii char number and position of the char in the original String
          charval= (char)(Integer.parseInt(str[i].split(String.valueOf(sep))[0])+64);
          res[Integer.parseInt(str[i].split(String.valueOf(sep))[1])]= String.valueOf(charval);
      }
      String decoded="";
      for (int j=0;j<res.length;j++){
          decoded=decoded+res[j];
      }

        System.out.println("Decoded String : " + decoded);
    }
*/

}
