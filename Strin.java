public class Strin {
    public static void main(String[] args) {
        System.out.println( mes("aaaaaaamaaaa", 'a', 0, ""));
        mass("","udayakumar");
    }

    static String mes(String name, char a, int index, String ans){
        if(index == name.length()){
            return ans;
        }
        if(a != name.charAt(index)){
            ans = ans + name.charAt(index);
            return mes(name, a, index + 1, ans);
        }
        return mes(name, a, index+1, ans);
    }


    static void mass(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            mass(p,up.substring(1));
        } else{
            mass(p+ch, up.substring(1));
        }
    }
}
