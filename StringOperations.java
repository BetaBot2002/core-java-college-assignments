class StringOperations{
    static void printCapitalLetterIndex(String str){
        System.out.println("Capital Letters-------");
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println(str.charAt(i)+" : "+i);
            }
        }
    }
    public static void main(String[] args) {
        String s1="Sinchan ";
        String s2="Nandy";
        String s3=s1.concat(s2);

        System.out.println(s1+"+"+s2+"="+s3);
        printCapitalLetterIndex(s3);
    }
}