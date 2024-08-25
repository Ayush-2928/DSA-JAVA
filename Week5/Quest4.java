package Week5;
//ques 4 - unsorted in ques 4
public class Quest4 {
     static char findMaxOcc2(String s){
    int[] arr= new int[26];
    for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
    }
    int index=0;
    for(int i=1;i<arr.length;i++){
        if(arr[index]<arr[i]){
            index=i;
        }
    }
    return (char)('a'+index);
}

    public static void main(String[] args) {
        String s="aaaaabbbbbcccaaaaaaaaadd";
        findMaxOcc2(s);
    }
}
